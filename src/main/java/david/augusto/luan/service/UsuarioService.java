package david.augusto.luan.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.repository.UsuarioRepository;
import david.augusto.luan.service.dto.UsuarioDTO;
import david.augusto.luan.service.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

	private final UsuarioMapper mapper;

	private final UsuarioRepository repository;

	public Usuario salvar(UsuarioDTO usuarioDTO) {

		Usuario usuario = mapper.toEntity(usuarioDTO);
		usuario.setDataCadastro(LocalDateTime.now());
		return repository.save(usuario);
	}

	@Transactional(readOnly = true)
	public List<UsuarioDTO> listarUsuarios(UsuarioDTO usuarioDTO) {
		return mapper.listagemDTO(repository.findAll());
	}

}
