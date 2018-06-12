package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class g
{
  public long pGZ = -1L;
  public long pHa = 0L;
  
  public final g aZ(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    try
    {
      this.pGZ = paramArrayOfByte.readLong();
      this.pHa = paramArrayOfByte.readLong();
      paramArrayOfByte.close();
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.TimeInfo", paramArrayOfByte, "", new Object[0]);
    }
    return this;
  }
  
  public final byte[] toByteArray()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeLong(this.pGZ);
      localDataOutputStream.writeLong(this.pHa);
      localDataOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.TimeInfo", localIOException, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */