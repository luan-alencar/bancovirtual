package david.augusto.luan.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.domain.Transacao;
import david.augusto.luan.domain.Usuario;

@Service
public class DBService {

	public void instantiateTestDatabase() throws ParseException {
		
		Conta conta = new Conta();
		
//		conta.set
		
		Usuario usuario = new Usuario();
		
		Transacao transacao = new Transacao();
		
	}
}
