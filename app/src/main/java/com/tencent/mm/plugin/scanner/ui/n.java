package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.tencent.mm.g.a.on;
import com.tencent.mm.plugin.scanner.util.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends m
{
  public n(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint, paramDisplayMetrics, paramInt);
  }
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    x.d("MicroMsg.ScanModeLicenceForIdCardPayAuth", "onDecodeSuccess");
    paramString = ((k)this.mKj).mNO;
    paramArrayOfByte1 = new on();
    paramArrayOfByte1.bZr.cardType = "identity";
    paramArrayOfByte1.bZr.bZs = 1;
    if ((this.mKj instanceof k)) {
      paramArrayOfByte1.bZr.bZu = paramString;
    }
    a.sFg.a(paramArrayOfByte1, Looper.getMainLooper());
    this.mKp.getContext().finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */