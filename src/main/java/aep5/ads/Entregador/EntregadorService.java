package aep5.ads.Entregador;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EntregadorService extends BaseCrudService<Entregador,EntregadorRepository> {
}
