package david.augusto.luan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import david.augusto.luan.domain.Transacao;

import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
