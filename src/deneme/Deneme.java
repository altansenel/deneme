package deneme;

public class Deneme {
	
	private String isim;
	private Integer sayi;
	private Boolean durum;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public Integer getSayi() {
		return sayi;
	}
	public void setSayi(Integer sayi) {
		this.sayi = sayi;
	}
	public Boolean getDurum() {
		return durum;
	}
	public void setDurum(Boolean durum) {
		this.durum = durum;
	}
	public String toString() {
		return " isim: " + isim + ", sayi: " + sayi + ", durum: " + durum;
	}
	
	


	
	

}
