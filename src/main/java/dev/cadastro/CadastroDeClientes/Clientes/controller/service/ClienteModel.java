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

}
