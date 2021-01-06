

public class Main {

    public static void main(String[] args) {

        GenericBlockingQueue<String> StringQueue = new GenericBlockingQueue<String>();

        GenericBlockingQueue<Integer> IntegerQueue = new GenericBlockingQueue<Integer>();

        GenericBlockingQueue<Character> CharQueue = new GenericBlockingQueue<Character>();

        System.out.println("\n" + "String_____________________");

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
        

        System.out.println("Integer_____________________" + "\n");

        System.out.print("Integer Kuyruğa Eklenenler: ");

        for(int i=0; i<5;i++) {

            IntegerQueue.add(i);

            System.out.print( " -> " + i );

        }

        
        System.out.println("\n\n" + "Integer Queue first element: " + IntegerQueue.peek());
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
        System.out.println("Kuyruk boş..."+ "\n");



        System.out.println("Char_____________________" + "\n");

        CharQueue.add('A'); 
        CharQueue.add('Y');
        CharQueue.add('S');
        CharQueue.add('U');
        CharQueue.add('N');

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println( CharQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println( CharQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println( CharQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println(  CharQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println( CharQueue.poll() + " kuyruktan çıkartılıyor." + "\n");

        System.out.println("Char Queue first element: " +  CharQueue.peek());
        System.out.println("Kuyruk boş..."+ "\n");

        

        }

    }