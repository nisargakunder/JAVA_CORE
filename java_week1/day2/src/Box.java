class Box1 {
    private int l;
    private int b;
    public Box1(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void print(){
        System.out.println("length="+l);
        System.out.println("breadth="+b);
    }


}
class Box3d extends Box1{
    private int h;
    public Box3d(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    public void print(){
        super.print(); //inhertence prove code resuability this is how you can access private variable of base class also...otherwise cannot
        System.out.println("height="+h);
    }
}
class Box3dcolor extends Box3d {
    private String color;

    public Box3dcolor(int l, int b, int h, String color) {
        super(l, b, h);
        this.color = color;
    }

    public void print() {
        super.print();
        System.out.println("color=" + color);

    }
}
public  class Box{
    public static void main(String[] args) {
        Box3dcolor b=new Box3dcolor(10,20,30,"red");
        b.print();
    }
}