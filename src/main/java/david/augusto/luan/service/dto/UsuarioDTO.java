package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import david.augusto.luan.domain.Conta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO implements Serializable {

	private Long id;

	@NotNull
	private String nome;

	@NotBlank
	@Size(max = 11, min = 11)
	private String cpf;

	@NotBlank
	@Size(max = 15)
	private String telefone;

	@Size(max = 15)
	private String segundoTelefone;

	private LocalDateTime dataNascimento;

	private LocalDateTime dataCadastro;

	private List<Conta> contas = new ArrayList<>();

}
