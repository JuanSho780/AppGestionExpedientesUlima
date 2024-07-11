package modelo;


public class Usuario {
    private String DNI, nombreApellido, telefono, email;

    public Usuario(String DNI, String nombreApellido, String telefono, String email) {
        this.DNI = DNI;
        this.nombreApellido = nombreApellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telelfono) {
        this.telefono = telelfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
