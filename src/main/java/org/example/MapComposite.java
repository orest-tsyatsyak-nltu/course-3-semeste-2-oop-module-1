package org.example;

import java.util.ArrayList;
import java.util.List;

public class MapComposite extends BaseMapComponent {

    private List<MapComponent> components;

    public MapComposite(int x, int y, String name) {
        super(x, y, name);
        this.components = new ArrayList<>();
    }

    public void addComponent(MapComponent component) {
        components.add(component);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Сomposite component " + name + " at (" + (this.x + x) + "," + (this.y + y) + ")");
        for (MapComponent component : components) {
            component.draw(this.x + x, this.y + y);
        }
    }

    @Override
    public MapComponent findChild(String name) {
        if (this.name.equals(name)) {
            return this;
        }
        for (MapComponent component : components) {
            MapComponent found = component.findChild(name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
