public class Food {
    private int food;

    public Food() {
        this.food = (int) (Math.random() * 1000);
    }

    public int getFood() {
        return this.food;
    }

    public void decreaseFood(int food) {
        if (this.food < food) {
            increaseFood();
        } else {
            this.food -= food;
        }
    }

    public void increaseFood() {
        if (food > 0) {
            this.food += 400;
        }
    }
}
