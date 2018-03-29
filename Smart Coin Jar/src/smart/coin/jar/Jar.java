/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.coin.jar;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ed1k
 */
public class Jar {

    private final double VOLUME_ERROR_MARGIN = 0.95;
    private final double COIN_JAR_MAX_VOLUME = 32;
    private ArrayList<Coin> coinlist;
    private double ActualMaxVolume;
    private double MaxVolume;
    private double CurrentVolume;
    private double CurrentValue;

    Jar() {
        this.CurrentVolume = 0;
        this.CurrentValue = 0;
        this.MaxVolume = COIN_JAR_MAX_VOLUME;
        this.ActualMaxVolume = this.MaxVolume * VOLUME_ERROR_MARGIN;
        this.coinlist = new ArrayList<>();
    }

    public void add(Coin coin) {
        if ((coin.getVolume() + this.CurrentVolume) > this.ActualMaxVolume) {
            System.out.println("Jar is full");
        } else {
            this.coinlist.add(coin);
            this.setCurrentVolume(this.getCurrentVolume() + coin.getVolume());
            this.setCurrentValue(this.getCurrentValue() + coin.getValue());

        }

    }

    public void reset() {
        this.CurrentValue = 0;
        this.CurrentVolume = 0;
        coinlist.clear();
    }

    public ArrayList<Coin> getCoinlist() {
        return coinlist;
    }

    public void setCoinlist(ArrayList<Coin> coinlist) {
        this.coinlist = coinlist;
    }

    public double getActualMaxVolume() {
        return ActualMaxVolume;
    }

    public void setActualMaxVolume(double ActualMaxVolume) {
        this.ActualMaxVolume = ActualMaxVolume;
    }

    public double getMaxVolume() {
        return MaxVolume;
    }

    public void setMaxVolume(double MaxVolume) {
        this.MaxVolume = MaxVolume;
    }

    public double getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(double CurrentVolume) {
        this.CurrentVolume = CurrentVolume;
    }

    public double getCurrentValue() {
        return CurrentValue;
    }

    public void setCurrentValue(double CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

}
