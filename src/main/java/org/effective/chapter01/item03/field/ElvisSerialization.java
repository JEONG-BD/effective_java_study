package org.effective.chapter01.item03.field;

import java.io.*;

public class ElvisSerialization {

    public static void main(String[] args) {
        try(ObjectOutput output = new ObjectOutputStream(new FileOutputStream("elvis.obj"))){
            output.writeObject(Elvis.INSTANCE);
        } catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("elvis.obj"))){
            Elvis elvis3 = (Elvis) input.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
