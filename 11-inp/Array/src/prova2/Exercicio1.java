package prova2;

import java.util.Arrays;

public class Exercicio1 {

  public static void main(String[] args) {

    String[] books = { "Clean Code", "Clean Architecture", "Pequeno Princípe", "Interstellar",
        "Alice no País das Maravilhas" };

    Arrays.sort(books);

    for (int i = 0; i < books.length; i++) {
      System.out.println(books[i]);
    }

  }

}
