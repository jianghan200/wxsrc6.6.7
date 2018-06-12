package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.g.a.qf;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ao
{
  boolean emK = false;
  boolean emL = false;
  c nrA = new ao.3(this);
  long nru = 0L;
  private boolean nrv = false;
  int nrw = 0;
  int nrx = 1440;
  c<qf> nry = new ao.1(this);
  c nrz = new ao.2(this);
  
  final boolean byO()
  {
    Object localObject = g.AT().getValue("SnsImgPreLoadingTimeLimit");
    x.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", new Object[] { localObject });
    if (bi.oW((String)localObject)) {
      return false;
    }
    try
    {
      localObject = ((String)localObject).split("-");
      String[] arrayOfString = localObject[0].split(":");
      int i = bi.WU(arrayOfString[0]);
      this.nrw = (bi.WU(arrayOfString[1]) + i * 60);
      localObject = localObject[1].split(":");
      i = bi.WU(localObject[0]);
      this.nrx = (bi.WU(localObject[1]) + i * 60);
      x.d("MicroMsg.SnsPreTimelineService", "preloadLimit:%d-%d", new Object[] { Integer.valueOf(this.nrw), Integer.valueOf(this.nrx) });
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */