package david.augusto.luan.repository;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.ContaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    List<Transacao> findByConta(ContaDTO contaDTO);

}
