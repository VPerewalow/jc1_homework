package part5.Task38;

public enum Season {
    WINTER("Зима", 90),
    SPRING("Весна", 92),
    SUMMER("Лето", 93),
    AUTUMN("Осень", 91);

    private final String description;
    private final int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public Season getNextSeason() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}
