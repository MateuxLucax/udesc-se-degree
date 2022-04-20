package prova2;

public class Exercicio2 {

  public static void main(String[] args) {

    char[] word = { 'A', 'N', 'A' };

    char[] phrase = { 'A', 'N', 'A', 'E', 'M', 'A', 'R', 'I', 'A', 'N', 'A', 'G', 'O', 'S', 'T', 'A', 'M', 'D', 'E',
        'B', 'A', 'N', 'A', 'N', 'A', 'S' };

    String wordString = new String(word);
    String phraseString = new String(phrase);

    int wordsInsidePhraseCounter = 0;
    int lastIndex = -1;

    for (int i = 0; i < phrase.length; i++) {
      int index = phraseString.indexOf(wordString, i);
      if (index >= 0 && index != lastIndex) {
        wordsInsidePhraseCounter++;
        lastIndex = index;
      }
    }

    System.out.println(wordsInsidePhraseCounter);
  }
}

class MyClass {
  public static void main(String[] args) {
    String myStr = "Hello planet earth, you are a great planet.";
    System.out.println(myStr.indexOf("planet", 3));
  }
}