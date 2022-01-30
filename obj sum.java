class Abc{
    int x;
    int y;
    Abc(int x,int y){
        this.x=x;
        this.y=y;
    }
    Abc(){}
}
class A{
    public static void main(String[] args) {
        Abc obj1 = new Abc(1,2);
        Abc obj2 = new Abc(3,4);
        Abc obj = new Abc();
        obj.x=obj1.x+obj2.x;
        obj.y=obj1.y+obj2.y;
        System.out.println(obj.x+", "+obj.y);
    }
}