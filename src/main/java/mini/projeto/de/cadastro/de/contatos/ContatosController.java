package mini.projeto.de.cadastro.de.contatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ContatosController {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
    static {
        LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 34 99876-5432"));
        LISTA_CONTATOS.add(new Contato("2", "João", "+55 34 91234-5678"));
        LISTA_CONTATOS.add(new Contato("3", "Pedro", "+55 34 99999-8888"));
        LISTA_CONTATOS.add(new Contato("4", "Ana", "+55 34 97777-6666"));
        LISTA_CONTATOS.add(new Contato("5", "Carlos", "+55 34 95555-4444"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
