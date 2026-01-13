public class User {
    private String name;
    private int code;

    public User(int code, String name){
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString(){
        return "User:{id = "+code+", nome = "+name+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
