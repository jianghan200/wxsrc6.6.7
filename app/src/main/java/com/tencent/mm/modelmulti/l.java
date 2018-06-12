package com.tencent.mm.modelmulti;

import com.tencent.mm.g.a.hc;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.awe;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.s.b;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bi;

public final class l
{
  public static boolean PJ()
  {
    g.Ek();
    if (bi.oV((String)g.Ei().DT().get(8195, null)).length() > 0)
    {
      g.Ek();
      if (bi.f((Integer)g.Ei().DT().get(15, null)) != 0) {
        break label76;
      }
    }
    label76:
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static void a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    s.b localb = new s.b();
    PByteArray localPByteArray2 = new PByteArray();
    PByteArray localPByteArray1 = new PByteArray();
    PInt localPInt2 = new PInt();
    PInt localPInt4 = new PInt();
    PInt localPInt1 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    try
    {
      bool1 = MMProtocalJni.unpack(localPByteArray1, paramArrayOfByte1, paramArrayOfByte2, localPByteArray2, localPInt2, localPInt4, localPInt1, localPInt3);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewSyncMgr", "summerdiz dealWithPushResp unpack ret[%b], noticeid[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localPInt1.value) });
      if (localPInt1.value != 0)
      {
        paramArrayOfByte2 = new hc();
        paramArrayOfByte2.bQo.bQp = localPInt1.value;
        boolean bool2 = com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte2);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool2) });
        localPInt1.value = 0;
      }
      if (!bool1)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewSyncMgr", "unpack push resp failed");
        return;
      }
      localb.qWC = localPInt3.value;
      if (localPInt2.value == -13)
      {
        localb.qWB = localPInt2.value;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewSyncMgr", "unpack push resp failed session timeout");
        return;
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      boolean bool1;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewSyncMgr", "unpack push resp failed: %s", new Object[] { paramArrayOfByte1 });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NewSyncMgr", paramArrayOfByte1, "", new Object[0]);
      while (localPInt1.value != 0)
      {
        paramArrayOfByte1 = new hc();
        paramArrayOfByte1.bQo.bQp = localPInt1.value;
        bool1 = com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool1) });
        localPInt1.value = 0;
        return;
        int i = localb.G(localPByteArray1.value);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewSyncMgr", "bufToResp using protobuf ok");
        localb.qWB = i;
        localb.bufferSize = paramArrayOfByte1.length;
        g.Ek();
        paramArrayOfByte1 = bi.WP(bi.oV((String)g.Ei().DT().get(8195, null)));
        paramArrayOfByte2 = ab.a(localb.qWX.rny);
        g.Ek();
        g.Eg().aW(localb.qWX.hcd, localb.qWX.rZx);
        com.tencent.mm.kernel.a.gH(localb.qWX.hcd);
        if ((bi.bC(paramArrayOfByte2)) || (!z.h(paramArrayOfByte1, paramArrayOfByte2)))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewSyncMgr", "compareKeybuf syncKey failed");
          return;
        }
        ((b)g.l(b.class)).PM().a(localb, paramInt, paramLong);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelmulti/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */