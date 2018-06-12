package com.tencent.mm.modelrecovery;

import android.content.Context;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static void Qr()
  {
    File localFile = new File(ad.getContext().getFilesDir(), "/recovery/recovery.log");
    String str = null;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (localFile.exists())
    {
      localObject1 = localObject2;
      if (localFile.length() > 0L) {
        localObject1 = str;
      }
    }
    try
    {
      localObject2 = FileOp.ct(localFile.getAbsolutePath());
      localObject1 = localObject2;
      localFile.delete();
      localObject1 = localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int k;
        int i;
        int j;
        x.printErrStackTrace("MicroMsg.Recovery.RecoveryLogUtil", localIOException, "recoveryLog", new Object[0]);
        continue;
        if (str.equals("E"))
        {
          j = 0;
          continue;
          x.e(localIOException[1], localIOException[2]);
          continue;
          x.i("MicroMsg.Recovery.RecoveryLogUtil", str);
        }
      }
      x.i("MicroMsg.Recovery.RecoveryLogUtil", "not found recovery log");
    }
    if (!bi.oW((String)localObject1))
    {
      localObject1 = ((String)localObject1).split("​​");
      k = localObject1.length;
      i = 0;
      for (;;)
      {
        if (i >= k) {
          return;
        }
        str = localObject1[i];
        localObject2 = str.split("​");
        if ((localObject2 == null) || (localObject2.length != 3)) {
          break;
        }
        str = localObject2[0];
        j = -1;
        switch (str.hashCode())
        {
        default: 
          switch (j)
          {
          default: 
            x.i(localObject2[1], localObject2[2]);
            i += 1;
          }
          break;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelrecovery/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */