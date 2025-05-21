package model;

/**
 * @author Vincent Velthuizen
 * Een object van dit type moet kunnen aangeven of het op een oppervlak past
 */
public interface ToelaatbaarInOppervlak {

    boolean pastInOppervlak(double lengte, double breedte);

}
