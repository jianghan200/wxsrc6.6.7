package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.xm;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class f
  extends i<e>
{
  public static final String[] diD = { i.a(e.dhO, "FreeWifiLog"), "CREATE INDEX IF NOT EXISTS idx_FreeWifiLog_key  on FreeWifiLog  (  id )" };
  public static LinkedHashMap<String, Class> jlO = new f.1();
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.dhO, "FreeWifiLog", null);
  }
  
  public final boolean a(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "save. id=%s, protocolNumber=%d, logContent=%s, createTime=%d", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, Long.valueOf(paramLong) });
    if (m.isEmpty(paramString1)) {
      return false;
    }
    Cursor localCursor = rawQuery("select * from FreeWifiLog where id = '" + paramString1 + "'", new String[0]);
    try
    {
      e locale = new e();
      locale.field_id = paramString1;
      locale.field_protocolNumber = paramInt;
      locale.field_logContent = paramString2;
      locale.field_createTime = paramLong;
      if (localCursor.getCount() == 0)
      {
        bool = b(locale);
        x.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "insert ret" + bool);
        return bool;
      }
      boolean bool = c(locale, new String[0]);
      x.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "update ret" + bool);
      return bool;
    }
    catch (Exception paramString1)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiLogStorage", m.h(paramString1));
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final LinkedList<xm> aPo()
  {
    Cursor localCursor = rawQuery("select id, protocolNumber, logContent, createTime from FreeWifiLog", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    while ((localCursor != null) && (localCursor.moveToNext()))
    {
      xm localxm = new xm();
      localxm.id = localCursor.getString(0);
      localxm.jkI = localCursor.getInt(1);
      localxm.rDq = localCursor.getString(2);
      localxm.rDr = localCursor.getLong(3);
      localLinkedList.add(localxm);
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */