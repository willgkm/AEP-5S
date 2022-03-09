package aep5.ads.estabelecimento;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EstabelecimentoService extends BaseCrudService<Estabelecimento,EstabelecimentoRepository> {
}
