package io.github.amanshuraikwar.kryptonite.data.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExchangeRateDao_Impl implements ExchangeRateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfExchangeRateEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfExchangeRateEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFor;

  public ExchangeRateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExchangeRateEntity = new EntityInsertionAdapter<ExchangeRateEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ExchangeRate`(`id`,`sourceCurrencyCode`,`currencyCode`,`exchangeRate`,`lastUpdated`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeRateEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSourceCurrencyCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSourceCurrencyCode());
        }
        if (value.getCurrencyCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCurrencyCode());
        }
        stmt.bindDouble(4, value.getExchangeRate());
        final String _tmp;
        _tmp = TypeConverters.fromOffsetDateTime(value.getLastUpdated());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfExchangeRateEntity = new EntityDeletionOrUpdateAdapter<ExchangeRateEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ExchangeRate` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeRateEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllFor = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ExchangeRate WHERE sourceCurrencyCode = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final ExchangeRateEntity exchangeRateEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExchangeRateEntity.insert(exchangeRateEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<ExchangeRateEntity> exchangeRateEntities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExchangeRateEntity.insert(exchangeRateEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll(final List<ExchangeRateEntity> exchangeRateEntities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExchangeRateEntity.handleMultiple(exchangeRateEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllFor(final String source) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFor.acquire();
    int _argIndex = 1;
    if (source == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, source);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllFor.release(_stmt);
    }
  }

  @Override
  public List<ExchangeRateEntity> getAll() {
    final String _sql = "SELECT * FROM ExchangeRate";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSourceCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceCurrencyCode");
      final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
      final int _cursorIndexOfExchangeRate = CursorUtil.getColumnIndexOrThrow(_cursor, "exchangeRate");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final List<ExchangeRateEntity> _result = new ArrayList<ExchangeRateEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExchangeRateEntity _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpSourceCurrencyCode;
        _tmpSourceCurrencyCode = _cursor.getString(_cursorIndexOfSourceCurrencyCode);
        final String _tmpCurrencyCode;
        _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
        final float _tmpExchangeRate;
        _tmpExchangeRate = _cursor.getFloat(_cursorIndexOfExchangeRate);
        final OffsetDateTime _tmpLastUpdated;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLastUpdated);
        _tmpLastUpdated = TypeConverters.toOffsetDateTime(_tmp);
        _item = new ExchangeRateEntity(_tmpId,_tmpSourceCurrencyCode,_tmpCurrencyCode,_tmpExchangeRate,_tmpLastUpdated);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ExchangeRateEntity> getFor(final String source) {
    final String _sql = "SELECT * FROM ExchangeRate WHERE sourceCurrencyCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (source == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, source);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSourceCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceCurrencyCode");
      final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
      final int _cursorIndexOfExchangeRate = CursorUtil.getColumnIndexOrThrow(_cursor, "exchangeRate");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final List<ExchangeRateEntity> _result = new ArrayList<ExchangeRateEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExchangeRateEntity _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpSourceCurrencyCode;
        _tmpSourceCurrencyCode = _cursor.getString(_cursorIndexOfSourceCurrencyCode);
        final String _tmpCurrencyCode;
        _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
        final float _tmpExchangeRate;
        _tmpExchangeRate = _cursor.getFloat(_cursorIndexOfExchangeRate);
        final OffsetDateTime _tmpLastUpdated;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLastUpdated);
        _tmpLastUpdated = TypeConverters.toOffsetDateTime(_tmp);
        _item = new ExchangeRateEntity(_tmpId,_tmpSourceCurrencyCode,_tmpCurrencyCode,_tmpExchangeRate,_tmpLastUpdated);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
