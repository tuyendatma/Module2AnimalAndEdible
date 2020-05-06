import Fruits.Fruits;
import Fruits.Orange;
import Fruits.Apple;
public class testAnimalAndEdible {
    public static void main(String[] args) {
        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruits fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
