package com.tencent.mm.aw;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class c
  implements at.a
{
  public BlockingQueue<g.a> ehl = new ArrayBlockingQueue(1024);
  public String mFileName = null;
  
  public final boolean Kr()
  {
    x.d("MicroMsg.SpeexEncoderWorker", "doEncode");
    d locald = new d();
    String str = b.RH();
    try
    {
      x.i("MicroMsg.SpeexEncoderWorker", "path " + str);
      Object localObject = new File(str);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      locald.df(str + this.mFileName + ".temp");
      while (this.ehl.size() > 0)
      {
        localObject = (g.a)this.ehl.poll();
        if ((((g.a)localObject).buf != null) && (((g.a)localObject).bEG > 0)) {
          locald.a((g.a)localObject, 0, false);
        }
      }
      localException1.wA();
    }
    catch (Exception localException1)
    {
      x.e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", new Object[] { localException1 });
      return true;
    }
    try
    {
      new File(str + this.mFileName + ".temp").renameTo(new File(str + this.mFileName + ".spx"));
      e.RQ().start();
      return true;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        x.e("MicroMsg.SpeexEncoderWorker", "exception:%s", new Object[] { bi.i(localException2) });
      }
    }
  }
  
  public final boolean Ks()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/aw/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */