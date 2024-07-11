package modelo;
    import java.io.File;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import tda.*;

public class AdministradorDelSistema {

    private Lista<Dependencia> listDependencias;
    private Pila<Usuario> PilaUsuarios;
    private String nombreApellido;
    private String nomUsuario, contraseña;

    public AdministradorDelSistema(String nombreApellido, String nomUsuario, String contraseña) {
        this.nombreApellido = nombreApellido;
        this.nomUsuario = nomUsuario;
        this.contraseña = contraseña;
        this.listDependencias = new Lista();
        this.PilaUsuarios = new Pila();
    }
    
    public String[] obtenerExpedienteConID(String UID){
        String[] resp = new String[7];
        Nodo<Dependencia> ptr = this.listDependencias.getCabeza();
        while(ptr != null){
            Dependencia dependenciaActual = ptr.getElemento();
            Cola<Expediente> aux = new Cola();
            while(!dependenciaActual.getExpedientes().esVacia()){
                Expediente ExpActual = dependenciaActual.getExpedientes().desencolar();
                if (ExpActual.getID().equals(UID)) {
                    resp[0] = ExpActual.getInteresado().getNombreApellido();
                    resp[1] = ExpActual.getID();
                    resp[2] = ExpActual.getDepenActual().getNombre();
                    resp[3] = ExpActual.getAsunto();
                    resp[4] = String.valueOf(ExpActual.getPrioridad());
                    
                    //Convertir Date en String con ese formato
                    Date horaInicio = ExpActual.getHoraInicio();
                    SimpleDateFormat horaString = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    resp[5] = horaString.format(horaInicio);
                    resp[6] = ExpActual.getDocReferencia().getName();
                }
                aux.encolar(ExpActual);
            }
            while(!aux.esVacia()){
                dependenciaActual.getExpedientes().encolar(aux.desencolar());
            }
            ptr = ptr.getSgteNodo();
        }
        return resp;
    }
    
    public boolean existeUsuario(String DNI){
        boolean resp = false;
        Pila<Usuario> aux = new Pila();
        while(!this.PilaUsuarios.isEmpty()){
            Usuario actual = this.PilaUsuarios.pop();
            if (actual.getDNI().equals(DNI)) {
                resp = true;
            }
            aux.push(actual);
        }
        while(!aux.isEmpty()){
            this.PilaUsuarios.push(aux.pop());
        }
        return resp;
    }
    
    public void registrarUsuario(String DNI, String nombreApellido, String telefono, String email){
        Usuario nuevo = new Usuario(DNI, nombreApellido, telefono, email);
        this.PilaUsuarios.push(nuevo);
    }
    
    public void registrarDependencia(String nombre){
        Dependencia nuevo = new Dependencia(nombre);
        this.listDependencias.agregar(nuevo);
    }
    
    public Expediente registrarExpedienteEnDependencia(int prioridad, String DNIinteresado, String asunto, String nombreDependencia, File docRef){ //int prioridad, Usuario interesado, String asunto, String referencia -> contructor expediente
        Pila<Usuario> aux = new Pila();
        Expediente nuevo = null;
        while(!this.PilaUsuarios.isEmpty()){
            Usuario actual = this.PilaUsuarios.pop();
            if (actual.getDNI().equals(DNIinteresado)) {
                Nodo<Dependencia> ptr = this.listDependencias.getCabeza();
                while(ptr != null && !ptr.getElemento().getNombre().equals(nombreDependencia)){
                    ptr = ptr.getSgteNodo();
                }
                if (ptr != null) {
                    nuevo = ptr.getElemento().ingresarTramite(prioridad, actual, asunto, docRef);
                }     
            }
            aux.push(actual);
        }
        while(!aux.isEmpty()){
            this.PilaUsuarios.push(aux.pop());
        }
        return nuevo;
    }
    
    public Dependencia obtenerDependencia(String nombreDependencia){ //retornar la dependencia (para hacer cambios) a partir de su nombre
        Nodo<Dependencia> ptr = this.listDependencias.getCabeza();
        while(ptr != null && !ptr.getElemento().getNombre().equals(nombreDependencia)){
            ptr = ptr.getSgteNodo();
        }
        if(ptr != null){
            return ptr.getElemento();
        }
        return null;
    }
    
    public void moverExpedienteporID(String nombreDependenciaDesde, String nombreDependenciaHasta, String UID){
        Dependencia desde = this.obtenerDependencia(nombreDependenciaDesde);
        Dependencia hasta = this.obtenerDependencia(nombreDependenciaHasta);
        
        if (desde != null && hasta != null) {
            desde.finalizarTramiteConID(UID);
            Expediente exp = ExpedientesFinalizados.eliminarUltimoFinalizado();
            
            hasta.ingresarTramite(exp);
        }
    }
    
    public void moverExpedienteAntiguedad(String nombreDependenciaDesde, String nombreDependenciaHasta){
        Dependencia desde = this.obtenerDependencia(nombreDependenciaDesde);
        Dependencia hasta = this.obtenerDependencia(nombreDependenciaHasta);
        
        if (desde != null && hasta != null) {
            desde.finalizarTramiteAntiguedad();
            Expediente exp = ExpedientesFinalizados.eliminarUltimoFinalizado();
            
            hasta.ingresarTramite(exp);
        }
    }
    
    public void moverExpedientePrioridad(String nombreDependenciaDesde, String nombreDependenciaHasta){
        Dependencia desde = this.obtenerDependencia(nombreDependenciaDesde);
        Dependencia hasta = this.obtenerDependencia(nombreDependenciaHasta);
        
        if (desde != null && hasta != null) {
            desde.finalizarTramitePrioridad();
            Expediente exp = ExpedientesFinalizados.eliminarUltimoFinalizado();
            
            hasta.ingresarTramite(exp);
        }
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Lista<Dependencia> getListDependencias() {
        return listDependencias;
    }
}
