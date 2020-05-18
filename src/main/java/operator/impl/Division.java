package operator.impl;

import com.google.inject.Singleton;
import operator.Operator;

@Singleton
public class Division implements Operator {
    public long operate(long expr1, long expr2) {
        return expr1 / expr2;
    }
}
