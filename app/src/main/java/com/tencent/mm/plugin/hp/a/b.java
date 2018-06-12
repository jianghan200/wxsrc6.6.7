package com.tencent.mm.plugin.hp.a;

import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.a.a;
import com.tencent.mm.c.d;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.RandomAccessFile;

public final class b
{
  public static int b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if ((paramString1 != null) && (paramString2 != null) && (paramString3 != null)) {
      for (;;)
      {
        try
        {
          File localFile2 = new File(paramString1);
          RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile2, "r");
          File localFile1 = new File(paramString3);
          e.cs(paramString3);
          paramString2 = new File(paramString2);
          if ((localFile2.exists()) && (paramString2.exists()))
          {
            paramString1 = a.cD(paramString1);
            if ((paramString1 != null) && (paramString1.bxg != null))
            {
              i = paramString1.bxg.bxj + 8;
              x.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", new Object[] { Integer.valueOf(i) });
              if (d.a(localRandomAccessFile, localFile1, paramString2, i) != 1)
              {
                x.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                localRandomAccessFile.close();
                return -1;
              }
              localRandomAccessFile.close();
              if (!paramString4.equalsIgnoreCase(g.cu(paramString3)))
              {
                x.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", new Object[] { paramString4, g.cu(paramString3) });
                return -2;
              }
              paramString1 = new com.tencent.mm.c.b();
              paramString1.apkMd5 = paramString4;
              new a(paramString1).o(localFile1);
              return 0;
            }
          }
          else
          {
            x.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", new Object[] { Boolean.valueOf(localFile2.exists()), Boolean.valueOf(localFile1.exists()), Boolean.valueOf(paramString2.exists()) });
            localRandomAccessFile.close();
            return -1;
          }
        }
        catch (Exception paramString1)
        {
          x.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", paramString1, "merge apk failed.", new Object[0]);
          return -1;
        }
        int i = 0;
      }
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/hp/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */