package dev.nioritos.CadastroDeNinjas.Missoes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class MissoesServices {
    MissoesRepository missoesRepository;
    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    };

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();

    };

    public MissoesModel listarMissoesId(Long id) {
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    };



}
