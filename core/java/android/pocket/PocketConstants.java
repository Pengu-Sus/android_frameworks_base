package android.pocket;

import android.content.res.Resources;

/**
 * This class contains global pocket setup constants.
 * @author Carlo Savignano
 * @hide
 */

public class PocketConstants {

    public static final boolean DEBUG = false;
    public static final boolean DEBUG_SPEW = false;

    /**
     * Whether to use proximity sensor to evaluate pocket state.
     */
    public static final boolean ENABLE_PROXIMITY_JUDGE = true;

    /**
     * Whether to use light sensor to evaluate pocket state.
     */
    public static final boolean ENABLE_LIGHT_JUDGE = Resources.getSystem().getBoolean(
        com.android.internal.R.bool.config_pocketModeLightSensorSupported);


}
