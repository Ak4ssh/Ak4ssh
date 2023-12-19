import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GitHubProfileGenerator {
    public static void main(String[] args) {
        // Replace these values with your information
        String name = "Akash";
        String fullName = "Akash Tiwari";
        String nationality = "Indian";
        String location = "Kolkata, India";
        String githubUsername = "Ak4ssH";
        String instagramUsername = "ak4sh.arc";
        String telegramUsername = "TheVenomXD";

        try {
            // Read the template file
            String templateContent = Files.readString(Path.of("README_TEMPLATE.md"));

            // Replace placeholders with actual data
            String readmeContent = templateContent
                    .replace("{name}", name)
                    .replace("{fullName}", fullName)
                    .replace("{nationality}", nationality)
                    .replace("{location}", location)
                    .replace("{githubUsername}", githubUsername)
                    .replace("{instagramUsername}", instagramUsername)
                    .replace("{telegramUsername}", telegramUsername);

            // Write the final README.md
            Files.writeString(Path.of("README.md"), readmeContent, StandardOpenOption.CREATE);
            System.out.println("README.md generated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
