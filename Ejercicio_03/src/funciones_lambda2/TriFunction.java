package funciones_lambda2;

@FunctionalInterface
interface TriFunction<T, U, V ,R> {
    R apply(T t, U u, V v);
}