package aep5.ads.pagamento;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PagamentoService extends BaseCrudService<Pagamento,PagamentoRepository> {
}
