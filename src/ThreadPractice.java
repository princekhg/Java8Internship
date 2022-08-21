public class ThreadPractice {
    private void firstMethod(){
        System.out.println("From Method A");
    }
    private void secondMethod(){
        System.out.println("From Second Method");
    }

    public static void main(String[] args) {
        ThreadPractice tp = new ThreadPractice();
        tp.firstMethod();
        tp.secondMethod();
        System.out.println("First Main Method");
    }
}
