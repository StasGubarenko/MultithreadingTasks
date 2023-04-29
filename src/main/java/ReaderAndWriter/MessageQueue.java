package ReaderAndWriter;

import java.util.LinkedList;

public class MessageQueue {
    //Общий ресурс, которому будут иметь 2 потока
    static LinkedList<Integer> queue = new LinkedList<>();
}
