package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.bk.b;
import com.tencent.mm.bt.h;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.bow;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q
  extends i<p>
{
  public static final String[] diD = { i.a(p.dhO, "SnsReportKv") };
  public h dCZ;
  
  public q(h paramh)
  {
    super(paramh, p.dhO, "SnsReportKv", p.ciG);
    this.dCZ = paramh;
  }
  
  private int a(bow parambow, int paramInt)
  {
    try
    {
      parambow = parambow.toByteArray();
      p localp = new p();
      localp.field_value = parambow;
      localp.field_logtime = System.currentTimeMillis();
      localp.field_logsize = paramInt;
      localp.field_offset = 0;
      parambow = localp.wH();
      paramInt = (int)this.dCZ.insert("SnsReportKv", "", parambow);
      x.d("MicroMsg.SnsKvReportStg", "SnsKvReport Insert result " + paramInt);
      return paramInt;
    }
    catch (Exception parambow) {}
    return 0;
  }
  
  public final int a(bow parambow)
  {
    bow localbow = new bow();
    int k = 0;
    int i = 0;
    int j = 0;
    if (k < parambow.rbN.size())
    {
      apz localapz = (apz)parambow.rbN.get(k);
      if (localapz.rSu.lR.length + j > 51200)
      {
        a(localbow, j);
        i += 1;
        localbow.rbN.clear();
        j = 0;
      }
      for (;;)
      {
        k += 1;
        break;
        j += localapz.rSu.lR.length;
        localbow.rbN.add(localapz);
      }
    }
    k = i;
    if (localbow.rbN.size() > 0)
    {
      k = i + 1;
      a(localbow, j);
    }
    return k;
  }
  
  public final bow dz(int paramInt1, int paramInt2)
  {
    Object localObject = "select rowid, *  from SnsReportKv";
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramInt2 > 0) {
      localObject = "select rowid, *  from SnsReportKv" + " where rowid <= " + paramInt2;
    }
    Cursor localCursor = this.dCZ.b((String)localObject, null, 0);
    bow localbow = new bow();
    ArrayList localArrayList = new ArrayList();
    localStringBuffer.append("target size " + paramInt1 + " current maxcolid " + paramInt2);
    if (localCursor.moveToFirst()) {
      paramInt2 = 0;
    }
    for (;;)
    {
      p localp = new p();
      localp.d(localCursor);
      i = localp.field_offset;
      localStringBuffer.append("|offset: " + i);
      localObject = new bow();
      for (;;)
      {
        try
        {
          ((bow)localObject).aG(localp.field_value);
        }
        catch (Exception localException2)
        {
          apz localapz;
          continue;
          i = 0;
          continue;
          i = 1;
          continue;
        }
        try
        {
          if (i >= ((bow)localObject).rbN.size()) {
            continue;
          }
          localapz = (apz)((bow)localObject).rbN.get(i);
          if (localapz.rSu.lR.length + paramInt2 > paramInt1)
          {
            if (paramInt2 != 0) {
              continue;
            }
            localArrayList.add(Integer.valueOf(localp.nJc));
            x.i("MicroMsg.SnsKvReportStg", "error by server for the mini size " + paramInt1 + " vlauesize " + localapz.rSu.lR.length);
            continue;
            localStringBuffer.append("|read end on " + localp.nJc + " and get size " + paramInt2);
            if ((i != 0) && (localp.field_offset <= ((bow)localObject).rbN.size()))
            {
              a(localp.nJc, localp);
              localStringBuffer.append("|update new offset " + localp.field_offset);
              if (i == 0) {
                continue;
              }
              x.i("MicroMsg.SnsKvReportStg", "read info " + localStringBuffer.toString());
              localCursor.close();
              localObject = localArrayList.iterator();
              if (!((Iterator)localObject).hasNext()) {
                continue;
              }
              delete(((Integer)((Iterator)localObject).next()).intValue());
              continue;
            }
          }
          else
          {
            localp.field_offset = (i + 1);
            localbow.rbN.add(localapz);
            int j = paramInt2 + localapz.rSu.lR.length;
            i += 1;
            paramInt2 = j;
            continue;
          }
          localStringBuffer.append("|read full ");
          localArrayList.add(Integer.valueOf(localp.nJc));
          continue;
          if (localCursor.moveToNext()) {
            break;
          }
        }
        catch (Exception localException1)
        {
          x.printErrStackTrace("MicroMsg.SnsKvReportStg", localException1, "", new Object[0]);
          localArrayList.add(Integer.valueOf(localp.nJc));
          x.i("MicroMsg.SnsKvReportStg", "error paser then delete " + localp.nJc);
        }
      }
    }
    for (;;)
    {
      break;
    }
    return localbow;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */