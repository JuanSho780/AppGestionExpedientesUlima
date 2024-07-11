package modelo;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import tda.*;

public abstract class ExpedientesFinalizados {
    public static Lista<Expediente> expFinalizados = new Lista();
    
    public static void ingresarFinalizado(Expediente exp){
        expFinalizados.agregar(exp);
    }
    
    public static void verFinalizados(){
        if (!expFinalizados.esVacia()) {
            Nodo<Expediente> ptr = expFinalizados.getCabeza();
            while(ptr != null){
                Expediente actual = ptr.getElemento();
                System.out.println(actual.getID() + " / " + actual.getPrioridad() + " / " + actual.getHoraFin() + " / " + actual.getDepenActual().getNombre());
                ptr = ptr.getSgteNodo();
            }
        }
    }
    
    public static String[][] obtenerArrayInfoTramiteTerminados(){
        int longitudLista = expFinalizados.longitud();
        String[][] superResp = new String[longitudLista][7];
        
        int pos = 0;
        Nodo<Expediente> ptr = expFinalizados.getCabeza();
        while(ptr != null){
            Expediente actual = ptr.getElemento();
            String[] resp = new String[7];
            resp[0] = actual.getInteresado().getNombreApellido();
            resp[1] = actual.getID();
            resp[2] = actual.getDepenActual().getNombre();
            resp[3] = actual.getAsunto();
            resp[4] = String.valueOf(actual.getPrioridad());
            
            //Convertir Date en String con ese formato
            Date horaInicio = actual.getHoraInicio();
            Date horaTermino = actual.getHoraFin();
            SimpleDateFormat horaString = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            resp[5] = horaString.format(horaInicio);
            resp[6] = horaString.format(horaTermino);
            
            superResp[pos] = resp;
            pos++;
            ptr = ptr.getSgteNodo();
        }
        return superResp;
    }
    
    public static Expediente eliminarUltimoFinalizado(){
        int posFinal = expFinalizados.longitud();
        Expediente resp = expFinalizados.iesimo(posFinal);
        expFinalizados.eliminar(posFinal);
        return resp;
    }
}
