package david.augusto.luan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.domain.FiltroBase;
import david.augusto.luan.service.dto.ContaDTO;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface ContaRepository extends JpaRepository<Conta, Long> {

	Page<ContaDTO> buscarListagemContasFiltro(@Param("filtro") String atributo, Pageable peageble);

	Page<ContaDTO> findByIdAndStatus(@Param("filtro") FiltroBase filtro, @Param("isVazio") boolean isVazio,
			Pageable peageble);

	@Modifying
	@Query("UPDATE TB_CONTA C SET C.SALDO = C.SALDO + ?1 WHERE C.ID = ?2")
	void setFixedSaldoFor(Double quantidade, Long id);

	Conta findByIdConta(Long id);

	@Modifying
	@Query("UPDATE TB_CONTA C SET C.SALDO = C.SALDO + ?1 WHERE C.ID = ?2")
	void setFixedSaldo(Double quantidade, Long id);

}
