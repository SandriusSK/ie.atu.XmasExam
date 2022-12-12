public class Trawler {
    public static void main(String[] args) {
        Ship Sandrius = new Ship();
        Sandrius.setName("Elizabeth");
        Sandrius.setBuild("2003");
        Sandrius.setCrew("196");

        System.out.println("There are sandrius adds" + Sandrius.getname());

        Trawler myCust = new Trawler("Elizabeth","2003","196",true);
}
