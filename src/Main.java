public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 30);
        heroes[1] = new Medic(120, 20);
        heroes[2] = new Warrior(150, 40);

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
