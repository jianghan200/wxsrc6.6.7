package com.tencent.mm.aa;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.wcdb.DefaultDatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteOpenHelper;

public final class b
  extends SQLiteOpenHelper
{
  public b()
  {
    super(ad.getContext(), g.Ei().cachePath + "AuxData.db", null, 1, new DefaultDatabaseErrorHandler(true));
    setWriteAheadLoggingEnabled(true);
  }
  
  public final void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.enableWriteAheadLogging();
    paramSQLiteDatabase.setAsyncCheckpointEnabled(true);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AvatarFile (fileName TEXT PRIMARY KEY, accessTime INTEGER) WITHOUT ROWID");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */