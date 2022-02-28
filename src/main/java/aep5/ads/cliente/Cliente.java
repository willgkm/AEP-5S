package aep5.ads.cliente;

import aep5.ads.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Cliente extends BaseEntity {

    private String nome;
    private Long cpf;
    private Long telefone;

    public Cliente(){
        super();
    }




}
