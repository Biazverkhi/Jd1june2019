package Jd1june2019.Lection11.Task4;


public class Test {
    public static void main(String[] args) {
        Black_Box  box = new Black_Box();
        box.addNumberInBlack_Box();
        int kMin=3;//порядоок от минимального числа
        int nMax=4;//поядок от максимального
        int minK=box.kMin(kMin);
        System.out.printf("%d число от минимального является %d\n", kMin, minK);
        int maxN=box.nMax(nMax);
        System.out.printf("%d число от максимального является %d", nMax, maxN);

    }


}
