class Pattern5
{
    public static void main(String[] args)
    {

        int rows = 5;
        System.out.println("## Printing the pattern ##");

        for (int i=1; i<=rows; i++)
        {
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }

            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=rows-1; i>=1; i--)
        {

            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }

            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


            System.out.println();
        }

    }
}

/*Output
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/
