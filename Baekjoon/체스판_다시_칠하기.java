package Baekjoon.Silver;

import java.io.*;
import java.util.*;

public class 체스판_다시_칠하기 {
    static char [][]b_origin = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
    };

    static char [][]w_origin = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
    };
    static int b_min=0;
    static int w_min=0;

    static char [][] compare;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size[] = br.readLine().split(" ");
        int y = Integer.parseInt(size[0]); //세로
        int x = Integer.parseInt(size[1]); //가로
        int min =Integer.MAX_VALUE;

        compare =new char[y][x] ;

        for (int i=0;i<y;i++) 
            compare[i] = br.readLine().toCharArray();
          
        
        for (int i=0;i<=y-8;i++) {
            for (int j=0;j<=x-8;j++) {
                for (int t=0; t<8 ; t++) {
                    for (int c =0; c<8; c++) {
                        if (w_origin[t][c] != compare[t+i][c+j]) w_min++;
                        else if (b_origin[t][c] != compare[t+i][c+j]) b_min++;
                    }
                 }
                min=Integer.min(min,Integer.min(w_min,b_min));
                w_min=0;
                b_min=0;
            }
        }
        System.out.println(min);
    }
}