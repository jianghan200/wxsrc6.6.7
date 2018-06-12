package com.tencent.mm.pluginsdk.g.a.a;

import android.database.Cursor;
import android.util.SparseArray;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.pluginsdk.g.a.a.a.a;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.c.t;
import com.tencent.mm.protocal.c.bhm;
import com.tencent.mm.protocal.c.bho;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public abstract class n
  extends l
  implements k
{
  protected static final SparseArray<a> qCK = new SparseArray();
  private volatile com.tencent.mm.ab.e diJ;
  protected final List<bho> qCJ = new LinkedList();
  
  n()
  {
    int[] arrayOfInt = i.qCl;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      Object localObject = (a)qCK.get(k);
      if ((localObject == null) || (!((a)localObject).mZ(k)))
      {
        localObject = new bho();
        ((bho)localObject).hcE = k;
        this.qCJ.add(localObject);
      }
      i += 1;
    }
  }
  
  public static void a(a parama)
  {
    qCK.put(39, parama);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.d(getTag(), "before dispatch");
    Iterator localIterator = this.qCJ.iterator();
    while (localIterator.hasNext())
    {
      bho localbho = (bho)localIterator.next();
      int i = localbho.hcE;
      parame1 = q.a.ccH();
      if (!parame1.fAQ)
      {
        parame1 = null;
        if (parame1 != null) {
          break label212;
        }
      }
      Object localObject;
      s locals;
      for (parame1 = Collections.emptyList();; parame1 = Collections.emptyList())
      {
        localObject = new StringBuilder("{ ");
        parame1 = parame1.iterator();
        while (parame1.hasNext())
        {
          locals = (s)parame1.next();
          i = bi.getInt(locals.field_fileVersion, -1);
          if (i >= 0)
          {
            bhm localbhm = new bhm();
            localbhm.sdX = locals.field_subType;
            localbhm.sir = i;
            localbhm.sip = locals.field_keyVersion;
            localbhm.qCh = locals.field_EID;
            localbho.siw.add(localbhm);
            ((StringBuilder)localObject).append(locals.field_subType).append(", ");
          }
        }
        parame1 = parame1.qDu.dCZ;
        break;
        label212:
        localObject = parame1.a("ResDownloaderRecordTable", null, "urlKey" + String.format(Locale.US, " like '%d.%%.data'", new Object[] { Integer.valueOf(i) }) + " and groupId1=" + String.format(Locale.US, "'%s'", new Object[] { "CheckResUpdate" }), null, null, null, null, 2);
        if ((localObject != null) && (!((Cursor)localObject).isClosed())) {
          break label314;
        }
      }
      label314:
      if (((Cursor)localObject).moveToFirst())
      {
        parame1 = new LinkedList();
        do
        {
          locals = new s();
          locals.d((Cursor)localObject);
          parame1.add(locals);
        } while (((Cursor)localObject).moveToNext());
      }
      for (;;)
      {
        ((Cursor)localObject).close();
        break;
        parame1 = Collections.emptyList();
      }
      ((StringBuilder)localObject).append(" }");
      x.i(getTag(), "before doScene, add subtypeList(%s) in type(%d)", new Object[] { ((StringBuilder)localObject).toString(), Integer.valueOf(localbho.hcE) });
    }
    return a(parame, ccA(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i(getTag(), "onGYNetEnd errType(%d), errCode(%d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = i(paramq);
      str = getTag();
      if (!bi.cX(paramArrayOfByte.rsG)) {
        break label128;
      }
    }
    label128:
    for (paramq = "null";; paramq = String.valueOf(paramArrayOfByte.rsG.size()))
    {
      x.i(str, "response.Res.size() = %s", new Object[] { paramq });
      if (!bi.cX(paramArrayOfByte.rsG)) {
        com.tencent.mm.sdk.f.e.post(new n.1(this, paramArrayOfByte.rsG), "NetSceneCheckResUpdate-ResponseHandlingThread");
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  protected abstract com.tencent.mm.network.q ccA();
  
  protected abstract String getTag();
  
  protected abstract oj i(com.tencent.mm.network.q paramq);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */