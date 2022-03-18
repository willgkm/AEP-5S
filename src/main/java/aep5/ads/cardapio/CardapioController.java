package aep5.ads.cardapio;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cardapio")
public class CardapioController extends BaseCrudController<Cardapio,CardapioRepository,CardapioService> {
}
