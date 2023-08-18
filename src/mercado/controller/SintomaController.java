package mercado.controller;
import mercado.Mercado;
import mercado.model.Sintoma;
public class SintomaController {

    public SintomaController() {
    }
    
    public static String mostrarSintoma(Sintoma s){
        return s.dados();
    }
}
