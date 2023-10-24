package com.asp.micrositio.eiyu.model;

import java.util.Date;

import lombok.Data;

@Data
public class Participante {

	private Long id;

	private Long prefijo;

	private TipoParticipante tipo;

	private String clabe;

	private String descripcion;

	private Boolean activo = false;

	private Date fechaCreacion = new Date();

	private String usuarioCreacion;

	private Long contadorUDN;

	private String rfc;
	private String domicilio;
	private String localidad;
	private String colonia;
	private String codigoPostal;
	private String telefono;
	private Date fechaInicioMonto;
	private Date fechaFinMonto;

	private Long limite;
	private String aliado;
	
}
