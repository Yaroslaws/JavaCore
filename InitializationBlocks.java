package mashin;

 class Parent{
    Parent(){
        System.out.println("parent constructor");

    }
}

public class InitializationBlocks extends Parent {
    static {
        System.out.println("Hi1");
    }

    {
        System.out.println("Hi2");
    }
    {
        System.out.println("hi3");
    }
    {
        System.out.println("Hi 3");
    }

    InitializationBlocks(){
        //работает без  super();
        System.out.println("Constructor");

    }


    public static void main(String[] args) {
        new InitializationBlocks();

    }

}
