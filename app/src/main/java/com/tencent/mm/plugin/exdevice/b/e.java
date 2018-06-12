package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bk.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.exdevice.e.f;
import com.tencent.mm.plugin.exdevice.e.g;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.CRC32;

public final class e
  extends d
{
  public e(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    x.i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", new Object[] { Integer.valueOf(paramInt1), paramString, b.aq(paramArrayOfByte1), b.aq(paramArrayOfByte2), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    g localg = new g();
    localg.ixj = X(0, "ok");
    paramString = q.GF();
    long l;
    label153:
    label190:
    int i;
    if (!bi.oW(paramString))
    {
      paramString = ac.ce(paramString).toLowerCase();
      x.i("MicroMsg.exdevice.Util", "user md5 : [%s]", new Object[] { paramString });
      if (bi.oW(paramString))
      {
        x.e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
        l = 0L;
        paramString = new int[] { (int)(l >> 32 & 0xFFFFFFFF), (int)(l & 0xFFFFFFFF) };
        localg.iwW = paramString[0];
        localg.iwX = paramString[1];
        if (!bi.bC(paramArrayOfByte2))
        {
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
            break label520;
          }
          paramInt1 = 0;
          localg.iwY = paramInt1;
        }
        if (!bi.bC(paramArrayOfByte1))
        {
          if ((paramArrayOfByte1[0] & 0x4) != 0) {
            localg.hbQ = com.tencent.mm.protocal.d.qVI;
          }
          if ((paramArrayOfByte1[0] & 0x8) != 0) {
            localg.ixd = com.tencent.mm.protocal.d.qVL;
          }
          if ((paramArrayOfByte1[0] & 0x2) != 0) {
            localg.ixc = 2;
          }
          if ((paramArrayOfByte1[0] & 0x10) != 0) {
            localg.ixe = ((int)bi.VE());
          }
          if ((paramArrayOfByte1[0] & 0x20) != 0)
          {
            paramString = TimeZone.getDefault();
            i = paramString.getRawOffset() / 1000;
            if ((!paramString.useDaylightTime()) || (!paramString.inDaylightTime(new Date(System.currentTimeMillis())))) {
              break label543;
            }
          }
        }
      }
    }
    label520:
    label543:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      int j = i / 3600 + paramInt1;
      x.i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(j) });
      localg.ixf = j;
      if ((paramArrayOfByte1[0] & 0x40) != 0) {
        localg.ixg = b.aIr();
      }
      if ((paramArrayOfByte1[0] & 0x1) != 0) {
        localg.ixb = q.GH();
      }
      localg.iwZ = paramInt2;
      localg.ixa = paramInt3;
      this.isE = localg;
      this.isC = 20003;
      return;
      j = 0;
      paramInt1 = 0;
      paramString = paramString.toCharArray();
      if (paramString.length > 0)
      {
        i = 0;
        for (;;)
        {
          j = paramInt1;
          if (i >= paramString.length) {
            break;
          }
          paramInt1 = paramInt1 * 31 + paramString[i];
          i += 1;
        }
      }
      l = j & 0xFFFFFFFF;
      x.i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
      break;
      paramString = null;
      break label153;
      paramString = new CRC32();
      paramString.update(paramArrayOfByte2);
      paramInt1 = (int)paramString.getValue();
      break label190;
    }
  }
  
  protected final a ao(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
      return null;
    }
    f localf = new f();
    try
    {
      localf.aG(paramArrayOfByte);
      x.i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
      this.isF = localf;
      return localf;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + paramArrayOfByte.getMessage());
      x.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdInit", paramArrayOfByte, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */