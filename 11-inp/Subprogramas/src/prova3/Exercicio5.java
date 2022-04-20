package prova3;

public class Exercicio5 {

  public static void main(String[] args) {

    String[] letrasA = { "A", "C", "H", "M", "I", "Y", "Y", "F", "J", "Q", "O", "P", "X", "C", "A" };
    String[] letrasB = { "K", "C", "H", "M", "I", "Y", "Y", "F", "J", "Q", "O", "P", "X", "C", "A" };
    String[] letrasC = { "A", "C", "H", "M", "I", "Y", "Y", "E", "J", "T", "O", "P", "X", "C", "A" };
    String[] letrasD = { "R", "C", "A", "M", "I", "Y", "Y", "F", "J", "T", "O", "P", "X", "C", "A" };
    String[] palavraA = { "M", "a", "c", "a", "c", "o" };
    String[] palavraB = { "C", "a", "p", "e", "t", "a" };
    String[] palavraC = { "X", "i", "c", "a", "r", "a" };

    System.out.println("Macaco");
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraA, letrasA));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraA, letrasB));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraA, letrasC));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraA, letrasD));

    System.out.println("Capeta");
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraB, letrasA));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraB, letrasB));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraB, letrasC));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraB, letrasD));

    System.out.println("Xícara");
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraC, letrasA));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraC, letrasB));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraC, letrasC));
    System.out.println(contemOuNaoLetrasParaFormarPalavra(palavraC, letrasD));
  }

  private static String contemOuNaoLetrasParaFormarPalavra(String[] palavra, String[] letras) {
    String[] vetorPalavraClone = palavra.clone();
    String[] vetorLetrasClone = letras.clone();
    int qtdLetras = 0;

    for (int i = 0; i < vetorPalavraClone.length; i++) {
      loopExterno: for (int j = 0; j < vetorLetrasClone.length; j++) {
        if (vetorPalavraClone[i].equalsIgnoreCase(vetorLetrasClone[j])) {
          qtdLetras++;
          vetorLetrasClone[j] = "";
          break loopExterno;
        }
      }
    }

    return qtdLetras == vetorPalavraClone.length ? "CONTÉM" : "NÃO CONTÉM";

  }

}
