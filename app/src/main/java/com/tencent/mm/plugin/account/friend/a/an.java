package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class an
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS qqgroup ( grouopid int PRIMARY KEY,membernum int,weixinnum int,insert_time int,lastupdate_time int,needupdate int,updatekey text,groupname text,reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )" };
  public final h dCZ;
  
  public an(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(am paramam)
  {
    boolean bool;
    ContentValues localContentValues;
    if (paramam != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localContentValues = paramam.XS();
      if (localContentValues.size() > 0) {
        break label36;
      }
      x.e("MicroMsg.QQGroupStorage", "update failed, no values set");
    }
    label36:
    while (this.dCZ.update("qqgroup", localContentValues, "grouopid= ?", new String[] { paramam.eLo }) <= 0)
    {
      return false;
      bool = false;
      break;
    }
    doNotify();
    return true;
  }
  
  public final am jf(int paramInt)
  {
    am localam = null;
    Cursor localCursor = this.dCZ.b("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup  where grouopid = " + paramInt, null, 2);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localam = new am();
      localam.d(localCursor);
    }
    localCursor.close();
    return localam;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */