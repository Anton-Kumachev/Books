package chap11;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        } catch (Exception se) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец main");
    }

    static void doRisky(String test) throws Exception {
        System.out.println("Началоопасного метода");
        if ("yes".equals(test)) {
            throw new Exception();
        }
        System.out.println("Конец метода");
        return;
    }
}
