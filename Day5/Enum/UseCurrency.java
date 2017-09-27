package Enum;

public class UseCurrency {
    Currency cy;
    public UseCurrency(Currency c){cy=c;}
    public void use(){
        System.out.println("所使用的钱币为：");
        switch (cy){
            case Hundred:System.out.println("一百元");break;
            case Thousand:System.out.println("一千元");break;
            case Million:System.out.println("百万");break;
            case Billion:System.out.println("亿");break;
            default:System.out.println("无钱币记录");break;
        }
    }
    public static void main(String[] agrs){
        UseCurrency
                hum=new UseCurrency(Currency.Hundred),
                mill=new UseCurrency(Currency.Million),
                bill=new UseCurrency(Currency.Billion);
        hum.use();
        mill.use();
        bill.use();
    }
}
