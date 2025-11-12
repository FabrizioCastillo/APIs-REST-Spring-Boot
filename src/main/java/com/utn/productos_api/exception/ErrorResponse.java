package com.utn.productos_api.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    // 1. Constructor vacío (el que ya tenías)
    public ErrorResponse() {
    }

    // 2. Constructor con todos los argumentos (¡Este es el que faltaba!)
    public ErrorResponse(LocalDateTime timestamp, int status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    // --- Getters y Setters Manuales ---

}