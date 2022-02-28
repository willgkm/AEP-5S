package aep5.ads.cliente;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClienteService extends BaseCrudService<Cliente, ClienteRepository> {
}
