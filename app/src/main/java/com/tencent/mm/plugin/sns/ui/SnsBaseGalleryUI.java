package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.l;

public abstract class SnsBaseGalleryUI
  extends MMActivity
  implements t.a
{
  private boolean hkK = true;
  private LinearLayout nTo;
  s nTp;
  private LinearLayout nTq;
  t nTr;
  private boolean nTs = true;
  private TextView nTt = null;
  protected SnsInfoFlip nTu;
  protected Button nTv;
  
  public void addView(View paramView)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.nTo.addView(paramView, localLayoutParams);
  }
  
  public void aun()
  {
    int j = 8;
    boolean bool = false;
    if (!this.nTs) {
      return;
    }
    s locals;
    if (this.hkK)
    {
      i = 8;
      setTitleVisibility(i);
      if (this.nTp != null)
      {
        locals = this.nTp;
        if (!this.hkK) {
          break label76;
        }
      }
    }
    label76:
    for (int i = j;; i = 0)
    {
      locals.setVisibility(i);
      if (!this.hkK) {
        bool = true;
      }
      this.hkK = bool;
      return;
      i = 0;
      break;
    }
  }
  
  public final void bBZ()
  {
    this.hkK = false;
    setTitleVisibility(8);
    if (this.nTp != null) {
      this.nTp.setVisibility(8);
    }
  }
  
  public void ci(String paramString, int paramInt) {}
  
  public void cj(String paramString, int paramInt)
  {
    if ((!this.nTs) || (af.bxX())) {
      return;
    }
    paramString = af.byo().Nl(paramString);
    if ((paramString == null) || (paramString.field_snsId == 0L))
    {
      enableOptionMenu(false);
      return;
    }
    enableOptionMenu(true);
  }
  
  public final void eP(String paramString1, String paramString2)
  {
    if (!this.nTs) {
      return;
    }
    setMMTitle(paramString1);
    setMMSubTitle(paramString2);
  }
  
  protected int getLayoutId()
  {
    return i.g.sns_gallery_img;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    af.byj().N(3, true);
    this.nTo = ((LinearLayout)findViewById(i.f.layout_content));
    this.nTq = ((LinearLayout)findViewById(i.f.content));
    this.nTr = new t(this, this);
    paramBundle = this.nTr;
    x.i("MicroMsg.GalleryTitleManager", "onAttach");
    g.Ek();
    g.Eh().dpP.a(218, paramBundle);
    a.sFg.b(paramBundle.iYS);
    a.sFg.b(paramBundle.nNd);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Object localObject;
    if (this.nTr != null)
    {
      localObject = this.nTr;
      x.i("MicroMsg.GalleryTitleManager", "onDetch");
      g.Ek();
      g.Eh().dpP.b(218, (e)localObject);
      a.sFg.c(((t)localObject).iYS);
      a.sFg.c(((t)localObject).nNd);
    }
    if (this.nTu != null)
    {
      localObject = this.nTu;
      if ((((SnsInfoFlip)localObject).nWz != null) && ((((SnsInfoFlip)localObject).nWz instanceof MMGestureGallery)))
      {
        localObject = (MMGestureGallery)((SnsInfoFlip)localObject).nWz;
        ((MMGestureGallery)localObject).uAg.release();
        ((MMGestureGallery)localObject).uAh.release();
        ((MMGestureGallery)localObject).uAf.release();
      }
      this.nTu.onDestroy();
    }
  }
  
  protected void onPause()
  {
    if (this.nTu != null) {
      this.nTu.onPause();
    }
    if (this.nTr != null)
    {
      t localt = this.nTr;
      if (localt.nMW != null)
      {
        aj localaj = new aj();
        localaj.bHK.activity = ((Activity)localt.context);
        localaj.bHK.bHL = localt.nMW;
        a.sFg.m(localaj);
        localt.nMW = null;
        localt.bJs = 0;
        localt.bJr = 0;
      }
    }
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.nTp != null) {
      this.nTp.refresh();
    }
  }
  
  @SuppressLint({"ResourceAsColor"})
  public final void t(boolean paramBoolean, int paramInt)
  {
    this.nTp = new s(this, paramInt, paramBoolean);
    this.nTp.setBackgroundColor(i.c.transparent);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.nTp.getBackground().setAlpha(50);
    this.nTq.addView(this.nTp, localLayoutParams);
    paramInt = getIntent().getIntExtra("sns_source", 0);
    this.nTp.setSnsSource(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */