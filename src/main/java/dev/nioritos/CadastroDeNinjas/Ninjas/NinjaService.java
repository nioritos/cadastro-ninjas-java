package dev.nioritos.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service //indica que é um modulo de service para o controller.
public class NinjaService {
    NinjaRepository ninjaRepository; 
    NinjaMapper ninjaMapper;
    
    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll(); // acessa o repository que contem o JPA e seus métodos, utiliza o método findall() que é o select * from 

    }

    public NinjaModel listarNinjaPorID(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    public NinjaDto criarNinja(NinjaDto ninjadto) {
        NinjaModel ninja = ninjaMapper.toDTO(ninjadto);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.toMODEL(ninja);
    }

    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id); 
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninja) {
        if(ninjaRepository.existsById(id)) {
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        } 
        return null;
    }

}
