class userService(object):
    def __init__(self, email, password):
        self.email = email
        self.password = password
        self.data = {
            "yosefkelompok74@gmail.com": {
                "email": "yosefkelompok74@gmail.com",
                "password": "12345",
                "role": "superadmin"
            },
            "riokelompok74@gmail.com": {
                "email": "nama2kelompokxx@gmail.com",
                "password": "12345",
                "role": "user"
            },
            "ariefkelompok74@gmail.com": {
                "email": "ariefkelompok74@gmail.com",
                "password": "12345",
                "role": "user"
            }
        }
        self.history = {
            "yosefkelompok74@gmail.com": {
                "peminjam_buku": {"Kewarganegaraan","Pancasila","Algoritma Pemrograman","Sistem digital"},
                "tanggal_pinjam": "23-04-2020",
            },
            "riokelompok74@gmail.com": {
                "peminjam_buku": {"Fisika Dasar 1","Dasar Komputer dan pemrograman"},
                "tanggal_pinjam": "23-04-2020",
            },
            "ariefkelompok74@gmail.com": {
                "peminjam_buku": {"Kalkulus","Dasar Komputer","Konsep Jaringan Komputer"},
                "tanggal_pinjam": "23-04-2020",
            }
        }

    def login(self):
        get_data = self.checkCredentials()
        if get_data:
            print("\nWelcome ", get_data['role'])
            print("Logged it as user email: ", get_data['email'])
            for value in self.history:
                if value == self.email:
                    get_pinjam = self.history[value]
                    print(get_data['email']," meminjam buku: ")
                    for i in get_pinjam['peminjam_buku']:
                        print(i)
                    print("tanggal peminjaman :",get_pinjam['tanggal_pinjam'])
        else:
            print("\nInvalid Login!\n")


    def checkCredentials(self):
        for value in self.data:
            if value == self.email:
                get_data_user = self.data[value]
                if self.password == get_data_user['password']:
                    return get_data_user
                else:
                    return False