
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            "=== Character Manager AP6 ==="
        );

        CharacterManager manager = new CharacterManager();

        // BAGIAN A: Menambahkan karakter
        System.out.println("\n--- Penambahan Karakter ---");

        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
            new Character("Athena", CharacterType.ARCHER, 4)
        );

        // Menguji nama duplikat
        System.out.println("\n--- Uji Nama Duplikat ---");

        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR, 10)
        );

        System.out.println(
            "Total karakter: " + manager.getTotalCharacters()
        );

        // Menguji equals()
        System.out.println("\n--- Uji equals() ---");

        Character a = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );

        Character b = new Character(
            "ARJUNA", CharacterType.MAGE, 3
        );

        System.out.println(
            "Apakah nama Arjuna sama? " + a.equals(b)
        );

        // Menguji pencarian
        System.out.println("\n--- Uji Pencarian ---");

        Character found = manager.findByName("Merlin");

        System.out.println("Hasil pencarian: " + found);

        // Menguji Defensive Copy
        System.out.println("\n--- Uji Defensive Copy ---");

        ArrayList<Character> copy = manager.getAllCharacters();

        copy.clear();

        System.out.println(
            "Jumlah pada salinan setelah dihapus: "
            + copy.size()
        );

        System.out.println(
            "Jumlah pada data asli: "
            + manager.getTotalCharacters()
        );

        // Menguji penghapusan
        System.out.println("\n--- Uji Penghapusan ---");

        manager.removeCharacter("Athena");

        System.out.println(
            "Total setelah hapus: "
            + manager.getTotalCharacters()
        );

        // BAGIAN B: Rata-rata level
        System.out.println("\n--- Mini-Challenge ---");

        System.out.println(
            "Rata-rata level: "
            + manager.getAverageLevel()
        );

        // Menguji rata-rata saat kosong
        CharacterManager emptyManager = new CharacterManager();

        System.out.println(
            "Rata-rata saat kosong: "
            + emptyManager.getAverageLevel()
        );

        // Mencari berdasarkan tipe
        System.out.println("\n--- Pencarian Berdasarkan Tipe ---");

        ArrayList<Character> warriors =
            manager.findByType(CharacterType.WARRIOR);

        for (Character c : warriors) {
            System.out.println(c);
        }

        // BAGIAN C: countByType
        System.out.println("\n--- Fitur Analitik ---");

        System.out.println(
            "Jumlah WARRIOR: "
            + manager.countByType(CharacterType.WARRIOR)
        );

        System.out.println(
            "Jumlah MAGE: "
            + manager.countByType(CharacterType.MAGE)
        );

        // Daftar karakter akhir
        System.out.println("\n--- Daftar Karakter Akhir ---");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }
    }
}

