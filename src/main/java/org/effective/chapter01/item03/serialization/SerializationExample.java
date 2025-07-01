package org.effective.chapter01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book){
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))){
            out.writeObject(book);
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
    private Book deserialize(){
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))){
            return (Book) in.readObject();
        }catch (IOException | ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "effective java", "author1", LocalDate.of(2024, 1, 1));
        book.setNumberOfSold(200);

        System.out.println(book);

        SerializationExample example = new SerializationExample();
        example.serialize(book);
        Book deserializedBook = example.deserialize();
        System.out.println(deserializedBook);
    }


}
