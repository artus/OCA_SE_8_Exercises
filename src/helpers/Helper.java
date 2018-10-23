package src.helpers;

public class Helper {

    public static String GET_TYPE(Object any) {
        return any.getClass().getName();
    }

    public static String GET_TYPE(byte any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(short any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(int any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(long any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(float any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(double any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(boolean any) {
        return GET_TYPE((Object) any);
    }

    public static String GET_TYPE(char any) {
        return GET_TYPE((Object) any);
    }

}