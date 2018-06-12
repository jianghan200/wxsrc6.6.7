package com.tencent.mm.plugin.bottle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.i.a;
import com.tencent.mm.bp.a;
import com.tencent.mm.k.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.bottle.a.h.a;
import com.tencent.mm.plugin.bottle.a.h.d;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText;

public class ThrowBottleUI
  extends FrameLayout
  implements View.OnClickListener, h.a
{
  private static final int[] erx = { R.g.amp_land_1, R.g.amp_land_2, R.g.amp_land_3, R.g.amp_land_4, R.g.amp_land_5, R.g.amp_land_6, R.g.amp_land_7, R.g.amp_land_8, R.g.amp_land_9, R.g.amp_land_10, R.g.amp_land_11 };
  private static final int[] hnd = { 0, 9, 18, 27, 37, 46, 55, 64, 74, 85, 93, 100 };
  final al erD = new al(new ThrowBottleUI.5(this), true);
  ag handler = new ag();
  BottleBeachUI hlO;
  boolean hmZ = true;
  ImageView hml;
  boolean hnA = false;
  @SuppressLint({"HandlerLeak"})
  private final ag hnB = new ThrowBottleUI.8(this);
  final i.a hnC = new ThrowBottleUI.9(this);
  h.d hne;
  ToneGenerator hnf;
  private long hng = -1L;
  Toast hnh;
  Vibrator hni;
  ThrowBottleAnimUI hnj;
  AnimationDrawable hnk;
  ImageView hnl;
  TextView hnm;
  ImageView hnn;
  MMEditText hno;
  View hnp;
  Button hnq;
  ImageButton hnr;
  ThrowBottleFooter hns;
  boolean hnt = false;
  boolean hnu;
  LinearLayout.LayoutParams hnv = null;
  private int hnw = 0;
  int hnx = 0;
  private ThrowBottleAnimUI.a hny = new ThrowBottleUI.4(this);
  final al hnz = new al(new ThrowBottleUI.6(this), true);
  
  public ThrowBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.hlO = ((BottleBeachUI)paramContext);
  }
  
  private void auF()
  {
    int j = 8;
    this.hnm.setVisibility(8);
    Object localObject = this.hnn;
    boolean bool;
    if (this.hmZ)
    {
      i = 8;
      ((ImageView)localObject).setVisibility(i);
      localObject = (View)this.hno.getParent();
      i = j;
      if (this.hmZ) {
        i = 0;
      }
      ((View)localObject).setVisibility(i);
      if (this.hmZ) {
        this.hno.requestFocus();
      }
      if (this.hmZ) {
        break label182;
      }
      bool = true;
      label87:
      this.hmZ = bool;
      ImageButton localImageButton = this.hnr;
      if (!this.hmZ) {
        break label187;
      }
      localObject = a.f(this.hlO, R.g.chatting_setmode_keyboard_btn);
      label117:
      localImageButton.setImageDrawable((Drawable)localObject);
      if (!this.hmZ) {
        break label202;
      }
      dL(false);
      label136:
      this.hnq = ((Button)this.hlO.findViewById(R.h.bottle_throw_btn));
      localObject = this.hnq;
      if (!this.hmZ) {
        break label210;
      }
    }
    label182:
    label187:
    label202:
    label210:
    for (int i = R.l.bottle_throw_voice_btn_text;; i = R.l.bottle_throw_text_btn_text)
    {
      ((Button)localObject).setText(i);
      return;
      i = 0;
      break;
      bool = false;
      break label87;
      localObject = a.f(this.hlO, R.g.chatting_setmode_voice_btn);
      break label117;
      dL(true);
      break label136;
    }
  }
  
  private void auG()
  {
    int k;
    int j;
    if (this.hmZ)
    {
      k = this.hnm.getLeft();
      j = this.hnm.getTop();
    }
    for (int i = this.hnm.getWidth();; i = 0)
    {
      this.hnj = ((ThrowBottleAnimUI)this.hlO.findViewById(R.h.bottle_throw_anim_lo));
      this.hnj.setOnThrowEndListener(this.hny);
      ThrowBottleAnimUI localThrowBottleAnimUI = this.hnj;
      localThrowBottleAnimUI.hmZ = this.hmZ;
      localThrowBottleAnimUI.Om = k;
      localThrowBottleAnimUI.On = j;
      localThrowBottleAnimUI.hmX = i;
      localThrowBottleAnimUI.setVisibility(0);
      ah.i(new ThrowBottleAnimUI.1(localThrowBottleAnimUI), 100L);
      return;
      k = this.hno.getLeft();
      j = this.hno.getTop();
    }
  }
  
  private void dL(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((InputMethodManager)this.hlO.getSystemService("input_method")).showSoftInput(this.hno, 0);
      return;
    }
    ((InputMethodManager)this.hlO.getSystemService("input_method")).hideSoftInputFromWindow(this.hno.getWindowToken(), 2);
  }
  
  public final boolean auH()
  {
    x.d("MM.Bottle.ThrowBottleUI", "bottle record stop");
    boolean bool;
    if (this.hnA)
    {
      this.hlO.getWindow().getDecorView().setKeepScreenOn(false);
      if (this.hnk != null) {
        this.hnk.stop();
      }
      if (this.hne == null) {
        break label179;
      }
      bool = this.hne.wk();
      af.Wq("keep_app_silent");
      this.erD.SO();
      this.hnz.SO();
      this.hng = -1L;
    }
    for (;;)
    {
      if (!bool)
      {
        this.hnq.setEnabled(false);
        this.hnq.setBackgroundDrawable(a.f(this.hlO, R.g.record_shape_disable));
        this.hnl.setVisibility(8);
        this.hnm.setVisibility(8);
        this.hnB.sendEmptyMessageDelayed(0, 500L);
        au.HU();
        if (com.tencent.mm.model.c.isSDCardAvailable()) {
          this.hlO.nl(R.l.bottle_throw_rcd_too_short);
        }
      }
      for (;;)
      {
        this.hnA = false;
        return false;
        auG();
      }
      label179:
      bool = false;
    }
  }
  
  public final void ci(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 63534)
    {
      this.hlO.nm(0);
      this.hlO.nl(R.l.bottle_banby_expose);
    }
  }
  
  public void onClick(View paramView)
  {
    if (R.h.bottle_attach_btn == paramView.getId())
    {
      if ((!this.hmZ) && (this.hno.getText().toString().trim().length() > 0))
      {
        h.a(this.hlO, getResources().getString(R.l.bottle_switch_mode_alert_title), null, getResources().getString(R.l.bottle_switch_mode_continue_text), new ThrowBottleUI.3(this), null);
        return;
      }
      auF();
      return;
    }
    this.hlO.nm(0);
  }
  
  public void setVisibility(int paramInt)
  {
    this.hml.setVisibility(8);
    int i;
    if (paramInt == 0)
    {
      this.hmZ = true;
      this.hnl.setVisibility(8);
      this.hnm.setVisibility(8);
      this.hnm.setWidth(BackwardSupportUtil.b.b(this.hlO, 120.0F));
      this.hnn.setVisibility(0);
      ((View)this.hno.getParent()).setVisibility(8);
      this.hno.setText("");
      this.hns.setVisibility(0);
      com.tencent.mm.ui.tools.a.c.d(this.hno).Gi(b.Au()).a(null);
      this.hnr.setImageDrawable(a.f(this.hlO, R.g.chatting_setmode_keyboard_btn));
      this.hnq.setBackgroundDrawable(a.f(this.hlO, R.g.record_shape_normal));
      Button localButton = this.hnq;
      if (this.hmZ)
      {
        i = R.l.bottle_throw_voice_btn_text;
        localButton.setText(i);
        ((LinearLayout)this.hlO.findViewById(R.h.bottle_throw_edit_lo)).setVisibility(0);
        this.hlO.getWindow().clearFlags(1024);
      }
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      return;
      i = R.l.bottle_throw_text_btn_text;
      break;
      this.hlO.getWindow().setFlags(1024, 1024);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/ThrowBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */