package david.augusto.luan.resource;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import david.augusto.luan.domain.FiltroBase;
import david.augusto.luan.repository.ContaRepository;
import david.augusto.luan.service.ContaService;
import david.augusto.luan.service.dto.ContaDTO;
import david.augusto.luan.service.mapper.ContaMapper;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contas")
@Slf4j
public class ContaResource {

	private final ContaService service;

	private final ContaMapper mapper;

	private final ContaRepository repository;

	@PostMapping
	@Timed
	public ResponseEntity<Void> createConta(@Valid @RequestBody ContaDTO contaDTO) {
		log.debug("Requisição REST para criar uma Conta: {}", contaDTO);
		service.salvar(contaDTO);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/listar")
	@Timed
	public ResponseEntity<Page<ContaDTO>> listarContas(@RequestBody(required = false) FiltroBase filtro,
			Pageable peageble) {
		log.debug("Requisição REST para listar as Contas pelo o filtro: {}", filtro, peageble);
		Page<ContaDTO> listaConta = service.findPageble(filtro, peageble);
		return ResponseEntity.ok(listaConta);
	}

}
