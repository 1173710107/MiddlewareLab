package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> list = new ArrayList<>();
    public void addObserver(Observer o) {
        list.add(o);
    }
    private String status;
    
    public List<Observer> getList() {
        return list;
    }

    public String getStatus() {
        return status;
    }

    public void movelUp (String status) {
        System.out.println(status);
        this.status = status;
        list.stream().forEach(o -> o.update(this));
    }
    
}