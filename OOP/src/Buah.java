package OOP.src;

import java.util.ArrayList;

public class Buah {
  private String nama;
  private int harga;
  private int stock;

  public static int buahCount;

  public Buah(String nama, int harga, int stock) {
    setNama(nama);
    setHarga(harga);
    setStock(stock);

    buahCount++;
  }

  public String getNama() {
    return nama;
  }

  private void setNama(String nama) {
    if (nama.length() == 0) {
      throw new IllegalArgumentException("Name cannot be empty");
    }
    this.nama = nama;
  }

  public int getHarga() {
    return harga;
  }

  private void setHarga(int harga) {
    if (harga <= 0) {
      throw new IllegalArgumentException("Price cannot be 0 or below");
    }
    this.harga = harga;
  }

  public int getStock() {
    return stock;
  }

  private void setStock(int stock) {
    if (stock < 0) {
      throw new IllegalArgumentException("Stock cannot be below 0");
    }
    this.stock = stock;
  }

}