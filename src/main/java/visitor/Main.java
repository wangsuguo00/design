package visitor;

import visitor.company.ArticleCompany;
import visitor.company.Company;
import visitor.company.NormalCompany;
import visitor.material.IronMaterial;
import visitor.material.Material;
import visitor.material.PaperMaterial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Material> materialList = new ArrayList<>();
        materialList.add(new PaperMaterial());
        materialList.add(new IronMaterial());

        Company company = new ArticleCompany();
        materialList.forEach(v-> System.out.println("艺术公司生产："+v.accept(company)));

        Company normalCompany = new NormalCompany();
        materialList.forEach(v-> System.out.println("普通公司生产："+v.accept(normalCompany)));
    }
}
