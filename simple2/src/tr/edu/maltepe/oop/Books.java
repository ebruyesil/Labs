package tr.edu.maltepe.oop;

public class Books  {
    private String bookname;
    public String getBookname(){
        return bookname;
    }
    public void  setBookname(String bookname){
        this.bookname = bookname;
    }

    void barrow(){
        System.out.println("Student is barrow this book: "+ getBookname());
    }
}
