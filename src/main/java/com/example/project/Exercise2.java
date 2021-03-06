package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int dist=0,rpta=0,k=0;
		while(true) {
			while(a[k]<=50+dist && k<6) {
				k++;
				if(k<6 && a[k]+50<a[k+1]) {
					return -1;
				}
			}
			k--;
			rpta++;
			if(dist+50>=a[6]) {
				break;
			}
			dist=a[k];
		}
		
		return rpta;
	}
}
