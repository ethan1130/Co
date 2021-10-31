package com.company.gamemechanics;

import java.util.Random;

public class LoopSystem {
    public class Main {

        static String SouthVietnam = "SouthVietnam";
        static String UnitedStates = "UnitedStates";

        static String NorthVietnam = "NorthVietnam";
        static String SovietUnion = "SovietUnion";

        public static void main(String[] args) {

            for (int i = 0; i < 100; i++) {
                System.out.println("ROUND " + (i + 1));
                Random random = new Random();
                int playerSelected = random.nextInt(3);
                System.out.println(playerSelected);
                String player = "";
                if (playerSelected == 0) {
                    player = UnitedStates;
                } else if (playerSelected == 1) {
                    player = NorthVietnam;
                }
                printOutputToConsole(player);
            }

        }

        private static void printOutputToConsole( String player) {
            if (player.equalsIgnoreCase(UnitedStates)) {
                System.out.println("United States is attacking\n\n");
            } else if (player.equalsIgnoreCase(NorthVietnam)) {
                System.out.println("North Vietnam is attacking\n\n");
            } else {
                System.out.println("North Vietnam is attacking\n\n");
            }
        }
    }
}
