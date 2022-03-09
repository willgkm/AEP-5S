package aep5.ads.endereco;

import aep5.ads.base.BaseCrudService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EnderecoService  extends BaseCrudService<Endereco, EnderecoRepository> {
}
