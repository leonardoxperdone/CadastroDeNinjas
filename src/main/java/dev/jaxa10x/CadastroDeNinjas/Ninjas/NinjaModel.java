package dev.jaxa10x.CadastroDeNinjas.Ninjas;

import dev.jaxa10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column( unique = true) // essa coluna e unica sem se reptir o email
    private String email;
    private int idade;

    @ManyToOne //um ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") //Foreing key ou chave estrangeira
    private MissoesModel missoes;

}
