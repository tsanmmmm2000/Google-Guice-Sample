import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import factory.Factory;
import factory.impl.ConstructorInjection;
import operator.Operator;
import operator.impl.Addition;
import operator.impl.Division;
import operator.impl.Multiplication;
import operator.impl.Subtraction;

public class Configuration extends AbstractModule {

    @Override
    public void configure() {
        MapBinder<String, Operator> mapBinder = MapBinder.newMapBinder(binder(), String.class, Operator.class);
        mapBinder.addBinding(Utility.Addition).to(Addition.class);
        mapBinder.addBinding(Utility.Subtraction).to(Subtraction.class);
        mapBinder.addBinding(Utility.Multiplication).to(Multiplication.class);
        mapBinder.addBinding(Utility.Division).to(Division.class);

        // instance binding
        // mapBinder.addBinding(Utility.Addition).toInstance(new Addition());
        // mapBinder.addBinding(Utility.Subtraction).toInstance(new Subtraction());
        // mapBinder.addBinding(Utility.Multiplication).toInstance(new Multiplication());
        // mapBinder.addBinding(Utility.Division).toInstance(new Division());

        // constructor binding
        // try {
        //    bind(Factory.class).toConstructor(ConstructorInjection.class.getConstructor());
        // } catch(NoSuchMethodException ex) {
        //    ex.printStackTrace();
        // }

        // constructor injection
        bind(Factory.class).to(ConstructorInjection.class);

        // method injection
        // bind(Factory.class).to(MethodInjection.class);

        // static injection
        // requestStaticInjection(StaticInjection.class);
        // bind(Factory.class).to(StaticInjection.class);
    }
}
