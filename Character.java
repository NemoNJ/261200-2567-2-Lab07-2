public class Character {
   private int health;
   private int stamina;
   private final int maxHealth;
   private final int  maxStamina;
    public Character(int health,int stamina){
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health  = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with "+this.health+" health and "+this.stamina+" stamina.");
    }
   public int getHealth(){
       return this.health;
   }
   public int getStamina(){
       return this.stamina;
   }
   //setter แบบต่างๆ
   public void swingSword(){
       this.stamina -= 10;
       if(this.stamina >= 0 ){
           System.out.println("Character swings sword. Stamina is now "+this.stamina);
       } else{
           this.stamina = 0;
           System.out.println("Your character needs to cool down.");
       }
   }
   public void takeDamage(int damageAmount){
       this.health -= damageAmount;
       if(this.health >= 0){
           System.out.println("Character takes "+damageAmount+" damage. Health is now "+this.health+".");
       }else{
           this.health = 0;
           System.out.println("Character is dead.");
       }
   }
   public void rest(){
       this.health = maxHealth;
       this.stamina = maxStamina;
       System.out.println("Character has rested. Health and stamina restored to maximum.");
       System.out.println("Character's health: "+this.health+", stamina: "+this.stamina+".");
   }
}
