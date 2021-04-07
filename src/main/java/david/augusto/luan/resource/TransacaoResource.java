package david.augusto.luan.resource;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.TransacaoService;
import david.augusto.luan.service.dto.TransacaoDTO;
import david.augusto.luan.service.mapper.TransacaoMapper;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transacoes")
public class TransacaoResource {

    private final TransacaoService service;

    private final TransacaoMapper mapper;

    @PostMapping
    public ResponseEntity<TransacaoDTO> depositar(@RequestBody TransacaoDTO transacaoDTO) {
        Transacao transacao = mapper.toEntity(transacaoDTO);
        service.salvar(transacaoDTO);
        return ResponseEntity.ok(mapper.toDTO(transacao));
    }

    @PatchMapping("/{id}/deletar")
    @Timed
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @Timed
    public ResponseEntity<?> listar() {
        List<Transacao> transacoes = mapper.listagemEntity(service.listar());
        return new ResponseEntity<>(transacoes, HttpStatus.OK);
    }

    @GetMapping("/{id}/buscar")
    @Timed
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        service.buscarPorId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}