public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(int n){
        length = n;
    }

    public void setWidth(int n){
        width = n;
    }

    public void setHeight(int n){
        height = n;
    }

    public int volume(){
        return length*width*height;
    }

    public int surfaceArea(){
        return  length*width*2 + length*height*2 + width*height*2;
    }

    public String dimensions() {
        return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
    }
}
