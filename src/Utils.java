import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Utils {
    public Utils() {
    }

    public static Object add(Object from ,Class to) throws NoSuchFieldException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object to2 = to.newInstance();
        for (Field field:from.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                field.setAccessible(true);
                Field fieldFrom = from.getClass().getDeclaredField(field.getName());
                fieldFrom.setAccessible(true);
                Object value = fieldFrom.get(from);
                Field field3 = to.getDeclaredField(field.getName());
                field3.setAccessible(true);
                field3.set(to2,value);
            }
        }
        return to2;
    }

    }







