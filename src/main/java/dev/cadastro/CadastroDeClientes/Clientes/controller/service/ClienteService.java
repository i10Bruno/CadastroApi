package dev.cadastro.CadastroDeClientes.Clientes.controller.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

   private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteModel> listarclientes(){


        return clienteRepository.findAll();
    }

    public ClienteModel listarClientePorId( long id){
        Optional<ClienteModel> ClientePorId= clienteRepository.findById(id);

        return ClientePorId.orElse(null);

    }


    public ClienteModel criarCliente(ClienteModel cliente){


        return clienteRepository.save(cliente);
    }

    public void deletarporid(long id){

        clienteRepository.deleteById(id);
    }


}
