public class GitHubProfile {
    public static void main(String[] args) {
        String username = "Ak4ssH";
        String githubStatsImage = "https://github-readme-stats.vercel.app/api/top-langs/?username=" + username + "&theme=blue-green";
        String profileViewsImage = "https://komarev.com/ghpvc/?username=" + username;

        String aboutMeSection = "<i>\n" +
                "  Name: Akash Tiwari\n" +
                "  - Nationality: Indian.\n" +
                "  - Currently Residing in Kolkata, India.\n" +
                "  ![ Ak4ssH ](" + githubStatsImage + ")\n" +
                "</i>";

        String programmingLanguagesSection = "## Programming Languages I've Learned :\n" +
                "![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)\n" +
                "![Java](https://img.shields.io/badge/Java-000000?style=for-the-badge&logo=java&logoColor=white)";

        String languagesToLearnSection = "## Languages I'm Trying To learn:\n" +
                "![GO](https://img.shields.io/badge/go-%2300ADD8.svg?style=for-the-badge&logo=go&logoColor=white)\n" +
                "![HTML](https://img.shields.io/badge/HTML5-f34F26?style=for-the-badge&logo=html5&logoColor=white)\n" +
                "![Js](https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E)";

        String socialMediaSection = "## <i>You Can Find Me At</i>\n" +
                "[![Github](https://img.shields.io/badge/-Github-181717?style=for-the-badge&logo=Github&logoColor=white)](https://github.com/Ak4ssH)\n" +
                "[![Instagram](https://img.shields.io/badge/Instagram-E44dsada5F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ak4sh.arc)\n" +
                "[![Telegram](https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white)](https://t.me/TheVenomXD)";

        String statsSection = " -   <h4 align=\"center\">Stats 📊</h4>\n" +
                "[![My github stats](https://github-readme-stats.vercel.app/api?username=" + username + "&count_private=true&show_icons=true&theme=radical&include_all_commits=true&custom_title=Ak4ssH's+Github+Stats)](https://t.me/TheVenomXD)";

        // Combine all sections to create the profile
        String profile = "## Hi I'm Akash <img src=\"https://user-images.githubusercontent.com/1303154/88677602-1635ba80-d120-11ea-84d8-d263ba5fc3c0.gif\" width=\"28px\" alt=\"Whats Up\">\n" +
                "### About Me:\n" +
                aboutMeSection + "\n\n" +
                programmingLanguagesSection + "\n\n" +
                languagesToLearnSection + "\n\n" +
                profileViewsImage + "\n\n" +
                socialMediaSection + "\n\n" +
                statsSection;

        // Print the profile
        System.out.println(profile);
    }
}
