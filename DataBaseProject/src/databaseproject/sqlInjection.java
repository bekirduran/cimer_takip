/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author flashomer
 */
public class sqlInjection {
    
    // bu sınıf sql injection için gerekli fonksiyondur.
public static final String[] injectionList = {
"'",
"`",
"``",
",",
"/",
"//",
"\\",
";",
"' or ",
"-- or #", 
"' OR '1",
"' OR 1 -- -",
" OR 1 = 1 -- -",
"' OR '' = '",
"'='",
"'LIKE'",
"'=0--+",
" OR 1=1",
"' OR 'x'='x",
"' AND id IS NULL; --",
"'''''''''''''UNION SELECT '2",
"%00",
"/*…*/ ",
"AND 1",
"AND 0",
"AND true",
"AND false",
"1-false",
"1-true",
"1*56",
"R 1=0",
 "OR x=x",
 "OR x=y",
 "OR 1=1#",
 "OR 1=0#",
 "OR x=x#",
 "OR x=y#",
 "OR 1=1--", 
 "OR 1=0--", 
 "OR x=x--", 
 "OR x=y--", 
 "sleep(5)#",
"1 or sleep(5)#",
" or sleep(5)#",
"' or sleep(5)#",
" or sleep(5)=",
"' or sleep(5)='",
    };
    // sqlinjection kaşılaştırılması
    public static boolean injectionControl(String text) {
        
        boolean index = false;
        for (int i=0;i<injectionList.length;i++) {
            
            int searchIndex = text.indexOf(injectionList[i].toString());
            //System.out.println("in: "+searchIndex+" text: "+text);
          
            if (searchIndex>-1) {
                index = true;
                break;
            }
        }              
            return index;
        
        }
    

    
}
