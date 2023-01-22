package Enums;

import java.math.BigDecimal;

public enum Higiene {

    BANHO("Banho",new BigDecimal(40)),
    TOSA("Tosa", new BigDecimal(30)),
    BANHO_E_TOSA("Banho e Tosa", new BigDecimal(60));

    String higiene;
    BigDecimal preco;

    Higiene(String higiene, BigDecimal preco){
        this.higiene = higiene;
        this.preco = preco;
    }

    public String getHigiene(){
        return higiene;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
