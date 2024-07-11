package modelo;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Date;
    import tda.*;

public class Expediente {
    private String ID;
    private int prioridad;
    private Usuario interesado;
    private String asunto;
    private File docReferencia;
    private Date horaInicio;
    private Date horaFin;
    private Lista<File> docsFinales;
    private Dependencia depenActual;
    
    public Expediente(int prioridad, Usuario interesado, String asunto, File docRef){
        this.docsFinales = new Lista();
        this.ID = IDexpediente.generarCodigoRandom();
        this.prioridad = prioridad;
        this.interesado = interesado; //usuario
        this.asunto = asunto;
        this.docReferencia = docRef;
        this.horaInicio = new Date();
        this.docsFinales = new Lista(); //ESTO FALTA
        this.depenActual = null;
        this.horaFin = null;
    }
    
    public boolean expActivo(){
        if (this.horaFin == null) {
            return true;
        }
        return false;
    }
    
    public String getID() {
        return ID;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Usuario getInteresado() {
        return interesado;
    }

    public String getAsunto() {
        return asunto;
    }

    public File getDocReferencia() {
        return docReferencia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public Lista<File> getDocsFinales() {
        return docsFinales;
    }

    public Dependencia getDepenActual() {
        return depenActual;
    }

    public void setInteresado(Usuario interesado) {
        this.interesado = interesado;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public void setDocsFinales(Lista<File> docsFinales) {
        this.docsFinales = docsFinales;
    }

    public void setDepenActual(Dependencia depenActual) {
        this.depenActual = depenActual;
    }
    
    
}
