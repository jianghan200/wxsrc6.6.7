package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.List;

public final class f
  implements j
{
  public final ab Co(String paramString)
  {
    ab localab2 = ((i)g.l(i.class)).FR().Yb(paramString);
    ab localab1 = localab2;
    if (localab2 == null)
    {
      localab1 = new ab();
      paramString = h("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0;", new String[] { paramString });
      if (paramString.moveToNext())
      {
        localab1.dhP = paramString.getLong(0);
        localab1.setUsername(paramString.getString(1));
        localab1.du(paramString.getString(2));
        localab1.dv(paramString.getString(3));
        localab1.dx(paramString.getString(4));
        localab1.eF(paramString.getInt(5));
        localab1.setType(paramString.getInt(6));
        localab1.B(paramString.getBlob(7));
        localab1.dE(paramString.getString(8));
        localab1.eH(0);
      }
      paramString.close();
    }
    return localab1;
  }
  
  public final boolean Cp(String paramString)
  {
    paramString = h(String.format("SELECT 1 FROM rconversation WHERE username = ?", new Object[0]), new String[] { paramString });
    try
    {
      boolean bool = paramString.moveToNext();
      return bool;
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
  
  public final long Cq(String paramString)
  {
    paramString = h("SELECT conversationTime FROM rconversation WHERE username=?;", new String[] { paramString });
    long l2 = 0L;
    long l1 = l2;
    if (paramString != null)
    {
      l1 = l2;
      if (paramString.moveToFirst()) {
        l1 = paramString.getLong(0);
      }
    }
    if (paramString != null) {
      paramString.close();
    }
    return l1;
  }
  
  public final List<String> Cr(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String str = paramString;
    if (paramString.endsWith("\000")) {
      str = paramString.substring(0, paramString.length() - 1);
    }
    if (str.length() == 0) {
      return localArrayList;
    }
    paramString = h(String.format("SELECT labelName FROM ContactLabel WHERE labelID IN (%s);", new Object[] { str }), null);
    while (paramString.moveToNext()) {
      localArrayList.add(paramString.getString(0));
    }
    paramString.close();
    return localArrayList;
  }
  
  public final Cursor h(String paramString, String[] paramArrayOfString)
  {
    g.Ek();
    return g.Ei().dqr.b(paramString, paramArrayOfString, 2);
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    g.Ek();
    return g.Ei().dqr.b(paramString, paramArrayOfString, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */