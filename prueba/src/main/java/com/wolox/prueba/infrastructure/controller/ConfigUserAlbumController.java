package com.wolox.prueba.infrastructure.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Servicio de ", tags = "profile")
@ApiResponses(value = {@ApiResponse(code = 200, message = "Exito|OK"), @ApiResponse(code = 201, message = "Creado"),
        @ApiResponse(code = 400, message = "Petici\u00f3n mal formada"),
        @ApiResponse(code = 401, message = "No autorizado"),
        @ApiResponse(code = 403, message = "Operaci\u00f3n no permitida"),
        @ApiResponse(code = 404, message = "No encontrado"),
        @ApiResponse(code = 500, message = "Error interno, comun\u00edquese con el administrador de la API")})
@RestController
@RequestMapping("/api/${app.endpoint.version}/profile")
public class ConfigUserAlbumController {



}
