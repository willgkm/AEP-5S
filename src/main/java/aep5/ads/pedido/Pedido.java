package aep5.ads.pedido;

import aep5.ads.Entregador.Entregador;
import aep5.ads.base.BaseEntity;
import aep5.ads.estabelecimento.Estabelecimento;
import aep5.ads.pagamento.Pagamento;
import aep5.ads.produto.Produto;
import aep5.ads.tipoDePagamento.TipoDePagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido extends BaseEntity {

    @OneToOne
    private Estabelecimento estabelecimento;
    @OneToOne
    private Entregador entregador;
    @OneToMany
    private List<Produto> produtosSelecionados;
    private BigDecimal valor;
    @OneToMany
    private List<Pagamento> pagamento;
    private Long avaliacao;
    private String Reclamacao;

}
