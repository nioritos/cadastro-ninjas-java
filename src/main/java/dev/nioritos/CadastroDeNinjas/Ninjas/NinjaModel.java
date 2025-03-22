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
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(name = "idade")
    private int idade;
    @Column(name = "imgNinja")
    private String imgUrl;
    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;



}
