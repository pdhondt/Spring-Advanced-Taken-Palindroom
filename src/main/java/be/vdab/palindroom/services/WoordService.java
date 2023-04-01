package be.vdab.palindroom.services;

public class WoordService {
    public boolean isPalindroom(String woord) {
        var woordOmgekeerd = new StringBuilder(woord).reverse();
        return woordOmgekeerd.compareTo(new StringBuilder(woord)) == 0;
    }
}
