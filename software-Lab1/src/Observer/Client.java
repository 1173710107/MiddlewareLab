package Observer;

public class Client {

    public static void main(String[] args) {
        Observable ob = new Observable();
        ob.addObserver(new ObserverImpl("小花"));
        ob.addObserver(new ObserverImpl("小名"));
        ob.movelUp("天下无贼");
    }
}