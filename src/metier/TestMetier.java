package metier;

import java.util.List;

public class TestMetier {

	public static void main(String[] args) {
		ICatalogueMetier metier = new CatalogueMetierImpl();
		
		metier.addProduit(new Produit("REF05", "AA", 870, 3));
		metier.addProduit(new Produit("REF06", "BB", 435, 40));
		metier.addProduit(new Produit("REF07", "CC", 752, 12));
		
//		System.out.println("------------------");
//		List<Produit> prods = metier.listProduits();
//		for (Produit p : prods) {
//			System.out.println(p.getDesignation());
//		}
//		System.out.println("------------------");
//		List<Produit> prods2 = metier.produitsParMC("HP");
//		for (Produit p : prods2) {
//			System.out.println(p.getDesignation());
//		}
//		System.out.println("------------------");
//		Produit p = metier.getProduit("REF05");
//		System.out.println(p.getDesignation());
//		System.out.println("------------------");
//		try {
//			Produit prod = metier.getProduit("REF09");
//			System.out.println(prod.getDesignation());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("------------------");
//		Produit p1 = metier.getProduit("PR02");
//		p1.setPrix(900);
//		metier.updateProduit(p1);
//		Produit p2 = metier.getProduit("PR02");
//		System.out.println(p2.getPrix());
		System.out.println("------------------");
//		try {
//			metier.deleteProduit("REF07");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
