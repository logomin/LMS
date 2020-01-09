package Lesson13WrapperClasses.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Integer i1 = 1;
        Integer i2 = Integer.valueOf(2);
        Integer i3 = new Integer(3);
        Integer i4 = Integer.parseInt("4");

        Short sh1 = 1;
        Short sh2 = Short.valueOf("8");
        Short sh3 = new Short("6");
        Short sh4 = Short.parseShort("4");

        Long l1 = 10000000000000L;
        Long l2 = Long.valueOf(100000l);
        Long l3 = new Long(5555555555l);
        Long l4 = Long.parseLong("158658445");

        Byte b1 = 5;
        Byte b2 = Byte.valueOf("8");
        Byte b3 = new Byte("5");
        Byte b4 = Byte.parseByte("15");

        Float fl1 = 48.5f;
        Float fl2 = Float.valueOf(58f);
        Float fl3 = new Float(54f);
        Float fl4 = Float.parseFloat("48.58");

        Double d1 = 48d;
        Double d2 = Double.valueOf(48d);
        Double d3 = new Double(57d);
        Double d4 = Double.parseDouble("597");

        Character ch1 = 'd';
        Character ch2 = Character.valueOf('d');
        Character ch3 = new Character('e');

        Boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = new Boolean(false);
        Boolean bool4 = Boolean.parseBoolean("false");

        //3

        Double db5 = 1584878.5d;
        byte b5 = db5.byteValue();
        short sh5 = db5.shortValue();
        int i5 = db5.intValue();
        float f5 = db5.floatValue();
        long l5 = db5.longValue();

        //4
        Double db6 = 0.0d;
        Double nanValue = db6/db6;
        Double infinityValue = db5/db6;
        System.out.println(nanValue);
        System.out.println(infinityValue);

        if (Double.isNaN(nanValue)) System.out.println("Переменная nanValue == NaN");
        if (Double.isNaN(infinityValue)) System.out.println("Переменная infinityValue == NaN");

        if (Double.isInfinite(nanValue)) System.out.println("Переменная nanValue == Infinity");
        if (Double.isInfinite(infinityValue)) System.out.println("Переменная infinityValue == Infinity");

        //5

        Long lg5 = 120l;
        Long lg6 = 120l;
        System.out.println(lg5 == lg6);

        Long lg7 = 1200l;
        Long lg8 = 1200l;
        System.out.println(lg7 == lg8);

    }
}
