/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_karimguifarro;

import java.util.*;

public class Lab3P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static ArrayList<user> per = new ArrayList();
    public static ArrayList<login> log = new ArrayList();

    public static void main(String[] args) {
        String user = "david", contra = "1234";
        log.add(new login(user, contra));
        char k = 'k';
        while (k == 'k') {
            System.out.println("******MENU*******\n"
                    + "1)Log in\n"
                    + "2)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String us, con;
                    int cont=0;
                    System.out.println("Ingrese el usuario:");
                    KaOz.nextLine();
                    us = KaOz.next();
                    System.out.println("Ingrese la contraseña:");
                    KaOz.nextLine();
                    con = KaOz.next();
                    String[] n = log.get(0).toString().split("\\");
                    String n1 = n[0];
                    String n2 = n[1];
                    if (n1.equals(us) && n2.equals(con)) {
                        System.out.println("******MENU*******\n"
                                + "1)Crear\n"
                                + "2)Leer\n"
                                + "3)Editar\n"
                                + "4)ELiminar\n"
                                + "6)Log Out\n");
                        int op1 = KaOz.nextInt();
                        switch (op1) {
                            case 1: {
                                System.out.println("******MENU*******\n"
                                        + "1)Cliente\n"
                                        + "3)Motoristas\n"
                                        + "2)Programador\n"
                                        + "4)Motorista\n");
                                int o = KaOz.nextInt();
                                switch (o) {
                                    case 1: {
                                        System.out.println("Ingrese el nombre de usuario:");
                                        String usuario = KaOz.next();
                                        System.out.println("Ingrese la contraseña:");
                                        KaOz.nextLine();
                                        String contraseña = KaOz.next();
                                        System.out.println("Ingrese un ID:");
                                        KaOz.nextLine();
                                        String id = KaOz.next();
                                        System.out.println("Ingrese su nombre:");
                                        KaOz.nextLine();
                                        String nombre = KaOz.next();
                                        System.out.println("Ingrese su apellido:");
                                        KaOz.nextLine();
                                        String apellido = KaOz.next();
                                        System.out.println("Ingrese la cantidad de pedidos que ha hecho:");
                                        int pedidos = KaOz.nextInt();
                                         log.add(new login( usuario,contraseña));
                                        per.add(new Cliente(usuario, contraseña, nombre, apellido, id, pedidos));
                                    }
                                    break;
                                    case 2: {
                                        System.out.println("Ingrese el nombre de usuario:");
                                        String usuario = KaOz.next();
                                        System.out.println("Ingrese la contraseña:");
                                        KaOz.nextLine();
                                        String contraseña = KaOz.next();
                                        System.out.println("Ingrese un ID:");
                                        KaOz.nextLine();
                                        String id = KaOz.next();
                                        System.out.println("Ingrese su nombre:");
                                        KaOz.nextLine();
                                        String nombre = KaOz.next();
                                        System.out.println("Ingrese su apellido:");
                                        KaOz.nextLine();
                                        String apellido = KaOz.next();
                                        System.out.println("Ingrese el tiempo que lleva en ese cargo:");
                                        int cargo = KaOz.nextInt();
                                        System.out.println("Ingrese su salario:");
                                        int salario = KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de años de experiencia que lleva en ventas:");
                                        int exp = KaOz.nextInt();
                                        log.add(new login( usuario,contraseña));
                                        per.add(new Administrador(usuario, contraseña, nombre, apellido, id, cargo, salario, exp));
                                    }
                                    break;
                                    case 3: {
                                        System.out.println("Ingrese el nombre de usuario:");
                                        String usuario = KaOz.next();
                                        System.out.println("Ingrese la contraseña:");
                                        KaOz.nextLine();
                                        String contraseña = KaOz.next();
                                        System.out.println("Ingrese un ID:");
                                        KaOz.nextLine();
                                        String id = KaOz.next();
                                        System.out.println("Ingrese su nombre:");
                                        KaOz.nextLine();
                                        String nombre = KaOz.next();
                                        System.out.println("Ingrese su apellido:");
                                        KaOz.nextLine();
                                        String apellido = KaOz.next();
                                        System.out.println("Ingrese el tiempo que lleva en ese cargo:");
                                        int cargo = KaOz.nextInt();
                                        System.out.println("Ingrese su salario:");
                                        int salario = KaOz.nextInt();
                                        System.out.println("Ingrese su lenguaje de programacion favorito:");
                                        KaOz.nextLine();
                                        String lenguaje = KaOz.next();
                                        System.out.println("Ingrese su horario:");
                                        KaOz.nextLine();
                                        String horario = KaOz.next();
                                         log.add(new login( usuario,contraseña));
                                        per.add(new Programadores(usuario, contraseña, nombre, apellido, id, cargo, salario, lenguaje, horario));
                                    }
                                    break;
                                }
                            }
                            break;
                            case 2: {
                                leer();
                            }
                            break;
                            case 3: {
                                leer();
                                int mod = KaOz.nextInt();
                                if (mod < 0 || mod > per.size()) {
                                    System.out.println("No existe este PYME");
                                    leer();
                                    System.out.println("Igrese de nuevo el valor:");
                                    mod = KaOz.nextInt();
                                }
                                per.remove(mod);
                            }
                            break;
                            case 4: {
                                us = "";
                                con = "";
                            }
                        }
                    }
                }
                break;
                case 2: {
                    k = 'n';
                }

            }
        }
    }

    public static void leer() {
        for (int i = 0; i < per.size(); i++) {
            System.out.println(per.get(i).toString());
        }
    }

}
