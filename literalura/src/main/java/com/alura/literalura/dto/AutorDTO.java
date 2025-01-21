package com.alura.literalura.dto;

public record AutorDTO(
        String nombre,
        Integer fechaNacimiento,
        Integer fechaDeMuerte
) {
    public AutorDTO(String nombre,Integer fechaNacimiento,Integer fechaDeMuerte) {
        this.nombre= nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDeMuerte = fechaDeMuerte;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getFechaMuerte() {
        return fechaDeMuerte;
    }

    @Override
    public String toString() {
        return String.format("%s (Nacido: %d, Fallecido: %d)",
                nombre,
                fechaNacimiento,
                fechaDeMuerte);
    }
}
