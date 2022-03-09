package aep5.ads.estabelecimento;

import aep5.ads.base.BaseEntity;
import aep5.ads.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Estabelecimento extends BaseEntity {

    private String nome;
    private String nomeFantasia;
    private String cnpj;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
    private Boolean possuiEntregador;
//    private List<MeiosDePagamento> meiosDePagamentosAceitos;



}
