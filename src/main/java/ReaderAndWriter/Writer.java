package ReaderAndWriter;

public class Writer extends Thread {
    @Override
    public void run() {
        synchronized (MessageQueue.queue) {
            System.out.println("The writer begins to work");
            for (int i = 0; i < 10; i++) {
                MessageQueue.queue.add(i);
                System.out.println("The writer wrote a message to the message queue " + MessageQueue.queue.getLast());
            }
            System.out.println("The writer has finished writing messages to the message queue");
        }
    }
}
