package david.augusto.luan.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_USUARIO")
@Getter
@Setter
public class Usuario implements Serializable {

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

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "SEGUNDO_TELEFONE")
    private String segundoTelefone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDateTime dataNascimento;

    @Column(name = "DATA_CADASTRO", nullable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Conta> contas = new ArrayList<>();
}
