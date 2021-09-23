package com.sunanda;
import java.util.Scanner;



public class Tictoe {
    public static void main(String[] args)
    {
        System.out.println("Welcome to tic-toe game");
        Scanner scan=new Scanner(System.in);
        char []board=new char[10];
        System.out.println("The TicToe player start fresh");
        System.out.println("Player choose x or o and decide if play the game or not.");
        playerComputer();
    }
    public static void createBoard(Scanner scan, char[] board)
    {
        for(int index=1; index<board.length; index++)
        {
            board[index]=' ';
        }
    }
    public static void playerComputer()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("You have to choose to check you can play or not.");
        System.out.println("X:Cannot play the game");
        System.out.println("O:Can play the game");
        System.out.println("Enter your choice X or O");
        char ch=scan.next().charAt(0);
        switch (ch)
        {
            case 'X':
                System.out.println("You Cannot play the game");
                break;
            case '0':
                System.out.println("You Can play the game");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
