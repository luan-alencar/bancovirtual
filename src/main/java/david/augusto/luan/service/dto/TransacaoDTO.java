package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import david.augusto.luan.domain.Conta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoDTO implements Serializable {

	private Long id;

	private Conta conta;

	private Double valor;

	private LocalDateTime dataTransacao;
}
