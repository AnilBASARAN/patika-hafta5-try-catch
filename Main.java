import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int index;

        System.out.println(Arrays.toString(array));
        System.out.print("Array'den eleman seçmek için bir sayı girin:   ");
        index = input.nextInt();

                try {
                    // Hata yakalama try bloğu
                    int result = getElementIndex(array, index);
                    System.out.println("Dizinin " + index + ". indeksindeki eleman: " + result);
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Hata durumunda mesajı yazdırma
                    System.out.println("Hata mesajı: Belirtilen index dizinin boyutunun dışında!");
                }finally {
                    input.close();
                }
            }

            // Belirli bir indeksteki array elemanını döndüren metot
            public static int getElementIndex(int[] array, int index) {

                return array[index];
            }
        }
