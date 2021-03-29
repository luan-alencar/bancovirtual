package david.augusto.luan.service.dto;

import java.time.LocalDateTime;

import david.augusto.luan.service.enumeration.SimNaoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DTOBase {

	private SimNaoEnum registroAtivo;

	private String criadoPor;

	private LocalDateTime dataCadastro;

	private String justificativa;
}
