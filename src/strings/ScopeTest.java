package strings;

public class ScopeTest {
	

    static int i;
     
    static void a() {
        i = 0;
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
	 

}
