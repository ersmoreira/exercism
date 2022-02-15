class RaindropConverter {

    String convert(int number) {
        String aux = "";

        if (number % 3 == 0) {
            aux += "Pling";
        }
        if (number % 5 == 0) {
            aux += "Plang";
        }
        if (number % 7 == 0) {
            aux += "Plong";
        }

        if (aux.isEmpty()){
            aux = Integer.toString(number);
        }

        return aux;
    }

}
