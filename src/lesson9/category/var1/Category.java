package lesson9.category.var1;

public class Category {
   private String type ;
   private String description ;

    public Category(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
