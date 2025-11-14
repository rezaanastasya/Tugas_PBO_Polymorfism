class Payment {
    public void pay() {
        System.out.println("Melakukan pembayaran...");
    }
}

class Dana extends Payment {
    @Override
    public void pay() {
        System.out.println("Pembayaran melalui DANA berhasil.");
    }
}

class OVO extends Payment {
    @Override
    public void pay() {
        System.out.println("Pembayaran melalui OVO berhasil.");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new Dana();  // polymorphism
        Payment p2 = new OVO();   // polymorphism

        p1.pay();
        p2.pay();
    }
}
