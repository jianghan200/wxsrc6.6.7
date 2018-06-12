package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends i<j>
{
  public static final String[] diD = { i.a(j.dhO, "SightDraftInfo") };
  public e diF;
  
  public l(e parame)
  {
    super(parame, j.dhO, "SightDraftInfo", null);
    this.diF = parame;
  }
  
  public final List<j> SV()
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "SELECT * FROM SightDraftInfo WHERE fileStatus = ?  ORDER BY localId DESC " + new StringBuilder(" LIMIT 5").toString();
    localObject = this.diF.b((String)localObject, new String[] { "7" }, 2);
    if (localObject == null) {
      return localLinkedList;
    }
    while (((Cursor)localObject).moveToNext())
    {
      j localj = new j();
      localj.d((Cursor)localObject);
      localLinkedList.add(localj);
    }
    ((Cursor)localObject).close();
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelvideo/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */