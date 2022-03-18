package aep5.ads.cardapio;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CardapioService extends BaseCrudService<Cardapio,CardapioRepository> {
}
