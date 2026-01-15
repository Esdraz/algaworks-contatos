package mini.projeto.de.cadastro.de.contatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class ContatoController {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("1", "Maria", "(34) 99876-5432"));
        LISTA_CONTATOS.add(new Contato("2", "João", "(34) 91234-5678"));
        LISTA_CONTATOS.add(new Contato("3", "Pedro", "(34) 99999-8888"));
        LISTA_CONTATOS.add(new Contato("4", "Ana", "(34) 97777-6666"));
        LISTA_CONTATOS.add(new Contato("5", "Carlos", "(34) 95555-4444"));
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
        modelAndView.addObject("contato", contato);
        return modelAndView;
    }

    @PutMapping("/contatos/{id}")
    public String atualizar(@PathVariable String id, Contato contato) {
        Contato contatoExistente = procurarContato(id);
        if (contatoExistente != null) {
            contatoExistente.setNome(contato.getNome());
            contatoExistente.setTelefone(contato.getTelefone());
            return "redirect:/contatos";
        } else {
            return "redirect:/contatos";
        }
    }

    @DeleteMapping("/contatos/{id}")
    public String remover(@PathVariable String id) {
        Contato contato = procurarContato(id);
        if (contato != null) {
            LISTA_CONTATOS.remove(contato);
            return "redirect:/contatos";
        } else {
            return "redirect:/contatos";
        }
    }

    // -------------------- Metodos auxiliares -------------------------

    public Contato procurarContato(String id) {
        for (Contato contato : LISTA_CONTATOS) {
            if (contato.getId().equals(id)) {
                return contato;
            }

        }
        return null;
    }
}
