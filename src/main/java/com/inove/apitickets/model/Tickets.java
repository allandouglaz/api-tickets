package com.inove.apitickets.model;
import java.time.LocalDate;


import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_ticket")
@SequenceGenerator(name = "seq_ticket", sequenceName = "seq_ticket", allocationSize = 1, initialValue = 1)
public class Tickets {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
	private Long id;
    @Column(name = "DESCRICAO", nullable = false, length =50)
	private String descricao;
    @Column(name = "DATA", nullable = false)
	private LocalDate data;
    @Column(name = "LOJA", nullable = false)
	private String loja; 
    @Column(name= "PROBLEMA", nullable= false, length = 200)
	private String problema;
	
    @Deprecated
	public Tickets() {
		
	}
	
    private Tickets(@NonNull String descricao, @NonNull String problema, @NonNull LocalDate data) {
        setDescricao(descricao);
        setProblema(problema);
    }
    
    

    
	public Tickets(Long id, String descricao, LocalDate data, String loja, String problema) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.loja = loja;
		this.problema = problema;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
}
