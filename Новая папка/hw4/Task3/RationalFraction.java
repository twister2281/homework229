package Task3;

public class RationalFraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор для дроби, равной нулю
    public RationalFraction() {
        this.numerator = 0;
        this.denominator = 1;  // По умолчанию знаменатель равен 1
    }

    // Конструктор дроби с числителем и знаменателем
    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Автоматическое сокращение дроби при создании
    }

    // Сокращение дроби
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator /= gcd;
        this.denominator /= gcd;

        // Если знаменатель отрицательный, меняем знак у числителя и знаменателя
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Нахождение НОД (наибольший общий делитель)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Сложение дроби с другой дробью, результат возвращается как новый объект
    public RationalFraction add(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        int commonDenominator = this.denominator * other.denominator;
        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        RationalFraction result = new RationalFraction(resultNumerator, commonDenominator);
        result.reduce();  // Сокращаем результат
        return result;
    }

    // Сложение дроби с другой дробью, результат сохраняется в текущем объекте
    public void add2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce();  // Сокращаем результат
    }

    // Вычитание из дроби другой дроби, результат возвращается как новый объект
    public RationalFraction sub(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        int commonDenominator = this.denominator * other.denominator;
        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        RationalFraction result = new RationalFraction(resultNumerator, commonDenominator);
        result.reduce();  // Сокращаем результат
        return result;
    }

    // Вычитание из дроби другой дроби, результат сохраняется в текущем объекте
    public void sub2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce();  // Сокращаем результат
    }

    // Умножение дроби на другую дробь, результат возвращается как новый объект
    public RationalFraction mult(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(resultNumerator, resultDenominator);
        result.reduce();  // Сокращаем результат
        return result;
    }

    // Умножение дроби на другую дробь, результат сохраняется в текущем объекте
    public void mult2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        reduce();  // Сокращаем результат
    }

    // Деление дроби на другую дробь, результат возвращается как новый объект
    public RationalFraction div(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        int resultNumerator = this.numerator * other.denominator;
        int resultDenominator = this.denominator * other.numerator;
        RationalFraction result = new RationalFraction(resultNumerator, resultDenominator);
        result.reduce();  // Сокращаем результат
        return result;
    }

    // Деление дроби на другую дробь, результат сохраняется в текущем объекте
    public void div2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другая дробь не может быть null");
        }
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        reduce();  // Сокращаем результат
    }

    // Строковое представление дроби (например, -2/3)
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Десятичное значение дроби
    public double value() {
        return (double) numerator / denominator;
    }

    // Сравнение дроби с другой дробью
    public boolean equals(RationalFraction other) {
        if (other == null) {
            return false;
        }
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // Целая часть дроби
    public int numberPart() {
        return numerator / denominator;
    }

    // Тестирование работы класса
    public static void main(String[] args) {
        RationalFraction r1 = new RationalFraction(3, 4);
        RationalFraction r2 = new RationalFraction(2, 5);

        System.out.println("Дробь 1: " + r1);
        System.out.println("Дробь 2: " + r2);

        RationalFraction sum = r1.add(r2);
        System.out.println("Сумма дробей: " + sum);

        r1.add2(r2);
        System.out.println("Дробь 1 после сложения с дробью 2: " + r1);

        RationalFraction diff = r1.sub(r2);
        System.out.println("Разность дробей: " + diff);

        r1.sub2(r2);
        System.out.println("Дробь 1 после вычитания дроби 2: " + r1);

        RationalFraction product = r1.mult(r2);
        System.out.println("Произведение дробей: " + product);

        r1.mult2(r2);
        System.out.println("Дробь 1 после умножения на дробь 2: " + r1);

        RationalFraction quotient = r1.div(r2);
        System.out.println("Частное дробей: " + quotient);

        r1.div2(r2);
        System.out.println("Дробь 1 после деления на дробь 2: " + r1);

        System.out.println("Десятичное значение дроби 1: " + r1.value());
        System.out.println("Целая часть дроби 1: " + r1.numberPart());
        System.out.println("Дроби равны: " + r1.equals(r2));
    }
}
