public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage) {
        super(health, damage, "HEALING");
        this.healPoints = 100;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность: HEALING WAVE");
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
        System.out.println("Очки лечения увеличены до: " + healPoints);
    }
}
