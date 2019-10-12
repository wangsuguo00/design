package visitorCopy.company;

import visitorCopy.material.IronMaterial;
import visitorCopy.material.Material;
import visitorCopy.material.PaperMaterial;

public class NormalCompany implements Company {

    @Override
    public String create(PaperMaterial material) {
        return null;
    }

    @Override
    public String create(IronMaterial ironMaterial) {
        return null;
    }
}
