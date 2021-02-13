/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.util.Date;

/**
 *
 * @author flashomer
 */

// başvuru tablosunun modelleme örneğinde kullanılan class
public class Basvuru {

    private short BasvuruNo;
    private Date BasvuruTarihi;
    private Date BasvuruCevapSonTarihi;
    private int BasvuranTipiNo;
    private int BasvuruTipiNo;
    private int BasvuruDurumuNo;
    private int TurkVatandasimi;
    private long TCKimlikNo;
    private String Adi;
    private String Soyadi;
    private int TuzelKisimi;
    private String TuzelKisiUnvani;
    private String Adres;
    private String Eposta;
    private String Telefonu;
    private int TelefonTipiNo;
    private String Fax;
    private int CevaplamaTipiNo;
    private String BasvuruCevabiAciklama;
    private int RedSebebiNo;
    private int AdresTipiNo;
    
    private String BasvuruAciklamasi;
    private int KurumNo;

    
   /* Basvuru(String Adi, String Soyadi) {
        this.Adi = Adi;
        this.Soyadi = Soyadi;
    }*/
    
    Basvuru(String Adi, String Soyadi, 
            /*Date BasvuruTarihi,int BasvuranTipiNo,*/ 
            int BasvuruTipiNo, int BasvuruDurumuNo,
            int TurkVatandasimi, long TCKimlikNo, int TuzelKisimi, String TuzelKisiUnvani,
            String Adres, String Eposta, String Telefonu, int TelefonTipiNo, String Fax,
            int CevaplamaTipiNo,
            /*String BasvuruCevabiAciklama,int RedSebebiNo, */
            int AdresTipiNo, String BasvuruAciklamasi, int KurumNo) {

        //this.BasvuruNo = BasvuruNo;
        this.Adi = Adi;
        this.Soyadi = Soyadi;
        //this.BasvuruTarihi = BasvuruTarihi;
        //this.BasvuranTipiNo = BasvuranTipiNo;
        this.BasvuruTipiNo = BasvuruTipiNo;
        this.BasvuruDurumuNo = BasvuruDurumuNo;
        this.TurkVatandasimi = TurkVatandasimi;
        this.TCKimlikNo = TCKimlikNo;
        this.TuzelKisimi = TuzelKisimi;
        this.TuzelKisiUnvani = TuzelKisiUnvani;
        this.Adres = Adres;
        this.Eposta = Eposta;
        this.Telefonu = Telefonu;
        this.TelefonTipiNo = TelefonTipiNo;
        this.Fax = Fax;
        this.CevaplamaTipiNo = CevaplamaTipiNo;
        //this.BasvuruCevabiAciklama = BasvuruCevabiAciklama;
        //this.RedSebebiNo = RedSebebiNo;
        this.AdresTipiNo = AdresTipiNo;
    }

    public int getAdresTipiNo() {
        return AdresTipiNo;
    }


    public int getKurumNo() {
        return KurumNo;
    }


    public String getBasvuruAciklamasi() {
        return BasvuruAciklamasi;
    }


    public short getBasvuruNo() {
        return BasvuruNo;
    }

    public void setBasvuruNo(short BasvuruNo) {
        this.BasvuruNo = BasvuruNo;
    }

    public Date getBasvuruTarihi() {
        return BasvuruTarihi;
    }

    public void setBasvuruTarihi(Date BasvuruTarihi) {
        this.BasvuruTarihi = BasvuruTarihi;
    }

    public Date getBasvuruCevapSonTarihi() {
        return BasvuruCevapSonTarihi;
    }

    public void setBasvuruCevapSonTarihi(Date BasvuruCevapSonTarihi) {
        this.BasvuruCevapSonTarihi = BasvuruCevapSonTarihi;
    }

    public int getBasvuranTipiNo() {
        return BasvuranTipiNo;
    }

    public void setBasvuranTipiNo(int BasvuranTipiNo) {
        this.BasvuranTipiNo = BasvuranTipiNo;
    }

    public int getBasvuruTipiNo() {
        return BasvuruTipiNo;
    }

    public void setBasvuruTipiNo(int BasvuruTipiNo) {
        this.BasvuruTipiNo = BasvuruTipiNo;
    }

    public int getBasvuruDurumuNo() {
        return BasvuruDurumuNo;
    }

