/**
*Tema 4
*Ejercicio 10
*Programa que diga el horoscopo a partir del día y mes de nacimiento
*/

import java.util.Scanner;

public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("Tu horóscopo: ");
  System.out.print("Introduce tu mes de nacimiento: ");
  int mes = s.nextInt();
  System.out.print("Introduce tu día de nacimiento: ");
  int dia = s.nextInt();
  
  if ((mes == 1) && (dia >= 1) && (dia <= 19)) {
    System.out.println("Capricornio");
  }
  if ((mes == 1) && (dia >= 20) && (dia <= 31)) {
    System.out.println("Acuario");
  }
   if ((mes == 2) && (dia >= 1) && (dia <= 18)) {
    System.out.println("Acuario");
  }
   if ((mes == 2) && (dia >= 19) && (dia <= 29)) {
    System.out.println("Piscis");
  }
   if ((mes == 3) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Piscis");
  }
   if ((mes == 3) && (dia >= 21) && (dia <= 31)) {
    System.out.println("Aries");
  }
   if ((mes == 4) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Aries");
  }
   if ((mes == 4) && (dia >= 21) && (dia <= 30)) {
    System.out.println("Tauro");
  }
   if ((mes == 5) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Tauro");
  }
   if ((mes == 5) && (dia >= 21) && (dia <= 31)) {
    System.out.println("Géminis");
  }
   if ((mes == 6) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Géminis");
  }
   if ((mes == 6) && (dia >= 21) && (dia <= 30)) {
    System.out.println("Cáncer");
  }
   if ((mes == 7) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Cáncer");
  }
   if ((mes == 7) && (dia >= 21) && (dia <= 31)) {
    System.out.println("Leo");
  }
   if ((mes == 8) && (dia >= 1) && (dia <= 21)) {
    System.out.println("Leo");
  }
   if ((mes == 8) && (dia >= 22) && (dia <= 31)) {
    System.out.println("Virgo");
  }
  if ((mes == 9) && (dia >= 1) && (dia <= 22 )) {
    System.out.println("Virgo");
  }
  if ((mes == 9) && (dia >= 23) && (dia <= 30)) {
    System.out.println("Libra");
  }
  if ((mes == 10) && (dia >= 1) && (dia <= 22)) {
    System.out.println("Libra");
  }
  if ((mes == 10) && (dia >= 23) && (dia <= 31)) {
    System.out.println("Escorpio");
  }
  if ((mes == 11) && (dia >= 1) && (dia <= 22)) {
    System.out.println("Escorpio");
  }
  if ((mes == 11) && (dia >= 23) && (dia <= 30)) {
    System.out.println("Sagitario");
  }
  if ((mes == 12) && (dia >= 1) && (dia <= 20)) {
    System.out.println("Sagitario");
  }
  if ((mes == 12) && (dia >= 21) && (dia <= 31)) {
    System.out.println("Capricornio");
  }
 
  
    
  
  
     
  }
 }
