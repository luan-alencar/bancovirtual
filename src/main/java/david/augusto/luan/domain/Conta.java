package david.augusto.luan.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

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

	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;

	@Enumerated(EnumType.STRING)
	@Column(name = "ST_CONTA", nullable = false) // ST_CONTA: Situacao Conta
	private TipoContaEnum situacao;

	@OneToMany(mappedBy = "conta")
	private List<Transacao> transacoes = new ArrayList<Transacao>();

	@Column(name = "SALDO", nullable = false)
	private Double saldo;

	@Column(name = "LIMITE_VALOR")
	private Double limiteValor;

	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacao;
}
