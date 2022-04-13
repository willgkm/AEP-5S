package aep5.ads.Entregador;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entregador")
public class EntregadorController extends BaseCrudController<Entregador,EntregadorRepository,EntregadorService> {
}
