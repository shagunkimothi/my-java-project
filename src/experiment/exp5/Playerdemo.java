package experiment.exp5;
// supper class
// Superclass: Player
class Player {
    String name;
    int age;
    String position;

    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Common Methods
    public void play() {
        System.out.println(name + " is playing in position: " + position);
    }

    public void train() {
        System.out.println(name + " is training hard.");
    }
}

// Subclass: Cricket Player
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is batting/bowling in a Cricket match.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing in the nets.");
    }
}

// Subclass: Football Player
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is dribbling and scoring in a Football match.");
    }

    @Override
    public void train() {
        System.out.println(name + " is doing agility drills on the field.");
    }
}

// Subclass: Hockey Player
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is maneuvering the hockey stick on the field.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing penalty shots.");
    }
}

// Main Class
public class Playerdemo {
    public static void main(String[] args) {
        // Creating objects of different player types
        Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 34, "Batsman");
        Football_Player footballer = new Football_Player("Cristiano Ronaldo", 39, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");

        // Calling methods
        cricketer.play();
        cricketer.train();

        footballer.play();
        footballer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}

