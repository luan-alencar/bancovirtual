package david.augusto.luan.service.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoContaEnum {

	C("Corrente"), P("Poupança");

	private String value;

}
