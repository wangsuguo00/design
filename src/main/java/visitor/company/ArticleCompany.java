package visitor.company;

import visitor.material.IronMaterial;
import visitor.material.PaperMaterial;

public class ArticleCompany implements Company {
    @Override
    public String create(PaperMaterial material) {

        return "风景画";
    }

    @Override
    public String create(IronMaterial material) {
        return "铜像";
    }
}
