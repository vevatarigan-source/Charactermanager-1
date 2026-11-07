
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // BAGIAN A

    // Menambahkan karakter dan menolak nama duplikat
    public boolean addCharacter(Character character) {

        if (character == null) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            System.out.println(
                "❌ Gagal: karakter dengan nama '"
                + character.getName() + "' sudah ada!"
            );
            return false;
        }

        characters.add(character);

        System.out.println(
            " ✅ Karakter '" + character.getName()
            + "' berhasil ditambahkan."
        );

        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {

        if (name == null) {
            return null;
        }

        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);

            System.out.println(
                "🗑️ Karakter '" + name
                + "' berhasil dihapus."
            );

            return true;
        }

        return false;
    }

    // Menghitung jumlah karakter
    public int getTotalCharacters() {
        return characters.size();
    }

    // Mengembalikan salinan ArrayList
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // BAGIAN B

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character c : characters) {
            total += c.getLevel();
        }

        return (double) total / characters.size();
    }

    // Mencari karakter berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character c : characters) {
            if (c.getType() == type) {
                result.add(c);
            }
        }

        return result;
    }

    // BAGIAN C

    /**
     * Menghitung jumlah karakter berdasarkan tipe tertentu.
     *
     * @param type tipe karakter yang ingin dihitung
     * @return jumlah karakter dengan tipe tersebut
     */
    public int countByType(CharacterType type) {

        int count = 0;

        for (Character c : characters) {
            if (c.getType() == type) {
                count++;
            }
        }

        return count;
    }
}

