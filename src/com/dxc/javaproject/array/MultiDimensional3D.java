package com.dxc.javaproject.array;

public class MultiDimensional3D
{
    public static void main(String[] args)
    {
        int[][][] num = {{{1,2,3},{4,5,6},{7,8,9}}};
        for(int x = 0; x < num.length; x++)
        {
            for(int y = 0; y < num[x].length; y++)
            {
                for(int z = 0; z < num[x][y].length; z++)
                {
                    System.out.print(num[x][y][z]);
                }
                System.out.println();
            }
        }
    }
}