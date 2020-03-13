/*
Crie um projeto Java no ambiente eclipse (sugest�o de nome de projeto - Aula2Exercicio1). Na sequ�ncia, crie uma classe com o nome Programa. 
Nesta classe, voc� deve fazer a entrada de dados das seguintes informa��es: 
o sal�rio de um professor, a idade de uma crian�a, se um servidor p�blico tem plano de sa�de ou n�o, se uma pessoa � casada (c) ou solteira (s) e, por fim, o nome de um aluno.

Ao terminar as entradas de dados, voc� deve fazer a apresenta��o dos valores utilizando System.out.println(). Al�m disso, coloque textos com valor significativo para o usu�rio, 
por exemplo: "O nome informado foi: Jo�o Silveira Neto".
*/

package aula2exercicio1;
import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) {
		double salary;
		int age;
		boolean healthPlan;
		char state;
		String name;
		
		System.out.print("Salary: ");
		salary = new Scanner(System.in).nextDouble();
	
		System.out.print("Age: ");
		age = new Scanner(System.in).nextInt();
		
		System.out.print("Have a health plan? ");
		healthPlan = new Scanner(System.in).nextBoolean();
		
		System.out.print("Civil Estate: ");
		state = new Scanner(System.in).next().charAt(0);
		
		System.out.print("Name: ");
		name = new Scanner(System.in).nextLine();
		
		//Show informations
		System.out.println("INFORMATION:\n");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Health Plan: " + healthPlan);
		System.out.println("Civil State: " + state);
	}
}
