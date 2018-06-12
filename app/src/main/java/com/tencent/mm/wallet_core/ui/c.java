package com.tencent.mm.wallet_core.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

public final class c
{
  public o eZB = null;
  private ImageView eZC;
  private View eZD;
  private View.OnClickListener eZF = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (((paramAnonymousView.getId() == a.f.popupwd_qrcode_iv) || (paramAnonymousView.getId() == a.f.popupwd_barcode_iv)) && (c.this.eZB != null) && (c.this.eZB.isShowing())) {
        c.this.eZB.dismiss();
      }
    }
  };
  private MMActivity gKS;
  public boolean hCn = true;
  private Bitmap hGf = null;
  private View hGi;
  private ImageView hGj;
  private MMVerticalTextView hGk;
  private ArrayList<Bitmap> hGm = new ArrayList();
  private String lJi = "";
  private String lLI = "";
  public Bitmap lLl = null;
  public Bitmap lLm = null;
  ViewGroup uYK;
  private boolean uYL = false;
  
  public c(MMActivity paramMMActivity)
  {
    this(paramMMActivity, false);
  }
  
  public c(MMActivity paramMMActivity, boolean paramBoolean)
  {
    this.gKS = paramMMActivity;
    this.uYL = paramBoolean;
  }
  
  private void cDG()
  {
    if (this.hCn)
    {
      this.hGj.setOnClickListener(this.eZF);
      Bitmap localBitmap = this.hGf;
      if (this.lLm != null)
      {
        this.hGf = e.w(this.lLm);
        x.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
      }
      for (;;)
      {
        this.hGj.setImageBitmap(this.hGf);
        this.hGm.add(0, localBitmap);
        if (this.hGm.size() < 2) {
          break;
        }
        int i = this.hGm.size() - 1;
        while (i > 1)
        {
          e.x((Bitmap)this.hGm.remove(i));
          i -= 1;
        }
        this.hGf = null;
        x.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
      }
      this.eZD.setVisibility(8);
      this.hGi.setVisibility(0);
      this.hGk.setText(e.ace(this.lJi));
      this.eZB.update();
      return;
    }
    this.eZC.setOnClickListener(this.eZF);
    this.eZC.setImageBitmap(this.lLl);
    if (this.lLl != null) {
      x.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
    }
    for (;;)
    {
      this.eZD.setVisibility(0);
      this.hGi.setVisibility(8);
      break;
      x.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
    }
  }
  
  public final void cDE()
  {
    if ((this.eZB != null) && (this.eZB.isShowing())) {
      cDG();
    }
  }
  
  public final void cDF()
  {
    if (this.uYK != null) {
      this.uYK.setVisibility(0);
    }
  }
  
  public final void dismiss()
  {
    if ((this.eZB != null) && (this.eZB.isShowing())) {
      this.eZB.dismiss();
    }
  }
  
  public final void gn(String paramString1, String paramString2)
  {
    this.lLI = paramString1;
    this.lJi = paramString2;
  }
  
  public final void init()
  {
    View localView;
    if (this.eZB == null)
    {
      if (!this.uYL) {
        break label207;
      }
      localView = View.inflate(this.gKS, a.g.wallet_offline_new_popupwindow_layout, null);
      MMVerticalTextView localMMVerticalTextView = (MMVerticalTextView)localView.findViewById(a.f.mask_i_know_btn);
      this.uYK = ((ViewGroup)localView.findViewById(a.f.popupwd_mask_layout));
      localMMVerticalTextView.setOnClickListener(new c.2(this));
      localView.findViewById(a.f.popupwd_content_layout).setOnClickListener(new c.3(this));
    }
    for (;;)
    {
      this.eZD = localView.findViewById(a.f.popupwd_qrcode_layout);
      this.eZC = ((ImageView)localView.findViewById(a.f.popupwd_qrcode_iv));
      this.hGi = localView.findViewById(a.f.popupwd_barcode_layout);
      this.hGj = ((ImageView)localView.findViewById(a.f.popupwd_barcode_iv));
      this.hGk = ((MMVerticalTextView)localView.findViewById(a.f.vertical_barcode_text));
      this.eZB = new o(localView, -1, -1, true);
      this.eZB.setClippingEnabled(false);
      this.eZB.update();
      this.eZB.setBackgroundDrawable(new ColorDrawable(16777215));
      this.eZB.setOnDismissListener(new c.5(this));
      return;
      label207:
      localView = View.inflate(this.gKS, a.g.wallet_offline_popup_window, null);
      localView.setOnClickListener(new c.4(this));
    }
  }
  
  public final void release()
  {
    if ((this.eZB != null) && (this.eZB.isShowing())) {
      this.eZB.dismiss();
    }
    e.x(this.hGf);
    e.ai(this.hGm);
    this.hGm.clear();
    this.gKS = null;
  }
  
  public final void v(View paramView, boolean paramBoolean)
  {
    this.hCn = paramBoolean;
    if ((this.eZB != null) && (!this.eZB.isShowing()))
    {
      this.eZB.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.eZB.setFocusable(true);
      this.eZB.setTouchable(true);
      this.eZB.setBackgroundDrawable(new ColorDrawable(16777215));
      this.eZB.setOutsideTouchable(true);
      if (this.hCn) {
        cDF();
      }
      cDG();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */