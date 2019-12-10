package mylib;


public class Example {
    public static void main(String[] args) {
        if(args.length >= 1){
            checkFormat(args[0],args[1]);
        }
        if(args[2] != null && args[3]!=null){
            switch (args[2]){
                case"/a":
                    break;
                case"/o":
                    delete(args[1],args[3]);
                    break;
            }
        }
    }
    public static void checkFormat(String format, String value){
        Boolean result = format.chars().distinct().allMatch(x -> value.contains(String.valueOf((char)x)));
        if (result) {
            return;
        }
        System.out.println("Error format");
    }
    public static Integer parserToInt(String integer){
        try {
            return Integer.parseInt(integer);
        }catch (Exception e){
            return 0;
        }
    }
    public static String rotate(String value, int nbRotato, Boolean directionRight){
        for(int i = 0; i < nbRotato; i++){
            value = shift(value,directionRight);
        }
        return value;
    }
    public static String shift(String s, Boolean directionRight){
        if (directionRight) {
            return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
        } else {
            return s.substring(1)+s.charAt(0);
        }
    }
    public static void delete(String value, String deleted){
        System.out.println(value.replaceAll(deleted,""));
    }

}
