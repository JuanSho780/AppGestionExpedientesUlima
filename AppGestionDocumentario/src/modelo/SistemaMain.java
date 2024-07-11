package modelo;
    import tda.*;

public abstract class SistemaMain {
    public static Lista<AdministradorDelSistema> administradores = new Lista();
    
    public static void registrarAdministrador(String nombreApellido, String nomUsuario, String contraseña){
        AdministradorDelSistema nuevo = new AdministradorDelSistema(nombreApellido, nomUsuario, contraseña);
        administradores.agregar(nuevo);
    }
    
    public static AdministradorDelSistema autenticarUsuario(String nomUsuario, String contraseña){
        Nodo<AdministradorDelSistema> ptr = administradores.getCabeza();
        while(ptr != null){
            if (ptr.getElemento().getNomUsuario().equals(nomUsuario) && ptr.getElemento().getContraseña().equals(contraseña)) {
                return ptr.getElemento();
            }
            ptr = ptr.getSgteNodo();
        }
        return null; //si esta función retorna "null": no existe el usuario. Si sí existe, te retorna el administrador que ha iniciado sesión.
    }
}
