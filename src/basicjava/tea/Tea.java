package basicjava.tea;

import java.util.Objects;

public class Tea {
    private int id;
    private String manufacturer;
    private String type;
    private String variety;

    public Tea(String manufacturer, String type, String variety) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.variety = variety;
    }

    public Tea(int id, String manufacturer, String type, String variety) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.type = type;
        this.variety = variety;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getVariety() {
        return variety;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tea tea)) return false;
        return Objects.equals(manufacturer, tea.manufacturer) && Objects.equals(type, tea.type) && Objects.equals(variety, tea.variety);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, type, variety);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}
