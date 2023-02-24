package pl.kurs.excercise2.app;

public class StringBuilderRunner {
    public static void main(String[] args) {


        // konkatenacja
        // 0 1 2 3 4 5...10 000
        long start1 = System.nanoTime();
        String number1 = "0";

        for (int i = 1; i < 10_000; i++) {
            number1 = number1 + " " + i;
        }
        long stop1 = System.nanoTime();
        System.out.println(number1);


        //stringBuilder
        long start2 = System.nanoTime();
        StringBuilder stringBuilder2 = new StringBuilder("0");
        for (int i = 1; i < 10_000; i++) {
            stringBuilder2.append(" ");
            stringBuilder2.append(i);
        }
        String number2 = stringBuilder2.toString();
        long stop2 = System.nanoTime();
        System.out.println(number2);


        long result1 = stop1 - start1;
        long result2 = stop2 - start2;

        System.out.println("Wynik konkatenacji: " + result1);
        System.out.println("Wynik StringBuildera: " + result2);


        double result3 = (double) result1 / result2;
        System.out.println("StringBuilder jest szybszy o: " + result3);

        // StringBuilder nie tworzy nowego łańcucha znaków za każdym razem tak jak w przypadku konkatenacji,
        // tworzy oryginalny bufor znaków, który jest modyfikowany za każdym razem, gdy wywoływana jest operacja
        // konkatenacji co prowadzi do miejszego zużycia pamięci.
    }
}
