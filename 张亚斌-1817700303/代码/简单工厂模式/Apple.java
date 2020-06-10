interface Fruit {
    void eat();
}
 
class Apple implements Fruit {
    public void eat() {
        System.out.println("Apple");
    }
}
 
class Orange implements Fruit {
    public void eat() {
        System.out.println("Orange");
    }
} 
class Factory {
    public static Fruit getInstance(String fruitName) {
        Fruit f = null;
        if ("Apple".equals(fruitName)) { 
            f = new Apple();
        }
        if ("Orange".equals(fruitName)) {
            f = new Orange();
        }
        return f;
    }
}
 
class Hello {
    public static void main(String[] a) {
        Fruit f = Factory.getInstance("Orange");
        f.eat();
    }
}  