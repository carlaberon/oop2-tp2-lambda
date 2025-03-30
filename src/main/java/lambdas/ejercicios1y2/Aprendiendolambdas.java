package lambdas.ejercicios1y2;

public class Aprendiendolambdas {
    public void unMetodo(A a) {
        a.metodo();
    }

    public void unMetodo(B b) {
        b.metodo("unString");
    }

//    public void unMetodo(C c) {
//        System.out.println(c.metodo("otroString") ? "true" : false);
//    }

    public void unMetodo(C c) {
        System.out.println(c.metodo("abcd"));
    }

    public String unMetodo(String c) {
        return c.length() % 2 == 0 ? "true" : "false";
    }

    public void unMetodo(D<Long, Long> d) {
        d.metodo(10L);
    }


}
