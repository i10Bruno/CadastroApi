package dev.cadastro.CadastroDeClientes.Clientes.controller.service;

import dev.cadastro.CadastroDeClientes.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "id")
    private long id;


    @Column(name = "nome")
    private String Nome;

    @Column(unique = true)
    private String Email;

    @Column(name = "img_url")
    private String imgurl;
    @Column(name = "idade")
    private int idade;



    //um cliente so tem uma unica tarefa @ManyToOne
    @ManyToOne()
    @JoinColumn(name = "tarefas_id")
    private TarefasModel tarefas;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TarefasModel getTarefas() {
        return tarefas;
    }

    public void setTarefas(TarefasModel tarefas) {
        this.tarefas = tarefas;
    }
}
