class LinkedList_ {
    private Node head;

    public LinkedList_() {
        head = null;
    }

    class Node {
        private int m_data;
        private Node next;

        Node(int data) {
            m_data = data;
            next = null;
        }
    }

    //Добавление нового элемента в конец
    public void add(int data) {
        Node new_node = new Node(data);
        //new_node.next = null;
        Node _head = head;

        if (head == null) {
            head = new_node;
        } else {
            while (_head.next != null) {
                _head = _head.next;
            }
            _head.next = new_node;
        }
    }

    //Добавление элемента в начало
    public void addToInception(int data) {
        Node new_node = new Node(data);
        //Node _head = head;
        Node prev = null;
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    //Удаление по позиции
    public void deleteAtPosition(int index) {
        Node _head = head;
        Node prev = null;

        if (index == 0 && _head != null) {
            head = _head.next;
            System.out.println("Элемент "+index + " удалён");
        }

        int count = 0;
        while (_head != null) {
            if (count == index) {
                prev.next = _head.next;
                System.out.println("Элемент "+index + " удалён");
                break;
            } else {
                prev = _head;
                _head = _head.next;
                count++;
            }
        }

        if (_head == null) {
            System.out.println("Элемент "+index + " удалён");
        }
    }

    //Получить элемент по индексу
    public int get_elem(int index) {
        Node _head = head;

        if (head == null){
            System.out.println("Список пуст");
            return -1;
        }

        for (int i = 0; i < index; i++) {
            if (_head != null) {_head = _head.next;}
            else {return -1;}
        }

        if (_head != null) {
            System.out.println(_head.m_data);
            return _head.m_data;
        }
        else{
            System.out.println("Указанный индекс превышает длину списка");
            return -1;
        }

    }
    //Удаление по значению
    public boolean delete(int data) {
        Node previous = null;
        Node _head = head;
        //Node fact = head;
        // 1: Пустой список: ничего не делать.
        // 2: Один элемент: установить Previous = null.
        // 3: Несколько элементов:
        //    a: Удаляемый элемент первый.
        //    b: Удаляемый элемент в середине или конце.
        while (_head != null) {
            if (_head.m_data == data) {
                if (previous != null) {
                    previous.next = _head.next;
                } else {
                    _head = _head.next;
                }
                return true;
            }
            previous = _head;
            _head = _head.next;
        }
        return false;
    }

    //Удаление всех элементов
    public void deleteAll() {
        head = null;
        System.out.println("Список удалён");
    }

    //Удалить по позиции и вывести на экран
    public int printAndDelete(int index) {
        Node _head = head, prev = null;

        if (index == 0 && _head != null) {
            head = _head.next;
            System.out.println(_head.m_data);
            return _head.m_data;
        }

        int count = 0;
        while (_head != null) {
            if (count == index) {
                prev.next = _head.next;
                System.out.println(_head.m_data);
                return _head.m_data;
            } else {
                prev = _head;
                _head = _head.next;
                count++;
            }
        }

        if (_head == null) {
            System.out.println("position element not found");
        }
        return -1;
    }

    //Вывод списка на экран
    public void show() {
        Node _head = head;
        while (_head != null) {
            System.out.println(_head.m_data);
            _head = _head.next;
        }
    }

    //Размер списка
    public int sizeList(){
        Node _head = head;
        int count = 0;
        while (_head != null){
            count++;
            _head = _head.next;
        }
        return count;
    }
}