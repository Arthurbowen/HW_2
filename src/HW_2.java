import java.util.Random;

public class HW_2 {
    public static void main(String[] args) {
        System.out.println( permission(generateRandomAge() , 19));
        System.out.println( permission(generateRandomAge() , 10));
        System.out.println( permission( generateRandomAge(), -22));
        System.out.println( permission(generateRandomAge() , 0));
        System.out.println( permission(generateRandomAge(), 9));

    }

    public static String permission(int humanAge, int temperature) {
        if (humanAge >= 20 && humanAge <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (humanAge < 20 && temperature > 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (humanAge > 45) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома ";
        }
    }
    public static int generateRandomAge (){
        Random random = new Random();
        return  random.nextInt(100);

    }
}

