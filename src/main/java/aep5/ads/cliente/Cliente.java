package aep5.ads.cliente;

import aep5.ads.endereço.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    private Long id;
    private String nome;
    private Long cpf;
    private Long telefone;
    @OneToMany
    private List<Endereco> enderecos;

}
