
/**
 * @author doncredas
 *
 */
public class Voce {
	
	private String nome;
	private String cognome;
	private String telefono;
	
	public Voce(String nome, String cognome, String telefono){
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	/**
	 * restituisce il nome della voce
	*/ 
	public String getNome() {
		return nome;
	}
	
	/**
	 * modifica il nome corrente con il nome passato in parametro
	 * @param string nome
	*/ 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * restituisce il cognome della voce
	*/ 
	public String getCognome() {
		return cognome;
	}
	
	/**
	 * modifica il cognome corrente con il cognome passato in parametro
	 * @param string nome
	*/ 
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	/**
	 * restituisce il numero di telefono della voce
	*/ 
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * modifica il numero di telefono corrente
	 *  con il numero di telefono passato in parametro
	 * @param string nome
	*/ 
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
