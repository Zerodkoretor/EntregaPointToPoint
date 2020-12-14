package com.webEntrega.Entrega.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="TB_ENTREGA")
public class EntregaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
    @Column(name = "REMETENTE")
	private String remetente;
	
	
	@Column(name = "DESTINARIO")
	private String destinario;
	
	
	@Column(name = "STATUS")
	private Status status;
	
	public EntregaEntity() {}
	
	

	public EntregaEntity(@NotBlank String remetente, @NotBlank String destinario, @NotBlank Status status) {
		super();
		this.remetente = remetente;
		this.destinario = destinario;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinario() {
		return destinario;
	}

	public void setDestinario(String destinario) {
		this.destinario = destinario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
