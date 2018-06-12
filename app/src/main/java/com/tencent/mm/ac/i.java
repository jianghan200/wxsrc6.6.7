package com.tencent.mm.ac;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.sdk.e.i<g>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(g.dhO, "BizKF") };
  public com.tencent.mm.sdk.e.e diF;
  
  public i(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, g.dhO, "BizKF", null);
    this.diF = parame;
    parame.fV("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
    parame.fV("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
  }
  
  public static boolean a(g paramg)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramg != null)
    {
      bool1 = bool2;
      if (System.currentTimeMillis() - paramg.field_updateTime >= 86400000L) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private boolean b(g paramg)
  {
    if ((paramg == null) || (bi.oW(paramg.field_openId)) || (bi.oW(paramg.field_brandUsername)))
    {
      x.w("MicroMsg.BizKFStorage", "wrong argument");
      return false;
    }
    ContentValues localContentValues = paramg.wH();
    if (this.diF.replace("BizKF", g.dhO.sKz, localContentValues) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", new Object[] { paramg.field_openId, paramg.field_brandUsername, Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final int e(LinkedList<g> paramLinkedList)
  {
    if (paramLinkedList.size() <= 0)
    {
      x.e("MicroMsg.BizKFStorage", "null kfs");
      return 0;
    }
    if ((this.diF instanceof h)) {}
    for (long l = ((h)this.diF).dO(Thread.currentThread().getId());; l = 0L)
    {
      paramLinkedList = paramLinkedList.iterator();
      int i = 0;
      if (paramLinkedList.hasNext())
      {
        g localg = (g)paramLinkedList.next();
        if ((localg == null) || (!b(localg))) {
          break label132;
        }
        i += 1;
      }
      label132:
      for (;;)
      {
        break;
        if ((this.diF instanceof h)) {
          com.tencent.mm.kernel.g.Ei().dqq.gp(l);
        }
        x.i("MicroMsg.BizKFStorage", "insertOrUpdateBizKFs %d", new Object[] { Integer.valueOf(i) });
        return i;
      }
    }
  }
  
  public final g kQ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Cursor localCursor = this.diF.a("BizKF", null, "openId=?", new String[] { paramString }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.BizKFStorage", "get null with openId:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new g();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
  
  public final g kR(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Cursor localCursor = this.diF.a("BizKF", null, "brandUsername = ? order by kfType desc ", new String[] { paramString }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.BizKFStorage", "get null with brandUsername:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new g();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */