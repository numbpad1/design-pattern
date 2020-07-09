package com.mazai.pattern.simplefactory;

import java.util.Scanner;

/**
 * 工厂模式
 */
public class FactoryTest {

    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship?(U / R / B)");
        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
           theEnemy =  shipFactory.makeEnemyShip(typeOfShip);
        }
        if (theEnemy != null){
            doStuffEnmy(theEnemy);
        }else System.out.println("Enter U , R , or B next time");

    }

    private static void doStuffEnmy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
