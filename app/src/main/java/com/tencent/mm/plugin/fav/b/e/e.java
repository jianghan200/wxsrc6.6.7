package com.tencent.mm.plugin.fav.b.e;

import android.database.Cursor;
import com.tencent.mm.plugin.fav.a.aa;
import com.tencent.mm.plugin.fav.a.j;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  extends i<j>
  implements aa
{
  private com.tencent.mm.sdk.e.e diF;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, j.dhO, "FavSearchInfo", null);
    this.diF = parame;
  }
  
  public final boolean Bt(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    paramString = "select count(localId) from FavSearchInfo where tagContent like '%" + paramString + "%'";
    x.d("MicroMsg.FavSearchStorage", "is tag exist sql {%s}", new Object[] { paramString });
    paramString = this.diF.b(paramString, null, 2);
    if ((paramString != null) && (paramString.moveToFirst())) {}
    for (int i = paramString.getInt(0);; i = 0)
    {
      if (paramString != null) {
        paramString.close();
      }
      if (i <= 0) {
        break;
      }
      return true;
    }
  }
  
  public final ArrayList<Long> a(List<String> paramList1, List<String> paramList2, List<Integer> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    String str = " 1=1 ";
    Object localObject = str;
    if (paramList1 != null)
    {
      localObject = str;
      if (!paramList1.isEmpty())
      {
        localObject = paramList1.iterator();
        for (paramList1 = " 1=1 "; ((Iterator)localObject).hasNext(); paramList1 = paramList1 + " and content like '%" + str + "%'") {
          str = (String)((Iterator)localObject).next();
        }
        localObject = paramList1;
      }
    }
    paramList1 = (List<String>)localObject;
    if (paramList2 != null)
    {
      paramList1 = (List<String>)localObject;
      if (!paramList2.isEmpty())
      {
        paramList2 = paramList2.iterator();
        for (paramList1 = (List<String>)localObject; paramList2.hasNext(); paramList1 = paramList1 + " and tagContent like '%" + (String)localObject + "%'") {
          localObject = (String)paramList2.next();
        }
      }
    }
    paramList2 = "select localId from FavSearchInfo" + " where " + paramList1;
    paramList1 = paramList2;
    if (paramList != null)
    {
      paramList1 = paramList2;
      if (!paramList.isEmpty())
      {
        paramList1 = paramList2 + " and ((1=1 ";
        paramList2 = paramList.iterator();
        int i;
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and type = " + i;
        }
        paramList1 = paramList1 + ") or (1=1";
        paramList2 = paramList.iterator();
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and subtype & " + j.pJ(i) + " != 0";
        }
        paramList1 = paramList1 + "))";
      }
    }
    paramList1 = paramList1 + " order by time desc";
    x.d("MicroMsg.FavSearchStorage", "search id sql {%s}", new Object[] { paramList1 });
    paramList1 = this.diF.b(paramList1, null, 2);
    if (paramList1 == null) {
      return localArrayList;
    }
    while (paramList1.moveToNext()) {
      localArrayList.add(Long.valueOf(paramList1.getLong(0)));
    }
    paramList1.close();
    return localArrayList;
  }
  
  public final void dA(long paramLong)
  {
    String str = "delete from FavSearchInfo where localId = " + paramLong;
    this.diF.fV("FavSearchInfo", str);
  }
  
  public final j dB(long paramLong)
  {
    j localj = null;
    Object localObject = "select * from FavSearchInfo where localId = " + paramLong;
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null) {
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localj = new j();
      localj.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/b/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */