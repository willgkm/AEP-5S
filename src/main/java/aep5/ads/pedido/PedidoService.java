package aep5.ads.pedido;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PedidoService extends BaseCrudService<Pedido,PedidoRepository> {
}
