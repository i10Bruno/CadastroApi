package dev.cadastro.CadastroDeClientes.Tarefas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")

public class TarefasController {

    @PostMapping("/criar")
    public String tarefaCriada() {


        return "tarefacriada";
    }

    @PutMapping("/alterar")
    public String tarefaalterada() {


        return "alterado";

    }
    @DeleteMapping("/deletar")
    public String deletar() {


        return "deletado com sucesso";

    }


}