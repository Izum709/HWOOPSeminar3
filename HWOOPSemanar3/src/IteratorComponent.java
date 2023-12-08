import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorComponent  implements  Iterator<PharmacyComponent>{
    public List<PharmacyComponent> components;
    public int index;
    private Pharmacy pharmacy;
    public IteratorComponent(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        this.components = pharmacy.getComponents();
        this.index = pharmacy.getIndex();
    }

    @Override
    public boolean hasNext() {
        return index<components.size();
    }

    @Override
    public PharmacyComponent next() {
        return components.get(index++);
    }
}
