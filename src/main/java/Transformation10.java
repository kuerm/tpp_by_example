import java.util.List;

// Statement -> tail-recursion
public class Transformation10 {

    private final Fruits fruits = new Fruits(List.of(new Fruit("Apple", 2), new Fruit("Banana", 3)));

    public String chooseBeforeTransformation(String fruitName) {
        var returnedFruits = 0;
        if (fruits.hasFruits(fruitName)) {
            fruits.take(fruitName, 5);
            returnedFruits++;
        }
        if (fruits.hasFruits(fruitName)) {
            fruits.take(fruitName, 5);
            returnedFruits++;
        }
        if (returnedFruits > 0) {
            return "You're welcome. Here is your %s".formatted(fruitName);
        }

        return "Sorry mate, no more %s for you".formatted(fruitName);
    }

    public String chooseAfterTransformation(String fruitName) {
        var returnedFruits = 0;
        while (fruits.hasFruits(fruitName)) {
            fruits.take(fruitName, 1);
            returnedFruits++;
        }
        if (returnedFruits > 0) {
            return "You're welcome. Here is your %s. Total quantity %d".formatted(fruitName, returnedFruits);
        }

        return "Sorry mate, no more %s for you".formatted(fruitName);
    }

    private record Fruit(String name, int initialStockSize) {
        private static int currentStockSize;

        private Fruit(String name, int initialStockSize) {
            this.name = name;
            this.initialStockSize = initialStockSize;
            currentStockSize = initialStockSize;
        }

        void take(int quantity) {
            currentStockSize -= quantity;
        }

        public int currentStockSize() {
            return currentStockSize;
        }
    }

    private record Fruits(List<Fruit> fruits) {
        boolean hasFruits(String fruitName) {
            return fruits.stream().anyMatch(fruit -> fruit.name.equalsIgnoreCase(fruitName) && fruit.currentStockSize() > 0);
        }

        public void take(String fruitName, int quantity) {
            fruits.stream()
                    .filter(fruit -> fruit.name.equalsIgnoreCase(fruitName))
                    .forEach(fruit -> fruit.take(quantity));
        }
    }
}