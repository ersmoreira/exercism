class Darts {

    private double distanceSquared;

    Darts(double x, double y) {
        this.distanceSquared = (x * x) + (y * y);
    }

    int score() {
        if (withinCircle(1)) {
            return 10;
        } else if (withinCircle(5)) {
            return 5;
        } else if (withinCircle(10)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean withinCircle(int radius) {
        return distanceSquared <= (radius * radius);
    }
}
