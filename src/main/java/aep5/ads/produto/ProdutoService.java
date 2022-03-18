package aep5.ads.produto;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProdutoService extends BaseCrudService<Produto,ProdutoRepository> {
}
