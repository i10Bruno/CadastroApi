package dev.cadastro.CadastroDeClientes.Clientes.controller.service;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class ClienteController {


    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/teste")
    public  String teste(){

        return "Teste de rota";
    }


    //adicionar(CREATE)

    @PostMapping("/criar")

    public ClienteModel criarCliente(@RequestBody ClienteModel cliente){

        return clienteService.criarCliente(cliente) ;
    }

    //mostrar todos (read)
    @GetMapping("/todos")

    public List<ClienteModel> listarclientes(){

        return clienteService.listarclientes();
    }


    //mostrar por id (READ)
    @GetMapping("/listar/{id}")

    public  ClienteModel lisporid(@PathVariable long id){

        return clienteService.listarClientePorId(id);
    }

    //ALTERAR(UPDATE)
    @PutMapping("/alterar/{id}")
    public ClienteModel alterarClientes(@PathVariable Long id,@RequestBody ClienteModel clienteAtualizado){

        return clienteService.atualizarCliente(id,clienteAtualizado);
    }

    //DELETAR(DELETE)
    @DeleteMapping("/deletar{id}")
    public void deletarClienteid(@PathVariable long id){

        clienteService.deletarporid(id);
    }




}
