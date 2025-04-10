package dev.nioritos.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDto dto) {
        NinjaModel model = new NinjaModel();
        dto.setEmail(model.getEmail());
        dto.setId(model.getId());
        dto.setIdade(model.getIdade());
        dto.setImgUrl(model.getImgUrl());
        dto.setMissoes(model.getMissoes());
        dto.setNome(model.getNome());
        return model;
    };

    public NinjaDto map(NinjaModel model) {
        NinjaDto dto = new NinjaDto();
        dto.setEmail(model.getEmail());
        dto.setId(model.getId());
        dto.setIdade(model.getIdade());
        dto.setImgUrl(model.getImgUrl());
        dto.setMissoes(model.getMissoes());
        dto.setNome(model.getNome());
        return dto;
    }
}
