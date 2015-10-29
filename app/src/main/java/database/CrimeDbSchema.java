package database;

/**
 * Created by KJ on 10/27/15.
 */
public class CrimeDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "data";
            public static final String SOLVED = "solved";
        }

    }
}