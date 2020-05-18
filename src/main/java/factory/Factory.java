package factory;

import operator.Operator;

public interface Factory {
    Operator getOperator(String operation);
}
