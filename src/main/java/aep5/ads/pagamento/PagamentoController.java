package aep5.ads.pagamento;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController extends BaseCrudController<Pagamento,PagamentoRepository,PagamentoService> {
}
