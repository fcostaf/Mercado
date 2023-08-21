package mercado;
import javax.swing.JFrame;
import mercado.model.Sintoma;
import mercado.view.telamercado;
public class Mercado {
   
    public static Sintoma[] listaS(){
        Sintoma listaSintomas[]=new Sintoma[7];
        
        Sintoma memoriaRecente=new Sintoma("Memória recente",
            "Dificuldade para armazenar infomrações novas. Costuma repetir as mesmas perguntas e esquecer das notícias atuais.",
            "Doença de Alzheimer, Demência Vascular");
        Sintoma alteracaoPersonalidade=new Sintoma("Alteração de personalidade",
            "Mudanças na personalidade, geralmente na forma de apatia ou desinibição, fazendo parecer outra pessoa.",
            "Demência Frontotemporal");

        listaSintomas[0]=(memoriaRecente);
        listaSintomas[1]=(alteracaoPersonalidade);

        return listaSintomas;
    }
    public static void main(String[] args) {
        telamercado tela=new telamercado();
        tela.setVisible(true);
        tela.setSize(1000,1000);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
