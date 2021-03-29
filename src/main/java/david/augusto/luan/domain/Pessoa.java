package david.augusto.luan.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_PESSOA")
@Getter
@Setter
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -2448993761122309131L;

	/**
	 * @author Luan Augusto
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Length(min = 11, max = 11)
	@Column(name = "CPF", unique = true, nullable = false)
	private String cpf;

	@Column(name = "DATA_NASCIMENTO")
	private LocalDateTime dataNascimento;

	@JsonIgnore
	@OneToMany(mappedBy = "PESSOA", fetch = FetchType.EAGER)
	private List<Conta> contas = new ArrayList<>();
}
