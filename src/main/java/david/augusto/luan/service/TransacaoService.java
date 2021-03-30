package david.augusto.luan.service;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.repository.TransacaoRepository;
import david.augusto.luan.service.dto.ContaDTO;
import david.augusto.luan.service.dto.TransacaoDTO;
import david.augusto.luan.service.mapper.TransacaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class TransacaoService {

    private final TransacaoRepository repository;

    private final TransacaoMapper mapper;

    public TransacaoDTO salvar(TransacaoDTO transacaoDTO) {
        Transacao transacao = mapper.toEntity(transacaoDTO);
        transacao.setDataTransacao(LocalDateTime.now());
        repository.save(transacao);
        return mapper.toDto(transacao);
    }

    public List<TransacaoDTO> listar() {
        return mapper.toDto(repository.findAll());
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void buscarPorId(Long id) {
        repository.findById(id);
    }

    public List<TransacaoDTO> buscarContas(ContaDTO contaDTO) {
        List<Transacao> listaTransacao = repository.findByConta(contaDTO);
        return mapper.toDto(listaTransacao);
    }
}
