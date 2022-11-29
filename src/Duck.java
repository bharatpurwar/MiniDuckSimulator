public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }
    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("All duck swim, or float");
    }
}
