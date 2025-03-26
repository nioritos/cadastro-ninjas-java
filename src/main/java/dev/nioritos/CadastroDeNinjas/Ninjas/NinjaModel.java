package dev.nioritos.CadastroDeNinjas.Ninjas;
import dev.nioritos.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //ele transforma a classe em uma interface do banco de dados
@Table(name = "tb_cadastro") //nomeia a tabela para o banco de dados
@NoArgsConstructor //lombox faz o contrutor sem valor
@AllArgsConstructor //lombok faz todos o contrutor com todos valores
@Data //lombok faz todos os getters e setters
public class NinjaModel {
    @Id // Diz q o valor abaixo será o id da table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //diz q o valor do id da coluna será gerado de maneira estratégica com o tipo identidade unico
    @Column(name = "id")// nomeia a coluna
    private Long id;
    @Column(name = "nome")// nomeia a coluna
    private String nome;
    @Column(unique = true) //unifica a coluna, o valor nao pode repetir
    private String email;
    @Column(name = "idade")// nomeia a coluna
    private int idade;
    @Column(name = "imgNinja") // nomeia a coluna
    private String imgUrl;
    @ManyToOne() //diz q o tipo de relacionamento é muitos ninjas para uma missao
    @JoinColumn(name = "missoes_id") //insere uma coluna "estrangeira" conectiva na table ninja
    private MissoesModel missoes;



}
