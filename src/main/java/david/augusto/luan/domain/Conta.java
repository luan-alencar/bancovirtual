package david.augusto.luan.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import david.augusto.luan.service.enumeration.TipoContaEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_CONTA")
@Getter
@Setter
public class Conta implements Serializable {

	private static final long serialVersionUID = 4881839220023654399L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CONTA")
	@SequenceGenerator(sequenceName = "SQ_CONTA", name = "SQ_CONTA", allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	private Pessoa pessoa;

	@Enumerated(EnumType.STRING)
	@Column(name = "ST_CONTA", nullable = false) // ST_CONTA: Situacao Conta
	private TipoContaEnum situacao;

	@OneToMany(mappedBy = "conta")
	private List<Transacao> transacoes = new ArrayList<Transacao>();

	@Column(nullable = false)
	private Double saldo;

	@Column(name = "LIMITE_VALOR")
	private Double limiteValor = 5.000;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacao;
}
