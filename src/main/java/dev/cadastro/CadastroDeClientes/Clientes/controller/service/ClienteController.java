package dev.cadastro.CadastroDeClientes.Clientes.controller.service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClienteController {

    @GetMapping("/teste")
    public  String teste(){

        return "Teste de rota";
    }


    //adicionar(CREATE)

    @PostMapping("/criar")

    public String criarCliente(){

        return "Clientecriado";
    }

    //mostrar todos (read)
    @GetMapping("/todos")

    public String mostrarTodosOsClientes(){

        return "clientes";
    }


    //mostrar por id (READ)
    @GetMapping("/todosid")

    public String mostrarTodosOsClientesId(){

        return "clientes id";
    }

    //ALTERAR(UPDATE)
    @PutMapping("/alterar")
    public String alterarClientes(){

        return "alteração";
    }

    //DELETAR(DELETE)
    @DeleteMapping("/deletarId")
    public String deletarClienteid(){

        return "deletado";
    }




}
