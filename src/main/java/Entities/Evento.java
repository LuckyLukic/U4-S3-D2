package Entities;


	
	import java.sql.Date;
import java.util.UUID;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity

	@Table(name = "Evento")
	public class Evento {
		@Id 
		@GeneratedValue 
		private UUID id; 
		
		private String titolo;
		private Date dataEvento;
		private String descrizione;
		private Enum<TipoEvento> tipoevento;
		- numeroMassimoPartecipanti


}
