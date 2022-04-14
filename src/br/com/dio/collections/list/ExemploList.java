package br.com.dio.collections.list;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
      //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        //Como iniciar lista:
        //List notas = new ArrayList(); //usado antes do java 5

        //List<Double> notas = new ArrayList<Double>(); //Generis(jdk 5) Diamond Operator <>

        //ArrayList<Double> notas = new ArrayList<>();//Não recomendado para interface

        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);//Sem implementação (new)limitada pois
        notas.add(10d);//nao permite adiciona nem remover
        System.out.println(notas);//Se compilar dará erro*/

       /* List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);//Tambem é imutável
        notas.add(10d);//nao permite adicionar
        notas.remove(5d);// não permite remover
        System.out.println(notas);//Se compidar dará erro */

        System.out.print("Crie uma lista e adicione as sete notas:");

        //List<Double> notas = new ArrayList<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //ou

        List<Double> notas = new ArrayList<>();//metodo add
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);// ou usando metodo .to/String();
        System.out.println();

        System.out.print("Exiba a posição da nota 5.0: ");
        System.out.println( notas.indexOf(5d));
        System.out.println();

        System.out.print("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println();

        System.out.print("Sustitua a notas 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println();

        System.out.print("Confira se a nota 5.0 está na lista: " );
        System.out.println(notas.contains(5.0)); //true ou false
        System.out.println();

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas)
            System.out.println(nota);
        System.out.println();

        System.out.print("Exiba a terceira nota adicionada: " );
        System.out.println(notas.get(2));
        System.out.println();

        System.out.print("Exiba a menos nota: ");
        System.out.println(Collections.min(notas));
        System.out.println();

        System.out.print("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));
        System.out.println();

        System.out.print("Exiba a soma de todas as notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println();

        System.out.print("Exiba a média das notas: ");
        System.out.println(soma/notas.size());
        System.out.println();

        System.out.print("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println();

        System.out.print("Remova a notas da posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println();

        System.out.print("Remova as notas menores que 7: "); //chana metodo iterator
        Iterator<Double> iterator1 =  notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println();

        System.out.print("Remova todos os itens da lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println();

        System.out.print("Confira se a lista esta vazia: ");
        System.out.println(notas.isEmpty());






    }
}
