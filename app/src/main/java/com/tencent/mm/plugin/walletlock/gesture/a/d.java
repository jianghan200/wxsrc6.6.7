package com.tencent.mm.plugin.walletlock.gesture.a;

import android.util.Base64;
import com.tencent.mm.protocal.c.ayy;
import com.tencent.mm.protocal.c.ayz;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.IOException;

public final class d
{
  private static long pGz = -1L;
  
  public static void H(long paramLong1, long paramLong2)
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      g localg = new g();
      localg.pGZ = paramLong1;
      localg.pHa = paramLong2;
      localx.set(339969, e.aY(localg.toByteArray()));
      localx.lm(true);
    }
  }
  
  public static void I(long paramLong1, long paramLong2)
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      g localg = new g();
      localg.pGZ = paramLong1;
      localg.pHa = paramLong2;
      localx.set(339971, e.aY(localg.toByteArray()));
      localx.lm(true);
    }
  }
  
  public static void a(ayy paramayy)
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null) {}
    try
    {
      localx.set(339989, Base64.encodeToString(paramayy.toByteArray(), 2));
      localx.lm(true);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.GestureGuardInfoManager", "alvinluo savePatternBuffer isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(e.bRE()) });
      return;
    }
    catch (IOException paramayy)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramayy, "", new Object[0]);
    }
  }
  
  public static void a(ayz paramayz)
  {
    if (paramayz != null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GestureGuardInfoManager", "alvinluo saveSyncedPatternInfo version: %d, status: %d", new Object[] { Integer.valueOf(paramayz.sbK), Integer.valueOf(paramayz.sbM) });
    }
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null) {}
    try
    {
      localx.set(339990, Base64.encodeToString(paramayz.toByteArray(), 2));
      localx.lm(true);
      return;
    }
    catch (IOException paramayz)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramayz, "", new Object[0]);
    }
  }
  
  public static g bRG()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null) {
      return new g();
    }
    localObject = ((com.tencent.mm.storage.x)localObject).get(339969, null);
    if (localObject == null) {
      return new g();
    }
    return new g().aZ(e.PI((String)localObject));
  }
  
  public static void bRH()
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      localx.set(339969, null);
      localx.lm(true);
    }
  }
  
  public static g bRI()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null) {
      return new g();
    }
    localObject = ((com.tencent.mm.storage.x)localObject).get(339971, null);
    if (localObject == null) {
      return new g();
    }
    return new g().aZ(e.PI((String)localObject));
  }
  
  public static void bRJ()
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      localx.set(339971, null);
      localx.lm(true);
    }
  }
  
  public static ayy bRK()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null) {
      return null;
    }
    localObject = (String)((com.tencent.mm.storage.x)localObject).get(339989, null);
    if (bi.oW((String)localObject)) {
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (ayy)new ayy().aG((byte[])localObject);
      return (ayy)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      return null;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
    }
    return null;
  }
  
  public static ayz bRL()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GestureGuardInfoManager", "alvinluo configstg is null");
      return null;
    }
    localObject = (String)((com.tencent.mm.storage.x)localObject).get(339990, null);
    if (bi.oW((String)localObject)) {
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (ayz)new ayz().aG((byte[])localObject);
      return (ayz)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      return null;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
    }
    return null;
  }
  
  public static int bRM()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null) {
      return -1;
    }
    localObject = ((com.tencent.mm.storage.x)localObject).get(339972, null);
    if (localObject == null) {
      return -1;
    }
    return ((Integer)localObject).intValue();
  }
  
  public static void bRN()
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      localx.set(339972, null);
      localx.lm(true);
    }
  }
  
  public static void bRv()
  {
    pGz = -1L;
  }
  
  public static long bRw()
  {
    return pGz;
  }
  
  public static void fy(long paramLong)
  {
    pGz = paramLong;
  }
  
  public static void zy(int paramInt)
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      localx.set(339972, Integer.valueOf(paramInt));
      localx.lm(true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */