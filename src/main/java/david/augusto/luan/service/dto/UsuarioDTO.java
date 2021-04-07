package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import david.augusto.luan.domain.Conta;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UsuarioDTO implements Serializable {

	private Long id;

	private String nome;

	private String cpf;

	private String telefone;

	private String segundoTelefone;

	private String email;

	private LocalDateTime dataNascimento;

	private LocalDateTime dataCadastro;

	private List<ContaDTO> contas = new ArrayList<>();

}
