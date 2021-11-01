package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Teclado {
    public static String nome;
    public static double peso;
    public static Character sexo;
    public static int idade;
    public static float nota;
    public static String data;
    public static String email;
    public static String telefone;
    public static CharSequence numero;


    public static void nome(String message){
        System.out.println(message);
    }

    public static void lerNome() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = tc.next();
    }

    public static void peso(String message){
        System.out.println(message);
    }

    public static void lerPeso() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu peso?");
        peso = tc.nextDouble();
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
        nota = tc.nextFloat();
    }

    public static void lerEmail() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu e-mail?");
        email = tc.next();
    }

    private static boolean compararEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);

        if (email == null)
            return false;

        return pat.matcher(email).matches();
    }

    public static String validarEmail() {
        if (compararEmail(email))
            return email;
        else
            return null;
    }

    public static void lerTelefone(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite seu Telefone:");
        telefone = tc.next();
    }

    private static boolean compararTelefone(String telefone) {
        String telefoneRegex = "^[0][0-9]{2}-([0-9]{8}|[0-9]{9})";
        Pattern pat = Pattern.compile(telefoneRegex);

        if (telefone == null)
            return false;

        return pat.matcher(telefone).matches();
    }

    public static String validarTelefone() {
        if (compararTelefone(telefone))
            return telefone;
        else
            return null;
    }

      public static void lerData() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite uma data:");
        data = tc.next();
    }

    public static String validarData() {
        if (compararData(data))
            return data;
        else
            return null;
    }

    private static boolean compararData(CharSequence data) {
        String dataRegex = "\\d{2}/\\d{2}/\\d{4}";
        Pattern pat = Pattern.compile(dataRegex);

        if (data == null)
            return false;

        return pat.matcher(data).matches();
    }

    public static String converterData(String date, String dateFormat, String dateFormatOut) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat(dateFormat);
        Date newDate = formato.parse(date);

        formato.applyPattern(dateFormatOut);

        return formato.format(newDate);
    }

    public static void lerNumero() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = tc.next();
    }

    private static boolean compararNumero(CharSequence numero) {
        String numeroRegex = "^[0-9]+$";
        Pattern pat = Pattern.compile(numeroRegex);

        if (numero == null)
            return false;

        return pat.matcher(numero).matches();
    }

    public static CharSequence validarNumero() {
        if (compararNumero(numero))
            return numero;
        else
            return null;
    }
}

