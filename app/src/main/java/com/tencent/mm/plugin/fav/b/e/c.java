package com.tencent.mm.plugin.fav.b.e;

import android.database.Cursor;
import com.tencent.mm.plugin.fav.a.f;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends i<f>
  implements t
{
  private e diF;
  
  public c(e parame)
  {
    super(parame, f.dhO, "FavEditInfo", null);
    this.diF = parame;
    this.diF.fV("FavEditInfo", "CREATE INDEX IF NOT EXISTS IndexLocalId_Type ON FavEditInfo(localId,type);");
  }
  
  public final List<f> aLy()
  {
    localCursor = this.diF.b("select count(*) from FavEditInfo", null, 2);
    if (localCursor == null) {
      x.e("MicroMsg.Fav.FavEditInfoStorage", "count all edit info, cursor is null");
    }
    for (;;)
    {
      return null;
      try
      {
        if (localCursor.moveToFirst()) {
          x.i("MicroMsg.Fav.FavEditInfoStorage", "get all edit infos, count %d", new Object[] { Integer.valueOf(localCursor.getInt(0)) });
        }
        localCursor.close();
        localCursor = this.diF.b("select * from FavEditInfo", null, 2);
        if (localCursor == null) {
          continue;
        }
        ArrayList localArrayList = new ArrayList();
        f localf;
        boolean bool;
        return null;
      }
      catch (Exception localException1)
      {
        try
        {
          if (localCursor.moveToFirst()) {
            do
            {
              localf = new f();
              localf.d(localCursor);
              localArrayList.add(localf);
              bool = localCursor.moveToNext();
            } while (bool);
          }
          localCursor.close();
          return localArrayList;
        }
        catch (Exception localException2)
        {
          x.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", localException2, "", new Object[0]);
          localCursor.close();
        }
        localException1 = localException1;
        x.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", localException1, "", new Object[0]);
        localCursor.close();
        return null;
      }
    }
  }
  
  public final f dx(long paramLong)
  {
    f localf = null;
    Cursor localCursor = this.diF.b("select * from FavEditInfo where localId =  ? and type =  ?", new String[] { String.valueOf(paramLong), "0" }, 2);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localf = new f();
      localf.d(localCursor);
    }
    localCursor.close();
    return localf;
  }
  
  public final void q(long paramLong, int paramInt)
  {
    this.diF.delete("FavEditInfo", "localId=? and type=?", new String[] { String.valueOf(paramLong), String.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/b/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */