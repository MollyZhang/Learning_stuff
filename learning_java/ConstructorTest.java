public class ConstructorTest {
    int x;
   
    // Following is the constructor
    ConstructorTest(int i ) {
        x = i;
    }
    
    public static void main(String args[]) {
        ConstructorTest ct = new ConstructorTest(5);
        System.out.println(ct.x);
//        following is bad
//        ConstructorTest ct1 = new ConstructorTest();
//        System.out.println(ct.x);
        
    }
}
