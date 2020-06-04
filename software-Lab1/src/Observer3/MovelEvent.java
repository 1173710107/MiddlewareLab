package Observer3;

import java.util.EventObject;

public class MovelEvent extends EventObject {

    private static final long serialVersionUID = -1231609728871248531L;

    public MovelEvent(Star star) {
        super(star);
    }

    public Star getStar() {
        return (Star) super.getSource();
    }
}