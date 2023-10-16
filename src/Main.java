public class Main {

    public static void main(String[] args) {

        // Reserved keywords
        int int2 = 5;
        double double2 = 10.00;
        short short2 = 20;
        long long2 = 25;
        byte byte2 = 15;

        // Expression = kilometers = (100 * 1.609344)
        double kilometers = (100 * 1.609344);

        // Expression = highScore = 50
        int highScore = 50;

        // Expression = highScore > 25
        if (highScore > 25) {

            // Expression = 1000 + highScore, highScore = 1000 + highScore
            highScore = 1000 + highScore; //add bonus points
        }

        // Expression = health = 100
        int health = 100;

        // Expression = health < 25, highScore > 1000, (health < 25) && (highScore > 1000)
        if ((health < 25) && (highScore > 1000)) {

            // Expression = highScore - 1000, highScore = highScore - 1000
            highScore = highScore - 1000;
        }


    }
}