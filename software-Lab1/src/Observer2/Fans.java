package Observer2;

public class Fans implements Observer {
    
    private String name;
    
    

    public Fans(String name) {
        super();
        this.name = name;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    public void subscribe(String starName) {
        Manager.getInstance().getStar(starName).addObserver(this);
    }

    @Override
    public void update(Star star,Object args) {
        System.out.println(name + "得到了" + star.getName() +"发布" + star.getLastMovel() + "的消息");
    }

    
}