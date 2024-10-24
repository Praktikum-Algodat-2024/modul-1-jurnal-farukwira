class Easy {
    String nama;
    String skill;
    int umur;
    String hobi;
    Easy next;

    public Easy(String nama, String skill, int umur, String hobi) {
        this.nama = nama;
        this.skill = skill;
        this.umur = umur;
        this.hobi = hobi;
        this.next = null;
    }
}

class Viral {
    private Easy head; 

    public Viral() {  
        head = null;
    }

    public void addFirst(Easy newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Easy newNode) {
        if (head == null) {
            head = newNode; 
        } else {
            Easy current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Belum ada manusianya");
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Belum ada manusianya");
            return;
        }

        if (head.next == null) {
            head = null; 
        } else {
            Easy current = head;
            while (current.next.next != null) {
                current = current.next; 
            }
            current.next = null; 
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Belum ada manusianya");
            return;
        }

        Easy current = head;
        while (current != null) {
            System.out.println("Nama: " + current.nama);
            System.out.println("Skill: " + current.skill);
            System.out.println("Umur: " + current.umur);
            System.out.println("Hobi: " + current.hobi);
            System.out.println();
            current = current.next;
        }
    }

    public void addPerson(String nama, String skill, int umur, String hobi, boolean isFirst) {
        Easy newNode = new Easy(nama, skill, umur, hobi);
        if (isFirst) {
            addFirst(newNode);
        } else {
            addLast(newNode);
        }
    }

    public static void main(String[] args) {
        Viral list = new Viral();

        list.addPerson("Vadel", "Dance Geterrr", 19, "Dance", false);
        list.addPerson("Loli", "ATM berjalan", 16, "Liat Vadel", false);
        list.addPerson("Agus", "Agus sakit", 35, "Donasi", false);
        list.addPerson("Fufu Fafa", "Roasting", 30, "Buka kaskus", false);
        list.addPerson("Kak Gem", "Kasih paham", 32, "Bernafas", true);

        list.display();

        list.deleteLast();
        list.deleteFirst();

        System.out.println("\nSetelah menghapus Kak Gem dan Fufu Fafa");
        System.out.println();
        list.display();
    }
}
