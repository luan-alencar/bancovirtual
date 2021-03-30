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
import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.ContaDTO;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	Page<Usuario> filtrar(@Param("filtro") String filtro, Pageable peageble);

	Page<ContaDTO> findByIdAndStatus(@Param("filtro") FiltroBase filtro, @Param("isVazio") boolean isVazio,
			Pageable peageble);

	@Modifying
	@Query("UPDATE CONTA C SET C.SALDO = C.SALDO + ?1 WHERE C.ID = ?2")
	void setFixedSaldoFor(Double quantidade, Long id);

	Conta findByIdConta(Long id);

	@Modifying
	@Query("UPDATE CONTA C SET C.SALDO = C.SALDO + ?1 WHERE C.ID = ?2")
	void setFixedSaldo(Double quantidade, Long id);

}
