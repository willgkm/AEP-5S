package aep5.ads.produto;


import aep5.ads.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto extends BaseEntity {

    private String nome ;
    private String descricao;
    private String Ingredientes;
    private BigDecimal valor;

}
