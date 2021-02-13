package databaseproject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// başvuru tablosunun view sınıfı
class BasvuruView implements ViewInterface {


	public ViewData create(ModelData modelData, String functionAdi, String operationAdi) throws Exception {

		switch(operationAdi) {
		case "select": return selectOperation(modelData);
		case "insert": return insertOperation(modelData);
		case "update": return updateOperation(modelData);
		case "delete": return deleteOperation(modelData);
		case "select.gui": return selectGUI(modelData);
		case "insert.gui": return insertGUI(modelData);
		case "update.gui": return updateGUI(modelData);
		case "delete.gui": return deleteGUI(modelData);
		}

		return new ViewData("MainMenu", "");
	}

	ViewData selectOperation(ModelData modelData) throws Exception {
		ResultSet resultSet = modelData.resultSet;

		if (resultSet != null) {
			while (resultSet.next()) {
				// Retrieve by column Adi

                                //int BasvuruNo = resultSet.getInt("PersonelId");
                                Date BasvuruTarihi = resultSet.getDate("BasvuruTarihi");
                                Date BasvuruCevapSonTarihi = resultSet.getDate("BasvuruCevapSonTarihi");
                                int BasvuranTipiNo = resultSet.getInt("BasvuranTipiNo");
                                int BasvuruTipiNo = resultSet.getInt("BasvuruTipiNo");
                                int BasvuruDurumuNo = resultSet.getInt("BasvuruDurumuNo");

                                int TurkVatandasimi = resultSet.getInt("TurkVatandasimi");
                                int TCKimlikNo = resultSet.getInt("TCKimlikNo");
                                String Adi = resultSet.getString("Adi");
                                String Soyadi = resultSet.getString("Soyadi");
                                int TuzelKisimi = resultSet.getInt("TuzelKisimi");
                                String TuzelKisiUnvani = resultSet.getString("TuzelKisiUnvani");
                                String Adres = resultSet.getString("Adres");
                                String Eposta = resultSet.getString("Eposta");
                                String Telefonu = resultSet.getString("Telefonu");
                                int TelefonTipiNo = resultSet.getInt("TelefonTipiNo");
                                String Fax = resultSet.getString("Fax");
                                int CevaplamaTipiNo = resultSet.getInt("CevaplamaTipiNo");
                                String BasvuruCevabiAciklama = resultSet.getString("BasvuruCevabiAciklama");
                                int RedSebebiNo = resultSet.getInt("RedSebebiNo");
                                int AdresTipiNo = resultSet.getInt("AdresTipiNo");                                

                                
				// Display values
				//System.out.print(BasvuruNo + "\t");
				System.out.print(BasvuruTarihi + "\t");
				System.out.print(BasvuruCevapSonTarihi + "\t");
                                System.out.print(BasvuranTipiNo + "\t");
                                System.out.print(BasvuruTipiNo + "\t");
                                System.out.print(BasvuruDurumuNo + "\t");
                                System.out.print(TurkVatandasimi + "\t");
                                System.out.print(TCKimlikNo + "\t");
                                System.out.print(Adi + "\t");
                                System.out.print(Soyadi + "\t");
                                System.out.print(TuzelKisimi + "\t");
                                System.out.print(TuzelKisiUnvani + "\t");
                                System.out.print(Adres + "\t");
                                System.out.print(Eposta + "\t");
                                System.out.print(Telefonu + "\t");
                                System.out.print(TelefonTipiNo + "\t");
                                System.out.print(Fax + "\t");
                                System.out.print(CevaplamaTipiNo + "\t");
                                System.out.print(BasvuruCevabiAciklama + "\t");
                                System.out.print(RedSebebiNo + "\t");
                                System.out.print(AdresTipiNo + "\t");
				//System.out.println(modifiedDate);
			}
			resultSet.close();
		}

		return new ViewData("MainMenu", "");
	}

	ViewData insertOperation(ModelData modelData) throws Exception {
		System.out.println("Number of inserted rows is " + modelData.recordCount);

		return new ViewData("MainMenu", "");
	}

	ViewData updateOperation(ModelData modelData) throws Exception {
		System.out.println("Number of updated rows is " + modelData.recordCount);

		return new ViewData("MainMenu", "");
	}

	ViewData deleteOperation(ModelData modelData) throws Exception {
		System.out.println("Number of deleted rows is " + modelData.recordCount);

		return new ViewData("MainMenu", "");
	}

	Map<String, Object> getWhereParameters() throws Exception {
		System.out.println("Filter conditions:");
		Integer BasvuruNo = getInteger("BasvuruNo : ", true);

		Map<String, Object> whereParameters = new HashMap<>();
		if (BasvuruNo != null) whereParameters.put("BasvuruNo", BasvuruNo);

		return whereParameters;
	}

	ViewData selectGUI(ModelData modelData) throws Exception {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("whereParameters", getWhereParameters());

		return new ViewData("Basvuru", "select", parameters);
	}

	ViewData insertGUI(ModelData modelData) throws Exception {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("fieldAdis", "Adi,Soyadi,BasvuruTarihi,BasvuruCevapSonTarihi,BasvuranTipiNo,BasvuruTipiNo,BasvuruDurumuNo,TurkVatandasimi,TCKimlikNo,TuzelKisimi,TuzelKisiUnvani,Adres,Eposta,Telefonu,TelefonTipiNo,Fax,AdresTipiNo");

		List<Object> rows = new ArrayList<>();

    short BasvuruNo;
    Date BasvuruTarihi;
    Date BasvuruCevapSonTarihi;
    int BasvuranTipiNo;
    int BasvuruTipiNo;
    int BasvuruDurumuNo;

    int TurkVatandasimi;
    int TCKimlikNo;
    String Adi;
    String Soyadi;
    int TuzelKisimi;
    String TuzelKisiUnvani;
    String Adres;
    String Eposta;
    String Telefonu;
    int TelefonTipiNo;
    String Fax;
    int CevaplamaTipiNo;
    String BasvuruCevabiAciklama;
    int RedSebebiNo;
    int AdresTipiNo;
    
		/*do
		{*/
			System.out.println("Fields to insert:");
                        
                        //BasvuruTarihi = getDate("BasvuruTarihi : ", true);
                        //BasvuruCevapSonTarihi = getDate("BasvuruCevapSonTarihi : ", true);
                        BasvuranTipiNo = getInteger("BasvuranTipiNo : ", true);
                        BasvuruTipiNo = getInteger("BasvuruTipiNo : ", true);
                        BasvuruDurumuNo = getInteger("BasvuruDurumuNo : ", true);

                        TurkVatandasimi = getInteger("TurkVatandasimi : ", true);
                        TCKimlikNo = getInteger("TCKimlikNo : ", true);
                        Adi = getString("Adi : ", true);
                        Soyadi = getString("Soyadi : ", true);
                        TuzelKisimi = getInteger("TuzelKisimi : ", true);
                        TuzelKisiUnvani = getString("TuzelKisiUnvani : ", true);
                        Adres = getString("Adres : ", true);
                        Eposta = getString("Eposta : ", true);
                        Telefonu = getString("Telefonu : ", true);
                        TelefonTipiNo = getInteger("TelefonTipiNo : ", true);
                        Fax = getString("Fax : ", true);
                        AdresTipiNo = getInteger("AdresTipiNo : ", true); 
                        

                                
                                System.out.println("Rowlar: "+rows.toString());

		parameters.put("rows", rows);

		return new ViewData("Basvuru", "insert", parameters);
	}

	ViewData updateGUI(ModelData modelData) throws Exception {
		System.out.println("Fields to update:");
                
                
     
                        int BasvuranTipiNo = getInteger("BasvuranTipiNo : ", true);
                        int BasvuruTipiNo = getInteger("BasvuruTipiNo : ", true);
                        int BasvuruDurumuNo = getInteger("BasvuruDurumuNo : ", true);

                        int TurkVatandasimi = getInteger("TurkVatandasimi : ", true);
                        int TCKimlikNo = getInteger("TCKimlikNo : ", true);
                        String Adi = getString("Adi : ", true);
                        String Soyadi = getString("Soyadi : ", true);
                        int TuzelKisimi = getInteger("TuzelKisimi : ", true);
                        String TuzelKisiUnvani = getString("TuzelKisiUnvani : ", true);
                        String Adres = getString("Adres : ", true);
                        String Eposta = getString("Eposta : ", true);
                        String Telefonu = getString("Telefonu : ", true);
                        int TelefonTipiNo = getInteger("TelefonTipiNo : ", true);
                        String Fax = getString("Fax : ", true);
                        int AdresTipiNo = getInteger("AdresTipiNo : ", true);              

		System.out.println();

		Map<String, Object> updateParameters = new HashMap<>();
                
		if (Adi != null) updateParameters.put("Adi", Adi);
		if (Soyadi != null) updateParameters.put("Soyadi", Soyadi);

		Map<String, Object> parameters = new HashMap<>();
		parameters.put("updateParameters", updateParameters);
		parameters.put("whereParameters", getWhereParameters());

		return new ViewData("Basvuru", "update", parameters);
	}

	ViewData deleteGUI(ModelData modelData) throws Exception {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("whereParameters", getWhereParameters());

		return new ViewData("Basvuru", "delete", parameters);
	}

	@Override
	public String toString() {
		return "Basvuru View";
	}
}
