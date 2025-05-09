package org.example.Repository;

import org.example.Exceptions.DaoException;
import org.example.FactoryConnection;
import org.example.dto.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.example.Main.logger;

public class BookRepoImpl implements BookRepo {
    private Connection connection;


    public BookRepoImpl(){
        this.connection=FactoryConnection.getConnection();
    }
    @Override
    public Book addBook(Book book) throws DaoException {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book values(?,?,?,?,?)");
            preparedStatement.setInt(1, book.getId());
            preparedStatement.setString(2, book.getIsbn());
            preparedStatement.setString(3, book.getTitle());
            preparedStatement.setDouble(4, book.getPrice());
            preparedStatement.setString(5, book.getAuthor());
            preparedStatement.executeUpdate();


        } catch ( SQLException e) {
            logger.error(e);
            throw new DaoException("Book ALready Exist",e);
        }
        return book;
    }

    @Override
    public void deleteBook(int id)  {
    try{
        PreparedStatement preparedStatement=connection.prepareStatement("delete from book where id=?");
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }catch (SQLException e){
        logger.error(e);
       throw new DaoException("Book not found",e);
    }
    }

    @Override
    public List<Book> getAllBooks() throws DaoException {
        List <Book> books=new ArrayList<>();
        try{
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("select * from book");
            while (rs.next()){
                books.add(new Book(rs.getInt("id"),rs.getString("isbn"),rs.getString("title"),rs.getDouble("price"),rs.getString("author")));
            }
        } catch (SQLException e) {
            logger.error(e);
            throw new DaoException("Book not found",e);
        }
        return books;
    }

    @Override
    public Book getBookById(int id) throws DaoException {
        Book book=null;
            try{
                PreparedStatement preparedStatement=connection.prepareStatement("select * from book where id=?");
                preparedStatement.setInt(1,id);
                ResultSet rs=preparedStatement.executeQuery();
                if (rs.next()){
                    book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"), rs.getDouble("price"), rs.getString("author"));
                }
            }catch (SQLException e){
                logger.error(e);
                throw new DaoException("Book not found",e);
            }


        return book;
    }

    @Override
    public void updateBook(int id, Book book) throws DaoException {
        try{
            PreparedStatement preparedStatement=connection.prepareStatement("update book set isbn=?,title=?,price=?,author=? where id=?");
            preparedStatement.setString(1,book.getIsbn());
            preparedStatement.setString(2,book.getTitle());
            preparedStatement.setDouble(3,book.getPrice());
            preparedStatement.setString(4,book.getAuthor());
            preparedStatement.setInt(5,id);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            logger.error(e);
            throw new DaoException("Book not found",e);
        }

    }
}
