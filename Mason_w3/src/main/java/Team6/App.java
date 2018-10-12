package Team6;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LombokTest testObject = new LombokTest();

        testObject.setAge(28);
        testObject.setName("Mason");
        int age = testObject.getAge();
        String name = testObject.getName();

        System.out.println("name : " + name + ", age : " + age);
    }
}
