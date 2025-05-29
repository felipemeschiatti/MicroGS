package br.com.fiap.rm551978.globalsolution.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoDTO;
import br.com.fiap.rm551978.globalsolution.service.EventoExtremoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/eventos")
@Tag(name = "EventoExtremo", description = "Gerencia eventos extremos")
public class EventoExtremoController {

    @Autowired
    private EventoExtremoService service;

    @PostMapping
    @Operation(summary = "Cria um novo evento extremo")
    public ResponseEntity<EventoExtremoDTO> criar(@RequestBody EventoExtremoDTO dto) {
        EventoExtremoDTO criado = service.criar(dto);
        return ResponseEntity.ok(criado);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza um evento existente")
    public ResponseEntity<EventoExtremoDTO> atualizar(
            @PathVariable Long id,
            @RequestBody EventoExtremoDTO dto
    ) {
        EventoExtremoDTO atualizado = service.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove um evento pelo ID")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca um evento por ID")
    public ResponseEntity<EventoExtremoDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    @Operation(summary = "Lista todos os eventos")
    public ResponseEntity<List<EventoExtremoDTO>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }
}