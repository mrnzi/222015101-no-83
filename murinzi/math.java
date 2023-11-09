
class  classAssignment {

    public static void main(String args[]) {
        A d = new A();
        d.display();
        d.sub();
        d.mult();
        d.add();
        d.divide();
        
        
    }
}
class D{
    int a=500;
    int b=300;
public void mult(){
System.out.println("The multiplication is"+a*b);
}

}

class C extends D{
public void add(){
System.out.println("The addition is "+a+b);
}

}

class B extends C{
public void divide(){
System.out.println("The division is "+a/b);
}
}
interface E{
void display();
}
class A extends B implements E{

    public void display(){
        System.out.println("This is interface implemented");
    }
    public void sub(){
    
    int su=a-b;
    System.out.println("the substraction is "+su);
    }
}
