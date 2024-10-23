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
    Easy head;
    
    public Viral() {
        this.head = null;
    }

    public void addFirst(String nama, String skill, int umur, String hobi) {
        Easy newNode = new Easy(nama, skill, umur, hobi);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String nama, String skill, int umur, String hobi) {
        Easy newNode = new Easy(nama, skill, umur, hobi);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Easy current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
}