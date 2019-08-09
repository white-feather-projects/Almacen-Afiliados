package com.cbp.web.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;
import org.tempuri.EmitirTarjetaVerificadaResponse;
import org.tempuri.EstadoImpresora;
import org.tempuri.EstadoImpresoraResponse;
import org.tempuri.Service1;
import org.tempuri.Service1Soap;

import com.cbp.web.dao.ImpresoraDAO;
import com.cbp.web.dto.EmitirTarjetaVerificadaDTO;
import com.cbp.web.dto.EstadoImpresoraDTO;
import com.cbp.web.util.Util;

@Service
public class ImpresoraService extends Util implements ImpresoraDAO{

	
	/////////////////////////////////
	///////Estado de la Impresora////
	/////////////////////////////////
	
	@Override
	public EstadoImpresoraResponse Estado_Impresora(EstadoImpresoraDTO parsImpresoraIp) {
		//Tipo Respuesta......
		EstadoImpresoraResponse respuestaImpresora = new EstadoImpresoraResponse();
		
		//Service....
		try {
			Service1 ser = new Service1(new URL("http://ec2-18-216-122-153.us-east-2.compute.amazonaws.com/Service1.asmx?wsdl"));
	        Service1Soap Client = ser.getService1Soap(); 
	        System.out.println("Respuesta: "+parsImpresoraIp.getParsImpresoraIp());
	        respuestaImpresora.setEstadoImpresoraResult(Client.estadoImpresora(parsImpresoraIp.getParsImpresoraIp())); 
	        /*
	        System.out.println("Test Service: "+Client.estadoImpresora("190.147.1.53"));*/
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return respuestaImpresora;
	}
	
	/////////////////////////////////
	///////Emision de Tarjetas///////
	/////////////////////////////////
	
	@Override
	public EmitirTarjetaVerificadaResponse Emitir_Tarjeta_Verificada(EmitirTarjetaVerificadaDTO emitirTarjetaverificada) {
		//Tipo Respuesta......
		EmitirTarjetaVerificadaResponse respuestaImpresora = new EmitirTarjetaVerificadaResponse();
		
		//Service....
		try {
			Service1 ser = new Service1(new URL("http://ec2-18-216-122-153.us-east-2.compute.amazonaws.com/Service1.asmx?wsdl"));
			Service1Soap client = ser.getService1Soap(); 
			System.out.println("Respuesta: "+emitirTarjetaverificada.getParsImpresoraIP()+" -- "+emitirTarjetaverificada.getParsTarjeta()+" -- "+emitirTarjetaverificada.getParsClienteNom());
			respuestaImpresora.setEmitirTarjetaVerificadaResult(client.emitirTarjetaVerificada(emitirTarjetaverificada.getParsImpresoraIP(), emitirTarjetaverificada.getParsTarjeta(), emitirTarjetaverificada.getParsClienteNom())); 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		return respuestaImpresora;
	}
	
}
