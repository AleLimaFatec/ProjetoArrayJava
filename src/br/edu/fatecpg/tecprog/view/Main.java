package br.edu.fatecpg.tecprog.view;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] valores = new double[5];
		double soma=0,media=0;
		for(int i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+"º Número:");
			valores[i] = scan.nextDouble();
		}
		for(int i=4;i>=0;i--) {
			System.out.println(valores[i]+"\n");
			soma+=valores[i];
		}
		media = soma/5;
		System.out.println("A média é: "+media);

	}

}
