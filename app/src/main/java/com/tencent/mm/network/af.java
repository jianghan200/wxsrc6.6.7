package com.tencent.mm.network;

import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mars.stn.StnLogic.ICallBack;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class af
  implements StnLogic.ICallBack
{
  private static WakerLock etI = null;
  private static int etJ = 1000000205;
  private static int etK = 205;
  private static byte[] etL;
  private static byte[] etM;
  
  private static int a(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2)
  {
    if (aa.UZ() == null) {}
    do
    {
      return 0;
      try
      {
        byte[] arrayOfByte = aa.UZ().UF();
        if (arrayOfByte != null)
        {
          paramByteArrayOutputStream1.write(arrayOfByte);
          etL = arrayOfByte;
        }
        arrayOfByte = aa.UZ().dpW;
        if (arrayOfByte != null)
        {
          paramByteArrayOutputStream2.write(arrayOfByte);
          etM = arrayOfByte;
        }
        int i = aa.UZ().esl.Df();
        return i;
      }
      catch (Exception localException)
      {
        x.e("StnCallBack", exception2String(localException));
      }
    } while ((etL == null) || (etM == null));
    try
    {
      paramByteArrayOutputStream1.write(etL);
      paramByteArrayOutputStream2.write(etM);
      return 0;
    }
    catch (IOException paramByteArrayOutputStream1) {}
    return 0;
  }
  
  private static String exception2String(Exception paramException)
  {
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  public final int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    if (aa.Va() == null) {
      return -1;
    }
    try
    {
      paramInt1 = aa.Va().a(paramInt1, paramArrayOfByte, paramArrayOfInt1, paramArrayOfInt2);
      return paramInt1;
    }
    catch (Exception paramObject)
    {
      x.e("StnCallBack", exception2String((Exception)paramObject));
      new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
    }
    return -1;
  }
  
  public final int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = etK;
    paramArrayOfInt[1] = etJ;
    if ((a(paramByteArrayOutputStream1, paramByteArrayOutputStream2) == 0) || (paramByteArrayOutputStream1.size() == 0) || (paramByteArrayOutputStream2.size() == 0))
    {
      requestDoSync();
      return StnLogic.ECHECK_NEXT;
    }
    return StnLogic.ECHECK_NOW;
  }
  
  public final boolean isLogoned()
  {
    if (aa.UZ() == null) {
      return false;
    }
    try
    {
      boolean bool = aa.UZ().esl.Ln();
      return bool;
    }
    catch (Exception localException)
    {
      x.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return false;
  }
  
  public final boolean makesureAuthed()
  {
    if (aa.UZ() == null) {
      return false;
    }
    try
    {
      boolean bool = aa.UZ().UE();
      return bool;
    }
    catch (Exception localException)
    {
      x.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return false;
  }
  
  public final void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    x.i("StnCallBack", "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean), paramString });
    try
    {
      aa.UZ().est.networkAnalysisCallBack(paramInt1, paramInt2, paramBoolean, paramString);
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("StnCallBack", paramString, "", new Object[0]);
      new StringBuilder().append(paramString.getClass().getSimpleName()).append(":").append(paramString.getStackTrace()[0]).append(", ").append(paramString.getStackTrace()[1]);
    }
  }
  
  public final boolean onLongLinkIdentifyResp(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null)) {
      localByteArrayOutputStream = new ByteArrayOutputStream();
    }
    try
    {
      localByteArrayOutputStream.write(paramArrayOfByte1);
      localByteArrayOutputStream.write(paramArrayOfByte2);
      onPush(etJ, localByteArrayOutputStream.toByteArray());
      return true;
    }
    catch (IOException paramArrayOfByte1)
    {
      for (;;) {}
    }
  }
  
  public final String[] onNewDns(String paramString)
  {
    return new String[0];
  }
  
  public final void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    if (aa.Vb() == null) {
      return;
    }
    try
    {
      if (etI == null) {
        etI = new WakerLock(aa.getContext(), "StnCallBack");
      }
      etI.lock(1000L, "StnLogic.onNotify");
      aa.UX().post(new af.1(this, paramInt, paramArrayOfByte));
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("StnCallBack", exception2String(paramArrayOfByte));
      new StringBuilder().append(paramArrayOfByte.getClass().getSimpleName()).append(":").append(paramArrayOfByte.getStackTrace()[0]).append(", ").append(paramArrayOfByte.getStackTrace()[1]);
    }
  }
  
  public final int onTaskEnd(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    if (aa.Va() == null) {
      return 0;
    }
    try
    {
      i = aa.Va().iM(paramInt1);
      x.e("StnCallBack", exception2String((Exception)paramObject));
    }
    catch (Exception paramObject)
    {
      try
      {
        aa.UX().post(new af.2(this, paramInt1, paramObject, paramInt2, paramInt3));
        return i;
      }
      catch (Exception paramObject)
      {
        for (;;)
        {
          int i;
          paramInt1 = i;
        }
      }
      paramObject = paramObject;
      paramInt1 = 0;
    }
    new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
    return paramInt1;
  }
  
  public final void reportConnectInfo(int paramInt1, int paramInt2)
  {
    try
    {
      aa.UW().iO(paramInt1);
      com.tencent.mm.af.a.hF(paramInt1);
      return;
    }
    catch (Exception localException)
    {
      x.e("StnCallBack", "reportConnectInfo :%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final boolean req2Buf(int paramInt1, Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    if (aa.Va() == null) {
      return false;
    }
    try
    {
      boolean bool = aa.Va().a(paramInt1, paramByteArrayOutputStream, paramArrayOfInt, paramInt2);
      return bool;
    }
    catch (Exception paramObject)
    {
      x.e("StnCallBack", exception2String((Exception)paramObject));
      new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
    }
    return false;
  }
  
  public final void requestDoSync()
  {
    if (aa.Vb() == null) {
      return;
    }
    try
    {
      aa.UX().post(new af.3(this));
      return;
    }
    catch (Exception localException)
    {
      x.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
  }
  
  public final String[] requestNetCheckShortLinkHosts()
  {
    return new String[0];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/network/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */