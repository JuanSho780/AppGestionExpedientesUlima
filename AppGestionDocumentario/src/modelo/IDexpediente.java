package modelo;
    import java.util.Random;
    import tda.*;

public class IDexpediente {
    private static final String[] caracteres = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
    private static int codLength = 4;
    private static Lista<String> codCreados = new Lista();
    
    public static String generarCodigoRandom(){
        String resp = "";
        Random rand = new Random();
        for(int i=0; i<codLength; i++){
            int newRandom = rand.nextInt(36);
            resp += caracteres[newRandom];
        }
        if (!codValido(resp)) {
            generarCodigoRandom();
        }
        codCreados.agregar(resp);
        return resp;
    }
    
    private static boolean codValido(String cod){
        Integer pos = codCreados.ubicacion(cod);
        if(pos == null){
            return true;
        }
        return false;
    }
}
