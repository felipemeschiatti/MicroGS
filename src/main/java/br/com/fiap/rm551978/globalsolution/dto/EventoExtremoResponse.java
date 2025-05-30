package br.com.fiap.rm551978.globalsolution.dto;


    import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventoExtremoResponse {
    private Long id;
    private String tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localizacao;
    private String descricao;
    private String impacto;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

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
         this.tipo = tipo; 
        }
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
    public LocalDateTime getCriadoEm() {
         return criadoEm; 
        }
    public void setCriadoEm(LocalDateTime criadoEm) {
         this.criadoEm = criadoEm; 
        }
    public LocalDateTime getAtualizadoEm() {
         return atualizadoEm; 
        }
    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
         this.atualizadoEm = atualizadoEm; 
        }
}
    

