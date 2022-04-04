public class MySecondJavaClass {
    public int x;
    public String y;
    public MySecondJavaClass(){
        x = 10;
        y = "khan";
    }
    public void get(){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        MySecondJavaClass mySecondJavaClass = new MySecondJavaClass();
        mySecondJavaClass.get();
    }


}
