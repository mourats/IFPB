package br.edu.ifpb.algoritmo;

/**
 * Created by Matheus da Silva
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.edu.ifpb.algoritmo.Valores;

public class Algoritmo {
	
	public Valores Round (){
		
		int[] nums = new int[9];
		int[] ind = new int[3];

		ind[0]=-1;
		ind[1]=-2;
		ind[2]=-3;

		int soma=0;

		Random random = new Random();
		Valores valores = new Valores();
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 1; i < 21; i++){
			numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		
		for(int i=0;i<9;i++){
			nums[i]= numeros.get(i);
		System.out.println(nums[i] + " - " + i + "° Posição");
		}

		System.out.println(" ");

		for(int i=0;i<3;i++){
			ind[i]=random.nextInt(8);
			while(ind[0] == ind[1] || ind[1] == ind[2] || ind[2] == ind[0]){
				ind[i]=random.nextInt(8);
			}
			System.out.println(ind[i]+ "° Posição");
			soma+=nums[ind[i]];
			
			
		} 
		
		valores.setNumeros(nums);
		valores.setResultado(soma);
		
		System.out.println(" ");
		System.out.println(soma);
		
		return valores;
	}
}

