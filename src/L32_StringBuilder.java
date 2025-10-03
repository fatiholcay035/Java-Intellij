/*
 🔹 StringBuilder, Java'da metinleri değiştirmek (ekleme, silme, ters çevirme)
     için kullanılan "mutable" (değiştirilebilir) bir sınıftır.
 🔹 Normal String'ler "immutable"dır, yani değiştirilemez.
 🔹 StringBuilder performans açısından daha hızlıdır.
*/

public class L32_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder nesnesi oluşturma
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Başlangıç: " + sb);

        // 1️ append() – metin ekler
        sb.append(" World");
        System.out.println("Append sonrası: " + sb); // Hello World

        // 2️ insert() – belirtilen index’e ekleme yapar
        sb.insert(5, ", Java");
        System.out.println("Insert sonrası: " + sb); // Hello, Java World

        // 3️ replace() – belirli aralığı değiştirir
        sb.replace(0, 5, "Hi");
        System.out.println("Replace sonrası: " + sb); // Hi, Java World

        // 4️ delete() – belirli aralığı siler
        sb.delete(0, 3);
        System.out.println("Delete sonrası: " + sb); // Java World

        // 5️ reverse() – metni ters çevirir
        sb.reverse();
        System.out.println("Reverse sonrası: " + sb); // dlroW avaJ

        // 6️ toString() – String’e dönüştürür
        String str = sb.toString();
        System.out.println("String türüne dönüştü: " + str);
    }
}

/*
   StringBuilder vs String
 --------------------------
  String → Immutable (değiştirilemez)
  StringBuilder → Mutable (değiştirilebilir)
  StringBuilder daha hızlıdır çünkü yeni nesne oluşturmaz.

  En çok kullanılan metotlar:
     append(), insert(), replace(), delete(), reverse(), toString()
*/
