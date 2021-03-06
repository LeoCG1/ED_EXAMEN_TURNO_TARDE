/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleadoed_44654545x;

/**
 *EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 * @author Leonardo Costa DNI 38871291A
 * @version 1.0
 */
import java.util.*;

/**
 * Constructor con tres parametros
 */
public class LeonardoCosta_38871291A {
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni; 
 private double salarioBasePorHora = 10.56; 
 /**
  * 
  * @param nombreCompleto Nombre completo en mayusculas
  * @param dni documento nacional de identidad con letra y sin espacios
  */
 public LeonardoCosta_38871291A(String nombreCompleto, String dni) {
 this.nombreCompleto = nombreCompleto;
 this.dni = dni; 
 } 
 /**
  * Calcula el salario bruto mensual en función del salario base por hora
  * y las horas extras.
  * 
  * El precio por hora de la hora extra se determina con la
  * constante FACTOR_HORA_EXTRA
  * 
  * @param horasExtra número de horas extra dedicadas redondeando a la baja(entero)
  * @return el salario bruto mensual en euros con dos decimales.
  */
 public double getSalarioEsteMes(int horasExtra) {
 double cantidadExtra, salarioFinal;
 cantidadExtra = horasExtra * this.salarioBasePorHora * 
FACTOR_HORA_EXTRA;
 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
 return salarioFinal;
 }
 
 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) { 
 LeonardoCosta_38871291A emp = new LeonardoCosta_38871291A("LEONARDO COSTA", 
"38871291A");
 int horasExtra = 2;
 System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
 }
}
