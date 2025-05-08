class Transaction {
    public void transferAmount(double transferAmount, long phoneNumber) {
        System.out.println(transferAmount + " rupees transferred to phone number " + phoneNumber);
    }

    public void transferAmount(double transferAmount, int accountNumber) {
        System.out.println(transferAmount + " rupees transferred to account number " + accountNumber);
    }

    public void transferAmount(double transferAmount, String qrCode) {
        System.out.println(transferAmount + " rupees transferred to QR code " + qrCode);
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.transferAmount(10000.45, 12345);
        t.transferAmount(10000.45, "likky");
        t.transferAmount(10000.45, 12345998L);
    }
}