import lib.Matematiques;

public class Main {
  public static void main(String[] args) {
    double[] numeros = {1, 2, 3, 4, 5};
    double media = Matematiques.calcularMitjana(numeros);
    System.out.println("La mitjana és: " + media);
  }
}
