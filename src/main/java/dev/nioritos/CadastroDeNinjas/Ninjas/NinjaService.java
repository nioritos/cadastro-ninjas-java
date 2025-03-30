package dev.nioritos.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service //indica que é um modulo de service para o controller.
public class NinjaService {
    NinjaRepository ninjaRepository; 
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll(); // acessa o repository que contem o JPA e seus métodos, utiliza o método findall() que é o select * from 

    }

    public NinjaModel listarNinjaPorID(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
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
