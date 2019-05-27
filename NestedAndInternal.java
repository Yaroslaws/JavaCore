package mashin;

public class NestedAndInternal {
    private int id;
    static int id2;

    public NestedAndInternal(int id) {
        this.id = id;
    }
//вложенный не статический класс
    private class NestedClass{
        public void startNasted(){
            System.out.println("Nasted start " + id);
        }
    }
    //вложенный  статический класс не имеет доступ к полям класса родителя
public static class NastedStatic{
    public void startNasted(){
        System.out.println("Nasted start " + id2);
    }
}



    public NestedAndInternal() {

    }

    public  void start(){
        System.out.println("Nested " + id + " start");
    }

    public static void main(String[] args) {
        NestedAndInternal nestedAndInternal = new NestedAndInternal();
        nestedAndInternal.start();
    }

}
