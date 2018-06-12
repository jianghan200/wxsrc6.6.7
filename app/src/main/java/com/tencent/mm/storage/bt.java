package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.ec;
import com.tencent.mm.sdk.e.i;
import java.util.concurrent.ConcurrentHashMap;

public final class bt
  extends i<ec>
{
  public static final String[] diD = { i.a(bs.dhO, "TablesVersion") };
  public h dCZ;
  
  public bt(h paramh)
  {
    super(paramh, bs.dhO, "TablesVersion", ec.ciG);
    this.dCZ = paramh;
  }
  
  public final ConcurrentHashMap<Integer, String> cnb()
  {
    Cursor localCursor = this.dCZ.b("select * from TablesVersion", new String[0], 0);
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    if (localCursor == null) {
      return localConcurrentHashMap;
    }
    try
    {
      if (localCursor.moveToNext()) {
        localConcurrentHashMap.putIfAbsent(Integer.valueOf(localCursor.getInt(0)), localCursor.getString(1));
      }
      return localConcurrentHashMap1;
    }
    finally
    {
      localCursor.close();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */