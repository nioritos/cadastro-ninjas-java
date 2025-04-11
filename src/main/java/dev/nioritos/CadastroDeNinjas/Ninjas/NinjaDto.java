package dev.nioritos.CadastroDeNinjas.Ninjas;

import dev.nioritos.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaDto {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imgUrl;
    private MissoesModel missoes;
    private String rank;
}
