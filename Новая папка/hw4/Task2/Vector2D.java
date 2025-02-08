package Task2;

public class Vector2D {
    private double x;  // Координата X
    private double y;  // Координата Y

    // Конструктор для нулевого вектора
    public Vector2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Конструктор с координатами
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Сложение вектора с другим вектором, результат возвращается как новый объект
    public Vector2D add(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Сложение вектора с другим вектором, результат сохраняется в текущем объекте
    public void add2(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        this.x += other.x;
        this.y += other.y;
    }

    // Вычитание из вектора другого вектора, результат возвращается как новый объект
    public Vector2D sub(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    // Вычитание из вектора другого вектора, результат сохраняется в текущем объекте
    public void sub2(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        this.x -= other.x;
        this.y -= other.y;
    }

    // Умножение вектора на вещественное число, результат возвращается как новый объект
    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    // Умножение вектора на вещественное число, результат сохраняется в текущем объекте
    public void mult2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    // Строковое представление вектора
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Длина вектора
    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    // Скалярное произведение вектора на другой вектор
    public double scalarProduct(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return this.x * other.x + this.y * other.y;
    }

    // Косинус угла между этим и другим вектором
    public double cos(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        double scalarProd = this.scalarProduct(other);
        return scalarProd / (this.length() * other.length());
    }

    // Сравнение векторов
    public boolean equals(Vector2D other) {
        if (other == null) {
            return false;
        }
        return this.x == other.x && this.y == other.y;
    }

    // Методы get- и set- для атрибутов
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Тестирование работы класса
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        System.out.println("Вектор 1: " + v1);
        System.out.println("Вектор 2: " + v2);

        Vector2D sum = v1.add(v2);
        System.out.println("Сумма векторов: " + sum);

        v1.add2(v2);
        System.out.println("Вектор 1 после сложения с вектором 2: " + v1);

        Vector2D diff = v1.sub(v2);
        System.out.println("Разность векторов: " + diff);

        v1.sub2(v2);
        System.out.println("Вектор 1 после вычитания вектора 2: " + v1);

        Vector2D scaled = v1.mult(2);
        System.out.println("Вектор 1, умноженный на 2: " + scaled);

        v1.mult2(2);
        System.out.println("Вектор 1 после умножения на 2: " + v1);

        System.out.println("Длина вектора 1: " + v1.length());
        System.out.println("Скалярное произведение векторов: " + v1.scalarProduct(v2));
        System.out.println("Косинус угла между векторами: " + v1.cos(v2));
        System.out.println("Векторы равны: " + v1.equals(v2));
    }
}
