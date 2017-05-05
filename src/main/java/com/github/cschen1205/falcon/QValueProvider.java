package com.github.cschen1205.falcon;

/**
 * Created by cschen on 9/30/2015 0030.
 */
public abstract class QValueProvider {
    public abstract QValue queryQValue(double[] state, int actionId, boolean isNextAction);
    public QValue queryQValue(double[] state, double[] actions, boolean isNextAction){
        int actionId = -1;
        double maxValue = Double.NEGATIVE_INFINITY;
        for(int i=0; i < actions.length; ++i){
            if(actions[i] > maxValue){
                maxValue = actions[i];
                actionId = i;
            }
        }
        return queryQValue(state, actionId, isNextAction);
    }
}
