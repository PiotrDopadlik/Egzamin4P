import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba zarejestrowanych osób to "+Osoba.licznik);
        Osoba osoba1 = new Osoba();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String imieWczytane = klawiatura.next();
        System.out.println("Podaj id ");
        int idWczytane = klawiatura.nextInt();
        Osoba osoba2 = new Osoba(idWczytane,imieWczytane);
        System.out.println("Liczba zarejestrowanych osób to "+Osoba.licznik);
        Osoba osoba3 = new Osoba(osoba2);
        osoba1.wypiszDane("Jan");
        osoba2.wypiszDane("Jan");
        osoba3.wypiszDane("Jan");
    }
}