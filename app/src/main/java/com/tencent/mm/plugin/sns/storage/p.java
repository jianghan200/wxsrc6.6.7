package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.g.c.dy;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

public final class p
  extends dy
{
  protected static c.a dhO;
  public int nJc;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "logtime";
    locala.sKA.put("logtime", "LONG");
    localStringBuilder.append(" logtime LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "offset";
    locala.sKA.put("offset", "INTEGER default '0' ");
    localStringBuilder.append(" offset INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "logsize";
    locala.sKA.put("logsize", "INTEGER");
    localStringBuilder.append(" logsize INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "errorcount";
    locala.sKA.put("errorcount", "INTEGER");
    localStringBuilder.append(" errorcount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "value";
    locala.sKA.put("value", "BLOB");
    localStringBuilder.append(" value BLOB");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void d(Cursor paramCursor)
  {
    try
    {
      super.d(paramCursor);
      this.nJc = ((int)this.sKx);
      return;
    }
    catch (Exception paramCursor)
    {
      String str = paramCursor.getMessage();
      x.e("MicroMsg.SnsKvReport", "error " + str);
      if ((str != null) && (str.contains("Unable to convert"))) {
        af.byt().bAR();
      }
      try
      {
        throw paramCursor;
      }
      catch (Exception paramCursor)
      {
        x.printErrStackTrace("MicroMsg.SnsKvReport", paramCursor, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */