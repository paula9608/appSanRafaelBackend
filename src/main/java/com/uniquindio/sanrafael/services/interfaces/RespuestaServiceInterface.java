package com.uniquindio.sanrafael.services.interfaces;

import java.util.List;

import com.uniquindio.sanrafael.entitys.Respuesta;

public interface RespuestaServiceInterface {
Respuesta save(Respuesta respuesta);

List<Respuesta> findByPreguntaId(Long idPregunta);

}
