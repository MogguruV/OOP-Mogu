public class Quis {
    private int key;
    private String value;
    private int dayExpired;  //IN DAY

    public void setItems(int key, String value, int dayExpired ){
        this.key = key;
        this.value = value;
        this.dayExpired = dayExpired;
    }

    public void getItems(int key){
        if (key == this.key){
            System.out.println(value);
        }
        else{
            System.out.println("Key " + key + " Tidak ditemukan");
        }
    }

    public void remove(int key){
        if (key == this.key){
            key = 0;
            value = "Null";
            System.out.println("Key berhasil dihapus");
        }
        else{
            System.out.println("Key " + key + " Tidak ditemukan\nKey tidak dapat dihapus");
        }
    }
    
    public void expired(int dayExpired){ // DUE DATE
        if (this.dayExpired <= dayExpired){
            System.out.println("Key belum expired");
        }
        else if (this.dayExpired >= dayExpired){
            key = 0;
            value = "Null";
            System.out.println("Key berhasil dihapus");
        }
        else{
            System.out.println("");
        }
    }
}
