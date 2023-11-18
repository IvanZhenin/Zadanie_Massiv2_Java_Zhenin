import java.util.Scanner;

public class New
{

    public static void main(String[] args) 
    {
   	Scanner scanner = new Scanner(System.in);
    	// Ввод числа столбцов и строк
    	System.out.println("Введите количество столбцов:");
    	int columnCount = scanner.nextInt();
    	System.out.println("Введите количество строк:");
    	int rowCount = scanner.nextInt();

	int[][] array = new int[rowCount][columnCount];
    	// Присвоение случайных значений элементам массива
    	for (int i = 0; i < rowCount; i++) 
    	{
            for (int j = 0; j < columnCount; j++) 
            {
              array[i][j] = (int) (Math.random() * 10);
            }
    	 }

    	System.out.print("Матрица:\n");
    	// Вывод
    	for (int[] row : array) 
    	{
      	   for (int number : row) 
           {
             System.out.printf("%d ", number);
           }
       	   System.out.println();
    	}
    }
}
