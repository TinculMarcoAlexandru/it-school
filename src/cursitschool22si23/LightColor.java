package cursitschool22si23;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);
    private final String meaning;
    private final int duration;
    LightColor(String meaning, int duration) {
        this.meaning = meaning;
        this.duration = duration;
    }
    public String getMeaning() {
        return meaning;
    }
    public int getDuration() {
        return duration;
    }
    public void displayInfo() {
        System.out.println(this.name() + " -> " + meaning + " (" + duration + " seconds)");
    }
}