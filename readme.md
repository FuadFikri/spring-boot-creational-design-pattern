## Creational Design Pattern in Spring Boot
- ` source : Programmer Zaman now`


### Singleton
    - ensure that a class has just a single instance
    - provide a global access point to that instance

    di spring boot
    - defaultnya object bean yang ada di Spring adalah singleton object dan objectnya akan dibuat secara eager (langsung dibuat ketika aplikasi pertama dijalankan)
    - kita bisa juga membuat object bean menjadi lazy(hanya dibuat ketika pertama kali dibutuhkan)
    - jika objectnya berat, seperti koneksi db, http client, disarankan membuat singleton eager
    - Pastikan singleton object bersifat immutable
    - Jika singleton object bersifat muttable, maka bisa saja terjadi race condition. Perlu hati-hati untuk menerapkan singleton object yang mutable. 
    

### Prototype
    - Saat kita memiliki sebuah class yang jenis objectnya banyak kesamaan, maka sangat cocok menggunakan prototype pattern
    - Dengan prototype pattern, kita bisa membuat object dari prototype bean yang sudah kita deklarasikan
    - Hati-hati ketika membuat bean dari prototype, karena secara otomatis object akan selalu dibuat baru oleh Spring
    - Di Spring, kita bisa ubah scope bean dari singleton menjadi prototype. Saat kita ubah menjadi prototype, secara otomatis object akan selalu dibuat baru sesuai dengan deklarasi yang ada di bean

