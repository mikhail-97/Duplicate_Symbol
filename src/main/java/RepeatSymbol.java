public class RepeatSymbol {
    public static void main(String args[]){
        String str = "Hello";
        char[] array = str.toCharArray();
        System.out.println("Строка:" + str);
        System.out.print("Повторяющиеся символы в приведенной выше строке: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
    }
}

