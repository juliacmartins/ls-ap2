package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Teclado{
    public static String nome;
    public static double peso;
    public static Character sexo;
    public static int idade;
    public static float nota;


    public static void nome(String message){
        System.out.println(message);
    }
    public static void lerNome() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome=tc.next();
    }
    public static void peso(String message){
        System.out.println(message);
    }
    public static void lerPeso() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu peso?");
        peso= tc.nextDouble();
    }
    public static void sexo(String message){
        System.out.println(message);
    }
    public static void lerSexo() {
        Scanner tc = new Scanner(System.in);
        System.out.println("E você?");
        sexo= tc.next().charAt(0);
    }
    public static void idade(String message){
        System.out.println(message);
    }
    public static void lerIdade() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual sua Idade?");
        idade= tc.nextInt();
    }
    public static void nota(String message){
        System.out.println(message);
    }
    public static void lerNota() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual nota você tirou?");
        nota= tc.nextFloat();
   }
    public static boolean compararEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static void validarEmail(String email) {
        System.out.println("Teste Email");
        if (compararEmail(email))
            System.out.println("Você digitou: " +email +" e ele é válido.");
        else
            System.out.println("Você digitou: " +email +" e ele não é válido.");
    }
    public static boolean compararTelefone(CharSequence telefone) {
        String telefoneRegex = "[0-9]{2}-([0-9]{8}|[0-9]{9})";

        Pattern pat = Pattern.compile(telefoneRegex);
        if (telefone == null)
            return false;
        return pat.matcher(telefone).matches();
    }
    public static void validarTelefone(CharSequence telefone) {
        System.out.println("Teste Telefone");
        if (compararTelefone(telefone))
            System.out.println("Você digitou: " +telefone+" e ele é válido.");
        else
            System.out.println("Você digitou: " +telefone +" e ele não é válido.");
    }
    public static boolean compararData(CharSequence data) {
        String dataRegex = "\\d{2}/\\d{2}/\\d{4}";

        Pattern pat = Pattern.compile(dataRegex);
        if (data == null)
            return false;
        return pat.matcher(data).matches();
    }
    public static void validarData(CharSequence data) {
        System.out.println("Teste Data:");
        if (compararData(data))
            System.out.println("Você digitou: " +data+" e ele é válido.");
        else
            System.out.println("Você digitou: " +data +" e ele não é válido.");
    }
    public static boolean compararNumero(CharSequence numero) {
        String numeroRegex = "^[0-9]+$";

        Pattern pat = Pattern.compile(numeroRegex);
        if (numero == null)
            return false;
        return pat.matcher(numero).matches();
    }
    public static void validarNumero(CharSequence numero) {
        System.out.println("Teste Numero");
        if (compararNumero(numero))
            System.out.println("Você digitou: " +numero+ " e ele é válido.");
        else
            System.out.println("Você digitou: " +numero+ " e ele não é válido.");
    }
}

