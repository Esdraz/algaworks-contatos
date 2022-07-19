package com.esdraz.algaworkscontatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ContatosControle {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 83 99999 1234"));
        LISTA_CONTATOS.add(new Contato("2", "Jose", "+55 83 98888 1234"));
        LISTA_CONTATOS.add(new Contato("3", "Pedro", "+55 83 97777 1234"));
        LISTA_CONTATOS.add(new Contato("4", "Jorge", "+55 83 98989 1234"));
        LISTA_CONTATOS.add(new Contato("5", "Marta", "+55 83 98932 1234"));
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

}
