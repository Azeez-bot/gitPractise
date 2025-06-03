package OOPs;

public class classAndObjects {
    int lenght,breadth;
    void getdata(int x,int y){
        lenght=x;
        breadth=y;
    }
    int getarea(){
        int area=lenght*breadth;
        return  area;
    }
}
class calculation{
    public static void main(String[] args) {
        int area1,area2;
        classAndObjects c1=new classAndObjects();
        classAndObjects c2=new classAndObjects();
        c1.getdata(12,23);
        area1= c1.getarea();
        System.out.println(area1);
    }
}

