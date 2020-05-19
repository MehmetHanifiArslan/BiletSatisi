/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import entity.seferler;
import java.util.List;

/**
 *
 * @author Hanifi
 */
public class Context {
    
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void BiletSec(List<seferler> seferler){
        strategy.BiletSec(seferler);
    }
}
 