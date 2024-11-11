// Клас Block для представлення будівельного блоку з п'ятьма полями
class Block {
    // Поле name - назва матеріалу блоку
    private final String name;
    // Поле strength - міцність блоку
    private final int strength;
    // Поле weight - вага блоку
    private final int weight;
    // Поле color - колір блоку
    private final String color;
    // Поле transparency - прозорість блоку
    private final int transparency;

    // Конструктор класу Block, що ініціалізує всі поля об'єкта
    public Block(String name, int strength, int weight, String color, int transparency) {
        this.name = name;
        this.strength = strength;
        this.weight = weight;
        this.color = color;
        this.transparency = transparency;
    }

    // Геттер для поля strength (використовується в сортуванні)
    public int getStrength() { return strength; }

    // Геттер для поля weight (використовується в сортуванні)
    public int getWeight() { return weight; }

    // Перевизначення методу equals для порівняння об'єктів Block
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // якщо це той самий об'єкт, повертаємо true
        if (o == null || getClass() != o.getClass()) return false; // перевірка на null та тип класу
        Block block = (Block) o;
        // Порівнюємо значення всіх полів для визначення ідентичності
        return strength == block.strength &&
                weight == block.weight &&
                transparency == block.transparency &&
                name.equals(block.name) &&
                color.equals(block.color);
    }

    // Перевизначення методу toString для зручного виведення інформації про об'єкт Block
    @Override
    public String toString() {
        return "<name=" + name + ", strength=" + strength + ", weight=" + weight +
                ", color=" + color + ", transparency=" + transparency + ">";
    }
}
