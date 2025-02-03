abstract class Shapes{
    abstract int area();
}

class Area extends Shapes {
    int area() {
        int length = 7;
        int base = 3;
        return length * base;
    }
}
public class Abstraction {
    public static void main(String[] args){
        Area area = new Area();
        System.out.println(area.area());
    }
}
