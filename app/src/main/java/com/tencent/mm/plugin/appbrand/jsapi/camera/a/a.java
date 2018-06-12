package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qbar.QbarNative;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a
  extends b
{
  private Object dMd = new Object();
  private QbarNative fOK;
  private volatile boolean fOL = false;
  private byte[] fOM;
  byte[] fON;
  private String type;
  
  public a(b.a parama, String paramString)
  {
    super(parama);
    this.type = paramString;
  }
  
  private void ll()
  {
    synchronized (this.dMd)
    {
      if (this.fOL)
      {
        int i = this.fOK.release();
        this.fOK = null;
        this.fOL = false;
        x.d("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative.Release():%d", new Object[] { Integer.valueOf(i) });
      }
      return;
    }
  }
  
  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2;
    for (;;)
    {
      synchronized (this.dMd)
      {
        if (!this.fOL)
        {
          x.e("MicroMsg.appbrand.ScanQBarDecoder", "not init");
          return false;
        }
        x.d("MicroMsg.appbrand.ScanQBarDecoder", "decode start");
        localObject2 = new int[2];
        localObject2[0] = paramInt1;
        localObject2[1] = paramInt2;
        if (this.fOM == null)
        {
          this.fOM = new byte[paramInt1 * paramInt2 * 3 / 2];
          this.fON = new byte[paramInt1 * paramInt2];
          x.d("MicroMsg.appbrand.ScanQBarDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(paramInt1 * paramInt2 * 3 / 2) });
          x.d("MicroMsg.appbrand.ScanQBarDecoder", "onFrameData: %s, width: %s, height: %s cameraRotation:%d", new Object[] { paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramInt1 = QbarNative.a(this.fOM, (int[])localObject2, paramArrayOfByte, paramInt1, paramInt2, 0, 0, paramInt1, paramInt2, paramInt3);
          if (paramInt1 == 1) {
            break;
          }
          x.e("MicroMsg.appbrand.ScanQBarDecoder", "decode isProOk %s", new Object[] { Integer.valueOf(paramInt1) });
          return false;
        }
      }
      if (this.fOM.length != paramInt1 * paramInt2 * 3 / 2)
      {
        this.fOM = null;
        this.fOM = new byte[paramInt1 * paramInt2 * 3 / 2];
        this.fON = null;
        this.fON = new byte[paramInt1 * paramInt2];
        x.d("MicroMsg.appbrand.ScanQBarDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(paramInt1 * paramInt2 * 3 / 2) });
      }
    }
    System.arraycopy(this.fOM, 0, this.fON, 0, this.fON.length);
    if (this.fON != null) {
      x.d("MicroMsg.appbrand.ScanQBarDecoder", "tempGrayData.len: %d, width: %d, height: %d", new Object[] { Integer.valueOf(this.fON.length), Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
    }
    boolean bool;
    if (this.fON != null)
    {
      paramInt1 = this.fOK.u(this.fON, localObject2[0], localObject2[1]);
      if (this.fOK.cEL() != 0)
      {
        bool = true;
        x.i("MicroMsg.appbrand.ScanQBarDecoder", "after scanImage, result:%d,hasCode: %s, areaRatio: %f", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool), Float.valueOf(this.fOK.cEK()) });
      }
    }
    for (;;)
    {
      if (paramInt1 != 1) {
        return false;
      }
      localObject2 = new StringBuilder();
      paramArrayOfByte = new StringBuilder();
      StringBuilder localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = new StringBuilder();
      int[] arrayOfInt = new int[2];
      paramInt1 = this.fOK.a((StringBuilder)localObject2, paramArrayOfByte, localStringBuilder1, localStringBuilder2, arrayOfInt);
      if (paramInt1 == 1)
      {
        x.d("MicroMsg.appbrand.ScanQBarDecoder", "decode type:%s, sCharset: %s, sBinaryMethod: %s, data:%s, gResult:%s", new Object[] { ((StringBuilder)localObject2).toString(), localStringBuilder1.toString(), localStringBuilder2.toString(), paramArrayOfByte.toString(), Integer.valueOf(paramInt1) });
        if (!bi.oW(paramArrayOfByte.toString()))
        {
          localObject2 = ((StringBuilder)localObject2).toString();
          if ((!((String)localObject2).equals("QR_CODE")) && (!((String)localObject2).equals("WX_CODE")))
          {
            paramArrayOfByte = paramArrayOfByte.toString();
            x.d("MicroMsg.appbrand.ScanDecoder", "result:%b, resultText:%s, resultType:%d, codeType:%d, codeVersion:%d", new Object[] { Boolean.valueOf(true), paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
            ah.A(new b.2(this, paramArrayOfByte));
            return true;
          }
        }
      }
      return false;
      bool = false;
      break;
      paramInt1 = -1;
    }
  }
  
  public final void init()
  {
    x.i("MicroMsg.appbrand.ScanQBarDecoder", "init");
    Object localObject1 = this.type;
    synchronized (this.dMd)
    {
      if (this.fOL)
      {
        x.i("MicroMsg.appbrand.ScanQBarDecoder", "the QbarDecoder is already init");
        return;
      }
      this.fOK = new QbarNative();
      ??? = new HashSet();
      if (((String)localObject1).contains("barcode")) {
        ((Set)???).add(Integer.valueOf(0));
      }
      if (((String)localObject1).contains("qrcode")) {
        ((Set)???).add(Integer.valueOf(2));
      }
      ((Set)???).add(Integer.valueOf(3));
      localObject1 = new int[((Set)???).size()];
      ??? = ((Set)???).iterator();
      i = 0;
      while (((Iterator)???).hasNext())
      {
        Integer localInteger = (Integer)((Iterator)???).next();
        if (localInteger != null)
        {
          localObject1[i] = localInteger.intValue();
          i += 1;
        }
      }
    }
    int i = this.fOK.E(0, "ANY", "UTF-8");
    int j = this.fOK.g(arrayOfInt, arrayOfInt.length);
    x.i("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative.Init = [%d], SetReaders = [%d], version = [%s], readers: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), QbarNative.getVersion(), Arrays.toString(arrayOfInt) });
    if ((i <= 0) || (j <= 0))
    {
      x.e("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative failed");
      ll();
      return;
    }
    synchronized (this.dMd)
    {
      this.fOL = true;
      return;
    }
  }
  
  public final void release()
  {
    x.i("MicroMsg.appbrand.ScanQBarDecoder", "release");
    ll();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */