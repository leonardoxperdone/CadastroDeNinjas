package dev.jaxa10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")

    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

}
