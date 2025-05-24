package dados;

public class Moeda {
    String codigo;
    Cotacao conversion_rates;

    public double converterBRL(double quantidade){
        return conversion_rates.BRL()* quantidade;
    }
    public double converterUSD(double quantidade){
        return conversion_rates.USD() * quantidade;
    }
    public double converterCOP(double quantidade){
        return conversion_rates.COP() * quantidade;
    }
    public double converterBOB(double quantidade){
        return conversion_rates.BOB() * quantidade;
    }
    public double converterARS(double quantidade){
        return conversion_rates.ARS() * quantidade;
    }
    public double converterCLP(double quantidade){
        return conversion_rates.CLP() * quantidade;
    }
    public double converterEUR(double quantidade){
        return conversion_rates.EUR() * quantidade;
    }
}
