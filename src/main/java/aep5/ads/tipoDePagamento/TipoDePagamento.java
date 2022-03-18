package aep5.ads.tipoDePagamento;

import aep5.ads.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDePagamento extends BaseEntity {

    private String Nome;
    private String Tipo;
}
