package david.augusto.luan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_TRANSACAO")
@Getter
@Setter
public class Transacao implements Serializable {

	/*
	 * @author Luan Augusto
	 */

	private static final long serialVersionUID = 599246688362408958L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TRANSACAO")
	@SequenceGenerator(sequenceName = "SQ_TRANSACAO", name = "SQ_TRANSACAO", allocationSize = 1)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "conta")
	private Conta conta;

	@Column(name = "VALOR")
	private Double valor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_TRANSACAO")
	private LocalDateTime dataTransacao;
}
