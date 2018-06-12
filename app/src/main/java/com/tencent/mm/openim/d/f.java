package com.tencent.mm.openim.d;

import android.database.Cursor;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends i<e>
{
  public static final String[] diD = { i.a(e.dhO, "OpenIMWordingInfo") };
  private com.tencent.mm.sdk.e.e diF;
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.dhO, "OpenIMWordingInfo", null);
    this.diF = parame;
  }
  
  public final boolean a(e parame)
  {
    parame.field_updateTime = bi.VE();
    return super.a(parame);
  }
  
  public final List<String> x(int paramInt, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject = " select wordingId from OpenIMWordingInfo where language='" + paramString + "' order by updateTime limit " + paramInt;
    x.d("MicroMsg.OpenIMWordingInfoStg", "getLastWording sql:%s", new Object[] { localObject });
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        String str = ((Cursor)localObject).getString(0);
        if (!bi.oW(str)) {
          localLinkedList.add(str);
        }
      } while (((Cursor)localObject).moveToNext());
    }
    x.d("MicroMsg.OpenIMWordingInfoStg", "getLastWording result cnt: %d, language:%s", new Object[] { Integer.valueOf(localLinkedList.size()), paramString });
    ((Cursor)localObject).close();
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/openim/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */