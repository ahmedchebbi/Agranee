/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.coin.jar;

/**
 *
 * @author ed1k
 */
public class Coin {

    private final double US_NICKEL_VALUE = 0.05;
    private final double US_NICKEL_VOLUME = 2;
    private final double US_DIME_VALUE = 0.1;
    private final double US_DIME_VOLUME = 2.5;
    private final double US_QUARTER_VALUE = 0.25;
    private final double US_QUARTER_VOLUME = 2.8;
    private final double US_DOLLAR_VALUE = 1;
    private final double US_DOLLAR_VOLUME = 4;
    private final double US_HALFDOLLAR_VALUE = 0.5;
    private final double US_HALFDOLLAR_VOLUME = 3.5;
    private double volume;
    private double value;

    Coin(String type) {
        if(type=="nickel"){
            this.volume = US_NICKEL_VOLUME;
                this.value = US_NICKEL_VALUE;
        }else if(type=="dime"){
            this.volume = US_DIME_VOLUME;
                this.value = US_DIME_VALUE;
        }else
        if(type=="quarter"){
            this.volume = US_QUARTER_VOLUME;
                this.value = US_QUARTER_VALUE;
        }else
        if(type=="dollar"){
            this.volume = US_DOLLAR_VOLUME;
                this.value = US_DOLLAR_VALUE;
        }else
        if(type=="halfdollar"){
            this.volume = US_HALFDOLLAR_VOLUME;
            this.value = US_HALFDOLLAR_VALUE;
        }else{ 
                System.out.println("Wrong choice");
        
           }}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
