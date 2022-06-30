public class area {
    int length ;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;

    }
    void calculationArea (){
        System.out.println(length* width);
    }

}
 class area1{
    public static void main(String[]args){
        area r1 = new area ();
        r1.insert(2, 2);
        r1.calculationArea();
    }
 }
