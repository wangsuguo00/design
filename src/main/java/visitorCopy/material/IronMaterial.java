package visitorCopy.material;


import visitorCopy.company.Company;

public class IronMaterial implements Material {
    @Override
    public String accept(Company c) {
        return c.create(this);
    }
}
