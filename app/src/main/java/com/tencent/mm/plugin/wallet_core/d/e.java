package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.sdk.e.i;

public final class e
  extends i<t>
{
  public static final String[] diD = { i.a(t.dhO, "WalletFunciontList") };
  public com.tencent.mm.sdk.e.e diF;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, t.dhO, "WalletFunciontList", null);
    this.diF = parame;
  }
  
  public final void b(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    t localt = new t();
    localt.field_wallet_region = paramInt;
    localt.field_function_list = paramString1;
    localt.field_new_list = paramString2;
    localt.field_banner_list = paramString3;
    localt.field_type_name_list = paramString4;
    super.a(localt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */