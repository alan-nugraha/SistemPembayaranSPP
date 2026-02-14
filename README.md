# Sistem Pembayaran SPP SMP Jakenan

Aplikasi desktop berbasis Java Swing untuk mengelola data pembayaran SPP (Sumbangan Pembinaan Pendidikan) di SMP Jakenan. Dibangun menggunakan NetBeans IDE dengan koneksi database MySQL.

---

## Fitur

- **Login** — autentikasi pengguna sebelum mengakses sistem
- **Tambah data** — input data siswa dan pembayaran sekaligus dalam satu transaksi
- **Ubah data** — edit data siswa dan jenis pembayaran yang sudah tersimpan
- **Hapus data** — hapus data pembayaran dengan konfirmasi
- **Tampilkan data** — tabel rekap seluruh data pembayaran dari database
- **Cetak laporan** — generate laporan PDF menggunakan JasperReports dengan tampilan JasperViewer

---

## Teknologi

| Komponen | Detail |
|---|---|
| Bahasa | Java 8 |
| IDE | Apache NetBeans |
| UI Framework | Java Swing |
| Database | MySQL (via XAMPP) |
| JDBC Driver | MySQL Connector/J 9.6.0 |
| Laporan | JasperReports 6.21.0 |

---

## Struktur Project

```
SistemPembayaranSPP/
├── src/
│   ├── sistempembayaranspp/
│   │   ├── FormLogin.java       # Form login dengan autentikasi database
│   │   ├── FormUtama.java       # Form utama CRUD data pembayaran
│   │   └── Koneksi.java         # Utility koneksi ke database MySQL
│   └── reports/
│       └── LaporanPembayaran.jrxml  # Template laporan JasperReports
├── database/
│   └── dbProjectSiswa.sql       # Script SQL untuk membuat database & tabel
└── nbproject/                   # Konfigurasi project NetBeans
```

---

## Prasyarat

Pastikan perangkat lunak berikut sudah terinstall:

- [Java JDK 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html) atau lebih baru
- [Apache NetBeans IDE](https://netbeans.apache.org/)
- [XAMPP](https://www.apachefriends.org/) (untuk MySQL)

---

## Instalasi & Setup

### 1. Clone Repository

```bash
git clone https://github.com/<username>/SistemPembayaranSPP.git
```

### 2. Setup Database

1. Jalankan **XAMPP** dan aktifkan service **MySQL**
2. Buka **phpMyAdmin** atau MySQL client
3. Import file SQL:

```bash
mysql -u root -p < database/dbProjectSiswa.sql
```

Atau di phpMyAdmin: **Import** → pilih file `database/dbProjectSiswa.sql` → **Go**

Script akan membuat:
- Database `dbProjectSiswa`
- Tabel `tbl_siswa`, `tbl_pembayaran`, `tbl_users`
- User default: `username: admin` / `password: admin123`
- Data contoh 3 siswa

### 3. Tambahkan Library ke Project NetBeans

Klik kanan project → **Properties** → **Libraries** → **Add JAR/Folder**, lalu tambahkan JAR berikut:

| Library | Download |
|---|---|
| `mysql-connector-j-9.6.0.jar` | [Maven Central](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/9.6.0/mysql-connector-j-9.6.0.jar) |
| `jasperreports-6.21.0.jar` | [Maven Central](https://repo1.maven.org/maven2/net/sf/jasperreports/jasperreports/6.21.0/jasperreports-6.21.0.jar) |
| `commons-beanutils-1.9.4.jar` | [Maven Central](https://repo1.maven.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar) |
| `commons-collections4-4.4.jar` | [Maven Central](https://repo1.maven.org/maven2/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.jar) |
| `commons-digester-2.1.jar` | [Maven Central](https://repo1.maven.org/maven2/commons-digester/commons-digester/2.1/commons-digester-2.1.jar) |
| `commons-logging-1.2.jar` | [Maven Central](https://repo1.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar) |
| `slf4j-api-1.7.32.jar` | [Maven Central](https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.jar) |

### 4. Sesuaikan Koneksi Database (jika perlu)

Edit file `src/sistempembayaranspp/Koneksi.java` jika konfigurasi MySQL berbeda:

```java
private static final String HOST     = "localhost";
private static final String PORT     = "3306";
private static final String DATABASE = "dbProjectSiswa";
private static final String USER     = "root";
private static final String PASSWORD = "";  // isi jika ada password
```

### 5. Build & Jalankan

- **Clean and Build**: `Shift + F11`
- **Run FormLogin** (dengan login): klik kanan `FormLogin.java` → **Run File** (`Shift + F6`)
- **Run FormUtama** (langsung ke form utama): klik kanan `FormUtama.java` → **Run File** (`Shift + F6`)

---

## Skema Database

```sql
tbl_siswa
├── id_siswa   VARCHAR(10) PK
├── nama_siswa VARCHAR(100)
├── kelas      VARCHAR(20)
└── jurusan    VARCHAR(50)

tbl_pembayaran
├── id_bayar         INT AUTO_INCREMENT PK
├── id_siswa         VARCHAR(10) FK → tbl_siswa
├── jenis_pembayaran VARCHAR(50)
├── jumlah           DECIMAL(12,2)
└── tanggal          DATE

tbl_users
├── username VARCHAR(50) PK
└── password VARCHAR(100)
```

---

## Cara Penggunaan

1. Jalankan aplikasi → muncul **Form Login**
2. Masukkan `username: admin` dan `password: admin123` → klik **Login**
3. Di **Form Utama**:
   - **Simpan**: isi semua field → klik **Simpan**
   - **Ubah**: klik baris di tabel → edit field → klik **Ubah**
   - **Hapus**: klik baris di tabel → klik **Hapus** → konfirmasi
   - **Cetak**: klik **Cetak** → JasperViewer terbuka, bisa print atau export

---

## Jenis Pembayaran yang Tersedia

- SPP Bulanan
- Uang Gedung
- Seragam
- Buku
- Kegiatan Sekolah

## Jurusan yang Tersedia

- IPA
- IPS
- Bahasa
- Teknik Komputer
- Multimedia

---

## Lisensi

Project ini dibuat untuk keperluan tugas / pembelajaran.
