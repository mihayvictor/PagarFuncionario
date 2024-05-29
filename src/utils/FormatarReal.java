package utils;


import java.text.NumberFormat;
import java.util.Locale;

public class FormatarReal {
    double valor;
    
    private static final Locale BRASIL = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
    private static final NumberFormat FORMATADOR_MOEDA = NumberFormat.getCurrencyInstance(BRASIL);

    //Formatador para a moeda brasileira
    public static String formatarReal(double valor){
        return FORMATADOR_MOEDA.format(valor);
    }

     
    

    


    
}
