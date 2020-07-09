package com.mazai.pattern.simplefactory;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip theEnemy = null;
        if ("U".equals(newShipType)){
            theEnemy = new UFOEnemyShip();
        }else if ("R".equals(newShipType)){
            theEnemy = new RocketEnemyShip();
        }else if ("B".equals(newShipType)){
            theEnemy = new BigUFOEnemyShip();
        }
        return theEnemy;
    }

}
