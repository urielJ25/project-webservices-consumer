package com.devpredator.projectwebservicesconsumer.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

/**
 * Mappear  gracias al tipo de datos 
 * */

public class EmpleadoDTO {

private String numeroEmpleado;
	
	private String nombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private int edad;
	// Deserialice de arreglo a un tipo de objeto(normal) JSON
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDateTime fechaCreacion;

	/**
	 * @return the numeroEmpleadoString
	 */
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	/**
	 * @param numeroEmpleadoString the numeroEmpleadoString to set
	 */
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	/**
	 * @return the nombreString
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombreString the nombreString to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
