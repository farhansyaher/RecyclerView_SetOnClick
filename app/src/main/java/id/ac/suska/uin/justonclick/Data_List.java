package id.ac.suska.uin.justonclick;

public class Data_List {
    private String username;
    private String email;
    private int img;

    public Data_List(String username, String email, int img) {
        this.username = username;
        this.email = email;
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}