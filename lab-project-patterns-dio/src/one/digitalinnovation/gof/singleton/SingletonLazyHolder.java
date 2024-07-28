package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href=""https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148>Referência</a>
 * @author RuanCostaDev
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder {

        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
