
/**
 * @author doncredas
 *
 */
public class Voce {
	
	private String nome;
	private String cognome;
	private String numeroTelefono;
	
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
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	/**
	 * modifica il numero di telefono corrente
	 *  con il numero di telefono passato in parametro
	 * @param string nome
	*/ 
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	

}
