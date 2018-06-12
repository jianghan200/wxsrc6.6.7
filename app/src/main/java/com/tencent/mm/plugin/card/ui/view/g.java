package com.tencent.mm.plugin.card.ui.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bm.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.ui.j;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o;

public abstract class g
  extends i
{
  String code;
  private Bitmap eZA;
  MMActivity gKS;
  private j hCm;
  private ViewStub hHA;
  private ViewGroup hHy;
  private ab hHz;
  protected b htQ;
  private Bitmap hyO;
  private View.OnLongClickListener hyX = new g.1(this);
  
  private static void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    if ((paramImageView == null) || (paramBitmap == null)) {
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
  }
  
  public final void azI()
  {
    if (this.hHy != null) {
      this.hHy.setVisibility(8);
    }
  }
  
  public final void azL()
  {
    if ((this.hHz != null) && (this.htQ != null) && (this.hHy != null)) {
      this.hHz.a(this.hHy, this.htQ);
    }
  }
  
  public final void azM()
  {
    if ((this.htQ != null) && (this.hHz != null) && (this.hHy != null))
    {
      this.hHz.b(this.hHy, this.htQ);
      if ((this.htQ.awn().rnc == 2) && (this.hCm != null))
      {
        j localj = this.hCm;
        if ((localj.eZB != null) && (localj.eZB.isShowing())) {
          localj.eZB.dismiss();
        }
      }
      return;
    }
    x.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
  }
  
  public abstract ab azN();
  
  public abstract ab azO();
  
  public abstract ab azP();
  
  public final void d(b paramb)
  {
    if (paramb == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
      return;
    }
    this.htQ = paramb;
  }
  
  public final void d(c paramc)
  {
    int j = 1;
    if (this.htQ == null) {
      x.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
    }
    Object localObject;
    do
    {
      for (;;)
      {
        return;
        if (paramc == null)
        {
          x.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
          return;
        }
        if (!this.hHz.i(this.htQ))
        {
          x.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
          azL();
          return;
        }
        this.hHz.g(this.hHy);
        x.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
        this.code = e(paramc);
        if (bi.oW(this.code))
        {
          x.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
          return;
        }
        switch (this.htQ.awn().rnc)
        {
        default: 
          return;
        case 0: 
          localObject = this.hHy;
          paramc = this.code;
          localObject = (TextView)((View)localObject).findViewById(a.d.code_text);
          ((TextView)localObject).setText(m.yd(paramc));
          ((TextView)localObject).setOnLongClickListener(this.hyX);
          String str = this.htQ.awm().dxh;
          if (!bi.oW(str)) {
            ((TextView)localObject).setTextColor(l.xV(str));
          }
          if (paramc.length() > 12) {
            break;
          }
          ((TextView)localObject).setTextSize(1, 33.0F);
          return;
        case 2: 
          localObject = this.hHy;
          paramc = this.code;
          try
          {
            localObject = (ImageView)((View)localObject).findViewById(a.d.code_qr_area);
            l.x(this.eZA);
            int i = j;
            if (this.htQ != null)
            {
              i = j;
              if (this.htQ.awm() != null) {
                i = this.htQ.awm().ron;
              }
            }
            this.eZA = a.b(this.gKS, paramc, 0, i);
            a((ImageView)localObject, this.eZA);
            ((ImageView)localObject).setOnClickListener(this.hHF.ayy());
            this.hCm.eZA = this.eZA;
            paramc = this.hCm;
            if ((paramc.eZB != null) && (paramc.eZB.isShowing()))
            {
              paramc.eZC.setImageBitmap(paramc.eZA);
              return;
            }
          }
          catch (Exception paramc)
          {
            x.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
            return;
          }
        }
      }
      localObject = this.hHy;
      paramc = this.code;
      try
      {
        localObject = (ImageView)((View)localObject).findViewById(a.d.code_bar_area);
        l.x(this.hyO);
        if ((paramc != null) && (paramc.length() > 0)) {
          this.hyO = a.b(this.gKS, paramc, 5, 0);
        }
        a((ImageView)localObject, this.hyO);
        ((ImageView)localObject).setOnClickListener(this.hHF.ayy());
        this.hCm.hyO = this.hyO;
        return;
      }
      catch (Exception paramc)
      {
        x.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
        return;
      }
      if ((paramc.length() > 12) && (paramc.length() <= 16))
      {
        ((TextView)localObject).setTextSize(1, 30.0F);
        return;
      }
      if ((paramc.length() > 16) && (paramc.length() <= 20))
      {
        ((TextView)localObject).setTextSize(1, 24.0F);
        return;
      }
      if ((paramc.length() > 20) && (paramc.length() <= 40))
      {
        ((TextView)localObject).setTextSize(1, 18.0F);
        return;
      }
    } while (paramc.length() <= 40);
    ((TextView)localObject).setVisibility(8);
  }
  
  public final void destroy()
  {
    super.destroy();
    this.gKS = null;
    this.hCm = null;
    this.htQ = null;
    this.hHy = null;
    this.hHz = null;
    l.x(this.eZA);
    l.x(this.hyO);
  }
  
  public abstract String e(c paramc);
  
  public abstract boolean h(b paramb);
  
  public final void initView()
  {
    this.gKS = this.hHF.ayx();
    this.hCm = this.hHF.ayD();
    this.htQ = this.hHF.ayu();
    if (this.htQ == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
      return;
    }
    switch (this.htQ.awn().rnc)
    {
    default: 
      this.hHz = azN();
    }
    while (this.hHz == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      return;
      this.hHz = azN();
      continue;
      this.hHz = azO();
      continue;
      this.hHz = azP();
    }
    switch (this.htQ.awn().rnc)
    {
    default: 
      if (this.hHA == null) {
        this.hHA = ((ViewStub)findViewById(a.d.card_qrcode_stub));
      }
      label209:
      if (this.hHA == null) {
        x.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
      }
      break;
    }
    while (this.hHy == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
      return;
      if (this.hHA != null) {
        break label209;
      }
      this.hHA = ((ViewStub)findViewById(a.d.card_qrcode_stub));
      break label209;
      if (this.hHA != null) {
        break label209;
      }
      this.hHA = ((ViewStub)findViewById(a.d.card_barcode_stub));
      break label209;
      if (this.hHA != null) {
        break label209;
      }
      this.hHA = ((ViewStub)findViewById(a.d.card_code_stub));
      break label209;
      if (this.hHz == null)
      {
        x.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      }
      else if (this.hHz.getLayoutId() == 0)
      {
        x.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
      }
      else
      {
        this.hHA.setLayoutResource(this.hHz.getLayoutId());
        if (this.hHy == null) {
          this.hHy = ((ViewGroup)this.hHA.inflate());
        }
      }
    }
  }
  
  public final void update()
  {
    if (this.htQ == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
      return;
    }
    if (this.hHz == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
      return;
    }
    if (this.hHy == null)
    {
      x.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
      return;
    }
    this.hCm.ayS();
    d(c.hID);
    this.hHz.c(this.hHy, this.htQ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */