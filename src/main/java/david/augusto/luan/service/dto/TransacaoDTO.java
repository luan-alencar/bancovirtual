package david.augusto.luan.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoDTO implements Serializable {

	private Long id;

	private Integer conta;

	private Double valor;

	private LocalDateTime dataTransacao;
}
