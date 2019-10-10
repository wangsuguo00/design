package visitor.company;

import visitor.material.IronMaterial;
import visitor.material.PaperMaterial;


public interface Company {
    String create(PaperMaterial material);
    String create(IronMaterial material);
}
