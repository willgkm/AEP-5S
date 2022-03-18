package aep5.ads.produto;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController extends BaseCrudController<Produto,ProdutoRepository,ProdutoService> {
}
