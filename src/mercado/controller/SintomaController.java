package mercado.controller;

public class SintomaController {

    public SintomaController() {
    }
    
    public String mostrarSintomas(int sintomas[],String graus[]){
        String texto="";
        int x=0;
        for(int s:sintomas){
            if(s==1){
                texto+=mercado.Mercado.listaS()[x].dados();
                texto+=graus[x]+"\n\n";
            }x+=1;
        }
        return texto;
    }
}
