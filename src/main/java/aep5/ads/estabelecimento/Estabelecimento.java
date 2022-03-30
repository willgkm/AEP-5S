package aep5.ads.estabelecimento;

import aep5.ads.base.BaseEntity;
import aep5.ads.endereco.Endereco;
import aep5.ads.tipoDePagamento.TipoDePagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estabelecimento extends BaseEntity {

    private String nome;
    private String nomeFantasia;
    private String cnpj;
    @OneToMany
    private List<Endereco> enderecos;
    private Boolean possuiEntregador;
    @OneToMany
    private List<TipoDePagamento> meiosDePagamentosAceitos;



}
