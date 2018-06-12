package com.tencent.mm.aw;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class e
{
  private static e ehB = null;
  public at dRY = new at(1, "speex_worker");
  private byte[] dol = new byte[0];
  private String ehC;
  private com.tencent.mm.ab.e ehD = new e.3(this);
  
  public static e RQ()
  {
    if (ehB == null) {
      ehB = new e();
    }
    return ehB;
  }
  
  private static File bo(int paramInt1, int paramInt2)
  {
    Object localObject1 = new File(b.RH());
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory())) {
      localObject1 = null;
    }
    File[] arrayOfFile;
    int i;
    label46:
    do
    {
      do
      {
        return (File)localObject1;
        arrayOfFile = ((File)localObject1).listFiles();
        i = 0;
        localObject2 = null;
        localObject1 = localObject2;
      } while (arrayOfFile == null);
      localObject1 = localObject2;
    } while (i >= arrayOfFile.length);
    Object localObject2 = arrayOfFile[i];
    localObject1 = localObject2;
    String str;
    long l;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((File)localObject2).isFile())
      {
        x.d("MicroMsg.SpeexUploadCore", "file " + ((File)localObject2).getPath());
        str = ((File)localObject2).getPath();
        l = ((File)localObject2).length();
        if (((File)localObject2).getName().endsWith(".spx")) {
          break label159;
        }
      }
    }
    for (localObject1 = null;; localObject1 = null)
    {
      i += 1;
      localObject2 = localObject1;
      break label46;
      label159:
      if (l >= paramInt1)
      {
        localObject1 = localObject2;
        if (l <= paramInt2) {
          break;
        }
      }
      x.d("MicroMsg.SpeexUploadCore", "unfit delete %s, minsize: %d, maxSize: %d", new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      com.tencent.mm.a.e.deleteFile(str);
    }
  }
  
  public final void b(at.a parama)
  {
    x.d("MicroMsg.SpeexUploadCore", "pushWork");
    this.dRY.c(parama);
  }
  
  public final void start()
  {
    if (!ao.isWifi(ad.getContext())) {
      return;
    }
    new ag(Looper.getMainLooper()).postDelayed(new e.2(this), 100L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/aw/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */