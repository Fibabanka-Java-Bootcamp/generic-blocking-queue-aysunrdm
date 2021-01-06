

public class Main {

    public static void main(String[] args) {

        GenericBlockingQueue<String> StringQueue = new GenericBlockingQueue<String>();

        GenericBlockingQueue<Integer> IntegerQueue = new GenericBlockingQueue<Integer>();

        StringQueue.add("Kodluyoruz");
        StringQueue.add("Fibabanka");
        StringQueue.add("Java");
        StringQueue.add("Bootcamp");


        System.out.println("\n" + "String Queue first element: " + StringQueue.peek());
        System.out.println( StringQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("String Queue first element: " + StringQueue.peek());
        System.out.println( StringQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("String Queue first element: " + StringQueue.peek());
        System.out.println( StringQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("String Queue first element: " + StringQueue.peek());
        System.out.println( StringQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("String Queue first element: " + StringQueue.peek());
        System.out.println("Kuyruk boş..."  + "\n");


        for(int i=0; i<5;i++) {

            IntegerQueue.add(i);

        }

        
        System.out.println("\n" + "Integer Queue first element: " + IntegerQueue.peek());
        System.out.println( IntegerQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Integer Queue first element: " + IntegerQueue.peek());
        System.out.println( IntegerQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Integer Queue first element: " + IntegerQueue.peek());
        System.out.println( IntegerQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Integer Queue first element: " + IntegerQueue.peek());
        System.out.println( IntegerQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Integer Queue first element: " + IntegerQueue.peek());
        System.out.println( IntegerQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Integer Queue first element: " + IntegerQueue.peek());
        System.out.println("Kuyruk boş..." + "\n");

        }

    }