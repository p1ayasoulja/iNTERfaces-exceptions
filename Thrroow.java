class ThrowOne {
    static void catchi() throws IllegalAccessException {
        System.out.println("Test!");
        throw new IllegalAccessException("Demo");

    }


    public static void main(String[] args) {
        try {
            catchi();

        } catch (IllegalAccessException e) {
            System.out.println("Illegal! " + e);
        }
    }
}
