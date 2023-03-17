package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl pdao = new ProduitDaoImpl();
		Produit prod = pdao.save(new Produit("Iphone",2300));
		System.out.println(prod);
		
		List<Produit> prods = pdao.produitsParMC("hp");
		for (Produit p : prods)
			System.out.println(p);

	}
}