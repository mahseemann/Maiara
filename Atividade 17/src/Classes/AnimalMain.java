package Classes;

import java.util.ArrayList;

public class AnimalMain {
	
	public static void main(String[] args) {
		Gato g1 = new Gato ();
		Gato g2 = new Gato ();
		Gato g3 = new Gato ();
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Cachorro c3 = new Cachorro();
		
		g1.setNome("Romeu");
		g1.setRaca("Indefinido");
		g1.setPatas(4);	
		g1.setCor("Laranja");
		g1.setComprimento((float)60);
		g1.setEcossistema("Urbano");
		
		g2.setNome("Mel");
		g2.setRaca("Siames");
		g2.setnPatas(4);	
		g2.setCor("Branco e cinza");
		g2.setComprimento((float)50);
		g2.setEcossistema("Urbano");
		
		g3.setNome("Bela");
		g3.setRaca("Persa");
		g3.setPatas(4);	
		g3.setCor("Preta");
		g3.setComprimento((float)50);
		g3.setEcossistema("Urbano");
		
		c1.setNome("Bartô");
		c1.setRaca("Yorkshire");
		c1.setPatas(4);	
		c1.setCor("Preto");
		c1.setComprimento((float)40);
		c1.setEcossistema("Urbano");
		
		c2.setNome("Nina");
		c2.setRaca("Poodle");
		c2.setPatas(4);	
		c2.setCor("Branco");
		c2.setComprimento((float)50);
		c2.setEcossistema("Urbano");
		
		c3.setNome("Bartô");
		c3.setRaca("Beagle");
		c3.setPatas(4);	
		c3.setCor("Marrom");
		c3.setComprimento((float)60);
		c3.setEcossistema("Urbano");
		
		ArrayList<Gato> listaGato = new ArrayList <> ();
		ArrayList<Cachorro> listaCachorro = new ArrayList <> ();
		
		listaGato.add(g1);
		listaGato.add(g2);
		listaGato.add(g3);
		
		listaCachorro.add(c1);
		listaCachorro.add(c2);
		listaCachorro.add(c3);
		
		for (Cachorro cachorro : listaCachorro) {
			System.out.println("Nome:" +cachorro.getNome());
			System.out.println("Raça:"+cachorro.getRaca());
			System.out.println("Cor:"+cachorro.getCor());
			System.out.println("Número de Patas:"+cachorro.getPatas());
			System.out.println("Comprimento:"+cachorro.getComprimento());
		    System.out.println("Ecossistema:"+cachorro.getEcossistema());
		}
		for (Cachorro gato : listaGato) {
			System.out.println("Nome:" +gato.getNome());
			System.out.println("Raça:"+gato.getRaca());
			System.out.println("Cor:"+gato.getCor());
			System.out.println("Número de Patas:"+gato.getPatas());
			System.out.println("Comprimento:"+gato.getComprimento());
		    System.out.println("Ecossistema:"+gato.getEcossistema());
		}
	}
	

	
}