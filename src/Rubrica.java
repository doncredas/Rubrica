import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author doncredas
 *
 */

public class Rubrica {

	private String titolo;
	private List<Voce> rubrica = null;
	
  /**
   * crea una nuova rubrica con il nome dato
   */
  public Rubrica(String nome) {
	  this.titolo = nome;
	  this.rubrica = new ArrayList<Voce>();
  }

  /**
   * inserisce una nuova voce nella rubrica 
   */  
  public void aggiungi(String nome, String cognome, String telefono){
	  Voce voce = new Voce(nome, cognome, telefono);
	  rubrica.add(voce);
  }

  /**
   * restituisce la prima voce inserita nella rubrica
   */  
  public String primo() {
	  return this.rubrica.get(0).toString();
  }

  /**
   * restituisce il nome della rubrica
   */
  public String getTitolo() {
    return this.titolo;
  }

  /**
   * Restituisce la voce i-esima inserita nella rubrica
   */
  public String voce(int i) {
      return this.rubrica.get(i-1).toString();
  }

  /**
   * Restituisce una stringa con l'elenco delle voci
   * della rubrica separate da ", ".
   * L'elenco inizia con "(" e termina con ")"
   */
  public String elenco() {
	  StringBuilder sb = new StringBuilder("(");
	  Iterator<Voce> it = this.rubrica.listIterator();
	  while(it.hasNext()){
		  sb.append(it.next());
		  if(!it.hasNext()){
			  sb.append(")"); break;
		  }
		  sb.append(", ");
	  }
  	return sb.toString();
  }

  /**
   * Restituisce la stringa con la prima voce che
   * contiene il parametro daCercare come nome,
   * cognome oppure telefono.
   */
  public String ricerca(String daCercare) {
	  Iterator<Voce> it = this.rubrica.listIterator();
	  Voce v;
	  while(it.hasNext()){
		  v = it.next();
		  if(v.getCognome().equals(daCercare) 
				  || v.getNome().equals(daCercare)
				  || v.getTelefono().equals(daCercare)){
			  return v.toString();
		  }
	  }
  	return null;
  }

}
