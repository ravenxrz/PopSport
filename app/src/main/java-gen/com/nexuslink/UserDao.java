package com.nexuslink;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.nexuslink.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table USER.
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UId = new Property(1, Integer.class, "uId", false, "U_ID");
        public final static Property UName = new Property(2, String.class, "uName", false, "U_NAME");
        public final static Property UGender = new Property(3, String.class, "uGender", false, "U_GENDER");
        public final static Property UImg = new Property(4, String.class, "uImg", false, "U_IMG");
        public final static Property UHeight = new Property(5, Float.class, "uHeight", false, "U_HEIGHT");
        public final static Property UWeight = new Property(6, Float.class, "uWeight", false, "U_WEIGHT");
        public final static Property UFansNum = new Property(7, Integer.class, "uFansNum", false, "U_FANS_NUM");
        public final static Property UExp = new Property(8, Integer.class, "uExp", false, "U_EXP");
        public final static Property UHistoryStep = new Property(9, Long.class, "uHistoryStep", false, "U_HISTORY_STEP");
        public final static Property UHistoryMileage = new Property(10, Long.class, "uHistoryMileage", false, "U_HISTORY_MILEAGE");
        public final static Property UBestRecordStep = new Property(11, Long.class, "uBestRecordStep", false, "U_BEST_RECORD_STEP");
        public final static Property UBestRecordMileage = new Property(12, Long.class, "uBestRecordMileage", false, "U_BEST_RECORD_MILEAGE");
        public final static Property UAchievements = new Property(13, String.class, "uAchievements", false, "U_ACHIEVEMENTS");
        public final static Property UFollowedNum = new Property(14, Integer.class, "uFollowedNum", false, "U_FOLLOWED_NUM");
    };


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USER' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'U_ID' INTEGER," + // 1: uId
                "'U_NAME' TEXT," + // 2: uName
                "'U_GENDER' TEXT," + // 3: uGender
                "'U_IMG' TEXT," + // 4: uImg
                "'U_HEIGHT' REAL," + // 5: uHeight
                "'U_WEIGHT' REAL," + // 6: uWeight
                "'U_FANS_NUM' INTEGER," + // 7: uFansNum
                "'U_EXP' INTEGER," + // 8: uExp
                "'U_HISTORY_STEP' INTEGER," + // 9: uHistoryStep
                "'U_HISTORY_MILEAGE' INTEGER," + // 10: uHistoryMileage
                "'U_BEST_RECORD_STEP' INTEGER," + // 11: uBestRecordStep
                "'U_BEST_RECORD_MILEAGE' INTEGER," + // 12: uBestRecordMileage
                "'U_ACHIEVEMENTS' TEXT," + // 13: uAchievements
                "'U_FOLLOWED_NUM' INTEGER);"); // 14: uFollowedNum
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer uId = entity.getUId();
        if (uId != null) {
            stmt.bindLong(2, uId);
        }
 
        String uName = entity.getUName();
        if (uName != null) {
            stmt.bindString(3, uName);
        }
 
        String uGender = entity.getUGender();
        if (uGender != null) {
            stmt.bindString(4, uGender);
        }
 
        String uImg = entity.getUImg();
        if (uImg != null) {
            stmt.bindString(5, uImg);
        }
 
        Float uHeight = entity.getUHeight();
        if (uHeight != null) {
            stmt.bindDouble(6, uHeight);
        }
 
        Float uWeight = entity.getUWeight();
        if (uWeight != null) {
            stmt.bindDouble(7, uWeight);
        }
 
        Integer uFansNum = entity.getUFansNum();
        if (uFansNum != null) {
            stmt.bindLong(8, uFansNum);
        }
 
        Integer uExp = entity.getUExp();
        if (uExp != null) {
            stmt.bindLong(9, uExp);
        }
 
        Long uHistoryStep = entity.getUHistoryStep();
        if (uHistoryStep != null) {
            stmt.bindLong(10, uHistoryStep);
        }
 
        Long uHistoryMileage = entity.getUHistoryMileage();
        if (uHistoryMileage != null) {
            stmt.bindLong(11, uHistoryMileage);
        }
 
        Long uBestRecordStep = entity.getUBestRecordStep();
        if (uBestRecordStep != null) {
            stmt.bindLong(12, uBestRecordStep);
        }
 
        Long uBestRecordMileage = entity.getUBestRecordMileage();
        if (uBestRecordMileage != null) {
            stmt.bindLong(13, uBestRecordMileage);
        }
 
        String uAchievements = entity.getUAchievements();
        if (uAchievements != null) {
            stmt.bindString(14, uAchievements);
        }
 
        Integer uFollowedNum = entity.getUFollowedNum();
        if (uFollowedNum != null) {
            stmt.bindLong(15, uFollowedNum);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // uId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // uGender
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // uImg
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // uHeight
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // uWeight
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // uFansNum
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // uExp
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // uHistoryStep
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // uHistoryMileage
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // uBestRecordStep
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // uBestRecordMileage
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // uAchievements
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14) // uFollowedNum
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setUName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUGender(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUImg(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUHeight(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setUWeight(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setUFansNum(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setUExp(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setUHistoryStep(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setUHistoryMileage(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setUBestRecordStep(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setUBestRecordMileage(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setUAchievements(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setUFollowedNum(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
