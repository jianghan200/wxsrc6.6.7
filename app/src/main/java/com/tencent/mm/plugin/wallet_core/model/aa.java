package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.model.bv.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class aa
{
  static ArrayList<j> iOD = null;
  private static aa prc = null;
  bv.a hTD = new aa.1(this);
  
  public static boolean a(j paramj)
  {
    if (paramj == null)
    {
      x.e("MicroMsg.WalletPushNotifyManager", "hy: the callback for registering is null. register failed");
      return false;
    }
    if (iOD == null) {
      iOD = new ArrayList();
    }
    iOD.add(paramj);
    return true;
  }
  
  public static boolean b(j paramj)
  {
    if (iOD == null)
    {
      x.e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
      return false;
    }
    iOD.remove(paramj);
    return true;
  }
  
  public static aa bPg()
  {
    if (prc == null) {
      prc = new aa();
    }
    return prc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */