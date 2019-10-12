package visitorCopy.company;

import visitorCopy.material.IronMaterial;
import visitorCopy.material.PaperMaterial;

public interface Company {
    String create(PaperMaterial material);
    String create(IronMaterial ironMaterial);
}
