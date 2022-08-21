class coffeMachine{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private coffeMachine my = null;

    private coffeMachine()
    {
        coffeQty = 1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    public void fillWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffe()
    {
        return coffeQty;
    }

    static coffeMachine getInstance()
    {
        if(my == null)
            my = new coffeMachine();
        return my;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        coffeMachine m1 = coffeMachine.getInstance();
        coffeMachine m2 = coffeMachine.getInstance();
        coffeMachine m3 = coffeMachine.getInstance();

        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same ");
    }
    
}
