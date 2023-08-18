package mercado.controller;
import mercado.Mercado;
import mercado.model.Sintoma;
public class SintomaController {

    public SintomaController() {
    }
    
    public static String mostrarSintoma(Sintoma s){
        String texto="";
        if(mercado.Mercado.listaS().contains(s)){
            texto+=s.dados();
        }else{}
        return texto;
    }
}
