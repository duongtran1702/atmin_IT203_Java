package session1;

class Bai_3{
    static void main() {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        /*
         * BAN ĐẦU:
         * Stack:
         *   book1 -> tham chiếu đến Heap("Java Basic")
         *   book2 -> tham chiếu đến Heap("Python Intro")
         *
         * Heap:
         *   "Java Basic"
         *   "Python Intro"
         */

        // Biến tạm
        String temp = book1;

        /*
         * SAU DÒNG NÀY:
         * Stack:
         *   temp  -> "Java Basic"
         *   book1 -> "Java Basic"
         *   book2 -> "Python Intro"
         *
         * Heap: KHÔNG THAY ĐỔI
         *   "Java Basic"
         *   "Python Intro"
         */

        book1 = book2;

        /*
         * SAU DÒNG NÀY:
         * Stack:
         *   book1 -> "Python Intro"
         *   book2 -> "Python Intro"
         *   temp  -> "Java Basic"
         *
         * Heap: KHÔNG THAY ĐỔI
         */

        book2 = temp;

        /*
         * KẾT QUẢ CUỐI:
         * Stack:
         *   book1 -> "Python Intro"
         *   book2 -> "Java Basic"
         *   temp  -> "Java Basic"
         *
         * Heap:
         *   "Java Basic"
         *   "Python Intro"
         */

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}

