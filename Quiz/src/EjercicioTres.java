import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Ingresa una contraseña");
        int contraseña = SC.nextInt();
        if (contraseña < 8 || contraseña > 8) {
            System.out.println("La contraseña debe ser de 8 caracteres");
    }
}
