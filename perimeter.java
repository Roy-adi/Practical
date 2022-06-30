public class perimeter {
    int length ;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;

    }
    void calculationPerimeter (){
        System.out.println(2*(length+width));
    }

}
 class perimeter1{
    public static void main(String[]args){
        perimeter r1 = new perimeter();
        r1.insert(5, 4);
        r1.calculationPerimeter();
    }
}
