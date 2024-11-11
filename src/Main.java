import java.util.Arrays;
import java.util.Comparator;

// Головний клас з методом main
public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів класу Block з різними значеннями полів
        Block[] blocks = {
                new Block("Stone", 2, 3, "Gray", 0),
                new Block("Wood", 3, 4, "Brown", 0),
                new Block("Glass", 1, 5, "White", 1),
                new Block("Iron", 1, 3, "Silver", 0)
        };

        // Сортування масиву за полем strength за зростанням, а якщо значення strength однакові,
        // тоді за полем weight за спаданням
        Arrays.sort(blocks, Comparator
                .comparingInt(Block::getStrength)
                .thenComparing((b1, b2) -> Integer.compare(b2.getWeight(), b1.getWeight())));

        // Виведення відсортованого масиву блоків
        System.out.println("Відсортований масив:");
        for (Block block : blocks) {
            System.out.println(block);
        }

        // Створення еталонного об'єкта для пошуку ідентичного об'єкта в масиві
        Block targetBlock = new Block("Iron", 1, 3, "Silver", 0);

        // Пошук еталонного об'єкта в масиві
        boolean found = false; // змінна, що визначає, чи знайдено об'єкт
        for (Block block : blocks) {
            if (block.equals(targetBlock)) { // перевірка на ідентичність з еталоном
                found = true;
                System.out.println("Знайдено ідентичний об'єкт: " + block);
                break; // вихід з циклу після знаходження першого співпадіння
            }
        }

        if (!found) { // якщо ідентичний об'єкт не знайдено
            System.out.println("Ідентичний об'єкт не знайдено.");
        }
    }
}
