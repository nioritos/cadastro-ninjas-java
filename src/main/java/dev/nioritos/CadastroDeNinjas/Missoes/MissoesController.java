package dev.nioritos.CadastroDeNinjas.Missoes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    };

    @PostMapping("/criar") 
    public void criarMissao(@RequestBody MissoesModel missao) {
        missoesServices.criarMissao(missao);
    }

    @PutMapping("/alterarmissao/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missao) {
        return missoesServices.alterarMissao(id, missao);
    }
}
