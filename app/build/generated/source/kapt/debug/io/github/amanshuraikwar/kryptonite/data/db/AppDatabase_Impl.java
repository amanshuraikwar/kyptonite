package io.github.amanshuraikwar.kryptonite.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AvailableCurrencyDao _availableCurrencyDao;

  private volatile ExchangeRateDao _exchangeRateDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AvailableCurrency` (`code` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`code`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ExchangeRate` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `sourceCurrencyCode` TEXT NOT NULL, `currencyCode` TEXT NOT NULL, `exchangeRate` REAL NOT NULL, `lastUpdated` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '66b33b89d8a8a4ea7f28d2abf9341deb')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `AvailableCurrency`");
        _db.execSQL("DROP TABLE IF EXISTS `ExchangeRate`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAvailableCurrency = new HashMap<String, TableInfo.Column>(2);
        _columnsAvailableCurrency.put("code", new TableInfo.Column("code", "TEXT", true, 1));
        _columnsAvailableCurrency.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAvailableCurrency = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAvailableCurrency = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAvailableCurrency = new TableInfo("AvailableCurrency", _columnsAvailableCurrency, _foreignKeysAvailableCurrency, _indicesAvailableCurrency);
        final TableInfo _existingAvailableCurrency = TableInfo.read(_db, "AvailableCurrency");
        if (! _infoAvailableCurrency.equals(_existingAvailableCurrency)) {
          throw new IllegalStateException("Migration didn't properly handle AvailableCurrency(io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity).\n"
                  + " Expected:\n" + _infoAvailableCurrency + "\n"
                  + " Found:\n" + _existingAvailableCurrency);
        }
        final HashMap<String, TableInfo.Column> _columnsExchangeRate = new HashMap<String, TableInfo.Column>(5);
        _columnsExchangeRate.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsExchangeRate.put("sourceCurrencyCode", new TableInfo.Column("sourceCurrencyCode", "TEXT", true, 0));
        _columnsExchangeRate.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0));
        _columnsExchangeRate.put("exchangeRate", new TableInfo.Column("exchangeRate", "REAL", true, 0));
        _columnsExchangeRate.put("lastUpdated", new TableInfo.Column("lastUpdated", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExchangeRate = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExchangeRate = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExchangeRate = new TableInfo("ExchangeRate", _columnsExchangeRate, _foreignKeysExchangeRate, _indicesExchangeRate);
        final TableInfo _existingExchangeRate = TableInfo.read(_db, "ExchangeRate");
        if (! _infoExchangeRate.equals(_existingExchangeRate)) {
          throw new IllegalStateException("Migration didn't properly handle ExchangeRate(io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity).\n"
                  + " Expected:\n" + _infoExchangeRate + "\n"
                  + " Found:\n" + _existingExchangeRate);
        }
      }
    }, "66b33b89d8a8a4ea7f28d2abf9341deb", "1a582bdbfdc0668cf638c5527ac1e52f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "AvailableCurrency","ExchangeRate");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `AvailableCurrency`");
      _db.execSQL("DELETE FROM `ExchangeRate`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AvailableCurrencyDao availableCurrencyDao() {
    if (_availableCurrencyDao != null) {
      return _availableCurrencyDao;
    } else {
      synchronized(this) {
        if(_availableCurrencyDao == null) {
          _availableCurrencyDao = new AvailableCurrencyDao_Impl(this);
        }
        return _availableCurrencyDao;
      }
    }
  }

  @Override
  public ExchangeRateDao exchangeRateDao() {
    if (_exchangeRateDao != null) {
      return _exchangeRateDao;
    } else {
      synchronized(this) {
        if(_exchangeRateDao == null) {
          _exchangeRateDao = new ExchangeRateDao_Impl(this);
        }
        return _exchangeRateDao;
      }
    }
  }
}
