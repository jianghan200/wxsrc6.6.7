package com.tencent.mm.plugin.sns.storage;

import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "CanvasInfo") };
  
  public d(e parame)
  {
    this(parame, c.dhO, "CanvasInfo");
  }
  
  private d(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
  }
  
  public final void a(c paramc)
  {
    if (paramc == null) {}
    do
    {
      return;
      paramc.field_createTime = System.currentTimeMillis();
    } while (b(paramc));
    c(paramc, new String[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */