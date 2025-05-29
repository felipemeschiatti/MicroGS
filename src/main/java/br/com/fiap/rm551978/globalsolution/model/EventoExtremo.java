package br.com.fiap.rm551978.globalsolution.model;




import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento_extremo")
public class EventoExtremo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(nullable = false)
    private String localizacao;

    @Column(length = 1000)
    private String descricao;

    @Column(length = 500)
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
}
