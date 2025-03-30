package dev.nioritos.CadastroDeNinjas.Missoes;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MissoesServices {
    MissoesRepository missoesRepository;
    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    };

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
        
    }

}
