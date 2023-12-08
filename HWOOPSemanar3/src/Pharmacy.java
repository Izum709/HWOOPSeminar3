import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

//это лекарство
public class Pharmacy implements Iterable<PharmacyComponent>,Comparable<Pharmacy>{
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pharmacy(int id) {
        this.id = id;
    }

    public List<PharmacyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmacyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Pharmacy(List<PharmacyComponent> components, int index) {
        this.components = components;
        this.index = index;
    }

    public Pharmacy() {
    }

    public Pharmacy addPharmacyComponents(PharmacyComponent component){
        components.add(component);
        return this;
    }


    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new IteratorComponent(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if(this.index>o.index){
            return 1;
        }
        else if (this.index<o.index){
            return -1;
        }
        return 0;
    }
}
