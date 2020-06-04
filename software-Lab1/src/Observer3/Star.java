package Observer3;

import java.util.ArrayList;
import java.util.List;


public class Star {
    // 标识被观察者是否变化
    private boolean changed = false;

    private List<MovelListener> list = new ArrayList<>();

    public void addMovelListener(MovelListener o) {
        list.add(o);
    }

    public List<MovelListener> getList() {
        return list;
    }

    public void setList(List<MovelListener> list) {
        this.list = list;
    }

    public void notifyObserver() {
        if (!changed) {
            return;
        }
        setChanged(false);
        MovelEvent movelEvent = new MovelEvent(this);
        String string = "";
        for(int i=0;i<list.size();i++)
        {
        	string = string + list.get(i);
        }
        System.out.println(string);
        list.stream().forEach(o -> o.update(movelEvent));
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }


    public Star(String name) {
        super();
        this.name = name;
        Manager.getInstance().addStar(this);
    }

    private String name;

    private String lastMovel;

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