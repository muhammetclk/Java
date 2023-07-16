import javax.swing.text.StyledEditorKit;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// hashmap i--> dictionary lere benzetebiliriz.

        HashMap<String,String> sozluk=new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("Table","Masa");
        sozluk.put("Computer","Bilgisayar");
        System.out.println(sozluk);
        System.out.println(sozluk.get("book"));
        sozluk.remove("Table");
        System.out.println(sozluk);

        for (String item:sozluk.keySet()) {
                System.out.println("Key:"+item+" Value: "+sozluk.get(item));
        }
    }
}
