public class Main {

    public static void main(String[] args) {
       //Se da un sir de numere ordonate crescator.
        //Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
        int[] a={1,2,3,7,10,70};
        int n=10;
        for (int i = 0; i <a.length ; i++){
          if(a[i]==n) {
              System.out.println("Numarul exista in sir si se afla pe pozitia " + (i + 1));
              i = a.length;
          }
          else if (i==a.length -1) {
              System.out.println("-1");

          }

        }

    }
}
