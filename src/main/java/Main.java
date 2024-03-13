// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int[] liczby = new int[5];
    Random generator = new Random();
    System.out.println("Liczby losowe od 0 do 100:");
    for (int i = 0; i < 5; i++) {
      liczby[i] = generator.nextInt(100);
      System.out.println(Integer.toString(liczby[i]));
      liczby[i] = liczby[i] * liczby[i];
    }
    for (int i = 1; i < 5; i++) {
      liczby[0] = liczby[0] + liczby[i];
    }
    System.out.println("Suma kwadratow wygenerowanych liczb:");
    System.out.println(Integer.toString(liczby[0], -1));
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}