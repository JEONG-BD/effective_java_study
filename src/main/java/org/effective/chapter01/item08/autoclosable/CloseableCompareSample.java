package org.effective.chapter01.item08.autoclosable;

import java.io.Closeable;
import java.io.IOException;

public class CloseableCompareSample {
    public static void main(String[] args) throws Exception {
        try(CloseableSample colseableSample = new CloseableSample();
            AutoCloseableSample autoCloseableSample  = new AutoCloseableSample()) {

        } catch (IOException e) {
        }
        catch (Exception e) {
        }
    }
}

class AutoCloseableSample implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseable");

    }
}

class CloseableSample implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closeable");
    }
}
