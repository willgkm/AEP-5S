package aep5.ads.Entregador;

import aep5.ads.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Entregador extends BaseEntity {

    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private Boolean entregaComMoto;
    private String CNH;
}
