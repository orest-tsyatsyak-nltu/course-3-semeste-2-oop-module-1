package org.example;

public interface MapComponent {
    void draw(int x, int y);

    MapComponent findChild(String name);
}
