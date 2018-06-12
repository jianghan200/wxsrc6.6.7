package com.tencent.mm.plugin.order.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "OrderCommonMsgXml") };
  private e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "OrderCommonMsgXml", null);
    this.diF = parame;
  }
  
  public final boolean a(a parama)
  {
    return super.b(parama);
  }
  
  public final Cursor axc()
  {
    return this.diF.rawQuery("select * from OrderCommonMsgXml order by msgId desc", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */