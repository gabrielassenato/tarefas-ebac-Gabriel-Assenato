package br.com.gabriel;

public class Wrapper {
	public static void main (String[] args) {
		int var1 = 10; //tipo primitivo
		Integer var2 = var1; //autoboxing
		System.out.println("variável do tipo primitivo: " + var1);
		System.out.println("variável convertida para o tipo wrapper: " + var2);
		 
		Boolean var3 = true; //autoboxing
		boolean var4 = Boolean.TRUE; //unboxing
		
		//casting explícito
		int var5 = 10;
		short var6 = (short) var5;
		
		//casting implicito
		short var7 = 10;
		long var8 = var7;
	}
}
