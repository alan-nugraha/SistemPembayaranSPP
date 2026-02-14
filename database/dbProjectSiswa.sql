-- ============================================================
--  Database: dbProjectSiswa
--  Sistem Pembayaran SPP SMP Jakenan
--  Jalankan script ini di MySQL / phpMyAdmin terlebih dahulu
-- ============================================================

CREATE DATABASE IF NOT EXISTS dbProjectSiswa
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_unicode_ci;

USE dbProjectSiswa;

-- -------------------------------------------------------
--  Tabel siswa
-- -------------------------------------------------------
CREATE TABLE IF NOT EXISTS tbl_siswa (
    id_siswa   VARCHAR(10)  NOT NULL,
    nama_siswa VARCHAR(100) NOT NULL,
    kelas      VARCHAR(20)  NOT NULL,
    jurusan    VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id_siswa)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- -------------------------------------------------------
--  Tabel pembayaran
-- -------------------------------------------------------
CREATE TABLE IF NOT EXISTS tbl_pembayaran (
    id_bayar         INT           NOT NULL AUTO_INCREMENT,
    id_siswa         VARCHAR(10)   NOT NULL,
    jenis_pembayaran VARCHAR(50)   NOT NULL,
    jumlah           DECIMAL(12,2) NOT NULL,
    tanggal          DATE          NOT NULL,
    PRIMARY KEY (id_bayar),
    CONSTRAINT fk_pembayaran_siswa
        FOREIGN KEY (id_siswa) REFERENCES tbl_siswa (id_siswa)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- -------------------------------------------------------
--  Tabel users (untuk login)
-- -------------------------------------------------------
CREATE TABLE IF NOT EXISTS tbl_users (
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Data awal: user admin (password: admin123)
INSERT IGNORE INTO tbl_users (username, password) VALUES ('admin', 'admin123');

-- -------------------------------------------------------
--  Data contoh
-- -------------------------------------------------------
INSERT IGNORE INTO tbl_siswa (id_siswa, nama_siswa, kelas, jurusan) VALUES
    ('S001', 'Budi Santoso',  '7A', 'IPA'),
    ('S002', 'Siti Rahayu',   '8B', 'IPS'),
    ('S003', 'Ahmad Fauzi',   '9A', 'IPA');

INSERT IGNORE INTO tbl_pembayaran (id_siswa, jenis_pembayaran, jumlah, tanggal) VALUES
    ('S001', 'SPP Bulanan', 150000, CURDATE()),
    ('S002', 'SPP Bulanan', 150000, CURDATE()),
    ('S003', 'Uang Gedung', 500000, CURDATE());
