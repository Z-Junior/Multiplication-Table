public class MT
{
    public static void main(String[] args)
    {
        int[][] iTable = new int[13][13];

        for (int i = 1; i < iTable.length; i++)
            for (int j = 1; j < iTable[i].length; j++)
                iTable[i][j] = i*j;

        printTable(iTable);
    }

    static void printTable(int[][] iTable)
    {
        for (int i = 1; i < iTable.length; i++)
        {
            for (int j = 1; j < iTable[i].length; j++)
            {
                System.out.print(String.format("%d\t", iTable[i][j]));
            }

            System.out.println();
        }
    }
}
