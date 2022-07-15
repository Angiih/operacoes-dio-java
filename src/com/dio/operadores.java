package com.dio;

public class operadores {

	public static void main(String[] args) {
		
		System.out.println("PrePos");
		prePos();
		System.out.println("Aritmético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedencia");
		Precedencia();
		

		}
	
	private static void prePos() {
		int k = 10;
		
		
		int i = ++k;
		int j = k--;
		int x = k;
		
		System.out.println("i:" + 1);
		System.out.println("j:" + j);
		System.out.println("x:" + x);
		
	}
	
	private static void aritmetico() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d+b;
		int r4 = e/a;
		int r5 = c%e;
		
		
		System.out.println("a+b" + r1);
		System.out.println("c-a" + r2);
		System.out.println("d+b" + r3);
		System.out.println("e/a" + r4);
		System.out.println("c%e" + r5);
	}
	
	
	private static void atribuicao() {
	
        int i = 1500;
        short j = 15;
        long l = 500l;
        int k = 35;
        float d = 3.5f;
        double d = f;
}