    public void setBasvuruDurumuNo(int BasvuruDurumuNo) {
        this.BasvuruDurumuNo = BasvuruDurumuNo;
    }

    public int getTurkVatandasimi() {
        return TurkVatandasimi;
    }

    public void setTurkVatandasimi(int TurkVatandasimi) {
        this.TurkVatandasimi = TurkVatandasimi;
    }

    public long getTCKimlikNo() {
        return TCKimlikNo;
    }

    public void setTCKimlikNo(int TCKimlikNo) {
        this.TCKimlikNo = TCKimlikNo;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String Soyadi) {
        this.Soyadi = Soyadi;
    }

    public int getTuzelKisimi() {
        return TuzelKisimi;
    }

    public void setTuzelKisimi(int TuzelKisimi) {
        this.TuzelKisimi = TuzelKisimi;
    }

    public String getTuzelKisiUnvani() {
        return TuzelKisiUnvani;
    }

    public void setTuzelKisiUnvani(String TuzelKisiUnvani) {
        this.TuzelKisiUnvani = TuzelKisiUnvani;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public String getEposta() {
        return Eposta;
    }

    public void setEposta(String Eposta) {
        this.Eposta = Eposta;
    }

    public String getTelefonu() {
        return Telefonu;
    }

    public void setTelefonu(String Telefonu) {
        this.Telefonu = Telefonu;
    }

    public int getTelefonTipiNo() {
        return TelefonTipiNo;
    }

    public void setTelefonTipiNo(int TelefonTipiNo) {
        this.TelefonTipiNo = TelefonTipiNo;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public int getCevaplamaTipiNo() {
        return CevaplamaTipiNo;
    }

    public void setCevaplamaTipiNo(int CevaplamaTipiNo) {
        this.CevaplamaTipiNo = CevaplamaTipiNo;
    }

    public String getBasvuruCevabiAciklama() {
        return BasvuruCevabiAciklama;
    }

    public void setBasvuruCevabiAciklama(String BasvuruCevabiAciklama) {
        this.BasvuruCevabiAciklama = BasvuruCevabiAciklama;
    }

    public int getRedSebebiNo() {
        return RedSebebiNo;
    }

    public void setRedSebebiNo(int RedSebebiNo) {
        this.RedSebebiNo = RedSebebiNo;
    }


    public void setAdresTipiNo(int AdresTipiNo) {
        this.AdresTipiNo = AdresTipiNo;
    }

   	public Object getByName(String attributeName) {
		switch (attributeName) {
                case "BasvuruTarihi" : return "";
                case "BasvuruCevapSonTarihi" : return "";
                    
                case "BasvuranTipiNo" : return BasvuranTipiNo;
                case "BasvuruTipiNo" : return BasvuruTipiNo;
                case "BasvuruDurumuNo" : return BasvuruDurumuNo;
                case "TurkVatandasimi" : return TurkVatandasimi;
                case "TCKimlikNo" : return TCKimlikNo;
                case "TuzelKisimi" : return TuzelKisimi;
                case "TuzelKisiUnvani" : return TuzelKisiUnvani;
                case "Adres" : return Adres;
                case "Eposta" : return Eposta;
                case "Telefonu" : return Telefonu;
                case "TelefonTipiNo" : return TelefonTipiNo;
                case "Fax" : return Fax;
                case "AdresTipiNo" : return AdresTipiNo;
                case "Adi": return Adi;
		case "Soyadi": return Soyadi;
                case "BasvuruAciklamasi": return BasvuruAciklamasi;
		case "KurumNo": return KurumNo;  
                case "CevaplamaTipiNo": return CevaplamaTipiNo;  
                    
		default: return null;
                    
                    
                    
		}
	}

    @Override
    public String toString() {
        return Adi + ", " + Soyadi + ", " + BasvuruTarihi + ", " + BasvuruCevapSonTarihi+", " +
        BasvuranTipiNo + ", " + BasvuruTipiNo + ", " + BasvuruDurumuNo + ", " + TurkVatandasimi+", " +
        TCKimlikNo + ", " + TuzelKisimi + ", " + TuzelKisiUnvani + ", " + Adres+", " +
        Eposta + ", " + Telefonu + ", " +TelefonTipiNo+", "+ Fax +", "+CevaplamaTipiNo+ ", " + AdresTipiNo+", "+BasvuruAciklamasi+", "+KurumNo;
    }

}
