package dev.nioritos.CadastroDeNinjas.Missoes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    MissoesServices missoesServices;
    public MissoesController(MissoesServices missoesServices) {
        this.missoesServices = missoesServices;
    };

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesServices.listarMissoes();
    };

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesId(@PathVariable Long id) {
        return missoesServices.listarMissoesId(id);
    }
}
