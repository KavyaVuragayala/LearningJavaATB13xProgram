package ex_33_Generics;

public class Lab_144_Generics_WebAuto {

    GenericClass g= new GenericClass(10);
    GenericClass g1= new GenericClass("alice");
    GenericClass g2= new GenericClass(true);
    GenericClass g3= new GenericClass(98.67);

    // T is a placeholder --> it can be any datatype

}

class GenericClass<T>{

    private T data;

    public GenericClass(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
