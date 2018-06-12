package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class k
  extends com.tencent.mm.sdk.e.j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS friend_ext ( username text  PRIMARY KEY , sex int  , personalcard int  , province text  , city text  , signature text  , reserved1 text  , reserved2 text  , reserved3 text  , reserved4 text  , reserved5 int  , reserved6 int  , reserved7 int  , reserved8 int  ) " };
  public h dCZ;
  
  public k(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean L(List<j> paramList)
  {
    if (paramList.size() <= 0) {
      return false;
    }
    bg localbg = new bg("MicroMsg.FriendExtStorage", "batchSetFriendExt transaction");
    localbg.addSplit("transation begin");
    long l = this.dCZ.dO(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        j localj = (j)paramList.get(i);
        if (localj != null) {
          a(localj);
        }
        i += 1;
      }
      bool = true;
    }
    catch (Exception paramList)
    {
      for (;;)
      {
        x.e("MicroMsg.FriendExtStorage", paramList.getMessage());
        boolean bool = false;
      }
    }
    this.dCZ.gp(l);
    localbg.addSplit("transation end");
    localbg.dumpToLog();
    doNotify();
    return bool;
  }
  
  public final boolean a(j paramj)
  {
    boolean bool1 = true;
    Object localObject = paramj.getUsername();
    localObject = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bi.oU((String)localObject) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    boolean bool2 = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (bool2) {
      if (paramj != null)
      {
        paramj = paramj.wH();
        if (paramj.size() <= 0) {
          break label158;
        }
      }
    }
    label158:
    for (int i = this.dCZ.update("friend_ext", paramj, "username=?", new String[] { "username" });; i = 0)
    {
      if (i > 0) {}
      for (;;)
      {
        doNotify();
        return bool1;
        bool1 = false;
        continue;
        if (paramj != null)
        {
          paramj.bWA = -1;
          paramj = paramj.wH();
          if ((int)this.dCZ.insert("friend_ext", "username", paramj) != -1) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */