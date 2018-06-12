package com.tencent.mm.plugin.wear.model;

import com.tencent.mm.a.g;
import com.tencent.mm.plugin.wear.model.a.b.a;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.plugin.wear.model.e.j;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.sdk.platformtools.x;
import java.security.Key;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
{
  com.tencent.mm.plugin.wear.model.a.b pJb = new com.tencent.mm.plugin.wear.model.a.a();
  com.tencent.mm.plugin.wear.model.e.b pJc = new com.tencent.mm.plugin.wear.model.e.b();
  public i pJd = new i();
  j pJe = new j();
  p pJf = new p();
  
  public final boolean bSq()
  {
    return (bSr() != null) && (bSr().bSv().size() > 0);
  }
  
  public final com.tencent.mm.plugin.wear.model.a.b bSr()
  {
    if ((this.pJb.isAvailable()) && (this.pJb.bSw())) {
      return this.pJb;
    }
    return null;
  }
  
  public final boolean ba(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return false;
    }
    if (!bSq()) {
      return false;
    }
    String str = String.format("/wechat/%s/%d", new Object[] { "phone", Long.valueOf(System.currentTimeMillis()) });
    com.tencent.mm.plugin.wear.model.a.b localb = bSr();
    if (localb == null) {
      return false;
    }
    if (paramArrayOfByte.length > 92160) {}
    for (paramArrayOfByte = localb.u(str, paramArrayOfByte); paramArrayOfByte.code == 0; paramArrayOfByte = localb.t(str, paramArrayOfByte)) {
      return true;
    }
    return false;
  }
  
  public final byte[] bb(byte[] paramArrayOfByte)
  {
    Cipher localCipher = null;
    byte[] arrayOfByte = this.pJc.DE();
    Object localObject = localCipher;
    if (paramArrayOfByte != null)
    {
      localObject = localCipher;
      if (arrayOfByte == null) {}
    }
    try
    {
      x.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.u(arrayOfByte) });
      localObject = new SecretKeySpec(arrayOfByte, "AES");
      localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      localCipher.init(2, (Key)localObject);
      localObject = localCipher.doFinal(paramArrayOfByte);
      return (byte[])localObject;
    }
    catch (Exception paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
    }
    return null;
  }
  
  public final byte[] bc(byte[] paramArrayOfByte)
  {
    Object localObject2 = null;
    byte[] arrayOfByte = this.pJc.DE();
    Object localObject1 = localObject2;
    if (paramArrayOfByte != null)
    {
      localObject1 = localObject2;
      if (arrayOfByte == null) {}
    }
    try
    {
      x.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.u(arrayOfByte) });
      localObject1 = com.tencent.mm.plugin.wear.a.a.f(paramArrayOfByte, arrayOfByte);
      return (byte[])localObject1;
    }
    catch (Exception paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */