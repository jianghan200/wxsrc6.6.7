package com.tencent.mm.plugin.sns.storage;

import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class y
  extends i<x>
{
  public static final String[] diD = { i.a(x.dhO, "UxCanvasInfo") };
  
  public y(e parame)
  {
    this(parame, x.dhO, "UxCanvasInfo");
  }
  
  private y(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
  }
  
  public final void a(x paramx)
  {
    if ((paramx == null) || (bi.oW(paramx.field_canvasXml))) {}
    do
    {
      return;
      paramx.field_createTime = System.currentTimeMillis();
    } while (b(paramx));
    c(paramx, new String[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */