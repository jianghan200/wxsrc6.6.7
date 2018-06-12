package com.tencent.mm.plugin.sns.f;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;

public final class e
{
  public static void MN(String paramString)
  {
    x.i("MicroMsg.SnsABTestStrategy", "dump id " + paramString);
    paramString = com.tencent.mm.model.c.c.Jx().fJ(paramString);
    if (!paramString.isValid()) {
      x.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
    }
    if (paramString.ckq() != null) {
      x.i("MicroMsg.SnsABTestStrategy", "dump feed abtest " + paramString.field_rawXML);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */