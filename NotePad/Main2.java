
class Students{
    public void doSomething(){
        System.out.println("This is from Students");
    }
}

class Man extends Students{

}



class Main2{

public static void main(String[] args){
    Students s1=new Man();

    s1.doSomething();


}


}