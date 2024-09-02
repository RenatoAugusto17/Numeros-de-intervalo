import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  //Um programa que leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo[10,20] e quanto estão fora do intervalo, mostrando essas informações;
  int quantidadeDeNumerosDigitados = sc.nextInt();
    int valoresDentroDoIntervalo = 0;
    int valoresForaDoIntervalo = 0;
    int numeroDigitado = 0;

  for (int i = 0; i < quantidadeDeNumerosDigitados; i++) {
    System.out.println("Digite o valor a ser comparado");
    numeroDigitado = sc.nextInt();
    if( numeroDigitado >= 10 && numeroDigitado <= 20) {
      valoresDentroDoIntervalo++;
    }else {
      valoresDentroDoIntervalo++;    }
  }

  System.out.println ("Dentro do intervalo temos:" + ValoresDentroDoIntervalo);
    System.out.println("Fora do intervalo temos:" + ValoresForaDoIntervalo);  
    sc.close();
  }
}