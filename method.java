// Create a new project and src > create new package > then in package new class and write the code there
package mypackage;
public class Demo {
    public static int add (int a, int b){
        int c = a + b;
        return c;
    }
    public static void public static void main(String[] args) {
        System.out.println("Hello")
    }
}
// Click on Project test and Export > Java > Jar File > Select location
// Create a new Project then Build Path > Configure build path > Classpath > Add external Jars > Choose the jar location
// Go to Project > src > new class Import mypackage into it
import mypackage.Demo;
public class newClass {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int c = demo.add(15, 45);
        System.outprintln(c)
    }
}