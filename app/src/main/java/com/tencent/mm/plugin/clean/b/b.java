package com.tencent.mm.plugin.clean.b;

import android.database.Cursor;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.clean.c.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Runnable
{
  private long hQF = 0L;
  private List<String> hQJ;
  private List<i> hQK;
  private com.tencent.mm.plugin.clean.c.h hQL;
  
  public b(List<String> paramList, List<i> paramList1, com.tencent.mm.plugin.clean.c.h paramh)
  {
    this.hQJ = paramList;
    this.hQK = paramList1;
    this.hQL = paramh;
  }
  
  private void aH(List<com.tencent.mm.plugin.j.b.a> paramList)
  {
    int j = paramList.size();
    HashSet localHashSet = new HashSet();
    au.HU();
    long l1 = c.FO().dO(Thread.currentThread().getId());
    int i = 0;
    while (i < j)
    {
      com.tencent.mm.plugin.j.b.a locala = (com.tencent.mm.plugin.j.b.a)paramList.get(i);
      long l2 = bi.VG();
      if (!localHashSet.contains(Long.valueOf(locala.field_msgId)))
      {
        au.HU();
        bd localbd = c.FT().dW(locala.field_msgId);
        if ((localbd.field_msgId != 0L) && (!localbd.cmu()))
        {
          com.tencent.mm.plugin.j.b localb = com.tencent.mm.plugin.j.b.avr();
          long l3 = locala.field_msgId;
          localb.hsJ = true;
          localb.hsI.add(Long.valueOf(l3));
          x.d("MicroMsg.CalcWxService", "%d lock msg change [%d] [%s]", new Object[] { Integer.valueOf(localb.hashCode()), Long.valueOf(l3), bi.cjd() });
          localbd.cmv();
          au.HU();
          c.FT().a(locala.field_msgId, localbd);
        }
        localHashSet.add(Long.valueOf(locala.field_msgId));
        x.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex handle msg[%d]", new Object[] { avy(), Long.valueOf(bi.bI(l2)) });
      }
      if ((locala != null) && (!com.tencent.mm.plugin.j.a.nB(locala.field_msgSubType)) && (locala.field_size > 0L))
      {
        this.hQF += locala.field_size;
        FileOp.deleteFile(g.Ei().dqo + locala.field_path);
        locala.field_path = "";
        locala.field_size = 0L;
        com.tencent.mm.plugin.j.b.avr().avs().a(locala.sKx, locala, false);
      }
      x.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex[%d]", new Object[] { avy(), Long.valueOf(bi.bI(l2)) });
      i += 1;
    }
    au.HU();
    c.FO().gp(l1);
  }
  
  private String avy()
  {
    return hashCode();
  }
  
  public final void run()
  {
    if (this.hQJ != null)
    {
      l5 = bi.VG();
      j = this.hQJ.size();
      localIterator2 = this.hQJ.iterator();
      i = 0;
      while (localIterator2.hasNext())
      {
        str1 = (String)localIterator2.next();
        if (!bi.oW(str1))
        {
          l6 = bi.VG();
          localPLong1 = new PLong();
          localPLong2 = new PLong();
          localObject4 = com.tencent.mm.plugin.j.b.avr().avs();
          l1 = bi.VG();
          str2 = "select max(msgtime), min(msgtime) from WxFileIndex2 where username='" + str1 + "' and msgSubType in (1,20,23,30,32,34 ) and size > 0 ";
          localObject3 = null;
          localObject1 = null;
          try
          {
            localObject4 = ((com.tencent.mm.plugin.j.b.b)localObject4).diF.rawQuery(str2, null);
            if (localObject4 != null)
            {
              localObject1 = localObject4;
              localObject3 = localObject4;
              if (((Cursor)localObject4).moveToFirst())
              {
                localObject1 = localObject4;
                localObject3 = localObject4;
                localPLong1.value = ((Cursor)localObject4).getLong(0);
                localObject1 = localObject4;
                localObject3 = localObject4;
                localPLong2.value = ((Cursor)localObject4).getLong(1);
              }
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              localObject3 = localObject1;
              x.printErrStackTrace("MicroMsg.WxFileIndexStorage", localException, " sql [%s]", new Object[] { str2 });
              if (localObject1 != null) {
                ((Cursor)localObject1).close();
              }
            }
          }
          finally
          {
            if (localObject3 == null) {
              break label479;
            }
            ((Cursor)localObject3).close();
          }
          x.i("MicroMsg.WxFileIndexStorage", "getNoThumbMediaMsgTimeByUsername [%s] cost[%d]", new Object[] { str1, Long.valueOf(bi.bI(l1)) });
          localPLong2.value -= 1L;
          l3 = localPLong1.value;
          l2 = Math.max(l3 - 2592000000L, localPLong2.value);
          l1 = l2;
          if (l2 == l3) {
            l1 = l2 - 1L;
          }
          localObject1 = com.tencent.mm.plugin.j.b.avr().avs().i(str1, l3, l1);
          l3 = ((List)localObject1).size() + 0L;
          aH((List)localObject1);
          for (l2 = l1; l2 > localPLong2.value; l2 = l1)
          {
            l4 = Math.max(l2 - 2592000000L, localPLong2.value);
            l1 = l4;
            if (l4 == l2) {
              l1 = l4 - 1L;
            }
            localObject1 = com.tencent.mm.plugin.j.b.avr().avs().i(str1, l2, l1);
            l3 += ((List)localObject1).size();
            aH((List)localObject1);
          }
          label479:
          x.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] [%d %d] cost[%d]", new Object[] { avy(), str1, Long.valueOf(l3), Long.valueOf(localPLong2.value), Long.valueOf(localPLong1.value), Long.valueOf(bi.bI(l6)) });
        }
        i += 1;
        if (this.hQL != null) {
          this.hQL.cq(i, j);
        }
      }
      if (this.hQL != null) {
        this.hQL.ck(this.hQF);
      }
      com.tencent.mm.plugin.j.b.avr().avv();
      x.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", new Object[] { avy(), Long.valueOf(bi.bI(l5)) });
    }
    while (this.hQK == null)
    {
      long l5;
      Iterator localIterator2;
      String str1;
      long l6;
      PLong localPLong1;
      PLong localPLong2;
      Object localObject4;
      String str2;
      Object localObject3;
      Object localObject1;
      long l3;
      long l2;
      long l4;
      return;
    }
    long l1 = bi.VG();
    int j = this.hQK.size();
    Iterator localIterator1 = this.hQK.iterator();
    int i = 0;
    while (localIterator1.hasNext())
    {
      aH(((i)localIterator1.next()).hRo);
      i += 1;
      if (this.hQL != null) {
        this.hQL.cq(i, j);
      }
    }
    if (this.hQL != null) {
      this.hQL.ck(this.hQF);
    }
    com.tencent.mm.plugin.j.b.avr().avv();
    x.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", new Object[] { avy(), Long.valueOf(bi.bI(l1)) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/clean/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */