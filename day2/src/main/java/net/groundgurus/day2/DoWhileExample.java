import java.util.Random;

void main() {
    Random rnd = new Random();
    int dice;
    int guess = 3;
    do {
        dice = rnd.nextInt(6) + 1;
        if (dice != guess) {
            System.out.println("We rolled " + dice + " Let's keep rolling!");
        }
    } while (dice != guess);

    System.out.println("Got it!");

}