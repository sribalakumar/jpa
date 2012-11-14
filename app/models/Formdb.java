package models;
import javax.persistence.Entity;
import play.db.jpa.Model;
import play.db.jpa.Blob;
@Entity
public class Formdb extends Model {
	public String fname;
	public String sname;
	public Blob photo;
}