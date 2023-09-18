public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0 ;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i = i + 1;
        }
        int k=3;
        while (k > 5) {
            System.out.println("i is " + i + " but is less than 15");
        }
        
        while ( a < 10 && b <=20) {
            System.out.println("i is " + i + " but is less than 15");
        }
    }
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


