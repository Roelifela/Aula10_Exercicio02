package br.com.digitalhouse;

public class Coca {

    private int tamanho;
    private double preco;

    public Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




    @Override
    public boolean equals(Object outraCoca) {
        if (!(outraCoca instanceof Coca)) {
            return false;
        }

        //COMPARANDO SOMENTE TAMANHO.

//        if (((Coca) outraCoca).getTamanho() == this.getTamanho()){
//            return true;
//        }else{
//            return false;
//        }
//    }

        //COMPARANDO TAMANHO E PRECO.

        if (((Coca) outraCoca).getTamanho() == this.getTamanho() && (((Coca) outraCoca).getPreco() == this.getPreco())) {
            return true;
        } else {
            return false;
        }
    }


}
