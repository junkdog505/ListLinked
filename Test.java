public class Test {
    public static void main(String[] args) {
        //TDAList<Integer> intList = new ListLinked<Integer>();
        ListOrderAsc <Integer> intList = new ListOrderAsc<Integer>();

        intList.insertFirst(20);
        System.out.println(intList);
        intList.insertFirst(6);
        System.out.println(intList);
        intList.insertFirst(50);
        System.out.println(intList);
        intList.insertFirst(33);
        System.out.println(intList);
        intList.insertFirst(2);
        System.out.println(intList);
        intList.insertFirst(41);
        System.out.println(intList);

        ListOrderAsc <String> strListAsc = new ListOrderAsc<String>();
        strListAsc.insertFirst("Edison");
        System.out.println(strListAsc);
        strListAsc.insertFirst("Cristian");
        System.out.println(strListAsc);
        strListAsc.insertFirst("Amézquita");
        System.out.println(strListAsc);
        strListAsc.insertFirst("Soto");
        System.out.println(strListAsc);
        System.out.println("10 esta ? " + intList.search(10));
        System.out.println("30 esta ? " + intList.search(30));
        System.out.println("Cristian esta?" + strListAsc.search("Cristian"));
    
        /* TDAList<String> stringList = new ListLinked<String>();
        stringList.insertFirst("Cristian");
        stringList.insertFirst("Amezquita");
        stringList.insertFirst("Edison");
        stringList.insertFirst("");
        System.out.println(stringList); */
    }
}
