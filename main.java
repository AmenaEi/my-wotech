// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suit, rain coat

    double temp = -15.0;

    if (temp <= 5) {
      System.out.println("Wear super warm");
    } else if (temp <= 15) {
      System.out.println("Wear warm");
    } else if (temp <= 30) {
      System.out.println("Wear normal");
    } else {
      System.out.println("You need cooling");
    }
   
    //else if optimizes the code, so it will only run if the first if statement is false
        
  }

}
