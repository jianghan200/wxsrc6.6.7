package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.g.a;
import com.tencent.mm.ab.g.b;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.s;
import java.util.ArrayList;
import junit.framework.Assert;

public class OpenBottleUI
  extends FrameLayout
  implements View.OnClickListener, g.a, g.b, m.b, SensorController.a
{
  static SensorController hlW;
  private com.tencent.mm.e.a.a bAW;
  com.tencent.mm.storage.bd bGS;
  BottleBeachUI hlO;
  TextView hlP;
  LinearLayout hlQ;
  FrameLayout hlR;
  ImageView hlS;
  TextView hlT;
  TextView hlU;
  TextView hlV;
  ThrowBottleAnimUI hlX;
  String hlY;
  private boolean hlZ = true;
  private com.tencent.mm.sdk.platformtools.az hma;
  private long hmb = -1L;
  private boolean hmc;
  TextView hmd;
  MMActivity hme;
  long hmf = 0L;
  private boolean hmg = false;
  private boolean isDeleteCancel = false;
  
  public OpenBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.hlO = ((BottleBeachUI)paramContext);
    au.HU();
    com.tencent.mm.model.c.FR().a(this);
    if (hlW == null) {
      hlW = new SensorController(paramContext.getApplicationContext());
    }
    if (this.hma == null) {
      this.hma = new com.tencent.mm.sdk.platformtools.az(paramContext.getApplicationContext());
    }
    au.HU();
    paramContext = (Boolean)com.tencent.mm.model.c.DT().get(26, Boolean.valueOf(false));
    this.hmc = paramContext.booleanValue();
    if (!paramContext.booleanValue()) {}
    for (boolean bool = true;; bool = false)
    {
      this.hlZ = bool;
      if (this.bAW != null) {
        this.bAW.aK(this.hlZ);
      }
      return;
    }
  }
  
  private void J(com.tencent.mm.storage.bd parambd)
  {
    if ((com.tencent.mm.p.a.by(getContext())) || (com.tencent.mm.p.a.bw(this.hlO)))
    {
      com.tencent.mm.sdk.platformtools.x.d("MM.Bottle_OpenBottleUI", "voip is running, can't use the feature");
      return;
    }
    boolean bool;
    if ((parambd != null) && (parambd.ckz()))
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((parambd != null) && (parambd.ckz()) && (!hlW.sIY))
      {
        hlW.a(this);
        OpenBottleUI.5 local5 = new OpenBottleUI.5(this);
        if (!this.hma.Q(local5)) {
          break label130;
        }
      }
    }
    label130:
    for (this.hmb = 0L;; this.hmb = -1L)
    {
      au.HU();
      if ((com.tencent.mm.model.c.isSDCardAvailable()) || (bi.oW(parambd.field_imgPath))) {
        break label140;
      }
      s.gH(this.hlO);
      return;
      bool = false;
      break;
    }
    label140:
    if (this.bAW == null) {
      this.bAW = new com.tencent.mm.e.a.a(this.hlO);
    }
    af.Wp("keep_app_silent");
    q.H(parambd);
    this.bAW.aJ(false);
    if ((parambd != null) && (this.bAW.m(parambd.field_imgPath, this.hlZ)))
    {
      au.HV().e(this.hlZ, false, false);
      this.bAW.bCU = this;
      this.bAW.bCT = this;
      this.hlS.setBackgroundResource(R.a.bottle_voice_playing);
      ((AnimationDrawable)this.hlS.getBackground()).start();
      return;
    }
    Toast.makeText(this.hlO, this.hlO.getString(R.l.chatting_play_err), 0).show();
  }
  
  static int nr(int paramInt)
  {
    if (paramInt <= 2) {
      return 100;
    }
    if (paramInt < 10) {
      return (paramInt - 2) * 8 + 100;
    }
    if (paramInt < 60) {
      return (paramInt / 10 + 7) * 8 + 100;
    }
    return 204;
  }
  
  private void stopPlay()
  {
    af.Wq("keep_app_silent");
    aux();
    if ((this.hlS.getBackground() instanceof AnimationDrawable))
    {
      ((AnimationDrawable)this.hlS.getBackground()).stop();
      this.hlS.setBackgroundResource(R.g.bottle_receiver_voice_node);
    }
    if (this.bAW != null) {
      this.bAW.aJ(false);
    }
    setScreenEnable(true);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    com.tencent.mm.sdk.platformtools.x.d("MM.Bottle_OpenBottleUI", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      com.tencent.mm.sdk.platformtools.x.e("MM.Bottle_OpenBottleUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      return;
      paramm = (String)paramObject;
    } while ((bi.oW(this.hlY)) || (!ab.XV(this.hlY).equals(ab.XV(paramm))));
    auy();
  }
  
  public final void aux()
  {
    if (hlW != null) {
      hlW.ciL();
    }
    this.hma.ciM();
  }
  
  final void auy()
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.FR().Yg(this.hlY);
    int i;
    if ((localObject != null) && (this.hlO != null))
    {
      this.hlU.setText(this.hlO.getString(R.l.bottle_open_contact_from, new Object[] { com.tencent.mm.plugin.bottle.a.c.b(this.hlO, (ab)localObject) }));
      TextView localTextView = this.hlU;
      if (((ai)localObject).sex == 1)
      {
        i = R.k.ic_sex_male;
        localTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.hlU.setCompoundDrawablePadding(8);
        this.hlV.setText(j.a(this.hlO, ((ai)localObject).signature, this.hlV.getTextSize()));
      }
    }
    else
    {
      localObject = ab.XV(this.hlY);
      if (!bi.oW((String)localObject)) {
        break label161;
      }
      localObject = this.hlY;
    }
    label161:
    for (;;)
    {
      a.b.a((ImageView)findViewById(R.h.bottle_open_avatar_iv), (String)localObject);
      return;
      i = R.k.ic_sex_female;
      break;
    }
  }
  
  public final boolean auz()
  {
    return (this.bAW != null) && (this.bAW.isPlaying()) && (!this.hlZ);
  }
  
  public final void dK(boolean paramBoolean)
  {
    boolean bool = true;
    if ((!this.bGS.ckz()) || (this.bAW == null)) {}
    do
    {
      return;
      if (this.hmg)
      {
        if (!paramBoolean) {}
        for (paramBoolean = bool;; paramBoolean = false)
        {
          this.hmg = paramBoolean;
          return;
        }
      }
      if ((!paramBoolean) && (this.hmb != -1L) && (bi.bI(this.hmb) > 400L))
      {
        this.hmg = true;
        return;
      }
      this.hmg = false;
      if ((bi.VG() - this.hmf > 500L) && ((paramBoolean) || ((!paramBoolean) && (this.bAW.isPlaying())))) {
        setScreenEnable(paramBoolean);
      }
      if (this.hmc)
      {
        this.bAW.aK(false);
        au.HV().e(false, false, false);
        this.hlZ = false;
        return;
      }
      if (!this.bAW.isPlaying())
      {
        this.bAW.aK(true);
        au.HV().e(true, false, false);
        this.hlZ = true;
        return;
      }
      this.bAW.aK(paramBoolean);
      au.HV().e(paramBoolean, false, false);
      this.hlZ = paramBoolean;
    } while (paramBoolean);
    J(this.bGS);
  }
  
  public void onClick(View paramView)
  {
    if (R.h.bottle_open_throw_back_btn == paramView.getId())
    {
      paramView = this.hlX;
      paramView.hmZ = this.bGS.ckz();
      paramView.setVisibility(0);
      paramView.hlO.hkD = false;
      paramView.hlO.nm(-1);
      paramView.auD();
      paramView.auB();
      paramView.auC();
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.f(this.hlY, 1));
      this.isDeleteCancel = false;
      paramView = this.hlO;
      this.hlO.getString(R.l.app_tip);
      paramView = h.a(paramView, this.hlO.getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          OpenBottleUI.c(OpenBottleUI.this);
        }
      });
      com.tencent.mm.model.bd.a(this.hlY, new OpenBottleUI.3(this, paramView));
      au.HU();
      com.tencent.mm.model.c.FW().Yp(this.hlY);
      aux();
    }
    do
    {
      stopPlay();
      do
      {
        return;
        if (R.h.bottle_open_reply_btn == paramView.getId())
        {
          this.hlO.nm(0);
          paramView = new Intent();
          paramView.putExtra("Chat_User", this.hlY);
          com.tencent.mm.plugin.bottle.a.ezn.e(paramView, this.hlO);
          aux();
          break;
        }
      } while (R.h.bottle_open_voice_node_fl != paramView.getId());
    } while ((this.bAW != null) && (this.bAW.isPlaying()));
    J(this.bGS);
  }
  
  public final void onError()
  {
    com.tencent.mm.sdk.platformtools.x.v("MM.Bottle_OpenBottleUI", "voice play error");
    stopPlay();
  }
  
  public final void onPause()
  {
    au.HV().yO();
    if ((this.bGS != null) && (this.bGS.ckz())) {
      aux();
    }
    if (this.bAW != null)
    {
      if (this.bAW.isPlaying()) {
        stopPlay();
      }
      this.bAW.aK(true);
    }
  }
  
  void setScreenEnable(boolean paramBoolean)
  {
    this.hme.setScreenEnable(paramBoolean);
  }
  
  public final void wd()
  {
    com.tencent.mm.sdk.platformtools.x.v("MM.Bottle_OpenBottleUI", "voice play completion");
    stopPlay();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/OpenBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */