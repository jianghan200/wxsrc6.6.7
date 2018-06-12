package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class r
{
  private static AtomicInteger pKg = new AtomicInteger();
  
  public static void b(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramBoolean) {
      arrayOfByte = a.bSl().pIM.bc(paramArrayOfByte);
    }
    int i = pKg.incrementAndGet();
    paramArrayOfByte = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(paramArrayOfByte);
    try
    {
      localDataOutputStream.writeInt(0);
      localDataOutputStream.writeInt(i);
      localDataOutputStream.writeInt(paramInt);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
      {
        localDataOutputStream.writeInt(arrayOfByte.length);
        localDataOutputStream.write(arrayOfByte);
      }
      for (;;)
      {
        a.bSl().pIM.ba(paramArrayOfByte.toByteArray());
        return;
        localDataOutputStream.writeInt(0);
      }
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.Wear.WearPushServerLogic", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(paramInt) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */