package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak(String talk) {
        if (talk.equals("")) { 
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
        System.out.println(name + ": " + talk);
        }
    }

    public void run() {
        System.out.println(name + " juoksee kovaa vauhtia!");
    }
}
