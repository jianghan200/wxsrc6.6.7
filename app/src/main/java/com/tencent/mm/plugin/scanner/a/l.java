package com.tencent.mm.plugin.scanner.a;

import android.graphics.Point;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class l
{
  public static int mFQ = 0;
  public static int mFR = 1;
  public static int mFS = 2;
  public static l mFT = new l();
  private long mFU = 0L;
  public boolean mFV = false;
  public int mFW = 0;
  private long mFX = 0L;
  private Point mFY = null;
  private String mFZ;
  private String mGa;
  private String mGb;
  private int mGc;
  private int mGd;
  private String mGe;
  public StringBuilder mGf = new StringBuilder();
  private int mGg;
  private boolean mGh = false;
  public boolean mGi;
  public int mxT = -1;
  private int retryCount = 0;
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    x.i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString4 });
    this.mFZ = paramString1;
    this.mGa = paramString2;
    this.mGb = paramString3;
    this.mGc = paramInt1;
    this.mGd = paramInt2;
    this.mGe = paramString4;
  }
  
  public final void aXS()
  {
    int k = 0;
    if (this.mGh)
    {
      x.i("MicroMsg.QBarEngineReporter", "doReport, already report");
      return;
    }
    int j = this.mFW;
    long l1 = this.mFU;
    long l2 = this.mFX;
    int m = this.mxT;
    Object localObject1 = this.mFY;
    int n = this.retryCount;
    boolean bool = this.mFV;
    Object localObject2 = this.mFZ;
    String str1 = this.mGa;
    String str2 = this.mGb;
    int i1 = this.mGc;
    int i2 = this.mGd;
    String str3 = this.mGe;
    int i;
    label341:
    int i3;
    if (!bi.oW(this.mGa))
    {
      i = this.mGa.length();
      x.i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d", new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(m), localObject1, Integer.valueOf(n), Boolean.valueOf(bool), localObject2, str1, str2, Integer.valueOf(i1), Integer.valueOf(i2), str3, Integer.valueOf(i), this.mGf.toString(), Integer.valueOf(this.mGg) });
      localObject1 = "";
      if (this.mFY != null) {
        localObject1 = this.mFY.x + "x" + this.mFY.y;
      }
      localObject2 = h.mEJ;
      m = this.mFW;
      l1 = this.mFU;
      l2 = this.mFX;
      n = this.mxT;
      i1 = this.retryCount;
      if (!this.mFV) {
        break label563;
      }
      i = 0;
      str1 = this.mFZ;
      str2 = this.mGb;
      i2 = this.mGc;
      i3 = this.mGd;
      str3 = this.mGe;
      if (bi.oW(this.mGa)) {
        break label568;
      }
    }
    label563:
    label568:
    for (j = this.mGa.length();; j = 0)
    {
      String str4 = this.mGf.toString();
      int i4 = this.mGg;
      if (this.mGi) {
        k = 1;
      }
      ((h)localObject2).h(13233, new Object[] { Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(n), localObject1, Integer.valueOf(i1), Integer.valueOf(i), str1, "", str2, Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(j), str4, Integer.valueOf(i4), Integer.valueOf(k) });
      this.mGh = true;
      return;
      i = 0;
      break;
      i = 1;
      break label341;
    }
  }
  
  public final void bsc()
  {
    x.i("MicroMsg.QBarEngineReporter", "markScanSuccess");
    this.mFV = true;
  }
  
  public final void bsd()
  {
    x.i("MicroMsg.QBarEngineReporter", "addScanFrame, current scan frame: %s", new Object[] { Integer.valueOf(this.mFW) });
    this.mFW += 1;
  }
  
  public final void bse()
  {
    x.i("MicroMsg.QBarEngineReporter", "addRetryTime, current retry count: %s", new Object[] { Integer.valueOf(this.retryCount) });
    this.retryCount += 1;
  }
  
  public final void dn(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.QBarEngineReporter", "setScanResolution, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.mFY = new Point(paramInt1, paramInt2);
  }
  
  public final void es(long paramLong)
  {
    x.i("MicroMsg.QBarEngineReporter", "addScanTime: %s", new Object[] { Long.valueOf(paramLong) });
    this.mFU += paramLong;
  }
  
  public final void et(long paramLong)
  {
    x.i("MicroMsg.QBarEngineReporter", "setScanSuccessTime: %s,", new Object[] { Long.valueOf(paramLong) });
    this.mFX = paramLong;
  }
  
  public final void reset()
  {
    this.mFU = 0L;
    this.mFV = false;
    this.mFW = 0;
    this.mxT = -1;
    this.mFY = null;
    this.retryCount = 0;
    this.mFZ = "";
    this.mGa = "";
    this.mGb = "";
    this.mGc = 0;
    this.mGd = 0;
    this.mGe = "";
    this.mFX = 0L;
    this.mGh = false;
    this.mGf.delete(0, this.mGf.length());
    this.mGg = 0;
    this.mGi = false;
    x.i("MicroMsg.QBarEngineReporter", "reset");
  }
  
  public final void vy(int paramInt)
  {
    x.i("MicroMsg.QBarEngineReporter", "setScanScene, scene: %s", new Object[] { Integer.valueOf(paramInt) });
    this.mxT = paramInt;
  }
  
  public final void vz(int paramInt)
  {
    if (this.mGg != 2) {
      this.mGg = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */