public class MyFirstJavaClass{
    public int x;
    public String y;
    public MyFirstJavaClass(){
        x = 10;
        y = "zaid";
    }
    public void get(){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        MyFirstJavaClass myFirstJavaClass = new MyFirstJavaClass();
        myFirstJavaClass.get();
    }


}