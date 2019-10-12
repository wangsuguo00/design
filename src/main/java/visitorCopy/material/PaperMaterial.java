package visitorCopy.material;

import visitorCopy.company.Company;

public class PaperMaterial implements Material {
    @Override
    public String accept(Company c) {
        return c.create(this);
    }
}
