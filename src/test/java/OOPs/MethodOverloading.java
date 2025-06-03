package OOPs;

public class MethodOverloading {
    float length;
    float Breadth;
    MethodOverloading(float x,float y){
        length=x;
        Breadth=y;
    }
    MethodOverloading(float z){
        length=Breadth=z;
    }
    float area(){
        return (length*Breadth);
    }

    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading(33);
        MethodOverloading m2=new MethodOverloading(20,20);
        System.out.println(m2.area());
        System.out.println(m1.area());
    }
}
