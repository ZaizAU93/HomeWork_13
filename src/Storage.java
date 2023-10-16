public class Storage <T>{
    private T value;

    public Storage(){

    }

    public Storage(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
