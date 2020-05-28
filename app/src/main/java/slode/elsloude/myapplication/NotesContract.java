package slode.elsloude.myapplication;
import android.provider.BaseColumns;

public class NotesContract {
   public static final class NotesEntry implements BaseColumns {
        static final String TABLE_NAME = "notes";
        static final String COLUMN_TITLE = "title";
        static final String COLUMN_DESCRIPTION = "description";
        static final String COLUMN_DAYOFWEEK = "dayofweek";
        static final String COLUMN_PRIORITY = "priority";

        static final String TYPE_TEXT = "TEXT";
        static final String TYPE_INTEGER = "INTEGER";

        static final String CREATE_COMMAND = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
                "(" + _ID + " " + TYPE_INTEGER + " PRIMARY KEY AUTOINCREMENT, " + COLUMN_TITLE +
                " " + TYPE_TEXT + ", " + COLUMN_DESCRIPTION + " " + TYPE_TEXT + ", " + COLUMN_DAYOFWEEK +
                " " + TYPE_INTEGER + ", " + COLUMN_PRIORITY + " " + TYPE_INTEGER + ")";

        static final String DROP_COMMAND = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
