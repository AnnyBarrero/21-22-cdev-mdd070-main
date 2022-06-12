package composite;

import java.util.ArrayList;
import java.util.List;

public class UniteOperationnelComposite implements UniteOperationnel {

    private List<UniteOperationnel> list = new ArrayList<>();

    //add, remove, getChildren

    @Override
    public void defendre() {
        for (UniteOperationnel uniteOperationnel : list) {
            uniteOperationnel.defendre();
        }
    }

    public void add(UniteOperationnel uniteOperationnel) {
        list.add(uniteOperationnel);
    }
}
