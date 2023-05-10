package interfacee;
//**************METHODLARIN KULLANIMI*****************************
//tum methodlar abstract olur yazmaya gerek yok
//abstract methodlar child classlar tarafından kullanılmak zorundadır.
// "Concrete Child Class" lar "parent interface" deki "abstract method"lari override etmek zorundadirlar.
//Child interface ise abstract methodları override etmek zorunda değil.
//Bu özelliği ile İnterfaceler to do liste benzer.
//Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz.
//abstract methodlar body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi
//birini override ederek kullanabilirler.  "return type" lari ayni olmak zorundadir.
//tum methodlar public olur yazmaya gerek yok
//Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugunuzda
//bu method'larin "return type" lari ayni olmak zorundadir.
//abstract methodlar butun child classlar tarafından kullanılmak zorundadır
//bazi ozel durumlarda "concrete method" koymamiz gerekirse oluşturulabilir.
// Bunun için Defoult veya Statik key wordunu kullanmak gerekir
//Defoult kullanılan methodu obje oluşturarak çağırabiliriz.
//Statik kullanılan method classın ismi ile çağırabiliriz.



//**************CHİLD YAPMA****************************************
//CLASS-CLASS extend
//CLASS-İNTERFACE implaments
//İNTERFACE-İNTERFACE extend
//Class interfacein parenti OLMAZ



//**************VERİABLE KULLANIMI**********************************
/*
Interfacedeki tum veriblellar otomatik olarak final-public-static tir
bu yuzden bu veriablelların atamasını mutlaka yapmalısınız


 */
public interface Oyun {
    void oyna();

    void basla();

    double age=4;
    String oyunName="PUBG";


}
