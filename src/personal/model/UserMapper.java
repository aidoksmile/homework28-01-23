package personal.model;

public class UserMapper {
    public String map(User user, String reg) {
        return String.format("%s%s%s%s%s%s%s", user.getId(), reg, user.getFirstName(), reg, user.getLastName(), reg, user.getPhone());
    }

    public User map(String line) {
        // String[] lines = line.split(",; :");
        String[] lines = line.replace(",|;|:", " ").split(" ", 0);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}