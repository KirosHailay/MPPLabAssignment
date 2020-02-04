package Exercise.Lesson8.Lesson10;

public class Pair<T, S> {
    T x;
    S y;

    public Pair(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public S getY() {
        return y;
    }

    public void setY(S y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y + "type" + getClass().getSimpleName() +
                '}';
    }
}
