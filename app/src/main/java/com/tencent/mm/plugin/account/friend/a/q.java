package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;

public final class q
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  private h dCZ;
  
  public q(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(p paramp)
  {
    if (pz(paramp.getUsername()))
    {
      paramp.bWA = -1;
      ContentValues localContentValues = paramp.wH();
      if (this.dCZ.update("invitefriendopen", localContentValues, "username=?", new String[] { paramp.getUsername() }) <= 0) {}
    }
    do
    {
      return true;
      return false;
      paramp.bWA = -1;
      paramp = paramp.wH();
    } while ((int)this.dCZ.insert("invitefriendopen", "username", paramp) != -1);
    return false;
  }
  
  public final boolean pz(String paramString)
  {
    paramString = "select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"" + bi.oU(paramString) + "\"";
    paramString = this.dCZ.b(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */