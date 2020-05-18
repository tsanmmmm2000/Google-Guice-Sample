package factory.impl;

import com.google.inject.Inject;
import factory.Factory;
import operator.Operator;

import java.util.Map;

public class FieldInjection implements Factory {

    @Inject
    private Map<String, Operator> operators;

    public Operator getOperator(String operation) {
        return (operators.containsKey(operation)) ? operators.get(operation): null;
    }
}
