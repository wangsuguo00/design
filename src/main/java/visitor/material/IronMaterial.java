package visitor.material;

import visitor.company.Company;

public class IronMaterial implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
