package phone;

import java.util.List;
import java.util.ArrayList;

public class SDCard {
    public int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(PhoneFile file){
        files.add(file);
    }
}
