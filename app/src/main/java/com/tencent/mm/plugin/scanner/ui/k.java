package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.scanner.a.g;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.plugin.scanner.util.j;
import com.tencent.mm.plugin.scanner.util.n;
import com.tencent.mm.plugin.scanner.util.p;
import com.tencent.mm.protocal.c.im;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends i
  implements e, b.a
{
  private static int mKB = 300;
  private int mFO;
  private TextView mHt;
  private View mHu;
  private long mKC = 130L;
  g mKD;
  private int mKE = 0;
  private int mKF = 1;
  private long mKG;
  private final int mKH = 260;
  private final int mKI = 300;
  private final int mKJ = 390;
  private final int mKK = 450;
  private final int mKL = 220;
  private final int mKM = 240;
  private final int mKN = 330;
  private final int mKO = 360;
  private float mKP;
  private final long mKQ = 30000L;
  private long mKR;
  private final int mKS = 50;
  private e.a mKT = new e.a()
  {
    public final void o(int paramAnonymousInt, Bundle paramAnonymousBundle)
    {
      switch (paramAnonymousInt)
      {
      case 0: 
      case 1: 
      case 2: 
      default: 
        return;
      }
      k.this.mKp.bsA();
    }
  };
  private View.OnTouchListener mKU;
  
  public k(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint);
    if (!d.zf()) {
      jdMethod_do(260, 300);
    }
    for (this.mKP = p.dq(390, this.mKl);; this.mKP = p.dq(330, this.mKl))
    {
      x.d("MicroMsg.scanner.ScanModeImage", "frameRectWidth = [%s], frameRectHeight = [%s], scaleRate = [%s]", new Object[] { Integer.valueOf(this.mKl), Integer.valueOf(this.mKm), Float.valueOf(this.mKP) });
      if (bi.fQ(paramb.getContext()) < 100L)
      {
        x.w("MicroMsg.scanner.ScanModeImage", "memory is not much");
        this.mKC = 300L;
      }
      this.mFO = ((int)(System.currentTimeMillis() & 0xFFFFFFFFFFFFFFFF));
      this.mKR = System.currentTimeMillis();
      return;
      jdMethod_do(220, 240);
    }
  }
  
  private void bsN()
  {
    if (this.mKp == null) {
      x.e("MicroMsg.scanner.ScanModeImage", "dealWithNetWork(), scanUICallback == null");
    }
    while ((au.DF().Lg() != 6) && (au.DF().Lg() != 4)) {
      return;
    }
    this.mKp.ev(0L);
  }
  
  private void bsO()
  {
    ah.A(new k.2(this));
  }
  
  public final void E(Bundle paramBundle) {}
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    this.mKE = 0;
    boolean bool;
    if ((this.mKp == null) || (paraml == null)) {
      if (paraml == null)
      {
        bool = true;
        x.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      if (paraml.getType() == 1062)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          x.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          this.gmo.setText(p.et(p.mOc, this.mKp.getContext().getString(R.l.scan_img_tips_focus)));
        }
        while (this.mKD != null)
        {
          au.DF().c(this.mKD);
          return;
          this.mKE = this.mKF;
          paramString = (g)paraml;
          if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
          for (paramString = (im)paramString.diG.dIE.dIL; paramString == null; paramString = null)
          {
            x.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd(), getResp() == null");
            return;
          }
          x.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() clientScanID = %s, imageType = %s", new Object[] { Integer.valueOf(paramString.rjz), Integer.valueOf(paramString.rjD) });
          switch (n.a(paramString.hcE, paramString.rjF, this, 3, this.mKT, 0, 0, false))
          {
          default: 
            break;
          case 0: 
            this.mKp.bss();
            if ((this.mKp != null) && (this.mKp.getContext() != null)) {
              this.mKp.bsA();
            }
            break;
          case 1: 
            x.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
            break;
          case 2: 
            x.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
          }
        }
      }
    }
  }
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      return;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      x.w("MicroMsg.scanner.ScanModeImage", "greyData null");
      if ((System.currentTimeMillis() - this.mKG > 1800L + this.mKC) && (((j)this.mKj).mNK == true))
      {
        this.mKG = System.currentTimeMillis();
        this.mKp.ev(0L);
        return;
      }
      this.mKp.eu(this.mKC);
      return;
    }
    bsO();
    if (this.mKE >= this.mKF)
    {
      x.i("MicroMsg.scanner.ScanModeImage", "too quick to send image, return now");
      this.mKp.eu(this.mKC);
      if ((System.currentTimeMillis() - this.mKG > 1800L + this.mKC) && (((j)this.mKj).mNK == true))
      {
        this.mKG = System.currentTimeMillis();
        this.mKp.ev(0L);
        return;
      }
      this.mKp.eu(this.mKC);
      return;
    }
    this.mKD = new g(paramArrayOfByte2, paramArrayOfByte2.length, this.mFO);
    au.DF().a(this.mKD, 0);
    this.mKE += 1;
    this.mKq += paramArrayOfByte2.length;
    x.d("MicroMsg.scanner.ScanModeImage", "totalNetworkFlow : [%s]", new Object[] { Integer.valueOf(this.mKq) });
    if ((System.currentTimeMillis() - this.mKG > 1800L + this.mKC) && (((j)this.mKj).mNK == true))
    {
      this.mKG = System.currentTimeMillis();
      this.mKp.ev(0L);
      return;
    }
    this.mKp.eu(this.mKC);
  }
  
  public final void bsf()
  {
    x.d("MicroMsg.scanner.ScanModeImage", "decodeFail");
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      return;
    }
    bsO();
    if ((System.currentTimeMillis() - this.mKG > 1800L + this.mKC) && (((j)this.mKj).mNK == true))
    {
      this.mKG = System.currentTimeMillis();
      this.mKp.ev(0L);
      return;
    }
    this.mKp.eu(this.mKC);
  }
  
  protected final void bsj()
  {
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
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
        x.d("MicroMsg.scanner.ScanModeImage", "ImageQuality=[%s]", new Object[] { Integer.valueOf(q.deM.ddb) });
      }
      if (!ao.is2G(this.mKp.getContext())) {
        break label100;
      }
    }
    label100:
    for (this.mKj = new j(this, i - 10, this.mKP, false, this.mKp.bsz());; this.mKj = new j(this, i, this.mKP, false, this.mKp.bsz())) {
      return this.mKj;
    }
  }
  
  protected final int bsl()
  {
    return R.i.scan_image_body;
  }
  
  protected final int bsm()
  {
    return mKB;
  }
  
  protected final void bsn()
  {
    j(new Rect(0, 0, 0, 0));
    this.mKp.b(4, null);
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
    this.mHu = this.mKp.findViewById(R.h.scan_no_data_mask);
    this.mHt = ((TextView)this.mKp.findViewById(R.h.scan_no_network_tips));
    this.gmo = ((TextView)this.mKp.findViewById(R.h.scan_tip_tv));
    this.gmo.setText(p.et(p.mOc, this.mKp.getContext().getString(R.l.scan_img_tips_focus)));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.gmo.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.mKp.getContext(), 13.0F));
      this.gmo.setLayoutParams(localLayoutParams);
    }
    if (d.zf()) {
      this.gmo.setPadding(BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.gmo.getPaddingTop(), BackwardSupportUtil.b.b(this.mKp.getContext(), 54.0F), this.gmo.getPaddingBottom());
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
    super.onPause();
    hw(false);
    au.DF().b(1062, this);
  }
  
  protected final void onResume()
  {
    au.DF().a(1062, this);
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      return;
    }
    this.mKE = 0;
    bsN();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */