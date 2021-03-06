package lesson07;

public class House {
    private final boolean hasOngKhoi;
    private final String color;

    private House(Builder builder) {
        this.hasOngKhoi = builder.hasOngKhoi;
        this.color = builder.color;

    }

    public void buildHouse() {
        System.out.println("Build the house with ong khoi: " + this.hasOngKhoi);

        if (this.color == null) {
            System.out.println("Build the house with color: RED");
        } else {
            System.out.println("Build the house with color: " + this.color);
        }
    }


    // Inner class
    public static class Builder {
        private boolean hasOngKhoi;
        private String color;

        Builder() {
        }

        public Builder hasOngKhoi(boolean hasOngKhoi) {
            this.hasOngKhoi = hasOngKhoi;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
