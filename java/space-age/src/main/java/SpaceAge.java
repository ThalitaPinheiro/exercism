class SpaceAge {

    private static final double EARTH = 31557600.0;
    private static final double MERCURY = EARTH * 0.2408467;
    private static final double VENUS = EARTH * 0.61519726;
    private static final double MARS = EARTH * 1.8808158;
    private static final double JUPITER = EARTH * 11.862615;
    private static final double SATURN = EARTH * 29.447498;
    private static final double URANUS = EARTH * 84.016846;
    private static final double NEPTUNE = EARTH * 164.79132;

    private final double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds/EARTH;
    }

    double onMercury() {
        return seconds/MERCURY;
    }

    double onVenus() {
        return seconds/VENUS;
    }

    double onMars() {
        return seconds/MARS;
    }

    double onJupiter() {
        return seconds/JUPITER;
    }

    double onSaturn() {
        return seconds/SATURN;
    }

    double onUranus() {
        return seconds/URANUS;
    }

    double onNeptune() {
        return seconds/NEPTUNE;
    }
}
