package ua.lviv.iot.TablewareStore;

import ua.lviv.iot.TablewareStore.models.Pans;
import ua.lviv.iot.TablewareStore.models.Plates;
import ua.lviv.iot.TablewareStore.models.Store;

public class Main {
    public static void main (String[] args) {
        Store WoW = new Store("WoW","Shevchenka, 34 Lviv ");
        Plates deep = new Plates("deep plates,", " white", 110, 24);
        Pans aluminium = new Pans(" aluminium pans,", " yellow,", 5.5, "yes");

        System.out.println(WoW);
        System.out.println(deep);
        System.out.println(aluminium);

    }
}
