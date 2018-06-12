package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class a
{
  public final void b(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    Object localObject = paramArrayOfByte;
    if (zE(paramInt3))
    {
      localObject = paramArrayOfByte;
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bSl().pIM.bb(paramArrayOfByte);
        localObject = paramArrayOfByte;
        if (paramArrayOfByte == null) {
          x.e("MicroMsg.Wear.BaseHttpServer", "request data decrypt error");
        }
      }
    }
    do
    {
      return;
      localObject = p(paramInt3, (byte[])localObject);
    } while (!bSz());
    paramArrayOfByte = (byte[])localObject;
    if (zD(paramInt3)) {
      paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bSl().pIM.bc((byte[])localObject);
    }
    localObject = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    for (;;)
    {
      try
      {
        localDataOutputStream.writeInt(paramInt1);
        localDataOutputStream.writeInt(paramInt2);
        localDataOutputStream.writeInt(paramInt3);
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
        {
          localDataOutputStream.writeInt(paramArrayOfByte.length);
          localDataOutputStream.write(paramArrayOfByte);
          paramArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
          x.i("MicroMsg.Wear.BaseHttpServer", "send data funId=%d length=%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramArrayOfByte.length) });
          if (zF(paramInt3)) {
            break;
          }
          com.tencent.mm.plugin.wear.model.a.bSl().pIM.ba(paramArrayOfByte);
          return;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.Wear.BaseHttpServer", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        return;
      }
      localDataOutputStream.writeInt(0);
    }
    e.post(new a.1(this, paramArrayOfByte), "WearSendResponseTask");
  }
  
  public abstract List<Integer> bSy();
  
  public boolean bSz()
  {
    return true;
  }
  
  protected abstract byte[] p(int paramInt, byte[] paramArrayOfByte);
  
  protected boolean zD(int paramInt)
  {
    return false;
  }
  
  protected boolean zE(int paramInt)
  {
    return false;
  }
  
  public boolean zF(int paramInt)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */