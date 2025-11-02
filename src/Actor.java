public class Actor extends Person {
    private double height; // Рост в метрах

    public Actor(String firstName, String lastName, double height) {
        super(firstName, lastName);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Для печати информации об актере в списке
    @Override
    public String toString() {
        return super.toString() + " (" + height + " м)";
    }

    // Реализация equals для сравнения актеров
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        // Актеры считаются одинаковыми, если совпадают имя, фамилия и рост
        return Double.compare(actor.height, height) == 0 &&
                getFirstName().equals(actor.getFirstName()) &&
                getLastName().equals(actor.getLastName());
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        // Простая комбинация хэшей полей
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        long temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}