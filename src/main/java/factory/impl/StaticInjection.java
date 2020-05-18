package factory.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import factory.Factory;
import operator.Operator;

import java.util.Map;

@Singleton
public class StaticInjection implements Factory {

    @Inject
    private static Map<String, Operator> operators;

    public Operator getOperator(String operation) {
        return getOperatorStatically(operation);
    }

    private static Operator getOperatorStatically(String operation) {
        return (operators.containsKey(operation)) ? operators.get(operation): null;
    }
}
