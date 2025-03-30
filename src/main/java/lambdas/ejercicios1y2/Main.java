package lambdas.ejercicios1y2;

public class Main {

    public static void main(String[] args) {
        Aprendiendolambdas a = new Aprendiendolambdas();
//
//        a.unMetodo((b) -> { //invoca al segundo m x la firma del m abstracto
//            System.out.println("abcd" + b);
//
//        });
//        a.unMetodo(() -> System.out.println(("abcd"))); //no invoca a ninguno
//
//        a.unMetodo((variable) -> { //invoca al segundo m x la firma del m abstracto
//            System.out.println("abcd");
//        });
//        a.unMetodo((Long variable) -> { //invoca al último m x la firma del m abstracto
//            System.out.println("abcd");
//            return 10L;
//        });
//

        //Para aprender a usar lambdas se puede en primer instacia crear una clase anonima
//        a.unMetodo(new C() {
//            @Override
//            public boolean metodo(String c) {
//                if (c.length() % 2 == 0){
//                    return true;
//                }
//                return false;
//            }
//        });

        a.unMetodo((String variable) -> {
            if (variable.length() % 2 == 0) {
                return true;
            }
            return false;
        });

        a.unMetodo((String variable) -> {
            String char1 = String.valueOf(variable.charAt(0));
            if (Character.isUpperCase(char1.charAt(0))) {
                return true;
            }
            return false;
        });


    }


}
