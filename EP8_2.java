public class EP8_2
{
								static java.util.Scanner scan = new java.util.Scanner(System.in);
								public static void main (String [] args)
								{			
														int L,C ,saida=0;
													System.out.print("digite  a quantidade de linhas ");
													L=scan.nextInt();
													System.out.print ("digite a quantidade de colunas ");
													C=scan.nextInt();
													int [][]matriz=LerMatriz(L,C);
												saida= AcimaDaDiagonal(matriz,L);
													System.out.print(saida);
									
								}
								public static int AcimaDaDiagonal(int[][] matriz, int L)
								{        int j=0;
												 				int soma=0;
       					 			
       					 				while (j<L)
       									 {       
        															for(int i=0;i<matriz[j].length;i++)
       															
       															 {
        																					if(i>j)
       																						 {
            																						soma=soma+matriz[j][i];

      																						  }    
     															   }j=j+1; 
																} 
																return soma;
								}
								public static int [][] LerMatriz(int L , int C)
					{	
						 int [][] matriz= new int [L][C];
						 		for (int i=0; i < matriz.length;i++)				// linha
						 				{
						 											for(int j=0 ; j < matriz[0].length;j++)			//coluna
						 											{
						 															System.out.print("Digite o elemento real "+i+","+j+": ");    
           								 matriz[i][j] = scan.nextInt();
           								 
						 											}
						 				}
						 			
						 		return matriz;
					}
}