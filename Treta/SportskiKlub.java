package Treta;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String ime;
	private String sport;
	private int clenovi;

	public SportskiKlub(String ime, String sport, int clenovi) {
		this.ime = ime;
		this.sport = sport;
		this.clenovi = clenovi;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getClenovi() {
		return clenovi;
	}

	public void setClenovi(int clenovi) {
		this.clenovi = clenovi;
	}

	public int compareTo(SportskiKlub obj) {
		SportskiKlub a = (SportskiKlub) obj;
		if (this.ime.equals(a.ime))
			return 0;
		else
			return this.ime.compareTo(a.ime);
	}
}
