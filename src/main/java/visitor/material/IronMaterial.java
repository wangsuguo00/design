package visitor.material;

import visitor.company.Company;

import java.util.concurrent.locks.ReentrantLock;

public class IronMaterial implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
