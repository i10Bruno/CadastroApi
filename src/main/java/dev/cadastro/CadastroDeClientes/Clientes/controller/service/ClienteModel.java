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
    private long id;
    private String Nome;

    @Column(unique = true)
    private String Email;
    private int idade;
    //sprivate List<TarefasModel> tarefas;


    //um cliente so tem uma unica tarefa @ManyToOne
    @ManyToOne()
    @JoinColumn(name = "tarefas_id")
    private TarefasModel tarefas;

}
