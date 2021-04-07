package david.augusto.luan.domain;

import david.augusto.luan.service.enumeration.TipoContaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CONTA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conta implements Serializable {

	private static final long serialVersionUID = 4881839220023654399L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CONTA")
	@SequenceGenerator(sequenceName = "SQ_CONTA", name = "SQ_CONTA", allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

	@Enumerated(EnumType.STRING)
	@Column(name = "ST_CONTA", nullable = false) // ST_CONTA: Situacao Conta
	private TipoContaEnum situacao;

	@OneToMany(mappedBy = "conta", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Transacao> transacoes = new ArrayList<>();

	@Column(name = "SALDO", nullable = false)
	private Double saldo;

	@Column(name = "LIMITE_VALOR")
	private Double limiteValor;

	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacao;
}
