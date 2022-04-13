package aep5.ads.tipoDePagamento;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipos-de-pagamento")
public class TipoDePagamentoController extends BaseCrudController<TipoDePagamento
                                                    ,TipoDePagamentoRepository
                                                    ,TipoDePagamentoService> {
}
