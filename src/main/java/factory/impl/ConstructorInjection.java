package factory.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import factory.Factory;
import operator.Operator;
import operator.impl.Addition;
import operator.impl.Division;
import operator.impl.Multiplication;
import operator.impl.Subtraction;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class ConstructorInjection implements Factory {

    private final Map<String, Operator> operators;

    public ConstructorInjection() {
        this.operators = new HashMap<String, Operator>() { {
            put("+", new Addition());
            put("-", new Subtraction());
            put("*", new Multiplication());
            put("/", new Division());
        } };
    }

    @Inject
    public ConstructorInjection(Map<String, Operator> operators) {
        this.operators = operators;
    }

    public Operator getOperator(String operation) {
        return (operators.containsKey(operation)) ? operators.get(operation): null;
    }

}
