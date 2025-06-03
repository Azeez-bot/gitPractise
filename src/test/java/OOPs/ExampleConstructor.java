package OOPs;

public class ExampleConstructor {
    int len;
    int brd;
    //Default Constructor
    ExampleConstructor(){
        len=0;
        brd=0;
    }
    //Parameterised Constructor
    ExampleConstructor(int w,int b){
        len=w;
        brd=b;
    }
    int area(){
        int b=len*brd;
        return b;
    }

    public static void main(String[] args) {
        ExampleConstructor e1=new ExampleConstructor(3,4);
        int kk= e1.area();
        System.out.println(kk);
    }
}
