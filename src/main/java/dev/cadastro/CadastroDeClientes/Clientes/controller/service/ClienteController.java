package dev.cadastro.CadastroDeClientes.Clientes.controller.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {

    @GetMapping("/teste")
    public  String teste(){

        return "Teste de rota";
    }

}
