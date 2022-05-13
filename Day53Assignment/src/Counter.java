class Counter {
    private int counter;

    public int value() {
        return counter;
    }

    public void Counter() {
        this.counter = 0;
    }

  /*  public void Counter (int startValue) {
        this.counter = startValue;
    }*/

    public void increase() {
        counter++;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            counter = counter + increaseBy;

        }
    }

    public void decrease() {
        counter--;
    }

    public void decrease(int decreasBy) {
        if (decreasBy >= 0) {
            counter = counter - decreasBy;
        }
    }
}
