package proyectobim3.erick.lemus;

public class contacto {

    String telefono, nombre, domicilio;

    public contacto(String telefono, String nombre, String domicilio) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String verTelefono() {
        return telefono;
    }

    public String verNombre() {
        return nombre;
    }

    public String verDomicilio() {
        return domicilio;
    }

    public void verTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void verNombre(String nombre) {
        this.nombre = nombre;
    }

    public void verDomicilio(String domicilio) {
        this.domicilio = domicilio;

    }

}
