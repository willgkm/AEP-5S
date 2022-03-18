package aep5.ads.tipoDePagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TIpoDePagamentoRepository extends JpaRepository<TipoDePagamento,Long> {
}
