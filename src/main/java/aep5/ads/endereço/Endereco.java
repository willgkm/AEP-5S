package aep5.ads.endereço;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    private Long id;
    private Boolean endereçoPrincipal;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidede;
    private String estado;
    private String pais;
}
