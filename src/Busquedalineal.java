import java.util.Scanner;
 
class LinearSearch 
{
  public static void main(String args[])
  {
    int c, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Introduzca el número de elementos");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Escrba" + n + "enteros");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Introducir valor para encontrar");
    search = in.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     
      {
         System.out.println(search + "Está presente " + (c + 1) + ".");
          break;
      }
   }
   if (c == n)  /* Searching element is absent */
      System.out.println(search + " no es presente ");
  }
}

