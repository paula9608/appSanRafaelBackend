package com.uniquindio.sanrafael.services.interfaces;

import java.util.List;

import com.uniquindio.sanrafael.entitys.Pregunta;

public interface PreguntaServiceInterface {
Pregunta save(Pregunta pregunta);
 List<Pregunta> findByTallerId(Long tallerId);
}
