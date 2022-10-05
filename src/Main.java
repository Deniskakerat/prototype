public class Main {
    public static void main(String[] args) {
        ShapeCashe.loadCache();

        Shape clonedShape = (Shape)ShapeCashe.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCashe.getShape ("2");
        System.out.println ("Shape "+clonedShape2.getType ());

        Shape clonedShape3 = (Shape) ShapeCashe.getShape( "3");
        System.out.println ("Shape : " +clonedShape3.getType());

        Shape clonedShape4 = (Shape) ShapeCashe.getShape("2");
        System.out.println("Shape " + clonedShape4.getType());
    }
}