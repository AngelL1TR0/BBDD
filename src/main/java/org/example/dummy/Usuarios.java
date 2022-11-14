package org.example.dummy;

public enum Usuarios {
    USU_APP("myApp");

    private final String name;

    Usuarios(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
