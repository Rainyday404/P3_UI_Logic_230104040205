# P3_UI_Logic_230104040205

![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Repository ini berisi source code untuk Modul Praktikum 3 Mobile Programming: "Menghubungkan UI dengan Logic". Aplikasi ini dikembangkan menggunakan Android Studio dengan bahasa pemrograman Kotlin dan Layout XML.

## Deskripsi Singkat

Aplikasi sederhana ini mendemonstrasikan interaksi dasar antara tampilan antarmuka (User Interface) dan logika pemrograman (Logic). Pengguna dapat memasukkan nama, menekan tombol, dan melihat respon aplikasi berupa sapaan teks serta notifikasi (Toast).

## Fitur Utama

1.  **Input Handling**: Mengambil data teks dari komponen EditText.
2.  **Input Validation**: Memastikan kolom nama tidak boleh kosong. Jika kosong, aplikasi akan menampilkan pesan error pada kolom input dan memindahkan fokus kursor.
3.  **Event Listener**: Menangani aksi klik pada tombol (Button) menggunakan `setOnClickListener`.
4.  **Dynamic Output**: Menampilkan teks sapaan yang dinamis berdasarkan input nama pengguna.
5.  **Toast Notification**: Menampilkan pesan singkat "Input diterima" saat data berhasil diproses.
6.  **Text Justification**: Mengimplementasikan fitur `justificationMode="inter_word"` pada TextView hasil output untuk perataan teks kanan-kiri (Justify) pada perangkat Android 8.0 (API 26) ke atas.

## Teknologi yang Digunakan

* **IDE**: Android Studio
* **Bahasa**: Kotlin
* **UI Layout**: XML (ConstraintLayout)
* **Minimum SDK**: API 21 (Android 5.0 Lollipop)

## Struktur Project

* `MainActivity.kt`: File logika utama yang menangani validasi input dan update UI.
* `activity_main.xml`: File tata letak antarmuka pengguna yang menggunakan ConstraintLayout.
* `strings.xml`: Penyimpanan variabel string untuk memudahkan manajemen teks aplikasi.

## Cara Menjalankan Project

1.  Clone repository ini ke komputer lokal Anda.
2.  Buka Android Studio, lalu pilih **File > Open** dan arahkan ke folder project ini.
3.  Tunggu hingga proses Gradle Sync selesai.
4.  Hubungkan perangkat Android atau jalankan Emulator.
5.  Klik tombol **Run** (Icon Play hijau) di toolbar.

## Identitas Pengembang

* **Nama**: Ivan Dwika Bagaskara (Rain/Hujan)
* **NIM**: 230104040205
* **Topik**: Praktikum 3 - Menghubungkan UI dengan Logic