package david.augusto.luan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.domain.FiltroBase;
import david.augusto.luan.repository.ContaRepository;
import david.augusto.luan.service.dto.ContaDTO;
import david.augusto.luan.service.enumeration.StatusEnum;
import david.augusto.luan.service.exception.RegraNegocioException;
import david.augusto.luan.service.mapper.ContaMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContaService {

	private final Conta conta;

	private final ContaRepository repository;

	private final ContaMapper mapper;

	public void sacar(Double valor, Long id) throws RegraNegocioException {
		if (valor > conta.getSaldo()) {
			throw new RegraNegocioException("Valor maior que saldo permitido");
		}
		repository.setFixedSaldo(valor, id);
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new RegraNegocioException("Operação inválida");
		}

		double novoSaldo = conta.getSaldo() + valor;
		conta.setSaldo(novoSaldo);
	}

	@Transactional(readOnly = true)
	public Page<ContaDTO> findPageble(FiltroBase filtro, Pageable peageble) {
		return repository.findByIdAndStatus(filtro, CollectionUtils.isEmpty(filtro.getIds()), peageble);
	}

	public Conta salvar(ContaDTO contaDTO) {
		contaDTO.setSituacao(StatusEnum.A);
		Conta conta = mapper.toEntity(contaDTO);
		return repository.save(conta);
	}

	
}
