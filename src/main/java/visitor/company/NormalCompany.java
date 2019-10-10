package visitor.company;

import visitor.material.IronMaterial;
import visitor.material.PaperMaterial;

public class NormalCompany implements Company {
    @Override
    public String create(PaperMaterial material) {
        return "纸张";
    }

    @Override
    public String create(IronMaterial material) {
        return "铁块";
    }
}
