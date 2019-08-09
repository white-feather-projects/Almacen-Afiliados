package com.cbp.web.dao;

import org.tempuri.EmitirTarjeta;
import org.tempuri.EmitirTarjetaResponse;
import org.tempuri.EmitirTarjetaVerificadaResponse;
import org.tempuri.EstadoImpresora;
import org.tempuri.EstadoImpresoraResponse;

import com.cbp.web.dto.EmitirTarjetaVerificadaDTO;
import com.cbp.web.dto.EstadoImpresoraDTO;
import com.cbp.web.dto.RespuestaDTO;

public interface ImpresoraDAO {

	public EstadoImpresoraResponse Estado_Impresora(EstadoImpresoraDTO parsImpresoraIp);
	
	public EmitirTarjetaVerificadaResponse Emitir_Tarjeta_Verificada(EmitirTarjetaVerificadaDTO emitirTarjetaverificada);
	
}
