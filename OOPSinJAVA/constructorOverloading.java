package OOPSinJAVA;

public class constructorOverloading {
    constructorOverloading(){
        System.out.println("Empty constructor");
    }
    constructorOverloading(String name){
        String fullName=name;
        System.out.println(fullName);
    }
    public static void main(String[] args) {
         new constructorOverloading();
         new constructorOverloading("Deepak");
    }
}
