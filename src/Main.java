import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kalkulator Wynagrodzeń\n");
        System.out.println("Podaj liczbe przepracowanych godzin");
        Scanner scan = new Scanner(System.in);
        double q = scan.nextDouble();
        System.out.println("Podaj stawke przepracowanych godzin");
        double w = scan.nextDouble();
        System.out.println("Podaj kwote dodatków");
        double e = scan.nextDouble();
        System.out.println("Wybierz rodzaj umowy\n1.Umowa o prace\n2.Umowa zlecenie\n3.Umowa o dzieło");
        Scanner scan2 = new Scanner(System.in);
        String menu = scan2.nextLine();
        switch (menu) {
            case "1" -> {
                System.out.println("Podaj liczbe dni roboczych danego miesiaca");
                double a1 = scan.nextDouble();
                System.out.println("Podaj liczbe przepracowanych godzin w soboty,niedziele i święta");
                double s1 = scan.nextDouble();
                System.out.println("Podaj ilość dni na urlopie");
                double d1 = scan.nextDouble();
                System.out.println("Podaj ilość dni na zwolnieniu lekarskim");
                double f1 = scan.nextDouble();
                System.out.println("Podaj ilosć dni wolnych na zwolnieniu lekarskim");
                double g1 = scan.nextDouble();
                System.out.println("Twoje wynagrodzenie wynosi= " + ((q * w) + e));
                System.out.println("Umowa o prace");
                System.out.println("liczba dni roboczych: " + (a1));
                System.out.println("Przepracowane godziny w soboty,niedziele i świenta: " + (s1));
                System.out.println("Ilosć dni na urlopie: " + (d1));
                System.out.println("Ilość dni na zwolnieniu lekarskim: " + (f1));
                System.out.println("Ilość dni wolnych na zwolnieniu lekarskim" + (g1));
            }
            case "2" -> {
                System.out.println("Podaj liczbe dni roboczych danego miesiaca");
                double a2 = scan.nextDouble();
                System.out.println("Podaj liczbe przepracowanych godzin w soboty,niedziele i święta");
                double s2 = scan.nextDouble();
                System.out.println("Podaj ilość dni na urlopie");
                double d2 = scan.nextDouble();
                System.out.println("Podaj ilość dni na zwolnieniu lekarskim");
                double f2 = scan.nextDouble();
                System.out.println("Podaj ilosć dni wolnych na zwolnieniu lekarskim");
                double g2 = scan.nextDouble();
                System.out.println("Twoje wynagrodzenie wynosi= " + ((q * w) + e));
                System.out.println("Umowa zlecenie");
                System.out.println("liczba dni roboczych: " + (a2));
                System.out.println("Przepracowane godziny w soboty,niedziele i świenta: " + (s2));
                System.out.println("Ilosć dni na urlopie: " + (d2));
                System.out.println("Ilość dni na zwolnieniu lekarskim: " + (f2));
                System.out.println("Ilość dni wolnych na zwolnieniu lekarskim" + (g2));
            }
            case "3" -> {
                System.out.println("Podaj liczbe dni roboczych danego miesiaca");
                double a3 = scan.nextDouble();
                System.out.println("Podaj liczbe przepracowanych godzin w soboty,niedziele i święta");
                double s3 = scan.nextDouble();
                System.out.println("Podaj ilość dni na urlopie");
                double d3 = scan.nextDouble();
                System.out.println("Podaj ilość dni na zwolnieniu lekarskim");
                double f3 = scan.nextDouble();
                System.out.println("Podaj ilosć dni wolnych na zwolnieniu lekarskim");
                double g3 = scan.nextDouble();
                System.out.println("Twoje wynagrodzenie wynosi= " + ((q * w) + e));
                System.out.println("Umowa o dzieło");
                System.out.println("liczba dni roboczych: " + (a3));
                System.out.println("Przepracowane godziny w soboty,niedziele i świenta: " + (s3));
                System.out.println("Ilosć dni na urlopie: " + (d3));
                System.out.println("Ilość dni na zwolnieniu lekarskim: " + (f3));
                System.out.println("Ilość dni wolnych na zwolnieniu lekarskim" + (g3));
            }
            default -> System.out.println("Bład, proszę podać poprawne dane");
        }
    }
}