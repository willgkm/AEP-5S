package aep5.ads.cliente;

import aep5.ads.base.BaseEntity;
import aep5.ads.endereco.Endereco;
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
public class Cliente extends BaseEntity {

    private String nome;
    private String dataDeNascimento;
    private Long cpf;
    private Long telefone;
    @OneToMany
    private List<Endereco> enderecos;





}
