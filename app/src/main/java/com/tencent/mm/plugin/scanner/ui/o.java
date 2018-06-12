package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.j;
import com.tencent.mm.plugin.scanner.util.p;
import com.tencent.mm.protocal.c.awi;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends i
  implements com.tencent.mm.ab.e, b.a
{
  private int mFO;
  int mKE = 0;
  int mKF = 2;
  private long mKG;
  private final int mKH = 184;
  private final int mKI = 46;
  private final int mKJ = 276;
  private final int mKK = 70;
  private float mKP;
  private final int mKS = 50;
  com.tencent.mm.plugin.scanner.a.e mKX;
  private int mKY = 0;
  private TextView mKZ;
  private TextView mLa;
  private final int mLb = 5000;
  private final int mLc = 8000;
  private ag mLd = new o.1(this);
  
  public o(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint, (byte)0);
    jdMethod_do(184, 46);
    this.mKP = p.dq(276, this.mKl);
    x.d("MicroMsg.scanner.ScanModeOCR", "frameRectWidth = [%s], frameRectHeight = [%s], scaleRate = [%s]", new Object[] { Integer.valueOf(this.mKl), Integer.valueOf(this.mKm), Float.valueOf(this.mKP) });
    this.mFO = ((int)(System.currentTimeMillis() & 0xFFFFFFFFFFFFFFFF));
  }
  
  private void bsN()
  {
    if (this.mKp == null)
    {
      x.e("MicroMsg.scanner.ScanModeOCR", "dealWithNetWork(), scanUICallback == null");
      return;
    }
    if ((au.DF().Lg() == 6) || (au.DF().Lg() == 4))
    {
      this.mKp.ev(0L);
      return;
    }
    this.mKZ.setText("");
    this.mLa.setText("");
    this.mKp.hu(true);
  }
  
  private void er(String paramString1, String paramString2)
  {
    if (!bi.oW(paramString1))
    {
      this.gmo.setVisibility(8);
      this.mKZ.setText(paramString1);
      this.mKZ.setVisibility(0);
    }
    while (!bi.oW(paramString2))
    {
      this.gmo.setVisibility(8);
      this.mLa.setText(paramString2);
      this.mLa.setVisibility(0);
      return;
      this.mKZ.setText("");
    }
    this.mLa.setText("");
  }
  
  public final void E(Bundle paramBundle) {}
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    this.mLd.removeMessages(0);
    switch (paraml.getType())
    {
    }
    do
    {
      do
      {
        return;
        this.mKE -= 1;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          x.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          this.mKG -= 300L;
          er(null, null);
          return;
        }
        x.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        paramString = (com.tencent.mm.plugin.scanner.a.e)paraml;
        if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
        for (paramString = (awi)paramString.diG.dIE.dIL; paramString == null; paramString = null)
        {
          x.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd(), getResp() == null");
          er(null, null);
          return;
        }
        x.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() clientScanID = %s, imageType = %s, source = %s, translate = %s", new Object[] { Integer.valueOf(paramString.rjz), Integer.valueOf(paramString.rjD), paramString.rZE, paramString.rZF });
      } while (bi.oW(paramString.rZF));
      er(paramString.rZE, paramString.rZF);
    } while (this.mKX == null);
    au.DF().c(this.mKX);
  }
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      return;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      boolean bool;
      if (paramArrayOfByte2 == null)
      {
        bool = true;
        x.w("MicroMsg.scanner.ScanModeOCR", "greyData null:[%s]", new Object[] { Boolean.valueOf(bool) });
        if ((System.currentTimeMillis() - this.mKG <= 1840L) || (((j)this.mKj).mNK != true)) {
          break label111;
        }
        this.mKG = System.currentTimeMillis();
        this.mKp.ev(0L);
      }
      for (;;)
      {
        this.mKY = 0;
        return;
        bool = false;
        break;
        label111:
        this.mKp.eu(40L);
      }
    }
    if (this.mKE >= this.mKF)
    {
      if ((System.currentTimeMillis() - this.mKG > 1840L) && (((j)this.mKj).mNK == true))
      {
        this.mKG = System.currentTimeMillis();
        this.mKp.ev(0L);
      }
      for (;;)
      {
        x.w("MicroMsg.scanner.ScanModeOCR", "hasDoSceneCount[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.mKE), Integer.valueOf(this.mKF) });
        return;
        this.mKp.eu(40L);
      }
    }
    this.mKX = new com.tencent.mm.plugin.scanner.a.e(paramArrayOfByte2, "en", "zh_CN", this.mFO);
    au.DF().a(this.mKX, 0);
    this.mKE += 1;
    this.mLd.removeMessages(0);
    if (ao.is2G(this.mKp.getContext()))
    {
      this.mLd.sendEmptyMessageDelayed(0, 8000L);
      this.mKq += paramArrayOfByte2.length;
      x.d("MicroMsg.scanner.ScanModeOCR", "totalNetworkFlow[%s], hasTakePicNum[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.mKq), Integer.valueOf(this.mKY), Integer.valueOf(this.mKF) });
      if ((System.currentTimeMillis() - this.mKG <= 1840L) || (((j)this.mKj).mNK != true)) {
        break label465;
      }
      this.mKG = System.currentTimeMillis();
      this.mKp.ev(0L);
    }
    for (;;)
    {
      x.v("MicroMsg.scanner.ScanModeOCR", "onDecodeFinished:" + this.mKE + "," + this.mKY);
      return;
      this.mLd.sendEmptyMessageDelayed(0, 5000L);
      break;
      label465:
      this.mKp.eu(40L);
    }
  }
  
  public final void bsf()
  {
    x.d("MicroMsg.scanner.ScanModeOCR", "decodeFail");
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      return;
    }
    if ((System.currentTimeMillis() - this.mKG > 1840L) && (((j)this.mKj).mNK == true))
    {
      this.mKG = System.currentTimeMillis();
      this.mKp.ev(0L);
      return;
    }
    this.mKp.eu(40L);
  }
  
  protected final void bsj()
  {
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      return;
    }
    bsN();
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bsk()
  {
    int i;
    if (this.mKj == null)
    {
      i = 50;
      if (q.deM.ddb > 0)
      {
        i = q.deM.ddb;
        x.d("MicroMsg.scanner.ScanModeOCR", "ImageQuality=[%s]", new Object[] { Integer.valueOf(q.deM.ddb) });
      }
      if (!ao.is2G(this.mKp.getContext())) {
        break label100;
      }
    }
    label100:
    for (this.mKj = new j(this, i - 10, this.mKP, true, this.mKp.bsz());; this.mKj = new j(this, i, this.mKP, true, this.mKp.bsz())) {
      return this.mKj;
    }
  }
  
  protected final int bsl()
  {
    return R.i.scan_ocr_body;
  }
  
  protected final int bsm()
  {
    return 0;
  }
  
  protected final void bsn()
  {
    j(new Rect(0, 0, 0, 0));
    this.mKp.b(4, null);
    this.mKp.ev(0L);
    onResume();
  }
  
  protected final boolean bso()
  {
    return true;
  }
  
  protected final boolean bsp()
  {
    return true;
  }
  
  protected final void j(Rect paramRect)
  {
    this.gmo = ((TextView)this.mKp.findViewById(R.h.scan_tip_tv));
    this.mLa = ((TextView)this.mKp.findViewById(R.h.ocr_result_tips));
    this.mKZ = ((TextView)this.mKp.findViewById(R.h.ocr_source_tv));
    this.gmo = ((TextView)this.mKp.findViewById(R.h.scan_tip_tv));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.gmo.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.mKp.getContext(), 13.0F));
      this.gmo.setLayoutParams(localLayoutParams);
      localLayoutParams = (RelativeLayout.LayoutParams)this.mKZ.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.mKp.getContext(), 13.0F));
      this.mKZ.setLayoutParams(localLayoutParams);
      this.mKZ.setVisibility(4);
    }
    if (d.zf())
    {
      this.gmo.setPadding(BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.gmo.getPaddingTop(), BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.gmo.getPaddingBottom());
      this.mKZ.setPadding(BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.mKZ.getPaddingTop(), BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.mKZ.getPaddingBottom());
    }
    if (this.mKj != null) {
      ((j)this.mKj).lhy = this.mKp.bsz();
    }
    bsN();
    hw(true);
  }
  
  protected final void onDestroy() {}
  
  protected final void onPause()
  {
    hw(false);
    au.DF().b(392, this);
  }
  
  protected final void onResume()
  {
    au.DF().a(392, this);
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      return;
    }
    bsN();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */