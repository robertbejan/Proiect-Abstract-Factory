package Abstract_Factory_Pattern;

public class Material_aur implements Fierarie<Aur>{

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
