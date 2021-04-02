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
import david.augusto.luan.service.enumeration.TipoContaEnum;
import david.augusto.luan.service.mapper.ContaMapper;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ContaService {

	private final ContaRepository repository;

	private final ContaMapper mapper;

	@Transactional(readOnly = true)
	public Page<ContaDTO> findPageble(FiltroBase filtro, Pageable peageble) {
		return repository.findByIdAndStatus(filtro, CollectionUtils.isEmpty(filtro.getIds()), peageble);
	}

	public ContaDTO salvar(ContaDTO contaDTO) {
		contaDTO.setSituacao(TipoContaEnum.A);
		Conta conta = mapper.toEntity(contaDTO);
		return mapper.toDto(repository.save(conta));
	}

}
