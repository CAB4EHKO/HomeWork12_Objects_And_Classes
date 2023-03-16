public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a = (Author) other;
        return firstName.equals(a.firstName) && lastName.equals(a.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
