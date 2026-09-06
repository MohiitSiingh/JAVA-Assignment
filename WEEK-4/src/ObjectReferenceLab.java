class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean setScore(int score) {
        if (score < 0) {
            return false;
        }

        this.score = score;
        return true;
    }

    @Override
    public String toString() {
        return "ScoreBox{score=" + score + "}";
    }
}

public class ObjectReferenceLab {

    public static void addBonus(ScoreBox box, int bonus) {
        if (box != null && bonus >= 0) {
            box.setScore(box.getScore() + bonus);
        }
    }

    public static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(999);
        System.out.println("Inside replaceLocally(): " + box);
    }

    public static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }
}