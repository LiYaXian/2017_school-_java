package Enum;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }
    public void describe(){
        System.out.println("this burrito is:\n");
        switch (degree){
            case NOT:System.out.println("not spicy at all");break;
            case MILD:System.out.println("a little hot");break;
            case MEDIUM:System.out.println("medium hot");break;
            case HOT:System.out.println("hot");break;
            case FLAMING:
            default:System.out.println("maybe too hot");break;
        }
    }
    public static void main(String[] args){
        Burrito
                plain=new Burrito(Spiciness.MILD),
                greenChill=new Burrito(Spiciness.HOT),
                jalapeno=new Burrito(Spiciness.FLAMING);
        plain.describe();
        greenChill.describe();
        jalapeno.describe();

    }
}
