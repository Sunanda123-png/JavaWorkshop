package com.sunanda;
import java.util.Scanner;

import java.util.Scanner;

public class Tictoe {
    public static void main(String[] args)
    {
        System.out.println("Welcome to tic-toe game");
        Scanner scan=new Scanner(System.in);
        char []board=new char[10];
        System.out.println("The TicToe player start fresh");
        createBoard(scan,board);
    }
    public static void createBoard(Scanner scan, char[] board)
    {
        for(int index=1; index<board.length; index++)
        {
            board[index]=scan.next().charAt(0);
        }
    }
}
