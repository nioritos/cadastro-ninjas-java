package dev.nioritos.CadastroDeNinjas.Ninjas;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    NinjaService ninjaService;
    public Controller(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorID(id);
    };

    @PostMapping("criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);

    }
    @PutMapping("/alterarNinja/id")
    public String alterarNinja() {
        return "alter ninja";
    };

    @DeleteMapping("deletarNinja")
    public String deletarNinja() {
        return "delete ninja";
    };
}
