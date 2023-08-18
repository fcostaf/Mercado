package mercado.model;

import java.util.ArrayList;
import java.util.Collection;

public class Sintoma {
    private String sintoma;
    private String descricao;
    private String transtornos;

    public Sintoma(String sintoma, String descricao, String transtornos) {
        this.sintoma = sintoma;
        this.descricao = descricao;
        this.transtornos = transtornos;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTranstornos() {
        return transtornos;
    }

    public void setTranstornos(String transtornos) {
        this.transtornos = transtornos;
    }
    
    public String dados(){
        String d;
        d="***"+this.sintoma+"***"+"\n---------------\n"+this.descricao+"\nTRANSTORNOS ASSOCIADOS\n"+this.transtornos+"\n";
        return d;
    }
}
