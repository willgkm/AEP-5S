package aep5.ads.estabelecimento;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estabelecimentos")
public class EstabelecimentoController extends BaseCrudController<Estabelecimento,EstabelecimentoRepository,EstabelecimentoService> {
}
