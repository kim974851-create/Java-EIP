package Overriding;

class Counter {
    int count = 0;
    void inc(){
        count++;
    }
    void print(){
        System.out.println("count:" + count);
    }
}

class StepCounter extends Counter{
    int step = 2;
    void inc(){
        super.inc();
        count = count + step;
    }

    public static void main(String[] args) {
        Counter c = new StepCounter();
        c.inc();
        c.inc();
        c.print();
    }
}

