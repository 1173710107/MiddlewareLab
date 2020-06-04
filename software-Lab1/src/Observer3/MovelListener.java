package Observer3;

import java.util.EventListener;

public interface MovelListener extends EventListener {
    
    void update (MovelEvent movelEvent);

}