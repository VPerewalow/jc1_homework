package part7.Task46;
class AgeException extends Exception {

    private int age;
    public AgeException(String message, int age) {
        super(message);
        this.age = age;
    }
}
class Age {
    public static int retirementAge(int age) throws AgeException {

        if (age < 60 ) throw new AgeException("NO pension", age);
        return age;
    }
}
