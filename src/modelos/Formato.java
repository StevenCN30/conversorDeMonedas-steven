package modelos;


import principal.Principal;

public class Formato extends Principal {


    private String valorDestino;



    public Formato(FormatoOmdb formato1) {
        this.valorDestino = formato1.conversion_result();
    }


    public String getValorDestino() {
        return valorDestino;
    }

    @Override
    public String toString() {
        return this.getValorDestino() ;
    }


}
