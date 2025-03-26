package dev.nioritos.CadastroDeNinjas.Ninjas;

import java.util.List;


public class NinjaService {
    NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }
}
