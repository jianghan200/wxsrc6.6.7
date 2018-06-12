package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.ak.a;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.g.a.ms.a;
import com.tencent.mm.plugin.af.a.b.2;
import com.tencent.mm.plugin.af.a.b.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  public com.tencent.mm.sdk.b.c mGl = new n.1(this);
  public com.tencent.mm.sdk.b.c mGm = new n.2(this);
  b.a mGn = new n.3(this);
  
  public final boolean h(com.tencent.mm.sdk.b.b paramb)
  {
    if (paramb == null) {}
    do
    {
      return false;
      if ((paramb instanceof ms))
      {
        l.mFT.reset();
        l.mFT.vy(l.mFS);
        paramb = (ms)paramb;
        com.tencent.mm.plugin.scanner.c.brY().mFg.a(paramb.bXH.filePath, this.mGn, paramb.bXH.bXI);
        return false;
      }
    } while (!(paramb instanceof ak));
    l.mFT.aXS();
    Object localObject = (ak)paramb;
    paramb = com.tencent.mm.plugin.scanner.c.brY().mFg;
    localObject = ((ak)localObject).bHM.filePath;
    b.a locala = this.mGn;
    x.i("MicroMsg.FileScanQueueService", "cancelDecode, fileUri: %s, callback: %x", new Object[] { localObject, Integer.valueOf(locala.hashCode()) });
    if (bi.oW((String)localObject))
    {
      x.e("MicroMsg.FileScanQueueService", "cancel failed, uri is null or nil");
      return false;
    }
    paramb.guJ.post(new b.2(paramb, (String)localObject, locala));
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */