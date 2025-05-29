package br.com.fiap.rm551978.globalsolution.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.rm551978.globalsolution.Repositório.EventoExtremoRepository;
import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoDTO;
import br.com.fiap.rm551978.globalsolution.model.EventoExtremo;

import java.util.Optional;

@Service
public class EventoExtremoServiceImpl implements EventoExtremoService {

    @Autowired
    private EventoExtremoRepository repo;

    private EventoExtremoDTO toDTO(EventoExtremo e) {
        EventoExtremoDTO dto = new EventoExtremoDTO();
        dto.setId(e.getId());
        dto.setTipo(e.getTipo());
        dto.setDataInicio(e.getDataInicio());
        dto.setDataFim(e.getDataFim());
        dto.setLocalizacao(e.getLocalizacao());
        dto.setDescricao(e.getDescricao());
        dto.setImpacto(e.getImpacto());
        return dto;
    }

    private EventoExtremo toEntity(EventoExtremoDTO dto) {
        EventoExtremo e = new EventoExtremo();
        e.setTipo(dto.getTipo());
        e.setDataInicio(dto.getDataInicio());
        e.setDataFim(dto.getDataFim());
        e.setLocalizacao(dto.getLocalizacao());
        e.setDescricao(dto.getDescricao());
        e.setImpacto(dto.getImpacto());
        return e;
    }

    @Override
    public EventoExtremoDTO criar(EventoExtremoDTO dto) {
        EventoExtremo e = repo.save(toEntity(dto));
        return toDTO(e);
    }

    @Override
    public EventoExtremoDTO atualizar(Long id, EventoExtremoDTO dto) {
        Optional<EventoExtremo> opt = repo.findById(id);
        if (!opt.isPresent()) {
            throw new RuntimeException("Evento não encontrado");
        }
        EventoExtremo e = opt.get();
        e.setTipo(dto.getTipo());
        e.setDataInicio(dto.getDataInicio());
        e.setDataFim(dto.getDataFim());
        e.setLocalizacao(dto.getLocalizacao());
        e.setDescricao(dto.getDescricao());
        e.setImpacto(dto.getImpacto());
        EventoExtremo atualizado = repo.save(e);
        return toDTO(atualizado);
    }

    @Override
    public void excluir(Long id) {
        repo.deleteById(id);
    }

    @Override
    public EventoExtremoDTO buscarPorId(Long id) {
        return repo.findById(id)
                   .map(this::toDTO)
                   .orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    @Override
    public List<EventoExtremoDTO> listarTodos() {
        return repo.findAll()
                   .stream()
                   .map(this::toDTO)
                   .collect(Collectors.toList());
    }
}