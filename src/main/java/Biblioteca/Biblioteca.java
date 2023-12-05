package Biblioteca;

public class Biblioteca {
    public Prestamo generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, String libro, String fechaInicio, String fechaTermino) {
        return new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);
    }
}