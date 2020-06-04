package Observer3;


public class Fans implements MovelListener {
    
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
        Manager.getInstance().getStar(starName).addMovelListener(this);
    }

    @Override
    public void update(MovelEvent movelEvent) {
        Star star = movelEvent.getStar();
        System.out.println(name + "得到了" + star.getName() +"发布" + star.getLastMovel() + "的消息");
        
    }

    
}