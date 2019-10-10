package visitor.material;

import visitor.company.Company;

public class PaperMaterial implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
