package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int guarda=a;
		String num = Integer.toString(a);
		int k=0;
		while(k<num.length()) {
			if(num.charAt(k)=='2') {
				int j=k+1;
				while(j<num.length()) {
					if(num.charAt(j)!='0') {
						return "El numero proporcionado no esta en base Gabriel.";
					}
					j++;
				}
			}	
			k++;
		}
		int rpta=0,i=0;
		while(guarda!=0) {
			int digito=guarda%10;
			rpta+=digito*(Math.pow(2,i+1)-1);
			i++;
			guarda/=10;
		}
		
		return rpta+"";
	}
}
