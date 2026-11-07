
package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {

    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor
    public Character(String name, CharacterType type, int level) {
        this.id = 0;
        this.name = name;
        this.type = type;
        this.mana = 0;
        setLevel(level);
    }

    // Constructor kedua
    public Character(int id, String name, CharacterType type, int level) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.mana = 0;
        setLevel(level);
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1");
        }

        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 5);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh negatif");
        }
        this.mana = mana;
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Membandingkan karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name != null &&
               other.name != null &&
               name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name == null ? null : name.toLowerCase()
        );
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{id=" + id
                + ", name='" + name + '\''
                + ", type=" + type
                + ", level=" + level
                + ", hp=" + hitPoints
                + ", atk=" + attackPower
                + '}';
    }
}
