# TP5 – Character Manager (Java Visual)

## IDENTITAS MAHASISWA

- Nama: [Veva Br Tarigan]
- NIM: [253303621280]
- Kelas: [3 Pagi B]
---

## 1. Deskripsi Proyek

Character Manager merupakan program berbasis Java yang digunakan untuk mengelola data karakter dengan menerapkan konsep Object-Oriented Programming (OOP).

## 2. Tujuan Pembelajaran

- Memahami penggunaan method `equals()`.
- Mengelola data menggunakan ArrayList.
- Mencegah nama karakter duplikat.
- Memahami Defensive Copy.
- Menghitung rata-rata level karakter.
- Mencari karakter berdasarkan tipe.
- Mengembangkan fitur analitik tambahan.

## 3. Implementasi Bagian A – Fitur Utama

1. `equals()` – Membandingkan nama karakter.
2. `addCharacter()` – Menambahkan karakter.
3. `findByName()` – Mencari karakter berdasarkan nama.
4. `removeCharacter()` – Menghapus karakter.
5. `getTotalCharacters()` – Menghitung jumlah karakter.
6. `getAllCharacters()` – Mengembalikan salinan ArrayList.
7. Menolak penambahan nama duplikat.
8. Menguji Defensive Copy agar perubahan salinan tidak memengaruhi data asli.

## 4. Implementasi Bagian B – Mini-Challenge

### A. getAverageLevel()

Menghitung rata-rata level seluruh karakter dan mengembalikan nilai 0 apabila daftar karakter kosong.

### B. findByType(CharacterType type)

Mengembalikan ArrayList berisi seluruh karakter berdasarkan tipe tertentu, seperti WARRIOR, MAGE, ARCHER, dan HEALER.

## 5. Implementasi Bagian C – Fitur Analitik

### countByType(CharacterType type)

Menghitung jumlah karakter berdasarkan tipe tertentu.

**Javadoc:**

```java
/**
 * Menghitung jumlah karakter berdasarkan tipe tertentu.
 *
 * @param type tipe karakter yang ingin dihitung
 * @return jumlah karakter dengan tipe tersebut
 */
```

**Alasan pemilihan fitur:**

Fitur ini membantu mengetahui jumlah karakter berdasarkan kategori. Method hanya mengembalikan nilai jumlah sehingga ArrayList asli tetap terlindungi.

## 6. Screenshot Output

Masukkan screenshot hasil program di bawah ini:

![Output Program](![alt text](<Hasil terminal TP5.png>))


## 7. Pengujian Program

| No. | Pengujian | Hasil yang Diharapkan |
|---|---|---|
| 1 | equals() | Membandingkan nama |
| 2 | addCharacter() | Menambahkan karakter |
| 3 | Nama duplikat | Ditolak |
| 4 | findByName() | Menemukan karakter |
| 5 | removeCharacter() | Menghapus karakter |
| 6 | getTotalCharacters() | Menghitung jumlah |
| 7 | getAllCharacters() | Mengembalikan salinan |
| 8 | getAverageLevel() | Menghitung rata-rata |
| 9 | findByType() | Mencari berdasarkan tipe |
| 10 | countByType() | Menghitung berdasarkan tipe |

## 8. Struktur Folder

```text
TP6/
├── src/
│   ├── com/unpri/charactermanager/model/
│   │   ├── Character.java
│   │   ├── CharacterType.java
│   │   └── CharacterManager.java
│   └── Main.java
├── Hasil Terminal.jpg
└── README.md
```



## 9. Dokumentasi

Dokumentasi berupa screenshot hasil pengujian program, meliputi:
- Penambahan karakter.
- Penolakan nama duplikat.
- Pengujian Defensive Copy.
- Rata-rata level.
- Pencarian berdasarkan tipe.
- Fitur countByType().

## 10. Link Google Docs

**Link Dokumen Tugas TP5:**

[https://drive.google.com/file/d/1bg5ZWmzMlZcuY5KX--9fdRuR5Nn3X4Yj/view?usp=drivesdk]

