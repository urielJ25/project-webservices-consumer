/**
 * 
 */
package com.devpredator.projectwebservicesconsumer.client;

import java.time.LocalDateTime;

import com.devpredator.projectwebservicesconsumer.dto.EmpleadoDTO;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author cesarjimenez
 * 
 * Clase para Cconsumir un WebServices de Empledos con @GET
 *
 */
public class EmpleadoWSClient {
	/*
	 * 
	 * */
	public static void main(String[]  args) {
		
	// ::::::   GET    :::::::
		
		// GENERAR UN CLIENTE QUE NOS CONSUMA UN SERVICIOWEB ATRAVES DE UNA URL
//		Client client = ClientBuilder.newClient();
//		WebTarget webTarget = client.target("http://localhost:8080/project-webservices/devpredator/empleadosWS").path("consultarEmpleadosPorNumeroEmpleado").path("1234");	// URL A COMUNICARSE
//		
//		// INDICA TIPO DE PETICION
//		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
//		Response response = invocationBuilder.get(); // OTNENER UN GET
//		
//		if(response.getStatus() == 204) {
//			System.out.println("No se encontró el nombre");
//		}
//		
//		if (response.getStatus() == 200) {
//			// Leer un objeto
//			EmpleadoDTO empleadoDTO = response.readEntity(EmpleadoDTO.class);
//			
//			System.out.println("Nombre Empleado: " + empleadoDTO.getNombre());
//		}
		
		
		// ::::: POST :::::
		
		
		// GENERAR UN CLIENTE QUE NOS CONSUMA UN SERVICIOWEB ATRAVES DE UNA URL
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/project-webservices/devpredator/empleadosWS").path("guardarEmpleados");	// URL A COMUNICARSE
	
		EmpleadoDTO emp = new EmpleadoDTO();
		emp.setNumeroEmpleado("7834");
		emp.setNombre("Luis Jesus");
		emp.setPrimerApellido("Romero");
		emp.setEdad(50);
		emp.setFechaCreacion(LocalDateTime.now());
		
		// INDICA TIPO DE PETICION
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(emp, MediaType.APPLICATION_JSON)); // OTNENER UN GET
		
		if (response.getStatus() == 400) {
			String error = response.readEntity(String.class);
			
			System.out.println(error);
		}
		
		if (response.getStatus() == 200) {
			EmpleadoDTO empleadoDTO = response.readEntity(EmpleadoDTO.class);
			
			System.out.println(empleadoDTO.getNombre());
			System.out.println(empleadoDTO.getFechaCreacion());
		}
		
	}
}
