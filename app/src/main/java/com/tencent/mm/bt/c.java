package com.tencent.mm.bt;

import android.database.Cursor;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class c
{
  private static int index = 0;
  private static boolean on = false;
  private static g.a tdp = null;
  private static long tdq = 0L;
  private static int tdr = 0;
  
  static void a(String paramString, Cursor paramCursor, long paramLong)
  {
    if (!on) {
      return;
    }
    long l = tdp.Ad();
    Object localObject1 = "Thread:[" + Thread.currentThread().getId() + "," + Thread.currentThread().getName() + "]";
    Object localObject2 = (String)localObject1 + "[" + index + "][" + l + "]";
    localObject1 = localObject2;
    if (paramLong != 0L) {
      localObject1 = (String)localObject2 + "[INTRANS]";
    }
    localObject2 = localObject1;
    if (paramCursor != null)
    {
      q(paramCursor);
      localObject2 = (String)localObject1 + "[cuCnt:" + tdr + ",cuTime:" + tdq + "]";
    }
    paramString = (String)localObject2 + "[" + paramString + "]--";
    x.v("MicroMsg.dbtest", paramString + bi.cjd());
  }
  
  static void begin()
  {
    if (!on) {
      return;
    }
    tdp = new g.a();
    index += 1;
  }
  
  public static void k(Exception paramException)
  {
    if (on) {
      x.e("MicroMsg.DKTest", "exception:%s", new Object[] { bi.i(paramException) });
    }
  }
  
  private static void q(Cursor paramCursor)
  {
    if (!on) {}
    while (paramCursor == null) {
      return;
    }
    tdr = paramCursor.getCount();
    g.a locala = new g.a();
    int i = 0;
    while (i < tdr)
    {
      paramCursor.moveToPosition(i);
      i += 1;
    }
    paramCursor.moveToPosition(-1);
    tdq = locala.Ad();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */