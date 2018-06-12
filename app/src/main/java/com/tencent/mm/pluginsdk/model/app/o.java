package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import com.tencent.mm.g.c.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class o
  extends i<r>
{
  public static final String[] diD = { i.a(n.dhO, "AppSort") };
  public e diF;
  
  public o(e parame)
  {
    super(parame, n.dhO, "AppSort", null);
    this.diF = parame;
    parame.fV("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( flag )");
    parame.fV("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( sortId )");
  }
  
  public final boolean a(n paramn)
  {
    return super.b(paramn);
  }
  
  public final List<String> fL(long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppSort");
    ((StringBuilder)localObject).append(" where ");
    ((StringBuilder)localObject).append("flag = ").append(paramLong);
    ((StringBuilder)localObject).append(" order by sortId desc ");
    localObject = rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      x.e("MicroMsg.AppSortStorage", "getAppListByFlag : cursor is null");
      return null;
    }
    x.d("MicroMsg.AppSortStorage", "getAppListByFlag count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
    int i = ((Cursor)localObject).getColumnIndex("appId");
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(((Cursor)localObject).getString(i));
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */