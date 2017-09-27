package Enum;

public class PrintCurrency {
    public static void main(String[] args){
        for (Currency s:Currency.values()
                ) {
            System.out.println(s+","+"Ordinal :"+s.ordinal());
        }
    }
}
