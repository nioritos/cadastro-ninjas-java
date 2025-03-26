package dev.nioritos.CadastroDeNinjas.Ninjas;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    NinjaService ninjaService;
    public Controller(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/todos")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/ninjaid")
    public String mostrarNinjaPorID() {
        return "show ninja per id";
    };

    @PutMapping("/alterarNinja/id")
    public String alterarNinja() {
        return "alter ninja";
    };

    @DeleteMapping("deletarNinja")
    public String deletarNinja() {
        return "delete ninja";
    };
}
