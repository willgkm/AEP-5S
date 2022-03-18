package aep5.ads.endereco;

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
public class Endereco extends BaseEntity {

    private Long cep;
    private String numero;
    private String rua;
    private String complemento;
    private String bairo;
    private String cidade;
    private String estado;
}
