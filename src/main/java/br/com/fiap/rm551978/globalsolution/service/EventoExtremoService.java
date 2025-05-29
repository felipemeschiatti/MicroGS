package br.com.fiap.rm551978.globalsolution.service;


import java.util.List;

import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoDTO;

public interface EventoExtremoService {
    EventoExtremoDTO create(EventoExtremoDTO dto);
    EventoExtremoDTO update(Long id, EventoExtremoDTO dto);
    void excluir(Long id);
    EventoExtremoDTO findbyid(Long id);
    List<EventoExtremoDTO> listarTodos();
}
