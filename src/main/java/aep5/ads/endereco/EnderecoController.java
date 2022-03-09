package aep5.ads.endereco;

import aep5.ads.base.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController extends BaseCrudController<Endereco,EnderecoRepository,EnderecoService> {
}
