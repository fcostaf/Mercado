package mercado;
import java.util.ArrayList;
import java.util.Collection;
import mercado.model.Sintoma;
public class Mercado {
   
    public static ArrayList<Sintoma> listaS(){
        ArrayList<Sintoma> listaSintomas=new ArrayList<>();
        
        Sintoma memoriaRecente=new Sintoma("Memória recente",
            "Dificuldade para armazenar infomrações novas. Costuma repetir as mesmas perguntas e esquecer das notícias atuais.",
            "Doença de Alzheimer, Demência Vascular");

        listaSintomas.add(memoriaRecente);

        return listaSintomas;
    }
    public static void main(String[] args) {
        
    }
    
}
