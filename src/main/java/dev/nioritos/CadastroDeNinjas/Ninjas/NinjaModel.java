package dev.nioritos.CadastroDeNinjas.Ninjas;
import dev.nioritos.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//ele transforma a classe em uma interface do banco de dados
@Table(name = "tb_cadastro")
//nomeia a tabela para o banco de dados
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;



}
