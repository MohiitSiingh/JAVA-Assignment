class Profile {
    private String name;
    private int age;
    private double heightMetres;

    public Profile(String name, int age, double heightMetres) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        if (heightMetres <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightMetres() {
        return heightMetres;
    }

    @Override
    public String toString() {
        return "Profile{name='" + name +
                "', age=" + age +
                ", heightMetres=" + heightMetres + "}";
    }
}

public class TextProfile {

    public static Profile createProfile(
            String nameText,
            String ageText,
            String heightText) {

        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);

        return new Profile(nameText, age, height);
    }

    public static String convertValues(
            String name,
            int age,
            double height) {

        String nameValue = String.valueOf(name);
        String ageValue = Integer.toString(age);
        String heightValue = Double.toString(height);

        return nameValue + " | " + ageValue + " | " + heightValue;
    }
}