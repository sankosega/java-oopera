public class Theatre {

    public static void main(String[] args) {

        // Актеры
        Actor actor1 = new Actor("Иван", "Петров", 1.85);
        Actor actor2 = new Actor("Мария", "Сидорова", 1.70);
        Actor actor3 = new Actor("Алексей", "Козлов", 1.78);

        // Режиссеры
        Director dir1 = new Director("Антон", "Чехов");

        // Автор музыки и Хореограф
        String musicAuthor = "Петр Чайковский";
        String choreographer = "Мариус Петипа";

        // Спектакли
        Show drama = new Show("Вишневый сад", dir1, 150);
        Ballet swanLake = new Ballet("Лебединое озеро", dir1, 180, musicAuthor,
                "Принце Зигфриде, который, празднуя совершеннолетие, встречает заколдованную волшебником " +
                        "Ротбартом принцессу Одетту, превращенную в лебедя",
                choreographer);
        Opera carmen = new Opera("Кармен", dir1, 165, "Жорж Бизе",
                "История страстной и свободолюбивой цыганки Кармен, которая влюбляется в солдата Хозе, но " +
                        "затем бросает его ради тореадора Эскамильо",
                50);

        System.out.println("Информация о постановках и режиссер0ах (используется toString)");
        System.out.println(drama.toString());
        System.out.println(swanLake.toString());
        System.out.println(carmen.toString());

        // 3. Распределить актеров по спектаклям
        System.out.println("Добавление актеров");

        // В Вишневый сад (Проверка на дубликат)
        drama.addActor(actor1);
        drama.addActor(actor2);

        // В Лебединое озеро
        swanLake.addActor(actor2);
        swanLake.addActor(actor3);

        // В Кармен
        carmen.addActor(actor1);
        carmen.addActor(actor3);

        // 4. Вывод списка актёров
        drama.printActorsList();
        swanLake.printActorsList();
        carmen.printActorsList();

        // 5. Замена актёра
        System.out.println("Замена актера");
        Actor newActor = new Actor("Ольга", "Смирнова", 1.75);
        // Заменяем Петрова в "Кармен" на Смирнову
        carmen.replaceActor(newActor, "Петров");
        carmen.printActorsList();

        // 6. Замена на несущесвующего актёра
        drama.replaceActor(newActor, "Иванов");

        // 7. Вывод текста либретто
        System.out.println("Печать либретто");
        swanLake.printLibretto();
        carmen.printLibretto();

    }
}