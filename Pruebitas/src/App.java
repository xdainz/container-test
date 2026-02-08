import Model.Tree;

public class App {

    public static void main() {
        Tree t1 = new Tree("Pepe", 20);
        Tree t2 = new Tree("Robert", 400);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }

}
