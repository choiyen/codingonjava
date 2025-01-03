package _06_abstract.Practice;

public class Main {
    public static void main(String[] args) {
        Beak beak = new Beak("백영희", "XYZ 고등학교", 20220002, 18);
        Kim kim = new Kim("김철수", "ABC 고등학교", 20220001, 17);

        beak.todo();
        kim.todo();

    }
}
