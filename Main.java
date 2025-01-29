public class Main {
    public static void main(String[] args) {
//        Character created with 100 health and 50 stamina.
        Character player_1 = new Character(100,50);
//        Character swings sword. Stamina is now 40.
        player_1.swingSword();
        player_1.swingSword();
        player_1.swingSword();
        player_1.swingSword();
        player_1.swingSword();
//        Character swings sword. Stamina is now 30.
//        Character swings sword. Stamina is now 20.
//        Character swings sword. Stamina is now 10.
//        Character swings sword. Stamina is now 0.
//        Your character needs to cool down.
        player_1.takeDamage(30);
        player_1.takeDamage(50);
        player_1.takeDamage(20);
        player_1.rest();
//        Character takes 30 damage. Health is now 70.
//        Character takes 50 damage. Health is now 20.
//        Character takes 20 damage. Health is now 0.
//        Character is dead.
//                Character has rested. Health and stamina restored to maximum.
//        Character's health: 100, stamina: 50.
    }
}
