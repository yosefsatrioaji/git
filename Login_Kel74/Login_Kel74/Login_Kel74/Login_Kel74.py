from userService import userService

while True :
    print("System Login Kelompok 74!\n")
    email = input("Email: ")
    password = input("Password: ")
    get_class = userService(email,password)
    get_class.login()
    while True :
        retry = str.lower(input("Login ulang? y untuk ya, n untuk tidak :"))
        if retry=='n' : break
        elif retry=='y' : break
        else :
            print('y or n only')
    if retry=='n' : break