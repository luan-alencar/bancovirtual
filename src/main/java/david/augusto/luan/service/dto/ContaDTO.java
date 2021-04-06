package david.augusto.luan.service.dto;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.domain.Usuario;
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

	private Usuario usuario;

	private String situacao;

	private List<Transacao> transacoes = new ArrayList<Transacao>();

	private Double saldo;

	private Double limiteValor;

	private LocalDateTime dataCriacao;
}
