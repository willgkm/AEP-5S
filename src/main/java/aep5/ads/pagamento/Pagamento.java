package aep5.ads.pagamento;

import aep5.ads.base.BaseEntity;
import aep5.ads.tipoDePagamento.TipoDePagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento extends BaseEntity {

    @OneToOne
    private TipoDePagamento Long;
    private BigDecimal valor;
    @CreationTimestamp
    private Date data;
}
