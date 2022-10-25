public class Author extends Book{
    String name;

    public Author(String name) {
        super(name);
        this.name = name;
    }

    public void print(){
        System.out.println("Name of Author is: " + name);

    }
}
