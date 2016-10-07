

public class Exercicio2 {
	
	//int pontosFora1 [] = new int [4];
	int [] pontosFora = {45,76,33,67};
    int soma = 0 ;
		
 	
    public Exercicio2 () {
	
		System.out.println("O valor da posição 3 é:" + pontosFora [2]); 
		
		System.out.println(soma(pontosFora));
		
		/*
		for(int i=0; i< pontosFora.length; i++){         
			
			soma = soma + pontosFora [i];
			
			System.out.println("A soma dos valores todos são:" + soma ); 	
			
		}
		*/
    }
    
   
    public int soma(int[] array){
		int soma=0;
		int [] vect = array;
		
		for(int i=0; i<vect.length;i++){
			soma= soma + vect[i];
		}
		
		return soma;
		
		
	
    }

}
