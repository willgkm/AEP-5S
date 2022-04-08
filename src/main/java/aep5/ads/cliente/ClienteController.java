package aep5.ads.cliente;


import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController extends BaseCrudController<Cliente, ClienteRepository,ClienteService> {


}
