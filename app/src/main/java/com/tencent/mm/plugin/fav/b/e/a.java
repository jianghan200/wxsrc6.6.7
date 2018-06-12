package com.tencent.mm.plugin.fav.b.e;

import android.database.Cursor;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends i<c>
  implements q
{
  private List<p> avD = new LinkedList();
  private e diF;
  
  public a(e parame)
  {
    super(parame, c.dhO, "FavCdnInfo", null);
    this.diF = parame;
  }
  
  public final c Br(String paramString)
  {
    Object localObject = null;
    if (bi.oW(paramString)) {
      x.e("MicroMsg.FavCdnStorage", "md5 null");
    }
    Cursor localCursor;
    do
    {
      return null;
      paramString = "select * from FavCdnInfo where dataId = '" + paramString + "'";
      localCursor = this.diF.b(paramString, null, 2);
    } while (localCursor == null);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.d(localCursor);
    }
    localCursor.close();
    return paramString;
  }
  
  public final void a(p paramp)
  {
    if (paramp != null) {
      this.avD.add(paramp);
    }
  }
  
  public final boolean a(c paramc, String... paramVarArgs)
  {
    boolean bool = false;
    int i = 0;
    if (super.c(paramc, paramVarArgs))
    {
      paramVarArgs = new p[this.avD.size()];
      this.avD.toArray(paramVarArgs);
      int j = paramVarArgs.length;
      while (i < j)
      {
        String str = paramVarArgs[i];
        if (str != null) {
          str.d(paramc);
        }
        i += 1;
      }
      bool = true;
    }
    return bool;
  }
  
  public final void aLt()
  {
    this.diF.fV("FavCdnInfo", "update FavCdnInfo set status = 1 where status <> 3");
  }
  
  public final LinkedList<c> aLu()
  {
    Object localObject = "select * from FavCdnInfo where status = 1 order by modifyTime desc " + " limit 1";
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null) {
      return null;
    }
    if (!((Cursor)localObject).moveToFirst())
    {
      ((Cursor)localObject).close();
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    do
    {
      c localc = new c();
      localc.d((Cursor)localObject);
      localLinkedList.add(localc);
    } while (((Cursor)localObject).moveToNext());
    ((Cursor)localObject).close();
    return localLinkedList;
  }
  
  public final Cursor aLv()
  {
    return this.diF.rawQuery("select * from FavCdnInfo where type = 0 and status = 1", null);
  }
  
  public final Cursor aLw()
  {
    return this.diF.rawQuery("select * from FavCdnInfo where type = 1 and status = 1", null);
  }
  
  public final void b(p paramp)
  {
    if (paramp != null) {
      this.avD.remove(paramp);
    }
  }
  
  public final boolean b(c paramc, String... paramVarArgs)
  {
    boolean bool = false;
    int i = 0;
    if (super.a(paramc, paramVarArgs))
    {
      paramVarArgs = new p[this.avD.size()];
      this.avD.toArray(paramVarArgs);
      int j = paramVarArgs.length;
      while (i < j)
      {
        String str = paramVarArgs[i];
        if (str != null) {
          str.d(paramc);
        }
        i += 1;
      }
      bool = true;
    }
    return bool;
  }
  
  public final List<c> dt(long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select * from FavCdnInfo where favLocalId = " + paramLong;
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        c localc = new c();
        localc.d((Cursor)localObject);
        localArrayList.add(localc);
      }
      ((Cursor)localObject).close();
    }
    x.v("MicroMsg.FavCdnStorage", "getInfos size:%d", new Object[] { Integer.valueOf(localArrayList.size()) });
    return localArrayList;
  }
  
  public final List<c> du(long paramLong)
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "select * from FavCdnInfo where favLocalId = " + paramLong + " and type = 0 and status = 3";
    localObject = this.diF.b((String)localObject, null, 2);
    if ((localObject != null) && (((Cursor)localObject).moveToFirst())) {
      do
      {
        c localc = new c();
        localc.d((Cursor)localObject);
        localLinkedList.add(localc);
      } while (((Cursor)localObject).moveToNext());
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    x.v("MicroMsg.FavCdnStorage", "getUploadedInfos size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
  
  public final void dv(long paramLong)
  {
    String str = String.format("delete from %s where %s = %d and %s = %d", new Object[] { "FavCdnInfo", "favLocalId", Long.valueOf(paramLong), "type", Integer.valueOf(0) });
    this.diF.fV("FavCdnInfo", str);
  }
  
  public final boolean dw(long paramLong)
  {
    c localc = new c();
    localc.field_favLocalId = paramLong;
    return b(localc, new String[] { "favLocalId" });
  }
  
  public final boolean e(c paramc)
  {
    int i = 0;
    if (paramc == null) {}
    while (!super.b(paramc)) {
      return false;
    }
    p[] arrayOfp = new p[this.avD.size()];
    this.avD.toArray(arrayOfp);
    int j = arrayOfp.length;
    while (i < j)
    {
      p localp = arrayOfp[i];
      if (localp != null) {
        localp.d(paramc);
      }
      i += 1;
    }
    return true;
  }
  
  public final int p(long paramLong, int paramInt)
  {
    Object localObject = "select status from FavCdnInfo where favLocalId = " + paramLong + " and type = " + paramInt;
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null) {
      return 3;
    }
    if (!((Cursor)localObject).moveToFirst())
    {
      ((Cursor)localObject).close();
      return 3;
    }
    paramInt = 1;
    int i = 1;
    int j = 1;
    int k;
    int m;
    int n;
    do
    {
      int i1 = ((Cursor)localObject).getInt(0);
      if (i1 == 1)
      {
        ((Cursor)localObject).close();
        return 1;
      }
      k = j;
      if (i1 != 4) {
        k = 0;
      }
      m = i;
      if (i1 != 2) {
        m = 0;
      }
      n = paramInt;
      if (i1 != 3) {
        n = 0;
      }
      paramInt = n;
      i = m;
      j = k;
    } while (((Cursor)localObject).moveToNext());
    ((Cursor)localObject).close();
    if (m != 0) {
      return 2;
    }
    if (k != 0) {
      return 4;
    }
    if (n != 0) {
      return 3;
    }
    return 0;
  }
  
  public final void x(g paramg)
  {
    long l = bi.VF();
    paramg = "update FavCdnInfo set status = 1,modifyTime = " + l + " where favLocalId = " + paramg.field_localId + " and type = 0 and status <> 3";
    this.diF.fV("FavCdnInfo", paramg);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/b/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */