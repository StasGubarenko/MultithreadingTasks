package ReaderAndWriter;


/**
Написать приложение, в котором есть 2 потока: писатель и читатель,
 которые будут работать с общим ресурсом - очередью сообщений.
 Первоначально писатель начинает писать 10 сообщений в очередь сообщений.
 Как только писатель напишет 10 сообщений, читатель начинает их считывать.
 */
public class Main {

    public static void main(String[] args) {
        new Writer().start();
        new Reader().start();
    }
}
