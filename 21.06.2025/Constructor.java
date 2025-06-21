class Car {
    String model;

    Car(String m) {
        model = m;
    }

    void show() {
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car c = new Car("Tesla Model 3");
        c.show();
    }
}
