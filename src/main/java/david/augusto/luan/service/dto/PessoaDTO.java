package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.domain.Conta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO implements Serializable {

	private Long id;

	private String nome;

	private String cpf;

	private LocalDateTime dataNascimento;

	private List<Conta> contas = new ArrayList<>();

}
