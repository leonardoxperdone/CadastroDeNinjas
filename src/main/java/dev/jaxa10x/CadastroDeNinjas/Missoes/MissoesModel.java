package dev.jaxa10x.CadastroDeNinjas.Missoes;

import dev.jaxa10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")// uma missão pode ter vários ninjas
    private List<NinjaModel> ninja;

}