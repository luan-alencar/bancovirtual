package david.augusto.luan.service.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SimNaoEnum {

	S("Sim"), N("Não");

	private String valor;
}
