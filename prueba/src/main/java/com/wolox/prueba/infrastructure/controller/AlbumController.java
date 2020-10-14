package com.wolox.prueba.infrastructure.controller;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.dto.AlbumProfileDto;
import com.wolox.prueba.applicacion.port.AlbumAppPort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Servicio de ", tags = "Album")
@ApiResponses(value = {@ApiResponse(code = 200, message = "Exito|OK"), @ApiResponse(code = 201, message = "Creado"),
        @ApiResponse(code = 400, message = "Petici\u00f3n mal formada"),
        @ApiResponse(code = 401, message = "No autorizado"),
        @ApiResponse(code = 403, message = "Operaci\u00f3n no permitida"),
        @ApiResponse(code = 404, message = "No encontrado"),
        @ApiResponse(code = 500, message = "Error interno, comun\u00edquese con el administrador de la API")})
@RestController
@RequestMapping("/api/${app.endpoint.version}/album")
public class AlbumController {

    @Autowired
    private AlbumAppPort albumAppPort;

    @GetMapping
    public ResponseEntity<List<AlbumDto>> listar() {
        return ResponseEntity.ok(albumAppPort.listar());
    }

    @PostMapping
    public ResponseEntity<AlbumProfileDto> guardar(@RequestBody AlbumProfileDto albumDto) {
        return ResponseEntity.ok(albumAppPort.guardar(albumDto));
    }

}
