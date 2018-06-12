package com.tencent.mm.plugin.address.e;

import android.content.Intent;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static Intent b(b paramb)
  {
    if (paramb == null)
    {
      x.e("MicroMsg.AddrUtil", "addressObj == null");
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("nationalCode", paramb.eYf);
    localIntent.putExtra("userName", paramb.eYd);
    localIntent.putExtra("telNumber", paramb.eYe);
    localIntent.putExtra("addressPostalCode", paramb.eYb);
    localIntent.putExtra("proviceFirstStageName", paramb.eXY);
    localIntent.putExtra("addressCitySecondStageName", paramb.eXZ);
    localIntent.putExtra("addressCountiesThirdStageName", paramb.eYa);
    localIntent.putExtra("addressDetailInfo", paramb.eYc);
    return localIntent;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */