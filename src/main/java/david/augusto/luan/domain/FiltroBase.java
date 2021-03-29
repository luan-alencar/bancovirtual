package david.augusto.luan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.service.enumeration.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FiltroBase implements Serializable {

	private static final long serialVersionUID = 8173840384716916142L;

	private List<Long> ids = new ArrayList<>();
	
	private StatusEnum situacao;
}
