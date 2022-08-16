package com.esdraz.algaworkscontatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class ContatosControle {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("Maria", "+55 83 99999 1234"));
        LISTA_CONTATOS.add(new Contato("Jose", "+55 83 98888 1234"));
        LISTA_CONTATOS.add(new Contato("Pedro", "+55 83 97777 1234"));
        LISTA_CONTATOS.add(new Contato("Jorge", "+55 83 98989 1234"));
        LISTA_CONTATOS.add(new Contato("Marta", "+55 83 98932 1234"));
        LISTA_CONTATOS.add(new Contato("10", "Marcia", "+55 88 9999 3333"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("listar");

        modelAndView.addObject("contatos", LISTA_CONTATOS);

        return modelAndView;
    }

    @GetMapping("/contatos/novo")
    public ModelAndView novo() {
        ModelAndView modelAndView = new ModelAndView("formulario");

        modelAndView.addObject("contato", new Contato());

        return modelAndView;

    }

    @PostMapping("/contatos")
    public String cadastrar(Contato contato) {
        String id = UUID.randomUUID().toString();

        contato.setId(id);

        LISTA_CONTATOS.add(contato);

        return "redirect:/contatos";
    }

    @GetMapping("/contatos/{id}/editar")
    public ModelAndView editar(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("formulario");

        Contato contato = procurarContato(id);

        modelAndView.addObject("contato",contato);

        return modelAndView;
    }

    @PutMapping("/contatos/{id}")
    public String atualizar(Contato contato) {
        Integer indice = procurarIndiceContato(contato.getId());

        Contato contatoVelho = LISTA_CONTATOS.get(indice);

//        LISTA_CONTATOS.remove(contatoVelho);
//
//        LISTA_CONTATOS.add(indice, contato);

        LISTA_CONTATOS.set(indice, contato);

        return "redirect:/contatos";
    }

    @DeleteMapping("/contatos/{id}")
    public String remover(@PathVariable String id) {
        Contato contato = procurarContato(id);

        LISTA_CONTATOS.remove(contato);

        return "redirect:/contatos";
    }

    // ---- Métodos auxiliares
    private Contato procurarContato(String id) {
        Integer indice = procurarIndiceContato(id);

        if (indice != null) {
            Contato contato = LISTA_CONTATOS.get(indice);
            return contato;
        }
        return null;
    }

    private Integer procurarIndiceContato(String id) {
        for (int i = 0; i < LISTA_CONTATOS.size(); i++) {
            Contato contato = LISTA_CONTATOS.get(i);

            if (contato.getId().equals(id)) {
                return i;
            }

        }
        return null;
    }
}
