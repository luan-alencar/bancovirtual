package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.domain.Pessoa;
import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.enumeration.TipoContaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaDTO implements Serializable {

	private Long id;

	private Pessoa pessoa;

	private TipoContaEnum situacao;

	private List<Transacao> transacoes = new ArrayList<Transacao>();

	private Double saldo;

	private Double limiteValor;

	private String tipo;

	private LocalDateTime dataCriacao;

}
