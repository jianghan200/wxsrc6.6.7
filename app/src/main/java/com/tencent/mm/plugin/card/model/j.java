package com.tencent.mm.plugin.card.model;

import com.tencent.mm.sdk.e.e;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(i.dhO, "CardQrCodeConfi") };
  private e diF;
  
  public j(e parame)
  {
    super(parame, i.dhO, "CardQrCodeConfi", null);
    this.diF = parame;
  }
  
  public final i xn(String paramString)
  {
    i locali = new i();
    locali.field_card_id = paramString;
    if (b(locali, new String[0])) {
      return locali;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */