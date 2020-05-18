import com.google.inject.Inject;
import com.google.inject.Singleton;
import factory.Factory;
import operator.Operator;

@Singleton
public class BinaryCalculator {

    @Inject
    private Factory factory;

    public long calc(long expr1, String operation, long expr2) {
        Operator operator = factory.getOperator(operation);
        return operator.operate(expr1, expr2);
    }
}
