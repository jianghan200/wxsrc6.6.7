package com.tencent.mm.plugin.account.security.a;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends i<d>
{
  public static final String[] diD = { i.a(d.dhO, "SafeDeviceInfo") };
  h eOp = null;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.dhO, "SafeDeviceInfo", null);
    if ((parame instanceof h)) {
      this.eOp = ((h)parame);
    }
  }
  
  public final List<d> Yn()
  {
    LinkedList localLinkedList = new LinkedList();
    if (getCount() > 0)
    {
      Cursor localCursor = super.axc();
      while (localCursor.moveToNext())
      {
        d locald = new d();
        locald.d(localCursor);
        localLinkedList.add(locald);
      }
      localCursor.close();
    }
    return localLinkedList;
  }
  
  public final boolean a(d paramd)
  {
    return super.b(paramd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */