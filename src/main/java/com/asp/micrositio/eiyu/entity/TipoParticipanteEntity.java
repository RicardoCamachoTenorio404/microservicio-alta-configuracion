package com.asp.micrositio.eiyu.entity;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipo_participante")
@Validated
public class TipoParticipanteEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_tipo_part")
	private Long id;
	
	private String descripcion;
	
	private Boolean activo = true;
	
	private Date fechaCreacion = new Date();
	
	private String usuarioCreacion;
	
}
