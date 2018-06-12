package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class c
  extends i<b>
{
  public static final String[] diD = { i.a(b.dhO, "appattach") };
  e diF;
  
  public c(e parame)
  {
    super(parame, b.dhO, "appattach", null);
    this.diF = parame;
  }
  
  public final b SR(String paramString)
  {
    b localb = new b();
    localb.field_mediaSvrId = paramString;
    if (b(localb, new String[] { "mediaSvrId" })) {}
    while (b(localb, new String[] { "mediaId" })) {
      return localb;
    }
    return null;
  }
  
  public final b fH(long paramLong)
  {
    b localb = new b();
    localb.field_msgInfoId = paramLong;
    if (b(localb, new String[] { "msgInfoId" })) {
      return localb;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */