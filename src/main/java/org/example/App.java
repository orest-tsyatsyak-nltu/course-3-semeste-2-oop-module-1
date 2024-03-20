package org.example;

public class App {
    public static void main(String[] args) {
        MapComposite cityMap = new MapComposite(0, 0, "City Map");
        MapComposite buildings = new MapComposite(10, 20, "Buildings");
        BaseMapComponent hospital = new BaseMapComponent(5, 5, "Hospital") {
            @Override
            public void draw(int x, int y) {
                System.out.println(this.name + " at (" + (this.x + x) + "," + (this.y + y) + ")");
            }
        };

        BaseMapComponent school = new BaseMapComponent(15, 25, "School") {
            @Override
            public void draw(int x, int y) {
                System.out.println(this.name + " at (" + (this.x + x) + "," + (this.y + y) + ")");
            }
        };

        buildings.addComponent(hospital);
        buildings.addComponent(school);
        cityMap.addComponent(buildings);

        cityMap.draw(0, 0);

        MapComponent foundComponent = cityMap.findChild("Hospital");
        if (foundComponent != null) {
            System.out.println("Found component: " + foundComponent);
        } else {
            System.out.println("Component not found.");
        }
    }
}
