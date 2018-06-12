package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.caz;
import com.tencent.mm.protocal.c.cbd;
import com.tencent.mm.protocal.c.cbe;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.v.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class p
{
  private static String deviceID = null;
  public static h ftI = null;
  
  public static k a(a parama, h paramh, String paramString)
  {
    cbe localcbe = new cbe();
    try
    {
      parama = parama.toByteArray();
      if ((parama.length > 256) && (jZ(paramh.fsC.fta)))
      {
        byte[] arrayOfByte = com.tencent.mm.a.q.r(parama);
        localcbe.rwb = b.bi(arrayOfByte);
        localcbe.sjO = 1;
        x.v("MicroMsg.RemoteDebugUtil", "use zlib %d/%d", new Object[] { Integer.valueOf(parama.length), Integer.valueOf(arrayOfByte.length) });
      }
      for (;;)
      {
        localcbe.egS = paramh.fsD.incrementAndGet();
        if (paramh.fsF != 0L) {
          break;
        }
        localcbe.sxo = 0;
        paramh.fsF = System.currentTimeMillis();
        localcbe.category = paramString;
        x.d("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend seq %d", new Object[] { Integer.valueOf(localcbe.egS) });
        parama = new k();
        parama.fsv = System.currentTimeMillis();
        parama.ftl = localcbe.rwb.lR.length;
        parama.ftk = localcbe;
        return parama;
        localcbe.rwb = b.bi(parama);
      }
    }
    catch (IOException parama)
    {
      for (;;)
      {
        x.e("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend %s", new Object[] { parama });
        continue;
        localcbe.sxo = ((int)(System.currentTimeMillis() - paramh.fsF));
      }
    }
  }
  
  public static cbd a(int paramInt, a parama)
  {
    cbd localcbd = new cbd();
    localcbd.nc = paramInt;
    if (bi.oW(deviceID)) {
      deviceID = com.tencent.mm.compatible.e.q.getDeviceID(ad.getContext());
    }
    localcbd.fMk = (deviceID + "-" + System.currentTimeMillis());
    localcbd.rwb = d(parama);
    return localcbd;
  }
  
  public static boolean a(h paramh, cbd paramcbd, caz paramcaz, q paramq, l paraml)
  {
    if (paramcbd == null)
    {
      x.w("MicroMsg.RemoteDebugUtil", "handleError dataFormat is null");
      return false;
    }
    int i = paramcbd.nc;
    if (paramcaz == null)
    {
      x.w("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d resp is null", new Object[] { Integer.valueOf(i) });
      return false;
    }
    if (i == 1006)
    {
      if (-50011 != paramcaz.bMH) {
        break label75;
      }
      paramh.cz(true);
    }
    while (paramcaz.bMH == 0)
    {
      return true;
      label75:
      boolean bool = paramh.isBusy();
      paramh.cz(false);
      if (bool) {
        paraml.aeC();
      }
    }
    x.i("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d, uuid: %s, errorCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), paramcbd.fMk, Integer.valueOf(paramcaz.bMH), paramcaz.bMI });
    ah.A(new q.8(paramq, i, paramcaz));
    return false;
  }
  
  public static ByteBuffer c(a parama)
  {
    try
    {
      parama = ByteBuffer.wrap(parama.toByteArray());
      return parama;
    }
    catch (IOException parama)
    {
      x.w("MicroMsg.RemoteDebugUtil", parama.getMessage());
    }
    return ByteBuffer.allocate(0);
  }
  
  private static b d(a parama)
  {
    try
    {
      parama = b.bi(parama.toByteArray());
      return parama;
    }
    catch (IOException parama)
    {
      x.w("MicroMsg.RemoteDebugUtil", parama.getMessage());
    }
    return b.bi(new byte[0]);
  }
  
  public static boolean jZ(int paramInt)
  {
    return (paramInt & 0x1) != 0;
  }
  
  public static i sr(String paramString)
  {
    x.i("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo extInfo=%s", new Object[] { paramString });
    i locali = new i();
    if (!bi.oW(paramString)) {}
    try
    {
      paramString = g.fU(paramString);
      locali.fsU = paramString.optBoolean("open_remote", false);
      locali.fsV = paramString.optString("room_id");
      locali.fsW = paramString.optString("wxpkg_info");
      locali.fsX = paramString.optString("qrcode_id");
      locali.fsY = paramString.optInt("remote_network_type", 1);
      locali.fqO = paramString.optBoolean("disable_url_check", true);
      locali.fsZ = paramString.optInt("remote_proxy_port", 9976);
      locali.fta = paramString.optInt("remote_support_compress_algo");
      return locali;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo %s", new Object[] { paramString });
    }
    return locali;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */