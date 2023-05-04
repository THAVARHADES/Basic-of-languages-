class new1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}