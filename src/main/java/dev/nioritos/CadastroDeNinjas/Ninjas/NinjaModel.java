package dev.nioritos.CadastroDeNinjas.Ninjas;

import dev.nioritos.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//just other comment to amend on git
@Entity
//ele transforma a classe em uma interface do banco de dados
@Table(name = "tb_cadastro")
//nomeia a tabela para o banco de dados
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
