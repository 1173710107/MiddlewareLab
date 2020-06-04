package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Star {

    private String name;

    private String lastMovel;

    // 标识被观察者是否变化
    private boolean changed = false;

    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer o) {
        list.add(o);
    }

    public List<Observer> getList() {
        return list;
    }

    public void notifyObserver() {
        if (!changed) {
            return;
        }
        setChanged(false);
        list.stream().forEach(o -> o.update(this, null));
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public void setList(List<Observer> list) {
        this.list = list;
    }

    public Star(String name) {
        super();
        this.name = name;
        Manager.getInstance().addStar(this);
    }

    
    public void movelUp(String movel) {
        System.out.println(name + "发布了" + movel);
        this.lastMovel = movel;
        setChanged(true);
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMovel() {
        return lastMovel;
    }

    public void setLastMovel(String lastMovel) {
        this.lastMovel = lastMovel;
    }

}