package ocpjp.dumps.enums;

/**
 * Enum как внутренний класс всегда статический.
 */
public class InnerEnum {
    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
}

class OtherClass {
    InnerEnum.Direction field = InnerEnum.Direction.EAST;
}

