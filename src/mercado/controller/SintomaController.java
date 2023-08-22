package mercado.controller;
import java.io.BufferedReader;
import java.io.FileWriter;
public class SintomaController {

    public SintomaController() {
    }
    
    public String mostrarSintomas(int sintomas[],String graus[]){
        String texto="";
        int x=0;
        
        for(int s:sintomas){
            try{
                if(s==1){
                    texto+=mercado.Mercado.listaS()[x].dados();
                    texto+=graus[x]+"\n\n";
                }x+=1;
            }catch(Exception e){
                texto+="\nSINTOMA NÃO CADASTRADO\n";
            }
        }
        
        return texto;
    }
    
    public void gravarSintomas(String texto){
        if(texto!=""){
            try{
                FileWriter fw=new FileWriter("sintomas.txt");
                fw.write(texto);
                fw.close();
            }catch(Exception e){
                System.out.println("Tentando gravar vazio");
            }
        }
    }
}
