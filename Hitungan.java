
public class Hitungan {
	String txtNama;
	String txtNim;
	String txtJurusan;
	String txtNilaitugas;
	String txtNilaiuts;
	String txtNilaiuas;
	String outnama;
	String outnim;
	String outrerata;
	String outgrade;
	String outketerangan;
	
	
	
	@Override
	public String toString() {
		return "Hitungan [txtNama=" + txtNama + ", txtNim=" + txtNim + ", txtJurusan=" + txtJurusan + ", txtNilaitugas="
				+ txtNilaitugas + ", txtNilaiuts=" + txtNilaiuts + ", txtNilaiuas=" + txtNilaiuas + ", outnama="
				+ outnama + ", outnim=" + outnim + ", outrerata=" + outrerata + ", outgrade=" + outgrade
				+ ", outketerangan=" + outketerangan + "]";
	}
	public Hitungan(String txtNama, String txtNim, String txtJurusan, String txtNilaitugas, String txtNilaiuts,
			String txtNilaiuas, String outnama, String outnim, String outrerata, String outgrade,
			String outketerangan) {
		super();
		this.txtNama = txtNama;
		this.txtNim = txtNim;
		this.txtJurusan = txtJurusan;
		this.txtNilaitugas = txtNilaitugas;
		this.txtNilaiuts = txtNilaiuts;
		this.txtNilaiuas = txtNilaiuas;
		this.outnama = outnama;
		this.outnim = outnim;
		this.outrerata = outrerata;
		this.outgrade = outgrade;
		this.outketerangan = outketerangan;
	}
	public String getTxtNama() {
		return txtNama;
	}
	public void setTxtNama(String txtNama) {
		this.txtNama = txtNama;
	}
	public String getTxtNim() {
		return txtNim;
	}
	public void setTxtNim(String txtNim) {
		this.txtNim = txtNim;
	}
	public String getTxtJurusan() {
		return txtJurusan;
	}
	public void setTxtJurusan(String txtJurusan) {
		this.txtJurusan = txtJurusan;
	}
	public String getTxtNilaitugas() {
		return txtNilaitugas;
	}
	public void setTxtNilaitugas(String txtNilaitugas) {
		this.txtNilaitugas = txtNilaitugas;
	}
	public String getTxtNilaiuts() {
		return txtNilaiuts;
	}
	public void setTxtNilaiuts(String txtNilaiuts) {
		this.txtNilaiuts = txtNilaiuts;
	}
	public String getTxtNilaiuas() {
		return txtNilaiuas;
	}
	public void setTxtNilaiuas(String txtNilaiuas) {
		this.txtNilaiuas = txtNilaiuas;
	}
	public String getOutnama() {
		return outnama;
	}
	public void setOutnama(String outnama) {
		this.outnama = outnama;
	}
	public String getOutnim() {
		return outnim;
	}
	public void setOutnim(String outnim) {
		this.outnim = outnim;
	}
	public String getOutrerata() {
		return outrerata;
	}
	public void setOutrerata(String outrerata) {
		this.outrerata = outrerata;
	}
	public String getOutgrade() {
		return outgrade;
	}
	public void setOutgrade(String outgrade) {
		this.outgrade = outgrade;
	}
	public String getOutketerangan() {
		return outketerangan;
	}
	public void setOutketerangan(String outketerangan) {
		this.outketerangan = outketerangan;
	}
	
	
	

}
