package aep5.ads.tipoDePagamento;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TipoDePagamentoService extends BaseCrudService<TipoDePagamento,TipoDePagamentoRepository> {
}
