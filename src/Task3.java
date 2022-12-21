public class Task3 {
    public static void sort(String[] names, String[] surnames){
        int posNames;
        int posSurnames;
        String tempNames;
        String tempSurnames;

        for(int i = 0; i < names.length; i++){
            posNames = i;
            posSurnames = i;

            for(int j = i + 1; j < names.length; j++){
                if(names[j].compareTo(names[posNames]) == 0){
                    if(surnames[j].compareTo(surnames[posSurnames]) < 0){
                        tempSurnames = surnames[j];
                        surnames[j] = surnames[posSurnames];
                        surnames[posSurnames] = tempSurnames;
                    }
                }
                if(names[j].compareTo(names[posNames]) < 0){
                    posNames = j;
                    posSurnames = j;
                }
            }
            tempNames = names[posNames];
            tempSurnames = surnames[posSurnames];
            names[posNames] = names[i];
            names[i] = tempNames;
            surnames[posSurnames] = surnames[i];
            surnames[i] = tempSurnames;
        }
    }

    public static void display(String[] names, String[] surnames){

        System.out.println();
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
            System.out.print(surnames[i] + " ");
            System.out.print("," + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        String[] names = new String[]{"Egor", "Artiom", "Egor", "Vlad", "Igor", "Ivan", "Kirill"};
        String[] surnames = new String[]{"Anufriev", "Abikenov", "Kalinchuk", "Ilyin", "Loginov", "Minin", "Fomichev"};

        display(names, surnames);
        sort(names, surnames);
        display(names, surnames);
    }
}
