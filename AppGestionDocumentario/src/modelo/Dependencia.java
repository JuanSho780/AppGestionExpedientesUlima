package modelo;
    import java.io.File;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.HashSet;
    import java.util.Set;
    import tda.*;


public class Dependencia {
    private String nombre;
    private Cola<Expediente> expedientes;
    
    public Dependencia(String nombre){
        this.expedientes = new Cola();
        this.nombre = nombre;
    }
    
    public String[][] obtenerArrayInfoTramite(){
        int longitudCola = this.expedientes.longitud();
        String[][] superResp = new String[longitudCola][5];
        
        int pos = 0;
        Cola<Expediente> aux = new Cola();
        while(!this.expedientes.esVacia()){
            Expediente actual = this.expedientes.desencolar();
            String[] resp = new String[5];
            resp[0] = actual.getInteresado().getNombreApellido();
            resp[1] = actual.getID();
            resp[2] = actual.getAsunto();
            resp[3] = String.valueOf(actual.getPrioridad());
            
            //Convertir Date en String con ese formato
            Date horaInicio = actual.getHoraInicio();
            SimpleDateFormat horaString = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            resp[4] = horaString.format(horaInicio);
            
            superResp[pos] = resp;
            pos++;
            aux.encolar(actual); //encolar al auxiliar
        }
        while(!aux.esVacia()){
            this.expedientes.encolar(aux.desencolar());
        }
        return superResp;
    }
    
    public boolean existeTramite(String UID){
        boolean resp = false;
        Cola<Expediente> aux = new Cola();
        while(!this.expedientes.esVacia()){
            Expediente actual = this.expedientes.desencolar();
            if (actual.getID().equals(UID)) {
                resp = true;
            }
            aux.encolar(actual);
        }
        while(!aux.esVacia()){
            this.expedientes.encolar(aux.desencolar());
        }
        return resp;
    }
    
    public Expediente ingresarTramite(int prioridad, Usuario interesado, String asunto, File docRef){
        Expediente nuevo = new Expediente(prioridad, interesado, asunto, docRef);
        nuevo.setDepenActual(this);
        this.expedientes.encolar(nuevo);
        return nuevo;
    }
    
    public void ingresarTramite(Expediente exp){
        exp.setDepenActual(this);
        this.expedientes.encolar(exp);
    }
    
    public void finalizarTramiteConID(String UID){
        Cola<Expediente> aux = new Cola();
        Expediente resp = null;
        while(!this.expedientes.esVacia()){
            Expediente actual = this.expedientes.desencolar();
            if (actual.getID().equals(UID)) {
                resp = actual;
            }
            else{
                aux.encolar(actual);
            }
        }
        while(!aux.esVacia()){
            this.expedientes.encolar(aux.desencolar());
        }
        if (resp != null) {
            Date horaFin = new Date();
            resp.setHoraFin(horaFin);
            ExpedientesFinalizados.ingresarFinalizado(resp);
        }
    }
    
    public void finalizarTramiteAntiguedad(){
        Expediente resp = this.expedientes.desencolar();
        Date horaFin = new Date();
        resp.setHoraFin(horaFin);
        ExpedientesFinalizados.ingresarFinalizado(resp);
    }
    
    public void finalizarTramitePrioridad(){
        Cola<Expediente> aux = new Cola();
        int prioridadMenor = 0;
        boolean primItera = true;
        while(!this.expedientes.esVacia()){
            Expediente actual = this.expedientes.desencolar();
            if(primItera){
                prioridadMenor = actual.getPrioridad();
                primItera = false;
            }
            if (actual.getPrioridad() < prioridadMenor && !primItera) {
                prioridadMenor = actual.getPrioridad();
            }
            aux.encolar(actual);
        }
        
        Expediente resp = null;
        boolean primResp = true;
        while(!aux.esVacia()){
            Expediente actual = aux.desencolar();
            if (actual.getPrioridad() == prioridadMenor && primResp) {
                resp = actual;
                primResp = false;
            }
            else{
                this.expedientes.encolar(actual);
            }
        }
        if (resp != null) {
            Date horaFin = new Date();
            resp.setHoraFin(horaFin);
            ExpedientesFinalizados.ingresarFinalizado(resp);
        }
    }
    
    public void verTramitesDepedencia(){
        String resp = "";
        Cola<Expediente> aux = new Cola();
        while(!this.expedientes.esVacia()){
            Expediente actual = this.expedientes.desencolar();
            resp += actual.getID() + " / " + this.nombre + " / " + actual.getHoraInicio() + " / " + actual.getPrioridad() + "\n";
            aux.encolar(actual);
        }
        while(!aux.esVacia()){
            this.expedientes.encolar(aux.desencolar());
        }
        System.out.println(resp);
    }

    public String getNombre() {
        return nombre;
    }

    public Cola<Expediente> getExpedientes() {
        return expedientes;
    }
}
