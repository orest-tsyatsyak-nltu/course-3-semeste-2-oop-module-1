package org.example;

public abstract class BaseMapComponent implements MapComponent {

    protected int x;
    protected int y;
    protected String name;
    protected MapComponent parent;

    protected BaseMapComponent(int x, int y, String name) {
        this(x, y, name, null);
    }

    protected BaseMapComponent(int x, int y, String name, MapComponent parent) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.parent = parent;
    }

    @Override
    public abstract void draw(int x, int y);
    //В джаві не обов'язково вказувати цей метод абстрактним
    // оскільки сам клас вказаний як абстрактний і той що імплементує MapComponent

    @Override
    public MapComponent findChild(String name) {
        if (this.name.equals(name)) {
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return "BaseMapComponent{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
