package aep5.ads.cardapio;

import aep5.ads.base.BaseEntity;
import aep5.ads.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cardapio extends BaseEntity{

    private String nome;
    @OneToMany
    private List<Produto> produtos;





}
