package dev.cadastro.CadastroDeClientes.Clientes.controller.service;

import dev.cadastro.CadastroDeClientes.Tarefas.TarefasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Nome;
    private   String Email;
    private int idade;
    //sprivate List<TarefasModel> tarefas;



    //um cliente so tem uma unica tarefa @ManyToOne
    @ManyToOne()
    @JoinColumn(name = "tarefas_id")
   private TarefasModel tarefas;

    public ClienteModel(){

    }

    public ClienteModel(String nome, String email, int idade) {
        Nome = nome;
        Email = email;
        this.idade = idade;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
