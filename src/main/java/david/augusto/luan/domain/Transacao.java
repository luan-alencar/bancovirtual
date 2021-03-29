package david.augusto.luan.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_TRANSACAO")
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
	private Conta conta;

	@Column(name = "VALOR")
	private double valor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_TRANSACAO")
	private LocalDateTime dataTransacao;
}
