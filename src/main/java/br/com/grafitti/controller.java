package br.com.grafitti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.grafitti.model.Usuario;

@Controller
@RequestMapping("/")

public class controller{
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/grafite")
    public String grafite(){
        return "grafite";
    }

    @GetMapping("/feedback")
    public String formulario(){
        return "feedback";
    }

    @PostMapping("/registro")
    public String registroUsuario(@ModelAttribute Usuario usuario, Model model){
        System.out.println(usuario.toString());

        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getTipoUsuario());
        System.out.println(usuario.getOpiniao());

        model.addAttribute("nome", usuario.getNome());
        model.addAttribute("email", usuario.getEmail());
        model.addAttribute("tipoUsuario", usuario.getTipoUsuario());
        model.addAttribute("opiniao", usuario.getOpiniao());
        
        return "dadosCadastrados";
    }
}