
public class Main {
  public static void main(String[] args) {    
    System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat
    String season = "autumn";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }

  }


  double temp = -15.0;

  if (temp <= 5) {
    System.out.println("Wear super warm");
  }
  else if (temp <= 15) {
    System.out.println("Wear warm");
  }
  else if (temp <= 30) {
    System.out.println("Wear normal");
  }
  else {
    System.out.println("You need cooling");
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
