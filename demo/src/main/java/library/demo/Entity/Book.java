package library.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Entity
@Data
@Table(name="BOOK")
@ApiModel(value = "自定义实体-Book", description = "存储图书数据")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id_b;
    private String BookName;
    private Integer Prize;
    private String Author;
 
    public Book(Integer id_b, String bookName, Integer prize, String author) {
        Id_b = id_b;
        BookName = bookName;
        Prize = prize;
        Author = author;
    }
 
 
    public Integer getId_b() {
        return Id_b;
    }
 
    public String getBookName() {
        return BookName;
    }
 
    public Integer getPrize() {
        return Prize;
    }

    public String getAuthor() {
        return Author;
    }
 
    public void setId_b(Integer id_b) {
        Id_b = id_b;
    }
 
    public void setBookName(String bookName) {
        BookName = bookName;
    }
 
    public void setPrize(Integer prize) {
        Prize = prize;
    }

    public void setAuthor(String author) {
        Author = author;
    }
 
    @Override
    public String toString() {
        return "Book{" +
                "Id_b=" + Id_b +
                ", BookName='" + BookName + '\'' +
                ", Prize=" + Prize +
                '}';
    }
}