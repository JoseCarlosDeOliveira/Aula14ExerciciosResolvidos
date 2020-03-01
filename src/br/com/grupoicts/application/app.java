package br.com.grupoicts.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.grupoicts.entities.Product;

public class app {

	public static void main(String[] args) {
		// =========================
		// Vetores Parte 1 udemy 87.
		// =========================
		System.out.println("=================================");
		System.out.println(">>> Vetores Parte 1 udemy .87 <<<");
		System.out.println("=================================");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:\n");
		int n = sc.nextInt();
		double[] vect = new double[n]; // Tamanho do Vetor
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o [%d-%d] valor: x.xx\n", i, n);
			vect[i] = sc.nextDouble(); // Recebendo dados digitados
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i]; // Somando dados digitados
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE HEIGTH: %.2f\n\n", avg);

		// =========================
		// Vetor Parte 2 udemy 88.
		// =========================
		System.out.println("=================================");
		System.out.println(">>> Vetores Parte 2 udemy .88 <<<");
		System.out.println("=================================");
		System.out.println("Digite o tamanho do vetor:\n");
		n = sc.nextInt();
		Product[] vect1 = new Product[n];
		for (int i = 0; i < vect1.length; i++) {
			sc.nextLine();
			System.out.println("Digite o Nome  do Produto:["+i+"]Index");
			String name = sc.nextLine();
			System.out.println("Digite o Preco do Produto:["+i+"]Index");
			double price = sc.nextDouble();
			vect1[i] = new Product(name, price);
		}
		sum = 0.0;
		for (int i = 0; i < vect1.length; i++) {
			sum += vect1[i].getPrice();
		}
		avg = sum / vect1.length;
		System.out.printf("AVERAGE PICE: %.2f\n\n", avg);

		// =====================================
		// Boxing,Unboxing & wrappers 2 udemy 90.
		// =====================================
		int x = 20; // At Stack
		Object obj = x; // At Heap >> Boxing
		System.out.println("===========================================");
		System.out.println(">>> Boxing,Unboxing &Wrappers udemy .87 <<<");
		System.out.println("===========================================");
		System.out.printf("obj at Heap: %d = Boxing\n", obj);
		x = (int) obj; // from Heap to Stack >> Unboxing
		System.out.printf("x = obj from Heap: %d = UnBoxing\n", x);
		// WRAPPERS Mesmo nome do Primitivo com 1a letra Maiuscuia
		// Object Number >> Byte,Short,Integer,Long,Float,Double
		// Object boolean >> Boolean
		// Object Character >> Char
		// Object String >> String
		Integer obj1 = x;
		System.out.printf("Wrapper Integer %d \n\n", obj1);

		// =====================================
		// Laco for each udemy 91.
		// =====================================
		// for (tipo apelido: colacao) {...}
		System.out.println("============================");
		System.out.println(">>> For Each - udemy .91 <<<");
		System.out.println("============================");
		String[] vect2 = new String[] { "Maria", "Bob", "Alex", "Paulo", "Chaves" };
		for (String obj3 : vect2) {// Using For each
			System.out.printf("For Each [%s] Cinco Elementos\n", obj3);
		}

		// ========================
		// Listas Parte 1 udemy 92.
		// ========================
		// Assuntos Pendentes: interfaces, generics, lambda(predicado)
		// interface:List casses >> ArrayList,LinkedList,etc...
		// add.obj, add(int,obj), remove(obj), remove(int)..
		System.out.println("==================================");
		System.out.println(">>> Listas Parte 1 - udemy .92 <<<");
		System.out.println("==================================");
		List<String> list = new ArrayList<>();// Faz parte da List(interface)
		System.out.printf("List.size() %d << Sem Elementos\n", list.size());
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Paulo");
		System.out.printf("List.size() %d << Com Cinco Elementos\n", list.size());
		for (String x1 : list) {
			System.out.printf("List %s\n", x1);
		}
		list.add(2, "Marco"); // Inseriu Marco na posicao 2
		System.out.printf("List.size() %d << Com Seis  Elementos Inseriu Marcos na Pos(2)\n", list.size());
		for (String x1 : list) {
			System.out.printf("List %s\n", x1);
		}
		list.remove("Anna");
		System.out.printf("List.size() %d << Com Cinco Elementos Removido Anna\n", list.size());
		for (String x1 : list) {
			System.out.printf("List %s\n", x1);
		}
		list.remove(3);
		System.out.printf("List.size() %d << Com Quatro Elementos Removido Pos(3)\n", list.size());
		for (String x1 : list) {
			System.out.printf("List %s\n", x1);
		}
		list.removeIf(x1 -> x1.charAt(0) == 'A');
		System.out.printf("List.size() %d << remove if charAt(0) = [A]\n", list.size());
		for (String x1 : list) {
			System.out.printf("List %s\n", x1);
		}
		System.out.printf("Index of Bob   %d << Nao Mais Existe\n", list.indexOf("Bob"));
		System.out.printf("Index of Paulo %d\n", list.indexOf("Paulo"));

		// ========================
		// Listas Parte 2 udemy 93.
		// ========================
		// ATENCAO:- A forma de usar listas conforme os exemplos
		// abaixo sao avancadas - nao precisam decorar
		System.out.println("==================================");
		System.out.println(">>> Listas Parte 2 - udemy .93 <<<");
		System.out.println("==================================");
		List<String> result = list.stream().filter(x1 -> x1.charAt(0) == 'B').collect(Collectors.toList());
		for (String x1 : result) {
			System.out.printf("%s\n", x1);
		}
		String name1 = list.stream().filter(x1 -> x1.charAt(0) == 'P').findFirst().orElse(null);
		System.out.printf("name1 %s FirstOccurrency of [P]\n", name1);
         
		// ==================
		// Matrizes udemy 95.
		// ==================
		System.out.println("============================");
		System.out.println(">>> Matrizes - udemy .95 <<<");
		System.out.println("============================");
		System.out.println("Digite o tamanho da Matriz:[x,y]=n\n");
		n = sc.nextInt();
		int[][] mat = new int[n][n]; // Matriz bidimencional
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			// Dimensao 1(i) Horizontal
			for (int j = 0; j < n; j++) {
				// Dimensao 2(i) Vertical
				System.out.printf("Entre Valor Na Posicao i[%d]H i[%d]V da Matriz\n", i, j);
				mat[i][j] = sc.nextInt();
				System.out.printf("Mat i[%d]H j[%d]V = [%d]\n\n", i, j,mat[i][j]);
			}
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			// Dimensao 1(i) Horizontal
			for (int j = 0; j < n; j++) {
				// Dimensao 2(i) Vertical
				System.out.printf("Mat i[%d]H j[%d]V = [%d]\n", i, j,mat[i][j]);
			}
		}

		System.out.println("\n============================");
		System.out.printf(">>>>>>>>> FIM!!!!! <<<<<<<<<<\n");
		System.out.println("============================");
		sc.close();
	}

}
