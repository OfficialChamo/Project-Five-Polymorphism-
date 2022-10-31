public class Games {
    public void game(){
        System.out.println("Games");
    }
}
class Cricket extends Games{
    @Override
    public void game() {
        System.out.println("Cricket");
    }
}
class Football extends Cricket{
    @Override
    public void game() {
        System.out.println("Football");
    }
}
class Rugby extends Football{
    @Override
    public void game() {
        System.out.println("Rugby");
    }
    public static void main(String[] args) {
        Games a1,a2,a3;
        a1 = new Cricket();
        a2 = new Football();
        a3 = new Rugby();
        a1.game();
        a2.game();
        a3.game();
    }
}