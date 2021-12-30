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
    - Jika singleton object bersifat muttable, maka bisa saja terjadi race condition
    

