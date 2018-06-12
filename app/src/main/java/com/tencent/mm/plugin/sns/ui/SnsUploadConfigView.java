package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.ab.l;
import com.tencent.mm.al.b;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.fu;
import com.tencent.mm.g.a.fu.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.b;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.y;
import org.b.d.i;

public class SnsUploadConfigView
  extends LinearLayout
  implements com.tencent.mm.ab.e, a.a, a.b
{
  private static String byT = "com.tencent.mm";
  private Context context;
  private ProgressDialog kxR = null;
  boolean oaw = false;
  private boolean ogA = true;
  private boolean ogB = false;
  boolean ogC = false;
  arj ogD = new arj();
  com.tencent.mm.ui.i.a ogE = new com.tencent.mm.ui.i.a();
  ImageView ogr;
  ImageView ogs;
  ImageView ogt;
  ImageView ogu;
  private boolean ogv = false;
  boolean ogw = false;
  boolean ogx = false;
  private boolean ogy = false;
  private boolean ogz = false;
  
  public SnsUploadConfigView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.context = paramContext;
    paramAttributeSet = y.gq(paramContext).inflate(i.g.sns_upload_config_view, this, true);
    this.ogr = ((ImageView)paramAttributeSet.findViewById(i.f.sns_sync_facebook_iv));
    this.ogs = ((ImageView)paramAttributeSet.findViewById(i.f.sns_sync_twitter_iv));
    this.ogt = ((ImageView)paramAttributeSet.findViewById(i.f.sns_sync_qzone_iv));
    this.ogu = ((ImageView)paramAttributeSet.findViewById(i.f.sns_sync_weishi_iv));
    if (!b.PB()) {
      this.ogt.setVisibility(8);
    }
    g.Ek();
    if (!g.Ei().DT().getBoolean(aa.a.sQN, false)) {
      this.ogu.setVisibility(8);
    }
    if (!b.PD()) {
      this.ogs.setVisibility(8);
    }
    if (!q.He()) {
      this.ogr.setVisibility(8);
    }
    this.ogt.setOnClickListener(new SnsUploadConfigView.1(this, paramContext));
    this.ogu.setOnClickListener(new SnsUploadConfigView.8(this, paramContext));
    this.ogr.setOnClickListener(new SnsUploadConfigView.9(this));
    this.ogs.setOnClickListener(new SnsUploadConfigView.10(this));
  }
  
  private void rI(int paramInt)
  {
    h.a(getContext(), paramInt, i.j.app_tip, new SnsUploadConfigView.5(this), new SnsUploadConfigView.6(this));
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paraml == null)) {
      return;
    }
    bEt();
  }
  
  public final void a(a.c paramc)
  {
    if (this.kxR != null) {
      this.kxR.cancel();
    }
    switch (SnsUploadConfigView.7.kyp[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bEu();
      return;
      this.ogx = true;
      rI(i.j.twitterlogin_success);
      continue;
      this.ogx = false;
      continue;
      this.ogx = false;
      rI(i.j.twitterlogin_failed);
    }
  }
  
  public final void b(a.c paramc)
  {
    switch (SnsUploadConfigView.7.kyp[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bEu();
      return;
      this.ogx = false;
    }
  }
  
  public final void bEr()
  {
    this.ogv = false;
    this.ogw = false;
    this.ogx = false;
    this.ogy = false;
    this.ogz = false;
    this.ogt.setImageResource(i.i.album_qzone_icon_normal);
    this.ogu.setImageResource(i.i.album_wesee_icon_normal);
    this.ogr.setImageResource(i.i.album_facebook_icon_normal);
    this.ogs.setImageResource(i.i.album_twitter_icon_normal);
  }
  
  final void bEs()
  {
    if (this.ogy)
    {
      g.Ek();
      int i = bi.f((Integer)g.Ei().DT().get(9, null));
      if (i == 0) {
        h.a(getContext(), i.j.settings_weibo_notice, i.j.app_tip, new SnsUploadConfigView.11(this), new SnsUploadConfigView.12(this));
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label85;
        }
        this.ogy = false;
        return;
        if (i == 0) {
          break;
        }
      }
      label85:
      this.ogt.setImageResource(i.i.album_qzone_icon_pressed);
      return;
    }
    this.ogt.setImageResource(i.i.album_qzone_icon_normal);
  }
  
  final void bEt()
  {
    if (this.ogu == null) {
      return;
    }
    if (this.ogC)
    {
      g.Ek();
      if (g.Ei().DT().getBoolean(aa.a.sQN, false)) {}
    }
    else
    {
      this.ogz = false;
      this.ogu.setVisibility(8);
      return;
    }
    this.ogu.setVisibility(0);
    if (this.ogz)
    {
      this.ogu.setImageResource(i.i.album_wesee_icon_pressed);
      return;
    }
    this.ogu.setImageResource(i.i.album_wesee_icon_normal);
  }
  
  final void bEu()
  {
    if (this.ogx)
    {
      if (!this.ogE.cAo()) {
        h.a(getContext(), i.j.settings_twitter_notice, i.j.app_tip, new SnsUploadConfigView.15(this), new SnsUploadConfigView.2(this));
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.ogx = false;
        return;
      }
      this.ogs.setImageResource(i.i.album_twitter_icon_pressed);
      return;
    }
    this.ogs.setImageResource(i.i.album_twitter_icon_normal);
  }
  
  public int getPrivated()
  {
    int i = 0;
    if (this.oaw) {
      i = 1;
    }
    return i;
  }
  
  public int getSyncFlag()
  {
    int j = 0;
    if (this.ogv) {
      j = 1;
    }
    int i = j;
    if (this.ogw) {
      i = j | 0x2;
    }
    j = i;
    if (this.ogx) {
      j = i | 0x8;
    }
    i = j;
    if (this.ogy) {
      i = j | 0x4;
    }
    j = i;
    if (this.ogz) {
      j = i | 0x10;
    }
    return j;
  }
  
  public i getTwitterAccessToken()
  {
    return this.ogE.uFc;
  }
  
  public void setPrivated(boolean paramBoolean)
  {
    this.oaw = paramBoolean;
    if (paramBoolean) {
      bEr();
    }
  }
  
  void setSyncFacebook(boolean paramBoolean)
  {
    if (this.ogw)
    {
      if (!q.Hg()) {
        h.a(getContext(), i.j.settings_facebook_notice, i.j.app_tip, new DialogInterface.OnClickListener()new SnsUploadConfigView.14
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            d.b(SnsUploadConfigView.this.getContext(), "account", ".ui.FacebookAuthUI", new Intent().putExtra("shake_music", true));
          }
        }, new SnsUploadConfigView.14(this));
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.ogw = false;
        return;
      }
      if ((!paramBoolean) && (!this.ogB) && (q.Hg()))
      {
        final fu localfu = new fu();
        localfu.bJX = new Runnable()
        {
          public final void run()
          {
            if (!localfu.bOv.bJm) {
              SnsUploadConfigView.m(SnsUploadConfigView.this);
            }
          }
        };
        com.tencent.mm.sdk.b.a.sFg.a(localfu, Looper.myLooper());
      }
      this.ogr.setImageResource(i.i.album_facebook_icon_pressed);
      return;
    }
    this.ogr.setImageResource(i.i.album_facebook_icon_normal);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadConfigView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */