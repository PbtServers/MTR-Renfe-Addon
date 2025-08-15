package es.joseka.renfemtr.mod.data;

import org.mtr.core.data.Rail;
import org.mtr.mapping.holder.MapColor;
import org.mtr.mod.data.IGui;

public enum ExtendedRailType implements IGui {
    PINK(5, MapColor.getStoneGrayMapped(), false, true, true, Rail.Shape.QUADRATIC),
    DIRT(30, MapColor.getTerracottaBrownMapped(), false, true, true, Rail.Shape.QUADRATIC),
    CABLE_CAR(30, MapColor.getWhiteMapped(), false, true, true, Rail.Shape.CABLE),
    CABLE_CAR_STATION(2, MapColor.getWhiteMapped(), false, true, true, Rail.Shape.QUADRATIC),
    RUNWAY(300, MapColor.getPalePurpleMapped(), false, true, false, Rail.Shape.QUADRATIC);
    public final int speedLimit;
    public final int color;
    public final boolean isSavedRail;
    public final boolean canAccelerate;
    public final boolean hasSignal;
    public final Rail.Shape railShape;

    //private static final int ARGB_OPAQUE_MASK = 0xFF000000;

    ExtendedRailType(int speedLimit, MapColor mapColor, boolean isSavedRail, boolean canAccelerate, boolean hasSignal, Rail.Shape railShape) {
        this.speedLimit = speedLimit;
        this.color = mapColor.getColorMapped();
        this.isSavedRail = isSavedRail;
        this.canAccelerate = canAccelerate;
        this.hasSignal = hasSignal;
        this.railShape = railShape;
    }

    public static int getRailColor(Rail rail) {
        for (final ExtendedRailType railType : values()) {
                if (railType.speedLimit == Math.max(rail.getSpeedLimitKilometersPerHour(false), rail.getSpeedLimitKilometersPerHour(true))) {

                    return railType.color;
                }
            }
            return ARGB_BLACK;
    }
}
