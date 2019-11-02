package io.github.amanshuraikwar.kryptonite.data.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AvailableCurrencyDao_Impl implements AvailableCurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAvailableCurrencyEntity;

  public AvailableCurrencyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAvailableCurrencyEntity = new EntityInsertionAdapter<AvailableCurrencyEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AvailableCurrency`(`code`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AvailableCurrencyEntity value) {
        if (value.getCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void insert(final AvailableCurrencyEntity currencyEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAvailableCurrencyEntity.insert(currencyEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AvailableCurrencyEntity> currencyEntities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAvailableCurrencyEntity.insert(currencyEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<AvailableCurrencyEntity> getAll() {
    final String _sql = "SELECT * FROM AvailableCurrency";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<AvailableCurrencyEntity> _result = new ArrayList<AvailableCurrencyEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AvailableCurrencyEntity _item;
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item = new AvailableCurrencyEntity(_tmpCode,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
