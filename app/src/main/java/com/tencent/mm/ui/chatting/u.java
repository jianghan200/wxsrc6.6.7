package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.pluginsdk.ui.tools.i.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class u
{
  SharedPreferences duR;
  public LinearLayout irL = null;
  long iyn = -1L;
  Context mContext;
  public String mim;
  String mio;
  String mip;
  public ChatFooterCustom tKI;
  public FrameLayout tKJ;
  public FrameLayout tKK;
  public TextView tKL;
  public ImageView tKM;
  a tKN = a.tKY;
  public int tKO = -1;
  public boolean tKP;
  String tKQ = null;
  public String tKR;
  public View.OnClickListener tKS = new u.1(this);
  public View.OnClickListener tKT = new u.2(this);
  private i.a tKU = new u.7(this);
  
  public u(ChatFooterCustom paramChatFooterCustom)
  {
    this.mContext = paramChatFooterCustom.getContext();
    this.tKI = paramChatFooterCustom;
  }
  
  public final void ctS()
  {
    if (this.tKN == a.tLc)
    {
      this.tKM.setImageResource(R.k.promo_icon_qqmail);
      return;
    }
    this.tKM.setImageResource(R.k.promo_icon_qqmail_uninstall);
  }
  
  public final void ctT()
  {
    Object localObject;
    if (p.r(this.mContext, "com.tencent.androidqqmail")) {
      localObject = a.tLc;
    }
    for (;;)
    {
      this.tKN = ((a)localObject);
      ctS();
      x.i("MicroMsg.ChattingQQMailFooterHandler", "dz[initRightBtnTv: status:%s]", new Object[] { this.tKN.toString() });
      switch (8.tKX[this.tKN.ordinal()])
      {
      default: 
        i.a(this.tKU);
        return;
        this.duR = this.mContext.getSharedPreferences("QQMAIL", 4);
        this.iyn = this.duR.getLong("qqmail_downloadid", -1L);
        if (this.iyn < 0L)
        {
          if (bi.oW(this.mim)) {
            localObject = a.tLd;
          } else {
            localObject = a.tKZ;
          }
        }
        else
        {
          localObject = d.aCU().cm(this.iyn);
          int i = ((FileDownloadTaskInfo)localObject).status;
          this.tKQ = ((FileDownloadTaskInfo)localObject).path;
          switch (i)
          {
          case 2: 
          default: 
            if (bi.oW(this.mim)) {
              localObject = a.tLd;
            }
            break;
          case 3: 
            if (e.cn(this.tKQ)) {
              localObject = a.tLb;
            } else if (bi.oW(this.mim)) {
              localObject = a.tLd;
            } else {
              localObject = a.tKZ;
            }
            break;
          case 1: 
            localObject = a.tLa;
            continue;
            localObject = a.tKZ;
          }
        }
        break;
      }
    }
    this.tKL.setText(R.l.chatfooter_mail_install);
    return;
    this.tKL.setText(R.l.chatfooter_mail_downloading);
    return;
    i.a(this.tKU);
  }
  
  public final void ctU()
  {
    if (this.tKO == 0)
    {
      this.tKL.setText(R.l.chatfooter_mail_without_unread_count);
      return;
    }
    if (this.tKO > 99)
    {
      this.tKL.setText(R.l.chatfooter_mail_with_unread_count_over_99);
      return;
    }
    this.tKL.setText(String.format(a.af(this.mContext, R.l.chatfooter_mail_with_unread_count), new Object[] { Integer.valueOf(this.tKO) }));
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */