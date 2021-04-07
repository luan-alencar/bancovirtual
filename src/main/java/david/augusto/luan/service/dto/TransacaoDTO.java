package david.augusto.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransacaoDTO implements Serializable {

	private Long id;

	private ContaDTO conta;

	private Double valor;

	private LocalDateTime dataTransacao;
}
