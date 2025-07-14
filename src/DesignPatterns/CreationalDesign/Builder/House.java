package DesignPatterns.CreationalDesign.Builder;

public class House {
    private String structure;
    private String foundation;
    private String roof;
    private boolean isGarden;
    private boolean isParking;
    private boolean isSwimmingPool;

    private House(HouseBuilder houseBuilder) {
        this.structure = houseBuilder.structure;
        this.foundation = houseBuilder.foundation;
        this.roof = houseBuilder.roof;
        this.isGarden = houseBuilder.isGarden;
        this.isParking = houseBuilder.isParking;
        this.isSwimmingPool = houseBuilder.isSwimmingPool;
    }

    //Build class
    public static class HouseBuilder {
        //Mandatory parameters
        private final String structure;
        private final String foundation;
        private final String roof;
        //Optional parameters
        private boolean isGarden;
        private boolean isParking;
        private boolean isSwimmingPool;

        public HouseBuilder(String structure, String foundation, String roof) {
            this.structure = structure;
            this.foundation = foundation;
            this.roof = roof;
        }

        public HouseBuilder setGarden(boolean garden) {
            isGarden = garden;
            return this;
        }

        public HouseBuilder setParking(boolean parking) {
            isParking = parking;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean swimmingPool) {
            isSwimmingPool = swimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "structure='" + structure + '\'' +
                ", foundation='" + foundation + '\'' +
                ", roof='" + roof + '\'' +
                ", isGarden=" + isGarden +
                ", isParking=" + isParking +
                ", isSwimmingPool=" + isSwimmingPool +
                '}';
    }
}
