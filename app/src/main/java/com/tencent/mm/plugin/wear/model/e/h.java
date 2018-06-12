package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.protocal.c.ceb;
import com.tencent.mm.protocal.c.cec;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11000));
    localArrayList.add(Integer.valueOf(11003));
    localArrayList.add(Integer.valueOf(11035));
    return localArrayList;
  }
  
  public final boolean bSz()
  {
    return false;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    String str2;
    if (paramInt == 11000)
    {
      str2 = new String(paramArrayOfByte);
      paramArrayOfByte = "";
      try
      {
        localObject = FileOp.ct(str2);
        paramArrayOfByte = (byte[])localObject;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          Object localObject;
          x.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException1, "handleData", new Object[0]);
        }
        if (localIOException1.size() <= 0) {
          break label145;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.n("WearCrash", localIOException1);
        localIOException1.clear();
        new File(str2).delete();
      }
      paramArrayOfByte = paramArrayOfByte.split("​​");
      localObject = new ArrayList();
      paramInt = 0;
      while (paramInt < paramArrayOfByte.length)
      {
        ((List)localObject).add(paramArrayOfByte[paramInt]);
        if (paramInt % 50 == 9)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.n("WearCrash", (List)localObject);
          ((List)localObject).clear();
        }
        paramInt += 1;
      }
    }
    for (;;)
    {
      label145:
      return null;
      if (paramInt == 11003)
      {
        str2 = new String(paramArrayOfByte);
        paramArrayOfByte = "";
        try
        {
          String str1 = FileOp.ct(str2);
          paramArrayOfByte = str1;
        }
        catch (IOException localIOException2)
        {
          for (;;)
          {
            int j;
            x.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException2, "handleData", new Object[0]);
          }
          new File(str2).delete();
        }
        paramArrayOfByte = paramArrayOfByte.split("​​");
        j = paramArrayOfByte.length;
        paramInt = i;
        while (paramInt < j)
        {
          x.i("MicroMsg.Wear.LOG", paramArrayOfByte[paramInt]);
          paramInt += 1;
        }
        continue;
      }
      if (paramInt != 11035) {
        continue;
      }
      ceb localceb = new ceb();
      try
      {
        localceb.aG(paramArrayOfByte);
        paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bSl().pIM.pJd.pJT;
        if (paramArrayOfByte == null) {
          continue;
        }
        x.v("MicroMsg.Wear.HttpLogServer", "report kv id=%d %s %s %s %s data=%s", new Object[] { Integer.valueOf(localceb.jTt), paramArrayOfByte.hbQ, paramArrayOfByte.szd, Integer.valueOf(paramArrayOfByte.rdn), paramArrayOfByte.sze, localceb.svH });
        com.tencent.mm.plugin.report.service.h.mEJ.h(localceb.jTt, new Object[] { paramArrayOfByte.hbQ, paramArrayOfByte.szd, Integer.valueOf(paramArrayOfByte.rdn), paramArrayOfByte.sze, localceb.svH });
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */