
n = int(input("Masukkan banyak segitiga: "))

# Validasi agar n positif
while n <= 0:
    n = int(input("Masukkan banyak segitiga: "))

# Pola baris 1
for i in range(n):
    print("*****", end="")
print()

# Pola baris 2
for i in range(n):
    print(" ***", end=" ")
print()

# Pola baris 3
for i in range(n):
    print("  * ", end=" ")
print()