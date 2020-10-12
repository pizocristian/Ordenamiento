/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author cristian
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int [] vector = new int[100]; 
		llenaVector(vector);
		imprimeVector(vector);
	}
	
	public static int[] llenaVector(int[] vector){
		System.out.println("LLenando vector....");
		for(int i=0;i<vector.length;i++){
			vector[i] = new Random().nextInt(100000);
		}
                 Arrays.sort(vector);
		return vector;
	}
	public static void imprimeVector(int[] vector){
		System.out.println("Imprimiendo vector....");
		for(int i=0;i<vector.length;i++){
			System.out.print(String.valueOf(vector[i])+" ");
		}
                
	}
    
}
