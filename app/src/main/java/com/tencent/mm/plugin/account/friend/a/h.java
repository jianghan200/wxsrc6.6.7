package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import junit.framework.Assert;

public final class h
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS facebookfriend ( fbid long  PRIMARY KEY , fbname text  , fbimgkey int  , status int  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , sex int  , personalcard int  , province text  , city text  , signature text  , alias text  , type int  , email text  ) " };
  public com.tencent.mm.bt.h dCZ;
  
  public h(com.tencent.mm.bt.h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean Xw()
  {
    return this.dCZ.fV("facebookfriend", "delete from facebookfriend");
  }
  
  public final boolean a(g paramg)
  {
    boolean bool;
    Object localObject;
    if (paramg.bWA == -1)
    {
      bool = true;
      Assert.assertTrue("Func Set always conv_flag == flag_all", bool);
      long l = paramg.csC;
      localObject = "select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.fbid = \"" + bi.oU(String.valueOf(l)) + "\"";
      localObject = this.dCZ.b((String)localObject, null, 2);
      bool = ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
      if (bool) {
        break label120;
      }
      paramg.bWA = -1;
      paramg = paramg.wH();
      if ((int)this.dCZ.insert("facebookfriend", "fbid", paramg) == -1) {
        break label118;
      }
    }
    label118:
    label120:
    int i;
    do
    {
      return true;
      bool = false;
      break;
      return false;
      localObject = paramg.wH();
      i = this.dCZ.update("facebookfriend", (ContentValues)localObject, "fbid=?", new String[] { paramg.csC });
      if (i > 0) {
        doNotify();
      }
    } while (i > 0);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */