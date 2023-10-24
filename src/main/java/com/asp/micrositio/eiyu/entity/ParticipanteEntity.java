package com.asp.micrositio.eiyu.entity;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "pblu")
@Validated
public class ParticipanteEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_pblu")
	private Long id;

	@Column(name = "prefijo_pblu")
	private Long prefijo;

	@ManyToOne
	@JoinColumn(name = "id_tipo_part")
	private TipoParticipanteEntity tipo;

	@NotEmpty
	@Column(name = "clabe_pblu")
	private String clabe;

	private String descripcion;

	private Boolean activo = false;

	private Date fechaCreacion = new Date();

	private String usuarioCreacion;

	@Column(name = "contador_udn")
	private Long contadorUDN;

	private String rfc;
	private String domicilio;
	private String localidad;
	private String colonia;
	private String codigoPostal;
	private String telefono;
	private Date fechaInicioMonto;
	private Date fechaFinMonto;

	@Column(name = "blu_limite")
	private Long limite;
	private String aliado;

}
