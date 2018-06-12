package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends i
  implements b.a
{
  private long mGP;
  private HighlightRectSideView mKw;
  boolean mKx = false;
  private View.OnClickListener mKy = new j.1(this);
  
  public j(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    if (paramInt == 1) {}
    for (paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);; paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels))
    {
      paramInt = paramPoint.y - (int)(118.0F * paramDisplayMetrics.density);
      paramPoint = new Point((int)((int)(paramInt * 1.586F) / paramDisplayMetrics.density), (int)(paramInt / paramDisplayMetrics.density));
      paramb.getContext().setResult(0);
      this.mKn = 0;
      this.mKo = 64;
      jdMethod_do(paramPoint.x, paramPoint.y);
      if (bi.fQ(paramb.getContext()) >= 100L) {
        break;
      }
      x.w("MicroMsg.ScanModeBankCard", "memory is not much");
      this.mGP = 280L;
      return;
    }
    this.mGP = 80L;
  }
  
  public final void E(Bundle paramBundle) {}
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    x.d("MicroMsg.ScanModeBankCard", "decode success, resultType:%d", new Object[] { Integer.valueOf(paramInt1) });
    if (3 != paramInt1)
    {
      x.e("MicroMsg.ScanModeBankCard", "decode success, but result type error:" + paramInt1);
      return;
    }
    paramArrayOfByte1 = ((g)this.mKj).bta();
    if (this.mKx)
    {
      this.mKp.bsB();
      ConfirmScanBankCardResultUI.c(paramArrayOfByte1, paramString);
      return;
    }
    paramArrayOfByte2 = new ol();
    paramArrayOfByte2.bZo.cardId = paramString;
    paramArrayOfByte2.bZo.bZp = paramArrayOfByte1;
    a.sFg.m(paramArrayOfByte2);
    this.mKp.getContext().finish();
  }
  
  public final void bsf()
  {
    x.d("MicroMsg.ScanModeBankCard", "onDecodeFailed");
    if (this.mKp == null)
    {
      x.e("MicroMsg.ScanModeBankCard", "ui callback is null");
      return;
    }
    boolean[] arrayOfBoolean = ((g)this.mKj).mNg;
    this.mKw.setShowRectEdges(arrayOfBoolean);
    this.mKp.eu(this.mGP);
  }
  
  protected final void bsj() {}
  
  protected final b bsk()
  {
    if ((this.mKj == null) && (this.mKp != null)) {
      this.mKj = new g(this, this.mKp.bsz(), this.mKx);
    }
    return this.mKj;
  }
  
  protected final int bsl()
  {
    return R.i.scan_bank_card;
  }
  
  protected final int bsm()
  {
    return 300;
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
  
  protected final void j(Rect paramRect)
  {
    LinearLayout localLinearLayout = (LinearLayout)this.mKp.findViewById(R.h.bank_card_container);
    TextView localTextView = (TextView)this.mKp.findViewById(R.h.bank_card_owner);
    this.mKw = ((HighlightRectSideView)this.mKp.findViewById(R.h.bank_card_highlight));
    this.mKw.setMaskRect(paramRect);
    paramRect = this.mKp.getContext().getIntent();
    if (paramRect != null)
    {
      paramRect = bi.aG(paramRect.getStringExtra("bank_card_owner"), "");
      localTextView.setText(String.format(this.mKp.getContext().getResources().getString(R.l.scan_bank_owner), new Object[] { paramRect }));
    }
    for (;;)
    {
      if (bi.oW(paramRect)) {
        localLinearLayout.setVisibility(8);
      }
      for (;;)
      {
        if ((this.mKj != null) && (this.mKp != null))
        {
          paramRect = (g)this.mKj;
          boolean bool = this.mKp.bsz();
          x.d("MicroMsg.ScanBankCardDecoder", "need rotate:" + bool);
          paramRect.mNe = bool;
        }
        return;
        localLinearLayout.setVisibility(0);
        ((ImageView)this.mKp.findViewById(R.h.bank_card_declare)).setOnClickListener(this.mKy);
      }
      paramRect = null;
    }
  }
  
  protected final void onDestroy() {}
  
  protected final void onPause() {}
  
  protected final void onResume() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */