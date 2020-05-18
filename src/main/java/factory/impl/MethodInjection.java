package factory.impl;

import com.google.inject.Inject;
import factory.Factory;
import operator.Operator;

import java.util.Map;

public class MethodInjection implements Factory {

    private Map<String, Operator> operators;

    @Inject
    public void setOperators(Map<String, Operator> operators) {
        this.operators = operators;
    }

    public Map<String, Operator> getOperators() {
        return operators;
    }

    public Operator getOperator(String operation) {
        return (getOperators().containsKey(operation)) ? getOperators().get(operation): null;
    }
}
