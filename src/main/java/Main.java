public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        {
            FormDate birthday = new FormDate();
            birthday.day = 13;
            birthday.month = 6;
            birthday.year = 1999;
        }
    }
}