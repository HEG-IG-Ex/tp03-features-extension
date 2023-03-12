package outils;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestList<TestResult> extends ArrayList<TestResult> {
    int nbPositive;

    public void updatePositiveCounter(boolean result){
        if(result){
            this.nbPositive++;
        }
    }

    public int getNbPositive() {
        return this.nbPositive;
    }

    public double calculatePositiveProportion(){
        DecimalFormat df = new DecimalFormat("###.##");
        return Double.parseDouble(df.format((double)  this.getNbPositive() / this.size() * 100));
    }

}
