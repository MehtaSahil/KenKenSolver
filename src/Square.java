
import java.util.Set;
import java.util.HashSet;

class Square {

    // Set of legal options remaining for this square
    private Set<Integer> legalOptions;
    private int value = 0;

    public Square() {
        legalOptions = new HashSet<Integer>();
    }

    public Set<Integer> getLegalOptions() {
        return legalOptions;
    }

    public void addLegalOption(int optionToAdd) {
        legalOptions.add(optionToAdd);
    }

    public void removeLegalOption(int optionToRemove) {
        legalOptions.remove(optionToRemove);
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public void getValue() {
        return value;
    }

}
