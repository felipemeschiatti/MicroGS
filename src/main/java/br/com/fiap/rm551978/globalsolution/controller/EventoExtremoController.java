package br.com.fiap.rm551978.globalsolution.controller;




import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoRequestCreate;
import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoRequestUpdate;
import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoResponse;
import br.com.fiap.rm551978.globalsolution.model.EventoExtremo;
import br.com.fiap.rm551978.globalsolution.service.EventoExtremoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/eventos")
@Tag(name = "EventoExtremo", description = "Gerencia eventos extremos")
public class EventoExtremoController {

    @Autowired
    private EventoExtremoService service;

    @PostMapping
    @Operation(summary = "Cria um novo evento extremo")
    public ResponseEntity<EventoExtremoResponse> criar(@RequestBody EventoExtremoRequestCreate req) {
        EventoExtremo e = service.create(req);
        return ResponseEntity.ok(new EventoExtremoResponse());
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Atualiza um evento existente")
    public ResponseEntity<EventoExtremoResponse> atualizar(
        @PathVariable Long id,
        @RequestBody EventoExtremoRequestUpdate req
    ) {
        return service.update(id, req)
            .map(e -> ResponseEntity.ok(new EventoExtremoResponse()))
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove um evento pelo ID")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (service.delete(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca um evento por ID")
    public ResponseEntity<EventoExtremoResponse> buscarPorId(@PathVariable Long id) {
        return service.getById(id)
            .map(e -> ResponseEntity.ok(new EventoExtremoResponse()))
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    @Operation(summary = "Lista todos os eventos")
    public ResponseEntity<List<EventoExtremoResponse>> listarTodos() {
        List<EventoExtremoResponse> list = service.getAll()
            .stream()
            .map(e -> new EventoExtremoResponse()) 
            .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }
}
