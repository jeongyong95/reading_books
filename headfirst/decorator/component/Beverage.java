package headfirst.decorator.component;

public abstract class Beverage {
    private String description = "음료";

    public abstract int cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
