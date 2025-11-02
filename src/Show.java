import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private Director director;
    private int durationInMinutes;
    protected List<Actor> listOfActors;

    public Show(String title, Director director, int durationInMinutes) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    //Информацию о режиссере спектакля
    @Override
    public String toString() {
        return "Спектакль '" + title + "', Режиссер: " + director.toString() +
                " (Длительность: " + durationInMinutes + " мин)";
    }

    //Добавление нового актера в спектакль
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor.getFirstName() + " " + actor.getLastName() +
                    " уже участвует в спектакле '" + title + "'. Добавление отменено.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.getLastName() + " добавлен в спектакль '" + title + "'.");
        }
    }

    // Заменить одного актера в спектакле на другого
    public void replaceActor(Actor newActor, String oldActorLastName) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getLastName().equalsIgnoreCase(oldActorLastName)) {
                listOfActors.set(i, newActor); // Замена на том же месте
                System.out.println("Актер " + oldActorLastName + " заменен на " + newActor.toString() +
                        " в спектакле '" + title + "'.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актер с фамилией '" + oldActorLastName +
                    "' не найден в спектакле '" + title + "'. Замена не выполнена.");
        }
    }

    // Распечатать список всех актеров, участвующих в спектакле
    public void printActorsList() {
        System.out.println("\n--- Актеры спектакля '" + title + "' ---");
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле нет актеров.");
            return;
        }
        for (Actor actor : listOfActors) {
            // Используется переопределенный Actor.toString()
            System.out.println("- " + actor.toString());
        }
    }
}