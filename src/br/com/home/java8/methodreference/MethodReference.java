package br.com.home.java8.methodreference;

@FunctionalInterface
interface Picture2D {
    void draw(Double width, Double height);

    default void draw(Double width, Double height, Double depth){
        System.out.printf("Draw rectangle width %f, height %f and depth %f with Default Method %n", width, height, depth);
    }
}

class Rectangle {
    public void drawRectangle(Double width, Double height) {
        System.out.printf("Draw rectangle width %f and height %f with Method Reference %n", width, height);
    }
}

public class MethodReference {

    public static void main(String[] args) {

        Picture2D pic2DAnonymousClasses = new Picture2D() {
            @Override
            public void draw(Double width, Double height) {
                System.out.printf("Draw rectangle width %f and height %f with AnonymousClasses %n", width, height);
            }
        };
        pic2DAnonymousClasses.draw(1.0, 2.0);
        pic2DAnonymousClasses.draw(1.0, 2.0, 3.0);

        Picture2D pic2DLambda = (width, height) -> System.out.printf("Draw rectangle width %f and height %f with Lambda. %n", width, height);
        pic2DLambda.draw(3.0, 4.0);
        pic2DLambda.draw(3.0, 4.0, 5.0);

        Picture2D pic2DMethodReference = new Rectangle()::drawRectangle;
        pic2DMethodReference.draw(5.0, 6.0);
        pic2DMethodReference.draw(5.0, 6.0, 7.0);

    }


}

