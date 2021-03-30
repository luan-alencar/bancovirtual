package david.augusto.luan.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import david.augusto.luan.domain.FiltroBase;
import david.augusto.luan.service.UsuarioService;
import david.augusto.luan.service.dto.UsuarioDTO;
import io.micrometer.core.annotation.Timed;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usuarios")
@Slf4j
public class UsuarioResource {

	private final UsuarioService service;


	@PostMapping
	@Timed
	public ResponseEntity<Void> createUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
		log.debug("Requisição REST para criar uma Conta: {}", usuarioDTO);
		service.salvar(usuarioDTO);
		return ResponseEntity.ok().build();
	}

	// " Esse filtro contém os campos que você vai querer filtrar na listagem
	// Por excemplo: numero da conta, pelas pessoas, etc "
	@GetMapping
	@Timed
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios(@RequestBody UsuarioDTO usuarioDTO) {
		log.debug("Requisição REST para listar as Contas pelo o filtro: {}", usuarioDTO);
		List<UsuarioDTO> listaUsuario = service.listarUsuarios(usuarioDTO);
		return ResponseEntity.ok(listaUsuario);
	}

}
