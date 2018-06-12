package com.tencent.sqlitelint.behaviour.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.sqlitelint.util.SLog;

public enum c
{
  private volatile a vnT;
  
  private c() {}
  
  public final SQLiteDatabase getDatabase()
  {
    if (this.vnT == null) {
      throw new IllegalStateException("getIssueStorage db not ready");
    }
    return this.vnT.getWritableDatabase();
  }
  
  public final void initialize(Context paramContext)
  {
    if (this.vnT == null) {
      try
      {
        if (this.vnT == null) {
          this.vnT = new a(paramContext);
        }
        return;
      }
      finally {}
    }
  }
  
  private static final class a
    extends SQLiteOpenHelper
  {
    a(Context paramContext)
    {
      super("SQLiteLintInternal.db", null, 1);
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      int i = 0;
      SLog.i("SQLiteLint.SQLiteLintOwnDatabase", "onCreate", new Object[0]);
      paramSQLiteDatabase.execSQL(a.vnP);
      while (i < a.vnQ.length)
      {
        paramSQLiteDatabase.execSQL(a.vnQ[i]);
        i += 1;
      }
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/behaviour/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */