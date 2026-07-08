package ciclos;

import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String password;
        String passUsuario ="12345";

        while(true){
            System.out.println("Ingresa la contraseña");
            password = entrada.next();
            if (password.equals(passUsuario)){
                break;
            }else{
                System.out.println("Contraseña no valida");
            }

        }
        System.out.println("Acceso permitido");




    }
}
