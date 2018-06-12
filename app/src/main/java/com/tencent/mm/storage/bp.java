package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.j;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class bp
  extends com.tencent.mm.sdk.e.i<bo>
  implements j
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )" };
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(bo.dhO, "shakeverifymessage") };
  public e diF;
  
  public bp(e parame)
  {
    super(parame, bo.dhO, "shakeverifymessage", ciG);
    this.diF = parame;
  }
  
  public static long YT(String paramString)
  {
    if (paramString != null)
    {
      paramString = ((bp)((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcU()).cna();
      if (paramString == null) {}
    }
    for (long l1 = paramString.field_createtime + 1L;; l1 = 0L)
    {
      long l2 = bi.VE();
      if (l1 > l2) {
        return l1;
      }
      return l2;
    }
  }
  
  public final void YP(String paramString)
  {
    paramString = "svrid = '" + paramString + "'";
    int i = this.diF.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    x.i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = " + i);
  }
  
  public final bo[] Zp(String paramString)
  {
    x.d("MicroMsg.ShakeVerifyMessageStorage", "getLastShakeVerifyMessage");
    paramString = "select *, rowid from ShakeVerifyMessage  where sayhiuser = '" + bi.oU(paramString) + "' order by createtime DESC limit 3";
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      bo localbo = new bo();
      localbo.d(paramString);
      localArrayList.add(localbo);
    }
    paramString.close();
    if (localArrayList.size() == 0) {
      return null;
    }
    return (bo[])localArrayList.toArray(new bo[localArrayList.size()]);
  }
  
  public final boolean a(bo parambo)
  {
    if (parambo == null) {
      x.e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
    }
    while (!super.b(parambo)) {
      return false;
    }
    Xp(parambo.sKx);
    return true;
  }
  
  public final void aPm()
  {
    this.diF.delete(getTableName(), null, null);
  }
  
  public final int axd()
  {
    Cursor localCursor = this.diF.b("select count(*) from " + getTableName() + " where status != 4", null, 2);
    if (!localCursor.moveToFirst()) {
      localCursor.close();
    }
    int i;
    do
    {
      return 0;
      i = localCursor.getInt(0);
      localCursor.close();
    } while (i <= 0);
    return i;
  }
  
  public final bo cna()
  {
    Cursor localCursor = this.diF.b("SELECT * FROM " + getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null) {
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return null;
    }
    bo localbo = new bo();
    localbo.d(localCursor);
    localCursor.close();
    return localbo;
  }
  
  public final bo[] df(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      x.e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
    }
    ArrayList localArrayList;
    do
    {
      return null;
      paramString = "select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '" + bi.oU(paramString) + "' order by createTime DESC limit " + paramInt;
      paramString = this.diF.b(paramString, null, 2);
      localArrayList = new ArrayList();
      while (paramString.moveToNext())
      {
        bo localbo = new bo();
        localbo.d(paramString);
        localArrayList.add(localbo);
      }
      paramString.close();
    } while (localArrayList.size() == 0);
    return (bo[])localArrayList.toArray(new bo[localArrayList.size()]);
  }
  
  public final int getCount()
  {
    Cursor localCursor = this.diF.b("select count(*) from " + getTableName(), null, 2);
    if (!localCursor.moveToFirst()) {
      localCursor.close();
    }
    int i;
    do
    {
      return 0;
      i = localCursor.getInt(0);
      localCursor.close();
    } while (i <= 0);
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */