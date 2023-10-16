public class Main {

    public static void main(String[] args) {

        // Reserved keywords
        int int2 = 5;
        double double2 = 10.00;
        short short2 = 20;
        long long2 = 25;
        byte byte2 = 15;

        // Expressions
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; //add bonus points
        }

        int health = 100;
        
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }


    }
}