package iList;
public class IListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new IListImpl<Integer>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("--------------------");
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(20));

        System.out.println("--------------------");

        System.out.println(list.lastIndexOf(50));

        IList<String> listOfCities = new IListImpl<String>();
        listOfCities.add("Berlin");
        listOfCities.add("Киев");
        listOfCities.add("Одесса");
        listOfCities.add("Львов");
        listOfCities.add("Харьков");

        System.out.println(listOfCities.size());
        System.out.println(listOfCities.isEmpty());

        for (String city : listOfCities) {
            System.out.println(city);
        }

        listOfCities.remove("Berlin");
        System.out.println(listOfCities.contains("Berlin"));

        System.out.println(listOfCities.indexOf("Киев"));

        listOfCities.clean();

        System.out.println(listOfCities.size());

    }
}