package dev.cadastro.CadastroDeClientes.Tarefas;


import dev.cadastro.CadastroDeClientes.Clientes.controller.service.ClienteModel;
import jakarta.persistence.*;

import java.util.List;

//Diz ao JPA que essa classe é uma entidade que será mapeada para uma tabela no banco.
@Entity
@Table(name = "tb_tarefas")//dar nome a tabela

public class TarefasModel {

    //informar que o id é chave
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// o tipo de id que o banco ira usar
    Long id;
    String tarefa;
    int tempoemhrs;


    //uma tarefa para varios clientes
    @OneToMany(mappedBy = "tarefas")
    private List<ClienteModel> cliente;

}
