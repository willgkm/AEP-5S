package aep5.ads.restaurante;

import aep5.ads.cardapio.Cardapio;
import aep5.ads.endereço.Endereco;
import aep5.ads.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

    @Id
    private Long id;
    private String nome;
    private Long razaoSocial;
    @OneToOne
    private Endereco endereco;
    private Long telefone;
    @OneToMany
    private List<Cardapio> cardapios;
    @OneToMany
    private List<Entregador> entregadores;


}
