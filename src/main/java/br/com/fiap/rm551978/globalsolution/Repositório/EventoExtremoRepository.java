package br.com.fiap.rm551978.globalsolution.Repositório;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.rm551978.globalsolution.model.EventoExtremo;

@Repository
public interface EventoExtremoRepository extends JpaRepository<EventoExtremo, Long> {
}