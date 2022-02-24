package aep5.ads.pedido;


import aep5.ads.entregador.Entregador;
import aep5.ads.pagamento.Pagamento;
import aep5.ads.produto.Produto;
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
public class Pedido {
    @Id
    private Long id;
    @OneToMany
    private List<Produto> pedidos;
    @OneToOne
    private Entregador entregador;

    @OneToMany
    private List<Pagamento> pagamento;
}
