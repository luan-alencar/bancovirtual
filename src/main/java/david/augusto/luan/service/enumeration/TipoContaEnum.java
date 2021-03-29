package david.augusto.luan.service.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoContaEnum {

	A("Corrente"), I("Poupança");

	private String value;

}
