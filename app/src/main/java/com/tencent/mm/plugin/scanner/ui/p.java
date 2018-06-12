package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.g.a.mb.b;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.af.a.c.a;
import com.tencent.mm.plugin.scanner.a.f;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.plugin.scanner.util.d.1;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.plugin.scanner.util.m;
import com.tencent.mm.plugin.scanner.util.n;
import com.tencent.mm.pluginsdk.ui.j;
import com.tencent.mm.protocal.c.ik;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class p
  extends i
  implements com.tencent.mm.ab.e, c.a, i.a, b.a
{
  int bJM = 0;
  int bufferSize;
  Object dMd = new Object();
  long mKC = 80L;
  private e.a mKT = new p.1(this);
  d mLf;
  AtomicBoolean mLg = new AtomicBoolean(false);
  boolean mLh = false;
  boolean mLi = false;
  private Set<Integer> mLj;
  private float mLk = 1.5F;
  byte[] mLl;
  Point mLm;
  int mLn;
  private TextView mLo;
  boolean mLp = false;
  private View.OnClickListener mLq = new p.2(this);
  private int mMode = 0;
  
  public p(i.b paramb, Point paramPoint, int paramInt1, int paramInt2)
  {
    super(paramb, paramPoint);
    jdMethod_do(244, 244);
    this.bJM = paramInt1;
    this.mMode = paramInt2;
    this.mKr = true;
    this.mKh = 1000L;
    if (bi.fQ(paramb.getContext()) < 100L)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "memory is not much");
      this.mKC = 280L;
    }
  }
  
  public p(i.b paramb, Point paramPoint, int paramInt, Set<Integer> paramSet)
  {
    super(paramb, paramPoint);
    jdMethod_do(244, 244);
    this.bJM = paramInt;
    this.mLj = paramSet;
    this.mKr = true;
    this.mKh = 1000L;
    if (bi.fQ(paramb.getContext()) < 100L)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "memory is not much");
      this.mKC = 280L;
    }
  }
  
  private void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 1;
    Activity localActivity = this.mKp.getContext();
    Object localObject = new mb();
    if (paramInt1 == 1)
    {
      ((mb)localObject).bWC.bWE = 0;
      ((mb)localObject).bWC.scanResult = paramString;
      if (!this.mLp) {
        break label167;
      }
      x.d("MicroMsg.scanner.ScanModeQRCode", "need to finish on decode success");
      ((mb)localObject).bWC.bWA = 1;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_scan_result", paramString);
      ((Intent)localObject).putExtra("key_scan_result_raw", paramArrayOfByte);
      ((Intent)localObject).putExtra("key_scan_result_type", paramInt1);
      ((Intent)localObject).putExtra("key_scan_result_code_type", paramInt2);
      ((Intent)localObject).putExtra("key_scan_result_code_version", paramInt3);
      localActivity.setResult(-1, (Intent)localObject);
      localActivity.finish();
      localActivity.overridePendingTransition(0, 0);
    }
    label167:
    label297:
    do
    {
      do
      {
        return;
        ((mb)localObject).bWC.bWE = 1;
        break;
        ((mb)localObject).bWC.bWA = 0;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
        if ((((mb)localObject).bWD.ret == 1) || (((mb)localObject).bWD.ret == 2))
        {
          localActivity.finish();
          localActivity.overridePendingTransition(0, 0);
        }
        if (paramInt1 != 1) {
          break label297;
        }
        this.mKp.bss();
        this.mKp.hu(true);
        this.mLh = false;
      } while (((mb)localObject).bWD.ret == 2);
      if (this.mLi) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        this.mKp.a(paramString, paramInt1, paramInt2, paramInt3, this.mKT);
        return;
      }
    } while (paramInt1 != 2);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      x.e("MicroMsg.scanner.ScanModeQRCode", "result is null");
      this.mLh = false;
      this.mKp.hu(false);
      return;
    }
    paramString = paramString.split(",", 2);
    if ((paramString == null) || (paramString.length < 2))
    {
      x.e("MicroMsg.scanner.ScanModeQRCode", "wrong zbar format");
      this.mLh = false;
      this.mKp.hu(false);
      return;
    }
    paramString = new f(com.tencent.mm.plugin.scanner.util.p.KS(paramString[0]), paramString[1], paramInt2, paramInt3);
    paramString.mFP = this.mLi;
    au.DF().a(paramString, 0);
    this.mKp.bss();
    this.mKp.hu(true);
    paramArrayOfByte = this.mKp.getContext();
    this.mKp.getContext().getString(R.l.app_tip);
    this.eHw = h.a(paramArrayOfByte, this.mKp.getContext().getString(R.l.qrcode_scan_default), true, new p.5(this, paramString));
  }
  
  private void bsN()
  {
    if (this.mKp == null) {
      x.e("MicroMsg.scanner.ScanModeQRCode", "dealWithNetWork(), scanUICallback == null");
    }
    while ((au.DF().Lg() != 6) && (au.DF().Lg() != 4)) {
      return;
    }
    this.mKp.ev(0L);
  }
  
  private void bsR()
  {
    if ((!this.mLg.get()) && (this.bufferSize > 0))
    {
      this.mLg.set(true);
      this.bufferSize -= 1;
      if ((this.mLj != null) && (this.mLj.size() > 0))
      {
        ((d)bsk()).mLj = this.mLj;
        x.i("MicroMsg.scanner.ScanModeQRCode", "try decode,buffer size:" + this.bufferSize);
        if ((com.tencent.mm.plugin.scanner.a.l.mFT.mFW > 0) && (this.mKp != null)) {
          this.mKp.eu(30L);
        }
        if ((this.mLl != null) && (this.mLm != null))
        {
          locald = (d)bsk();
          if (locald.fOL)
          {
            localSet2 = locald.mLj;
            if (localSet2 != null)
            {
              localSet1 = localSet2;
              if (!localSet2.isEmpty()) {}
            }
            else
            {
              localSet1 = d.vD(locald.mMN);
            }
            locald.h(localSet1);
          }
          com.tencent.mm.sdk.f.e.b(new d.1((d)bsk(), this.mLl, this.mLm), "scan_decode", 10);
        }
        if ((com.tencent.mm.plugin.scanner.a.l.mFT.mFW == 30) && (this.mKp != null)) {
          this.mKp.bsD();
        }
      }
    }
    while (this.mKp == null) {
      for (;;)
      {
        d locald;
        Set localSet2;
        Set localSet1;
        return;
        if ((com.tencent.mm.plugin.scanner.a.l.mFT.mFW % 2 == 0) && ((this.mMode == 1) || (this.mMode == 0))) {
          ((d)bsk()).mMN = 3;
        } else {
          ((d)bsk()).mMN = this.mMode;
        }
      }
    }
    this.mKp.eu(0L);
  }
  
  public final void E(Bundle paramBundle)
  {
    if ((paramBundle.containsKey("zoom_action")) && (paramBundle.containsKey("zoom_type")) && (paramBundle.containsKey("zoom_scale")) && (this.mKp != null)) {
      this.mKp.V(paramBundle.getInt("zoom_action"), paramBundle.getInt("zoom_type"), paramBundle.getInt("zoom_scale"));
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    boolean bool;
    if ((this.mKp == null) || (paraml == null)) {
      if (paraml == null)
      {
        bool = true;
        x.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        this.mLh = false;
      }
    }
    label730:
    do
    {
      do
      {
        return;
        bool = false;
        break;
        if ((paramInt1 == 4) && (paramInt2 == -4))
        {
          h.a(this.mKp.getContext(), R.l.qrcode_no_user_tip, R.l.app_tip, new p.4(this));
          return;
        }
        int i;
        switch (paramInt1)
        {
        default: 
          i = 0;
        }
        while (i != 0)
        {
          hk(true);
          return;
          if (au.DF().Lh())
          {
            this.mKp.getContext();
            au.DF().getNetworkServerIp();
            new StringBuilder().append(paramInt2);
          }
          for (;;)
          {
            i = 1;
            break;
            if (ab.bU(this.mKp.getContext())) {
              j.eY(this.mKp.getContext());
            } else {
              Toast.makeText(this.mKp.getContext(), this.mKp.getContext().getString(R.l.fmt_http_err, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
            }
          }
          Toast.makeText(this.mKp.getContext(), this.mKp.getContext().getString(R.l.fmt_iap_err, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
          i = 1;
        }
        if ((paramInt1 == 4) && (paramInt2 == 63532))
        {
          h.i(this.mKp.getContext(), R.l.qrcode_ban_by_expose, R.l.app_tip);
          hk(true);
          return;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(this.mKp.getContext(), this.mKp.getContext().getString(R.l.fmt_search_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          hk(true);
          return;
        }
        if (paraml.getType() == 1061)
        {
          paramString = ((f)paraml).bsb();
          if (paramString == null)
          {
            x.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd(), getResp() == null");
            hk(true);
            return;
          }
          x.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(paramString.hcE) });
          if (bi.oW(paramString.rjl))
          {
            hk(true);
            return;
          }
          switch (n.a(paramString.hcE, paramString.rjl, this, 4, this.mKT, ((f)paraml).bJr, ((f)paraml).bJs, ((f)paraml).mFP))
          {
          }
          for (;;)
          {
            this.mKp.hu(false);
            return;
            this.mKp.getContext().finish();
            this.mKp.getContext().overridePendingTransition(0, 0);
            return;
            x.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
            continue;
            x.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
            this.mKp.ev(0L);
          }
        }
        if (paraml.getType() != 666) {
          break label730;
        }
      } while (!(paraml instanceof u));
      this.mKp.hu(true);
      this.mKp.getContext().finish();
      this.mKp.getContext().overridePendingTransition(0, 0);
      return;
    } while (paraml.getType() != 971);
    this.mKp.hu(true);
    this.mKp.getContext().finish();
    this.mKp.getContext().overridePendingTransition(0, 0);
  }
  
  protected final void a(byte[] paramArrayOfByte, Point paramPoint, int paramInt, Rect paramRect)
  {
    synchronized (this.dMd)
    {
      if (this.bufferSize == 1)
      {
        x.d("MicroMsg.scanner.ScanModeQRCode", "decode too slow");
        this.bufferSize = 0;
      }
      if (this.mLm == null) {
        this.mLm = new Point();
      }
      com.tencent.mm.sdk.f.e.post(new p.8(this, paramArrayOfByte, paramPoint, paramInt, paramRect), "prepare_decode_data");
      return;
    }
  }
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    this.mLg.set(false);
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      return;
    }
    if (this.mLh)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "is decoding, return");
      return;
    }
    this.mLh = true;
    x.d("MicroMsg.scanner.ScanModeQRCode", "decode success:%s", new Object[] { paramString });
    if (bi.oW(paramString))
    {
      this.mLh = false;
      return;
    }
    if (au.DF().Lg() == 0)
    {
      Toast.makeText(this.mKp.getContext(), this.mKp.getContext().getString(R.l.fmt_iap_err), 0).show();
      this.mLh = false;
      return;
    }
    m.mNW.stop();
    a(paramInt1, paramString, paramArrayOfByte1, paramInt2, paramInt3);
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramActivity == null) {
      return;
    }
    this.mLh = true;
    if (paramInt2 != -1)
    {
      this.mLh = false;
      this.mLg.set(false);
      this.mLi = false;
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    case 1: 
      this.mKp.bsB();
      return;
    }
    if (paramIntent == null)
    {
      x.e("MicroMsg.scanner.ScanModeQRCode", "onActivityResult data == null");
      this.mLh = false;
      this.mLg.set(false);
      this.mLi = false;
      return;
    }
    this.mLg.set(true);
    au.HU();
    paramIntent = com.tencent.mm.ui.tools.a.e(paramActivity, paramIntent, com.tencent.mm.model.c.Gb());
    x.d("MicroMsg.scanner.ScanModeQRCode", "select: [%s]", new Object[] { paramIntent });
    new ag().post(new p.6(this, paramActivity));
    if (this.mLf != null) {
      this.mLf.ll();
    }
    if (this.mKp != null) {
      this.mKp.hu(true);
    }
    com.tencent.mm.plugin.scanner.a.l.mFT.reset();
    com.tencent.mm.plugin.scanner.c.brY().mFg.a(paramIntent, new p.7(this, paramActivity), null);
  }
  
  public final void bsP()
  {
    this.mKr = false;
  }
  
  public final boolean bsQ()
  {
    return this.mKr;
  }
  
  public final void bsf()
  {
    x.i("MicroMsg.scanner.ScanModeQRCode", "decodeFail");
    this.mLg.set(false);
    synchronized (this.dMd)
    {
      bsR();
      return;
    }
  }
  
  protected final void bsj()
  {
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "handleNetworkChange(), scanUICallback == null");
      return;
    }
    bsN();
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bsk()
  {
    if ((this.mLf == null) && (this.mKp != null)) {
      this.mLf = new d(this, this.mMode, this.mKp.bsz());
    }
    return this.mLf;
  }
  
  protected final int bsl()
  {
    return R.i.scan_qrcode_body;
  }
  
  protected final int bsm()
  {
    return 244;
  }
  
  protected final void bsn()
  {
    j(new Rect(0, 0, 0, 0));
    if (this.mMode == 2) {
      this.mKp.b(4, null);
    }
    for (;;)
    {
      this.mKp.a(this);
      onResume();
      return;
      this.mKp.b(0, new p.3(this));
    }
  }
  
  protected final boolean bso()
  {
    return true;
  }
  
  protected final boolean bsp()
  {
    return true;
  }
  
  public final Context getContext()
  {
    if (this.mKp == null)
    {
      x.e("MicroMsg.scanner.ScanModeQRCode", "getContext(), scanUICallback == null");
      return null;
    }
    return this.mKp.getContext();
  }
  
  protected final void h(Point paramPoint)
  {
    this.mKi = null;
    super.h(paramPoint);
  }
  
  public final void hk(boolean paramBoolean)
  {
    if (this.mKp == null)
    {
      x.e("MicroMsg.scanner.ScanModeQRCode", "continueScan, scanUICallback == null");
      return;
    }
    if (paramBoolean)
    {
      this.mKp.hu(false);
      return;
    }
    this.mKp.getContext().finish();
    this.mKp.getContext().overridePendingTransition(0, 0);
  }
  
  protected final Rect hx(boolean paramBoolean)
  {
    Rect localRect = new Rect(B(true, paramBoolean));
    x.i("MicroMsg.scanner.ScanModeQRCode", "display rect:" + localRect);
    int m = localRect.width();
    int n = localRect.height();
    int j = (int)(m * this.mLk);
    int k = (int)(n * this.mLk);
    int i = j;
    if (j > this.mKk.x) {
      i = this.mKk.x;
    }
    j = k;
    if (k > this.mKk.y) {
      j = this.mKk.y;
    }
    k = j;
    if (j % 2 == 1) {
      k = j - 1;
    }
    j = i;
    if (i % 2 == 1) {
      j = i - 1;
    }
    x.i("MicroMsg.scanner.ScanModeQRCode", "newWidth:%d,newHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
    localRect.left -= (j - m) / 2;
    i = localRect.right;
    localRect.right = ((j - m) / 2 + i);
    localRect.top -= (k - n) / 2;
    localRect.bottom += (k - n) / 2;
    x.i("MicroMsg.scanner.ScanModeQRCode", "scan rect:" + localRect);
    return localRect;
  }
  
  protected final void j(Rect paramRect)
  {
    this.mLo = ((TextView)this.mKp.findViewById(R.h.scan_to_my_qrcode));
    this.mLo.setOnClickListener(this.mLq);
    this.gmo = ((TextView)this.mKp.findViewById(R.h.scan_tip_tv));
    if (paramRect.bottom > 0)
    {
      this.mLo.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.gmo.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.mKp.getContext(), 13.0F));
      this.gmo.setLayoutParams(localLayoutParams);
    }
    if (this.mLf != null) {
      this.mLf.lhy = this.mKp.bsz();
    }
    bsN();
    if (this.mMode == 2) {
      this.gmo.setText(R.l.qbar_tip_only_zbar);
    }
    for (;;)
    {
      hw(true);
      return;
      if (this.mMode == 1) {
        this.gmo.setText(R.l.qbar_tip_only_qrcode);
      } else if (this.bJM == 1) {
        this.gmo.setText(R.l.qrcode_tip_in_discount_from_addmorefriend);
      } else if (this.bJM == 2) {
        this.gmo.setText(R.l.webwx_login_introduction);
      } else {
        this.gmo.setText(R.l.qrcode_tip_in_discount_from_friend);
      }
    }
  }
  
  protected final void onDestroy()
  {
    this.mLl = null;
  }
  
  protected final void onPause()
  {
    super.onPause();
    hw(false);
    au.DF().b(1061, this);
    au.DF().b(666, this);
    au.DF().b(971, this);
  }
  
  protected final void onResume()
  {
    au.DF().a(1061, this);
    au.DF().a(666, this);
    au.DF().a(971, this);
    if (this.mKp == null)
    {
      x.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      return;
    }
    if (!this.mLi) {
      this.mLh = false;
    }
    bsN();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */