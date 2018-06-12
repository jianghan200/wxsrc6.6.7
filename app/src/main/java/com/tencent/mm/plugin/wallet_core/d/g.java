package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends i<y>
{
  public static final String[] diD = { i.a(y.dhO, "WalletLuckyMoney") };
  public static Map<String, y> eBb = new HashMap();
  private e diF;
  
  public g(e parame)
  {
    super(parame, y.dhO, "WalletLuckyMoney", null);
    this.diF = parame;
  }
  
  public final y Pk(String paramString)
  {
    paramString = this.diF.rawQuery("select * from WalletLuckyMoney where mNativeUrl=?", new String[] { paramString });
    if (paramString == null) {
      return null;
    }
    if (paramString.getCount() == 0)
    {
      paramString.close();
      return null;
    }
    paramString.moveToFirst();
    y localy = new y();
    localy.d(paramString);
    paramString.close();
    return localy;
  }
  
  public final boolean a(y paramy)
  {
    if ((paramy != null) && (eBb.containsKey(paramy.field_mNativeUrl))) {
      eBb.put(paramy.field_mNativeUrl, paramy);
    }
    return super.a(paramy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */