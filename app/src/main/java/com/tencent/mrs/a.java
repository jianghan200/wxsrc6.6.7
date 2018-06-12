package com.tencent.mrs;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.d.b;
import com.tencent.matrix.d.b.a;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.sqlitelint.c;
import com.tencent.sqlitelint.e;
import com.tencent.sqlitelint.e.b.a;
import com.tencent.sqlitelint.h;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  public static com.tencent.mrs.b.a uZP;
  
  public static void onDestroy()
  {
    if (!MatrixReport.isInstalled())
    {
      b.e("Matrix.Manager", "onDestroy, matrix report is not installed, just return", new Object[0]);
      return;
    }
    MatrixReport.with().onDestroy();
  }
  
  private static final class a
    implements c
  {
    private final SQLiteDatabase mDb;
    
    a(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mDb = paramSQLiteDatabase;
    }
    
    public final void execSQL(String paramString)
    {
      if (!this.mDb.isOpen())
      {
        x.w("Matrix.Manager", "rawQuery db close", new Object[0]);
        return;
      }
      this.mDb.execSQL(paramString);
    }
    
    public final Cursor rawQuery(String paramString, String... paramVarArgs)
    {
      if (!this.mDb.isOpen())
      {
        x.w("Matrix.Manager", "rawQuery db close", new Object[0]);
        return null;
      }
      return this.mDb.rawQuery(paramString, paramVarArgs);
    }
  }
  
  public static final class b
  {
    private static Map<String, Boolean> uZQ = new HashMap();
    private static h uZR;
    
    public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong)
    {
      if (!com.tencent.matrix.a.isInstalled()) {}
      do
      {
        do
        {
          return;
          if (uZR != null) {
            break;
          }
          localObject1 = (h)com.tencent.matrix.a.tg().g(h.class);
          uZR = (h)localObject1;
        } while (localObject1 == null);
      } while (!uZR.tw());
      x.v("Matrix.Manager", "onSQLExecuted  String sql:%s,  timeCost:%d", new Object[] { paramString, Long.valueOf(paramLong) });
      Object localObject1 = paramSQLiteDatabase.getPath();
      Object localObject2;
      if (!uZQ.containsKey(localObject1))
      {
        paramSQLiteDatabase = new com.tencent.sqlitelint.e.a((String)localObject1, new a.a(paramSQLiteDatabase));
        localObject2 = new e.b.a();
        ((e.b.a)localObject2).vno |= 0x2;
        ((e.b.a)localObject2).vno &= 0xFFFFFFFE;
        paramSQLiteDatabase = new com.tencent.sqlitelint.a.a.a(paramSQLiteDatabase, ((e.b.a)localObject2).cGg());
        paramSQLiteDatabase.acL("AvoidAutoIncrementChecker");
        paramSQLiteDatabase.acL("AvoidSelectAllChecker");
        paramSQLiteDatabase.acL("ExplainQueryPlanChecker");
        paramSQLiteDatabase.acL("RedundantIndexChecker");
        paramSQLiteDatabase.acL("WithoutRowIdBetterChecker");
        paramSQLiteDatabase.acL("PreparedStatementBetterChecker");
        localObject2 = paramSQLiteDatabase.vnX.vnk;
        if (!((String)localObject2).endsWith("EnMicroMsg.db")) {
          break label286;
        }
        paramSQLiteDatabase.vnZ = com.tencent.mm.plugin.report.e.a.enmicromsg_sqlite_lint_whitelist;
        localObject2 = uZR;
        if (((h)localObject2).tw()) {
          break label326;
        }
        SLog.i("Matrix.SQLiteLintPlugin", "addConcernedDB isPluginStarted not", new Object[0]);
      }
      int i;
      for (;;)
      {
        uZQ.put(localObject1, Boolean.valueOf(true));
        paramSQLiteDatabase = uZR;
        i = (int)paramLong;
        if (paramSQLiteDatabase.tw()) {
          break label457;
        }
        SLog.i("Matrix.SQLiteLintPlugin", "notifySqlExecution isPluginStarted not", new Object[0]);
        return;
        label286:
        if (((String)localObject2).endsWith("AppBrandComm.db"))
        {
          paramSQLiteDatabase.vnZ = com.tencent.mm.plugin.report.e.a.appbrandcomm_sqlite_lint_whitelist;
          break;
        }
        if (!((String)localObject2).endsWith("SnsMicroMsg.db")) {
          break;
        }
        paramSQLiteDatabase.vnZ = com.tencent.mm.plugin.report.e.a.snsmicromsg_sqlite_lint_whitelist;
        break;
        label326:
        Object localObject3 = ((h)localObject2).vnw;
        if (com.tencent.sqlitelint.a.a.a.a(paramSQLiteDatabase) != null)
        {
          String str = com.tencent.sqlitelint.a.a.a.a(paramSQLiteDatabase).vnk;
          if (!TextUtils.isEmpty(str))
          {
            i = 0;
            while (i < ((com.tencent.sqlitelint.a.a)localObject3).vnW.size())
            {
              if (str.equals(com.tencent.sqlitelint.a.a.a.a(paramSQLiteDatabase).vnk)) {
                break label411;
              }
              i += 1;
            }
            ((com.tencent.sqlitelint.a.a)localObject3).vnW.add(paramSQLiteDatabase);
          }
        }
        label411:
        localObject3 = paramSQLiteDatabase.vnX.vnk;
        e.a(((h)localObject2).mContext, paramSQLiteDatabase.vnX, paramSQLiteDatabase.vnY);
        e.dD((String)localObject3, paramSQLiteDatabase.vnZ);
        e.v((String)localObject3, paramSQLiteDatabase.voa);
      }
      label457:
      e.M((String)localObject1, paramString, i);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mrs/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */