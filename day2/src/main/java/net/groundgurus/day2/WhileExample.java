import java.util.Random;

void main() {
    Random random = new Random();
    int randomValue = random.nextInt(100) + 1;

    // will continue to loop until value is between 50-59
    while (!(randomValue >= 50 && randomValue <= 59)) {
        System.out.println(randomValue + " ...not yet");
        randomValue = random.nextInt(100) + 1;
    }

    System.out.println(randomValue + " ...Done!");
}