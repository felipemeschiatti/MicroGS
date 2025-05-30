package br.com.fiap.rm551978.globalsolution.dto;

import java.time.LocalDate;

import br.com.fiap.rm551978.globalsolution.model.EventoExtremo;

public class EventoExtremoRequestUpdate {
    private Long id;
    private String tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localizacao;
    private String descricao;
    private String impacto;

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) {
         this.id = id; 
        }
    public String getTipo() {
         return tipo; 
        }
    public void setTipo(String tipo) {
         this.tipo = tipo; }
    public LocalDate getDataInicio() {
         return dataInicio;
         }
    public void setDataInicio(LocalDate dataInicio) {
         this.dataInicio = dataInicio; 
        }
    public LocalDate getDataFim() {
         return dataFim; 
        }
    public void setDataFim(LocalDate dataFim) {
         this.dataFim = dataFim; 
        }
    public String getLocalizacao() {
         return localizacao; 
        }
    public void setLocalizacao(String localizacao) {
         this.localizacao = localizacao; 
        }
    public String getDescricao() {
         return descricao; 
        }
    public void setDescricao(String descricao) {
         this.descricao = descricao; 
        }
    public String getImpacto() {
         return impacto; 
        }
    public void setImpacto(String impacto) {
         this.impacto = impacto; 
        }
    public Object toModel(EventoExtremo e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toModel'");
    }
}
