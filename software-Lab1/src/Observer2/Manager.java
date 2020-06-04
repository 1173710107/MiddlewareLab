package Observer2;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Star> observableMap = new HashMap<>();
    
    private Manager() {
        
    }
    public void addStar(Star star) {
        observableMap.put(star.getName(), star);
    }
    public Star getStar(String name) {
        return observableMap.get(name);
    }
    public static Manager getInstance() {
        return SingleManager.manager;
    }
    private static class SingleManager{
        private static Manager manager = new Manager();
        
    }
    
    
}