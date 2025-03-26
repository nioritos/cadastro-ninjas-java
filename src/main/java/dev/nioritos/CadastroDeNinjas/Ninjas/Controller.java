package dev.nioritos.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/home")
    public String boasVindas() {
        return "first msg on route";
    };
    
    @GetMapping("/ninjasPerId")
    public String mostrarNinjaPorID() {
        return "show ninja per id";
    };

    @GetMapping("/todos")
    public String mostrarTodosNinjas() {
        return "show all ninjas";
    };

    @PutMapping("/alterarNinja")
    public String alterarNinja() {
        return "alter ninja";
    };

    @DeleteMapping("deletarNinja")
    public String deletarNinja() {
        return "delete ninja";
    };
}
