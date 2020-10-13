package com.wolox.prueba.infrastructure.controller;

import com.wolox.prueba.applicacion.dto.CommentDto;
import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.applicacion.port.CommentAppPort;
import com.wolox.prueba.applicacion.port.UserAppPort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Servicio de ", tags = "Comment")
@ApiResponses(value = {@ApiResponse(code = 200, message = "Exito|OK"), @ApiResponse(code = 201, message = "Creado"),
        @ApiResponse(code = 400, message = "Petici\u00f3n mal formada"),
        @ApiResponse(code = 401, message = "No autorizado"),
        @ApiResponse(code = 403, message = "Operaci\u00f3n no permitida"),
        @ApiResponse(code = 404, message = "No encontrado"),
        @ApiResponse(code = 500, message = "Error interno, comun\u00edquese con el administrador de la API")})
@RestController
@RequestMapping("/api/${app.endpoint.version}/comment")
public class CommentController {

    @Autowired
    private CommentAppPort commentAppPort;

    @GetMapping
    public ResponseEntity<List<CommentDto>> listar() {
        return ResponseEntity.ok(commentAppPort.listar());
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<PhotoDto>> buscar(@PathVariable String username) {
        return null;
        //return ResponseEntity.ok(commentAppPort.buscar(username));
    }
}
