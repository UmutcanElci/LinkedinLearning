package ObjectsAndAPIs.FunctionalProgramming;

import java.util.Objects;
import java.util.function.Function;

/*

@FunctionalInterface
public interface FunctionalInterfaces<T,R> {
    default <V>Function<T,V> andThen(Function<? super R, ? extends V> after){
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
}


 */