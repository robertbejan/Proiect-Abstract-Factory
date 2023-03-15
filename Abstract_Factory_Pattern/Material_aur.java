package Abstract_Factory_Pattern;

public class Material_aur implements Fierarie<Aur>{
	/**
	 * 
	 * @param echipament parametru pentru alegerea item-ului
	 * @return returneaza un obiect de tipul item-ului ales de materialul aur
	 */
	public Aur create(String echipament) {
		if("sabie".equalsIgnoreCase(echipament))
			return new Sabie_aur();
		else if("tarnacop".equalsIgnoreCase(echipament))
			return new Tarnacop_aur();
		else if("topor".equalsIgnoreCase(echipament))
			return new Topor_aur();
		return null;
	}
}
