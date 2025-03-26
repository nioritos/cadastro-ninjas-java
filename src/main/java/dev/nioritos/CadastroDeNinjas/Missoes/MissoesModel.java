package dev.nioritos.CadastroDeNinjas.Missoes;

import dev.nioritos.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //ele transforma a classe em uma interface do banco de dados
@Table(name = "tb_missoes") //nomeia a tabela para o banco de dados
@NoArgsConstructor //lombox faz o contrutor sem valor
@AllArgsConstructor //lombok faz todos o contrutor com todos valores
@Data //lombok faz todos os getters e setters
public class MissoesModel {
    @Id // Diz q o valor abaixo será o id da table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //diz q o valor do id da coluna será gerado de maneira estratégica com o tipo identidade unico
    @Column(name = "id")// nomeia a coluna
    private Long id;
    @Column(name = "nome")// nomeia a coluna
    private String nome;
    @Column(name = "dificuldade")// nomeia a coluna
    private String dificuldade;
    @Column(name = "ninjas")// nomeia a coluna
    @OneToMany() //diz q o tipo de relacionamento é 1 missao para muitos ninjas
    private List<NinjaModel> ninjas;

}
