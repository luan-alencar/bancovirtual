package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import david.augusto.luan.domain.Pessoa;
import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.enumeration.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaDTO implements Serializable {

	private Long id;

	private Pessoa pessoa;

	private StatusEnum situacao;

	private List<Transacao> transacoes;
	
	private Double  saldo;
	
	private Double limiteValor;
	
	private String tipo;
	
	private LocalDateTime dataCriacao;

}
