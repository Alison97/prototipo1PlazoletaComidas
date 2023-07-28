package org.example;

import org.example.foodCourt.Admin;
import org.example.foodCourt.Client;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin firstAdmin = new Admin();
        System.out.println("Hola bienvenido a la plaza de comidas Alison");
        System.out.println("Quieres crear una cuenta de cliente");
        Scanner scanner = new Scanner(System.in);
        String answerToCreateClient = scanner.next();
        if (answerToCreateClient.equals("yes")){
            System.out.println("Ingrese su número de cédula");
            int id = scanner.nextInt();
            System.out.println("Ingrese su nombre");
            String name = scanner.next();
            System.out.println("Ingrese su apellido");
            String lastName = scanner.next();
            System.out.println("Ingrese su fecha de nacimiento");
            String dateOfBirthString = scanner.next();
            Date dateOfBirth = new Date(dateOfBirthString);

            System.out.println("Ingrese su telefono");
            long phone = scanner.nextLong();
            System.out.println("Ingrese su email");
            String email = scanner.next();
            System.out.println("Ingrese su ciudad");
            String city = scanner.next();
            System.out.println("Ingrese su barrio");
            String neighborhood = scanner.next();
            System.out.println("Ingrese su dirección");
            String address = scanner.next();

            Client nuevoCliente = new Client( id, name,  lastName,  dateOfBirth, phone, email, city,neighborhood, address);

            System.out.println("Hola " + nuevoCliente.getName() + " " + nuevoCliente.getLastName());


        }
    }
}