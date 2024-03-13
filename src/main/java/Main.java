// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int min = 0;
    int max = 100;
    double[] arr;
    arr = new double[5];
    for(int i = 0; i<5; i++){
      arr[i]  = Math.pow(((int)Math.floor(Math.random()*(max-min+1)+min)),2);
    }
    System.out.println("Pierwsza liczba " + arr[0]);
    System.out.println("Druga liczba " + arr[1]);
    System.out.println("Trzecia liczba " + arr[2]);
    System.out.println("Czwarta liczba " + arr[3]);
    System.out.println("Piąta liczba " + arr[4]);

    double suma = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
    System.out.println("Suma kwadratów " + suma);

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}