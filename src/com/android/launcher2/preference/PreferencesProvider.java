package com.android.launcher2.preference;

import android.content.Context;
import android.content.SharedPreferences;

public final class PreferencesProvider {
    public static final String PREFERENCES_KEY = "com.android.launcher_preferences";

    public static final String PREFERENCES_CHANGED = "preferences_changed";

    public static class Interface {
        public static class Homescreen {
            public static int getNumberHomescreens(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getInt("ui_homescreen_screens", 5);
            }
            public static int getDefaultHomescreen(Context context, int def) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getInt("ui_homescreen_default_screen", def + 1) - 1;
            }
            public static boolean getShowSearchBar(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_homescreen_general_search", true);
            }
            public static boolean getAutoRotate(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_general_orientation", false);
            }
        }
    }

    public static class Dock {
        public static class Indicator {
            public static boolean getShowDockDivider(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_dock_indicator_background", true);
            }
        }
    }

        public static class Drawer {

        }

        public static class Icons {

        }
}
