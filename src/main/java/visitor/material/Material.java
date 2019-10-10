package visitor.material;

import visitor.company.Company;

public interface Material {
    String accept(Company company);
}
