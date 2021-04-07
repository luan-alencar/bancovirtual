package david.augusto.luan.service.dto;

import david.augusto.luan.service.enumeration.TipoContaEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ContaDTO implements Serializable {

	private Long id;

	private UsuarioDTO usuario;

	private TipoContaEnum situacao;

	private List<TransacaoDTO> transacoes = new ArrayList<>();

	private Double saldo;

	private Double limiteValor;

	private LocalDateTime dataCriacao;
}
