package dev.nioritos.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public NinjaModel toDTO(NinjaDto dto) {
        NinjaModel model = new NinjaModel();
        model.setEmail(dto.getEmail());
        model.setId(dto.getId());
        model.setIdade(dto.getIdade());
        model.setImgUrl(dto.getImgUrl());
        model.setMissoes(dto.getMissoes());
        model.setNome(dto.getNome());
        model.setRank(dto.getRank());
        return model;
    };

    public NinjaDto toMODEL(NinjaModel model) {
        NinjaDto dto = new NinjaDto();
        dto.setEmail(model.getEmail());
        dto.setId(model.getId());
        dto.setIdade(model.getIdade());
        dto.setImgUrl(model.getImgUrl());
        dto.setMissoes(model.getMissoes());
        dto.setNome(model.getNome());
        dto.setRank(model.getRank());
        return dto;
    }
}
