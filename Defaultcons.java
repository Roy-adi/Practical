
class Defaultcons {
    String name;
     Defaultcons (String name1){
       name = name1 ;
System.out.println("Cons Called");
}
 
 public static void main(String[]args) {
    Defaultcons obj = new Defaultcons("java");
    Defaultcons obj1 = new Defaultcons("c++");
    Defaultcons obj2 = new Defaultcons("c");
    System.out.println("the name is " + obj.name);
    System.out.println("the name is " + obj1.name);
    System.out.println("the name is " + obj2.name);
}
}


