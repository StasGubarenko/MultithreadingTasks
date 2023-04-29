package ReaderAndWriter;

public class Reader extends Thread{
    @Override
    public void run() {
        synchronized (MessageQueue.queue) {
            System.out.println("The reader is going to read from the message queue");
            for (int i = 0; i < 10; i++) {
                System.out.println("Reader are reading " + MessageQueue.queue.pollFirst());
            }
            System.out.println("The reader has finished reading messages from the message queue");
        }
    }
}
