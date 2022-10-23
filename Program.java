import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        LinkedList_ first = new LinkedList_();
        int num = 0;

        System.out.println("1. Заполнить список \n"+
                "2. Добавить новый элемент \n"+
                "3. Добавить новый элемент в начало\n"+
                "4. Удалить элемент по значению \n"+
                "5. Удалить элемент по позиции (индексу) \n"+
                "6. Удалить элемент по позиции и вывести его на экран \n"+
                "7. Получить элемент по индексу \n"+
                "8. Вывести длинну списка \n"+
                "9. Вывести список\n"+
                "10. Удалить список \n"+
                "11. Выход\n");


        while(true){
            System.out.print("Введите номер операции: ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            if (num == 1){
                System.out.print("Введите размер списка: ");
                int size = in.nextInt();
                System.out.print("Введите список: \n");
                for (int i = 0; i < size; i++) {
                    int a = in.nextInt();
                    first.add(a);
                }
            }
            if (num == 2){
                System.out.print("Введите новый элемент: ");
                int new_el = in.nextInt();
                first.add(new_el);
            }
            if (num == 3){
                System.out.print("Введите новый элемент: ");
                int new_el = in.nextInt();
                first.addToInception(new_el);
            }
            if (num == 4){
                System.out.print("Введите значение элемента, который хотите удалить: ");
                int del_el = in.nextInt();
                first.delete(del_el);
            }
            if(num == 5){
                System.out.print("Введите индекс элемента, который хотите удалить: ");
                int del_el = in.nextInt();
                first.deleteAtPosition(del_el);
            }
            if(num == 6){
                System.out.print("Введите индекс элемента, который хотите удалить и вывести: ");
                int del_el = in.nextInt();
                first.printAndDelete(del_el);
            }
            if(num == 7) {
                System.out.print("Введите индекс элемента, который хотите вывести: ");
                int el = in.nextInt();
                first.get_elem(el);}
            if (num == 8){ System.out.println(first.sizeList());}
            if (num == 9){ first.show();}
            if (num == 10){ first.deleteAll();}
            if (num == 11){ break;}
        }
    }
}