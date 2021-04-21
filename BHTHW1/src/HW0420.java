import java.util.Arrays;

public class HW0420 {

    public static void main(String[] args) {
        // Topic String:
        // Question 1
        System.out.println("Topic String:");
        System.out.println("Question 1:");
        String s1 = "Algorism";
        String s2 = s1.substring(0, 2);
        String s3 = s1.substring(0, 4);

        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);

        // Question 2
        System.out.println("\nQuestion 2:");
        String s4 = new String("sameOne");
        String s5 = new String("sameOne");
        System.out.println("s4 == s5: "+(s4==s5));
        System.out.println("s4.equals(s5): "+s4.equals(s5));

        // Question 3
        System.out.println("\nQuestion 3:");
        String s6 = "https://www.amazon.com/demo?test=abc";
        String[] s6List = s6.split("://|\\.|\\?|\\=|/");
        System.out.print("s6 split into: ");
        System.out.println(Arrays.toString(s6List));

        // Question 4
        System.out.println("\nQuestion 4:");
        String[] s7List = new String[]{"aaa", "bbb", "ccc", "ddd"};
        StringBuilder sb7 = new StringBuilder();
        for (String s: s7List) {
            sb7.append(s);
        }
        System.out.println(sb7.toString());

        // Topic: final
        // Question 1
        System.out.println("\nTopic final:");
        System.out.println("Question 1:");
        Car car = new Car();
        System.out.println("Before change: "+car.toString());
        car.setBrand("NewBee");
        System.out.println("After change: "+car.toString());
    }
}

// Topic: final
// Question 1
final class Car{
    private final StringBuilder brand = new StringBuilder("Toyota");
    public final void setBrand(String brand) {
        this.brand.delete(0, brand.length());
        this.brand.append(brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                '}';
    }
}


/* Test output:
Topic String:
Question 1:
s2:Al
s3:Algo

Question 2:
s4 == s5: false
s4.equals(s5): true

Question 3:
s6 split into: [https, www, amazon, com, demo, test, abc]

Question 4:
aaabbbcccddd

Topic final:
Question 1:
Before change: Car{brand=Toyota}
After change: Car{brand=NewBee}
 */



