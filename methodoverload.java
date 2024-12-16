import java.util.*; 

class methodoverload {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        methodoverload method = new methodoverload();
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("sum: " + method.add(x, y, z));
  
    }
}
