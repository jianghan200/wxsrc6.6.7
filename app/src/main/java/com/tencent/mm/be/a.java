package com.tencent.mm.be;

import android.content.Context;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bb;

public final class a
{
  public static boolean cbf()
  {
    String str2 = g.AT().getValue("EnableStrangerChat");
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = "0";
    }
    return "1".equals(str1);
  }
  
  public static void eF(Context paramContext)
  {
    if ((!cbf()) && (com.tencent.mm.az.d.SG().axd() > 0))
    {
      com.tencent.mm.bg.d.A(paramContext, "nearby", ".ui.NearbyFriendShowSayHiUI");
      return;
    }
    com.tencent.mm.bg.d.A(paramContext, "nearby", ".ui.NearbyFriendsUI");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/be/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */