package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
         Teclado.nome("Meu nome é: Maria");
         Teclado.lerNome();

         Teclado.peso("Meu peso é 55kg");
         Teclado.lerPeso();

         Teclado.sexo("Sou do Sexo Femino");
         Teclado.lerSexo();

         Teclado.idade("Tenho 15 anos");
         Teclado.lerIdade();

         Teclado.nota("Tirei 8 em Matemática");
         Teclado.lerNota();

        Teclado.lerEmail();
        String email = Teclado.validarEmail();

        if (email != null) {
            System.out.println("Email " + email + " é válido");
        } else {
            System.out.println("Email informado é inválido");
        }

        Teclado.lerTelefone();
        String telefone = Teclado.validarTelefone();

        if (telefone != null) {
            System.out.println("Telefone " + telefone + " é válido");
        } else {
            System.out.println("Telefone informado é inválido");
        }

        Teclado.lerData();
        String data = Teclado.validarData();

        if (data != null) {
            String formatedData = Teclado.converterData(data, "dd/MM/yyyy", "MM/dd/yyyyy");
            System.out.println("Data digitada: " + data);
            System.out.println("Data invertida: " + formatedData);
        } else {
            System.out.println("Data não pode ser convertida porque é inválida");
        }

        Teclado.lerNumero();
        CharSequence numero = Teclado.validarNumero();

        if (numero != null) {
            System.out.println("Numero " + numero + " é válido");
        } else {
            System.out.println("Numero informado é inválido");
        }
    }
}
