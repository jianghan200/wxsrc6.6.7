package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.v;
import com.tencent.mm.g.a.on;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.scanner.util.k;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.protocal.c.io;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public abstract class c
  extends i
  implements com.tencent.mm.plugin.scanner.util.b.a
{
  private long mGP;
  int mGQ = 0;
  private HighlightRectSideView mGR;
  l mGS = null;
  private p mGT = null;
  private com.tencent.mm.ui.widget.a.c mGU = null;
  
  public c(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    this.mKn = 0;
    this.mKo = 0;
    float f = bsg();
    int i;
    if (paramInt == 1)
    {
      paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);
      i = (int)(paramPoint.y * 0.8F);
      paramInt = (int)(paramPoint.x * 0.8F);
      if (i * f <= paramPoint.x) {
        break label226;
      }
      i = (int)(paramInt / f);
    }
    for (;;)
    {
      Point localPoint = new Point((int)(paramInt / paramDisplayMetrics.density), (int)(i / paramDisplayMetrics.density));
      this.mKo = ((int)((paramPoint.y / paramDisplayMetrics.density - localPoint.y) / 2.0F));
      jdMethod_do(localPoint.x, localPoint.y);
      if (bi.fQ(paramb.getContext()) >= 100L) {
        break label238;
      }
      x.w("MicroMsg.BaseScanModeLicence", "memory is not much");
      this.mGP = 280L;
      return;
      paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels);
      break;
      label226:
      paramInt = (int)(i * f);
    }
    label238:
    this.mGP = 80L;
  }
  
  private void bsq()
  {
    boolean[] arrayOfBoolean = ((k)this.mKj).btk();
    this.mGR.setShowRectEdges(arrayOfBoolean);
    this.mKp.eu(this.mGP);
  }
  
  private void r(int paramInt, String paramString1, String paramString2)
  {
    if (paramInt == 0)
    {
      localon = new on();
      localon.bZr.cardType = paramString1;
      localon.bZr.bZs = 1;
      localon.bZr.bZt = paramString2;
      if ((this.mKj instanceof k)) {
        localon.bZr.bZu = ((k)this.mKj).mNO;
      }
      a.sFg.a(localon, Looper.getMainLooper());
      if (this.mGT != null) {
        this.mGT.dismiss();
      }
      this.mKp.getContext().finish();
      return;
    }
    if (((paramInt & 0x2) > 0) && ((paramInt & 0x1) > 0))
    {
      localon = new on();
      localon.bZr.cardType = paramString1;
      localon.bZr.bZs = 0;
      localon.bZr.bZt = paramString2;
      a.sFg.a(localon, Looper.getMainLooper());
      if (this.mGT != null) {
        this.mGT.dismiss();
      }
      this.mKp.getContext().finish();
      return;
    }
    if (this.mGQ >= 3)
    {
      localon = new on();
      localon.bZr.cardType = paramString1;
      localon.bZr.bZs = 1;
      localon.bZr.bZt = paramString2;
      if ((this.mKj instanceof k)) {
        localon.bZr.bZu = ((k)this.mKj).mNO;
      }
      a.sFg.a(localon, Looper.getMainLooper());
      if (this.mGT != null) {
        this.mGT.dismiss();
      }
      this.mKp.getContext().finish();
      return;
    }
    if (((paramInt & 0x1) > 0) && (this.mGQ < 3))
    {
      if (this.mGT != null) {
        this.mGT.dismiss();
      }
      bsk().bsU();
      if ((paramInt & 0x20) > 0) {
        paramInt = R.l.scan_license_image_incomplete;
      }
      for (;;)
      {
        Toast.makeText(this.mKp.getContext(), paramInt, 0).show();
        bsq();
        return;
        if ((paramInt & 0x40) > 0) {
          paramInt = R.l.scan_license_image_too_dark;
        } else {
          paramInt = R.l.scan_license_continue;
        }
      }
    }
    on localon = new on();
    localon.bZr.cardType = paramString1;
    localon.bZr.bZs = 0;
    localon.bZr.bZt = paramString2;
    a.sFg.a(localon, Looper.getMainLooper());
    if (this.mGT != null) {
      this.mGT.dismiss();
    }
    this.mKp.getContext().finish();
  }
  
  public final void E(Bundle paramBundle) {}
  
  protected abstract com.tencent.mm.plugin.scanner.util.b a(com.tencent.mm.plugin.scanner.util.b.a parama);
  
  public void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    x.d("MicroMsg.BaseScanModeLicence", "onDecodeSuccess");
    paramArrayOfByte1 = ((k)this.mKj).mNO;
    paramString = bsh();
    if (this.mGT != null) {
      this.mGT.dismiss();
    }
    paramArrayOfByte2 = this.mKp.getContext();
    paramArrayOfByte2.getString(R.l.app_tip);
    this.mGT = h.a(paramArrayOfByte2, paramArrayOfByte2.getString(R.l.scan_license_server_recognising), false, null);
    this.mGT.setOnKeyListener(new c.2(this, paramString));
    paramArrayOfByte2 = new com.tencent.mm.ab.b.a();
    paramArrayOfByte2.dIG = new in();
    paramArrayOfByte2.dIH = new io();
    paramArrayOfByte2.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanlicense";
    paramArrayOfByte2.dIF = 1803;
    paramArrayOfByte2 = paramArrayOfByte2.KT();
    Object localObject = new ByteArrayOutputStream();
    if (!paramArrayOfByte1.compress(Bitmap.CompressFormat.JPEG, 80, (OutputStream)localObject))
    {
      r(2, paramString, "");
      return;
    }
    paramArrayOfByte1 = ((ByteArrayOutputStream)localObject).toByteArray();
    if (bi.bC(paramArrayOfByte1))
    {
      r(2, paramString, "");
      return;
    }
    localObject = (in)paramArrayOfByte2.dID.dIL;
    ((in)localObject).rjJ = new com.tencent.mm.bk.b(paramArrayOfByte1);
    if (paramString.equals("driving")) {
      ((in)localObject).rjI = 0;
    }
    for (;;)
    {
      this.mGS = v.a(paramArrayOfByte2, new c.1(this, paramString), false);
      return;
      if (paramString.equals("identity")) {
        ((in)localObject).rjI = 1;
      }
    }
  }
  
  public final void bsf()
  {
    x.d("MicroMsg.BaseScanModeLicence", "onDecodeFail");
    if (this.mKp == null)
    {
      x.e("MicroMsg.BaseScanModeLicence", "ui callback is null");
      return;
    }
    bsq();
  }
  
  protected abstract float bsg();
  
  protected abstract String bsh();
  
  protected abstract int bsi();
  
  protected final void bsj() {}
  
  protected final com.tencent.mm.plugin.scanner.util.b bsk()
  {
    if (this.mKj == null) {
      this.mKj = a(this);
    }
    return this.mKj;
  }
  
  protected final int bsl()
  {
    return R.i.scan_licence;
  }
  
  protected final int bsm()
  {
    return 0;
  }
  
  protected final void bsn() {}
  
  protected final boolean bso()
  {
    return false;
  }
  
  protected final boolean bsp()
  {
    return false;
  }
  
  protected final void cv(View paramView)
  {
    if (paramView != null)
    {
      TextView localTextView = (TextView)paramView.findViewById(R.h.card_tips);
      if (localTextView != null) {
        localTextView.setText(paramView.getContext().getString(R.l.scan_licence_tips, new Object[] { paramView.getContext().getString(bsi()) }));
      }
    }
  }
  
  protected final void j(Rect paramRect)
  {
    x.d("MicroMsg.BaseScanModeLicence", "smoothie, maskRect = %s", new Object[] { paramRect });
    HighlightRectSideView localHighlightRectSideView = (HighlightRectSideView)this.mKp.findViewById(R.h.card_highlight);
    if (localHighlightRectSideView != null) {
      localHighlightRectSideView.setMaskRect(paramRect);
    }
    this.mGR = localHighlightRectSideView;
  }
  
  protected final void onDestroy() {}
  
  protected final void onResume() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */