/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author morph
 */

// Bu sınıfta dışarıdan parametre alınmadan çalışan genel sorguları bulabilirsiniz.



public class ConstantSqlQuery {
    
    // bu sorgu ile bütün verileri daha okunaklı bir şekilde database'den alınmasını yapar
    public static String fatchAlldataQuery = "select\n" +
"BasvuruNo,\n" +
"BasvuruTarihi,\n" +
"BasvuruCevapSonTarihi,\n" +
"BasvuruTipi.BasvuruTipiAciklama,\n" +
"BasvuruDurumu.BasvuruDurumuAciklama,\n" +
"CASE\n" +
"WHEN TurkVatandasimi = 1 THEN 'EVET' ELSE 'HAYIR'\n" +
"END AS TurkVatandasimi,\n" +
"TCKimlikNo,\n" +
"\n" +
"\n" +
"\n" +
"Adi,\n" +
"Soyadi,\n" +
"CASE\n" +
"WHEN Basvuru.BasvuranTipiNo = 1 THEN 'EVET' ELSE 'HAYIR'\n" +
"END AS TuzelKisimi,\n" +
"TuzelKisiUnvani,\n" +
"Adres,\n" +
"Eposta,\n" +
"Telefonu,\n" +
"Telefontipi.TelefonTipiAciklama,\n" +
"coalesce(Fax, '-') as Fax,\n" +
"CevaplamaTipi.CevaplamaTipiAciklama,\n" +
"coalesce(BasvuruCevabiAciklama, '-') as BasvuruCevabiAciklama,\n" +
"coalesce(RedSebebi.RedSebebiAciklama, '-') as RedSebebiAciklama,\n" +
"AdresTipi.AdresTipiAciklama,\n" +
"coalesce(BasvuruAciklamasi, '-') as BasvuruAciklamasi,\n" +
"Kurum.KurumAdi\n" +
"\n" +
"\n" +
"\n" +
"from Basvuru\n" +
"left outer join  Kurum on\n" +
"Basvuru.KurumNo = Kurum.KurumNo\n" +
"left outer join BasvuruDurumu on\n" +
"BasvuruDurumu.BasvuruDurumuNo = Basvuru.BasvuruDurumuNo\n" +
"left outer join RedSebebi on\n" +
"RedSebebi.RedSebebiNo = Basvuru.RedSebebiNo\n" +
"left outer join BasvuranTipi on\n" +
"BasvuranTipi.BasvuranTipiNo = Basvuru.BasvuranTipiNo\n" +
"left outer join BasvuruTipi on\n" +
"BasvuruTipi.BasvuruTipiNo = Basvuru.BasvuruTipiNo\n" +
"left outer join Telefontipi on\n" +
"Telefontipi.TelefonTipiNo = Basvuru.TelefonTipiNo\n" +
"left outer join CevaplamaTipi on\n" +
"CevaplamaTipi.CevaplamaTipiNo = Basvuru.CevaplamaTipiNo\n" +
"left outer join AdresTipi on\n" +
"AdresTipi.AdresTipiNo = Basvuru.AdresTipiNo order by BasvuruNo DESC ";
    
    
    
    // bu sorgu ile başvuru durumunun daha okunaklı bir şekilde olmasını sağlar
     public static String basvuruDurumNo2Queries ="select Basvuru.BasvuruNo ,  Basvuru.Adi ,Basvuru.Soyadi, TCKimlikNo, BasvuruDurumu.BasvuruDurumuAciklama  from Basvuru \n" +
            "\n" +
            "inner join BasvuruDurumu on \n" +
            "Basvuru.BasvuruDurumuNo= BasvuruDurumu.BasvuruDurumuNo\n" +
            "\n" +
            "\n" +
            "where Basvuru.BasvuruDurumuNo=2";
     
     public static String basvuruDurumNoSayisiQueries(String number){
         return "Select Count(BasvuruDurumuNo) as RedEdilenler from Basvuru where BasvuruDurumuNo="+number;
     }
     
     //bu sorgu gizli bilgi olarak red edilen başvuruları filtrelemeye yarar
       public static String gizliBilgimiQuery = "select\n" +
        "count(RedSebebi.GizliBilgimi) as GizliBilgi\n" +
        "from Basvuru\n" +
        "left outer join RedSebebi\n" +
        "on\n" +
        "Basvuru.RedSebebiNo = RedSebebi.RedSebebiNo\n" +
        "Where RedSebebi.GizliBilgimi = 1";
       
     // bu sorgu aynı tc ile yapılan bütün başvuruları daha okunaklı bir şekilde  listeler 
     public static String ayniTcSahibiQuery = "select\n" +
            "BasvuruNo,\n" +
            "BasvuruTarihi,\n" +
            "Adi,\n" +
            "Soyadi,\n" +
            "BasvuruAciklamasi,\n" +
            "Kurum.KurumAdi,\n" +
            "t.*\n" +
            "from [Basvuru] myAllList\n" +
            "left outer join Kurum on\n" +
            "myAllList.KurumNo = Kurum.KurumNo\n" +
            "join (\n" +
            "select\n" +
            "TCKimlikNo,\n" +
            "count(*) as TekrarSayisi\n" +
            "from [Basvuru]\n" +
            "group by TCKimlikNo\n" +
            "having count(*) > 1\n" +
            ") t on myAllList.TCKimlikNo = t.TCKimlikNo";
     
     // bu sorgu controller rolünde olan personelin işine yarayan kolonları daha okunaklı bir şekilde listelemeye yarar.
     public static String controllerGetAllDataQuery = "select\n" +
"BasvuruNo,\n" +
"BasvuruCevapSonTarihi,\n" +
"BasvuruDurumu.BasvuruDurumuAciklama,\n" +
"TCKimlikNo,\n" +
"Adi,\n" +
"Soyadi,\n" +
"coalesce(RedSebebi.RedSebebiAciklama,'-') as RedSebebiAciklama,\n" +
"Kurum.KurumAdi\n" +
"from Basvuru\n" +
"inner join Kurum on\n" +
"Basvuru.KurumNo = Kurum.KurumNo\n" +
"inner join BasvuruDurumu on\n" +
"BasvuruDurumu.BasvuruDurumuNo = Basvuru.BasvuruDurumuNo\n" +
"left outer join RedSebebi on\n" +
"RedSebebi.RedSebebiNo = Basvuru.RedSebebiNo";
     
     
     // bu sorgu controller rolünde olan personelin ekranında başvuru için kalan zamanı filtreler
      public static String controllerRemaninDayCalcQuery = "select\n" +
"BasvuruNo,\n" +
"BasvuruTarihi,\n" +
"BasvuruCevapSonTarihi,\n" +
"('Kalan Gün ' + Cast((DATEDIFF(DAY, GETDATE(),BasvuruCevapSonTarihi)) AS varchar)) as KalanGünSayisi,\n" +
"BasvuruDurumu.BasvuruDurumuAciklama,\n" +
"Adi,\n" +
"Soyadi,\n" +
"coalesce(RedSebebi.RedSebebiAciklama, '-') as RedSebebiAciklama,\n" +
"Kurum.KurumAdi\n" +
"from Basvuru\n" +
"inner join Kurum on\n" +
"Basvuru.KurumNo = Kurum.KurumNo\n" +
"inner join BasvuruDurumu on\n" +
"BasvuruDurumu.BasvuruDurumuNo = Basvuru.BasvuruDurumuNo\n" +
"left outer join RedSebebi on\n" +
"RedSebebi.RedSebebiNo = Basvuru.RedSebebiNo\n" +
"where DATEDIFF(DAY, GETDATE(),BasvuruCevapSonTarihi)> 0 order by KalanGünSayisi";
     
      // bu sorguda muhasebe rolüne sahip personelin işine yarayacak olan bilgiler okunaklı bir şekilde listelenir.
        public static String muhasebeGetAllDataQuery = "select Basvuru.BasvuruNo,BasvuruTarihi,BasvuruCevapSonTarihi,BasvuruUcreti.UcretTalepTarihi,BasvuruUcreti.BasvuruUcreti,\n" +
"CASE\n" +
"WHEN BasvuruUcreti.Odendimi = 0 THEN 'Ödenmedi'\n" +
"WHEN BasvuruUcreti.Odendimi = 1 THEN 'Ödendi'\n" +
"END AS Odendimi,\n" +
"Adi,\n" +
"Soyadi,\n" +
"CASE\n" +
"WHEN BasvuruDurumuNo = 0 THEN 'Inceleme asamasinda'\n" +
"WHEN BasvuruDurumuNo = 1 THEN 'Baska kuruma yönlendirildi'\n" +
"WHEN BasvuruDurumuNo = 2 THEN 'Kabul edildi'\n" +
"WHEN BasvuruDurumuNo = 3 THEN 'Reddedildi'\n" +
"END AS BasvuruDurumuNo\n" +
"from Basvuru inner join BasvuruUcreti\n" +
"on Basvuru.BasvuruNo = BasvuruUcreti.BasvuruNo ";
}
