package david.augusto.luan.service.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusEnum {

	A("Ativo"), I("Inativo");

	private String value;

}
