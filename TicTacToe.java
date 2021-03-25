package ru.geekgrains;

import java.util.Random;
import java.util.Scanner;

    public class TicTacToe {
        private static final Random RANDOM = new Random();
        private static final Scanner SCANNER = new Scanner(System.in);
        private static final char DOT_HUMAN = 'x';
        private static final char DOT_AI = '0';
        private static final char DOT_AMP = '.';

        private static char[][] field;
        private static int fieldSizeX;
        private static int fieldSizeY;

        public static void main(String[] args) {
            fieldSizeY = 3;
            fieldSizeX = 3;
            initField();
            printField();
            humanTurn();
            printField();

        }

        private static void humanTurn() {
            int x, y;
            System.out.print("Введите координаты x и y через пробел>>>>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
            if (isCellEmpty(x, y) && isCellValid(x, y))
            field[y][x] = DOT_HUMAN;

        }

        private static boolean isCellValid(int x, int y) {
            return x >= 0 && y>=0 && x <=fieldSizeX && y<= fieldSizeY;
        }

        private static boolean isCellEmpty(int x, int y) {
            return field[y][x] == DOT_AMP;

        }


        private static void initField() {
            field = new char[fieldSizeY][fieldSizeX];
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    field[y][x] = DOT_AMP;
                }
            }
        }
        private static void printField() {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    System.out.print(field[x][y] + " ");

                }
                System.out.println();
            }
        }
    }


