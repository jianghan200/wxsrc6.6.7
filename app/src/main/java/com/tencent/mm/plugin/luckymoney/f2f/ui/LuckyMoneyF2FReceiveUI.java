package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.f2f.a.b;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import java.io.IOException;

@a(3)
public class LuckyMoneyF2FReceiveUI
  extends LuckyMoneyBaseUI
{
  private int amount;
  private DisplayMetrics ewi;
  private String ixy;
  private String kLZ;
  private ImageView kNF;
  private TextView kNG;
  private String kNe;
  private String kNj;
  private View kOG;
  private TextView kOH;
  private ImageView kOI;
  private ValueAnimator kOJ;
  private ValueAnimator kOK;
  private Intent kOL;
  private boolean kOM = false;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!(paraml instanceof b)) {
      return true;
    }
    Object localObject1 = (b)paraml;
    paramInt1 = ((b)localObject1).ceS;
    paramInt2 = ((b)localObject1).kNd;
    this.amount = ((b)localObject1).amount;
    int i = ((b)localObject1).kNg;
    Object localObject2 = ((b)localObject1).kNh;
    String str = ((b)localObject1).kNi;
    x.i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", new Object[] { Integer.valueOf(((b)localObject1).ceS), Integer.valueOf(((b)localObject1).kNd), Integer.valueOf(((b)localObject1).bJL) });
    if (paramInt2 == 2)
    {
      if (paramInt1 == 5) {
        h.a(this, getString(a.i.lucky_money_f2f_has_expired), "", new LuckyMoneyF2FReceiveUI.5(this));
      }
      for (;;)
      {
        return true;
        this.kLZ = ((b)localObject1).kLZ;
        this.kNe = ((b)localObject1).kNe;
        this.kNj = ((b)localObject1).kNj;
        this.kOL = new Intent();
        if ((!bi.oW(this.kNe)) && (!com.tencent.mm.model.s.he(this.kNe)))
        {
          paramString = new j();
          paramString.username = this.kNe;
          q.KH().a(paramString);
        }
        o.a(this.kNF, null, this.kNe);
        paramString = new f();
        paramString.cfh = this.amount;
        paramString.kLZ = this.kLZ;
        paramString.ceS = paramInt1;
        paramString.ceT = paramInt2;
        paramString.kNi = str;
        paramString.kNg = i;
        paramString.kQg = this.kNe;
        paramString.kNh = ((String)localObject2);
        paramString.kPL = o.gS(this.kNe);
        paramString.kNj = this.kNj;
        paramString.kPI = 2;
        x.i("LuckyMoneyF2FReceiveUI", "is most lucky %d", new Object[] { Integer.valueOf(((b)localObject1).kNk) });
        if (((b)localObject1).kNk > 0) {
          paramString.kPK = getString(a.i.lucky_money_lucky_best);
        }
        paramString.kPM = o.Gd(this.kNe);
        try
        {
          this.kOL.putExtra("key_detail_info", paramString.toByteArray());
          paramString = ((b)localObject1).kNf;
          if (paramString != null)
          {
            localObject1 = new RealnameGuideHelper();
            ((RealnameGuideHelper)localObject1).a(String.valueOf(paramString.qYW), paramString.kRt, paramString.kRu, paramString.kRv, paramString.kRw, paraml.getType());
            this.kOL.putExtra("key_realname_guide_helper", (Parcelable)localObject1);
          }
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            x.e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + paramString.getMessage());
          }
        }
        if (!bi.G(new String[] { this.kLZ, this.kNe }))
        {
          o.a(this, this.kNG, o.gS(this.kNe));
          o.a(this, this.kOH, this.kNj);
          this.kOJ.start();
          this.mController.contentView.setVisibility(0);
        }
      }
    }
    if (((b)localObject1).kNf != null)
    {
      x.i("LuckyMoneyF2FReceiveUI", "need real name verify");
      localObject2 = ((b)localObject1).kNf;
      localObject1 = new RealnameGuideHelper();
      ((RealnameGuideHelper)localObject1).a(String.valueOf(((bfi)localObject2).qYW), ((bfi)localObject2).kRt, ((bfi)localObject2).kRu, ((bfi)localObject2).kRv, ((bfi)localObject2).kRw, paraml.getType());
      paraml = new Bundle();
      paraml.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
      paraml.putString("realname_verify_process_jump_plugin", "luckymoney");
      localObject2 = new LuckyMoneyF2FReceiveUI.6(this);
      new LuckyMoneyF2FReceiveUI.7(this);
      if (((RealnameGuideHelper)localObject1).a(this, paraml, (DialogInterface.OnClickListener)localObject2, false))
      {
        this.kOM = true;
        return true;
      }
    }
    paraml = paramString;
    if (bi.oW(paramString)) {
      paraml = getString(a.i.lucky_money_f2f_receive_fail);
    }
    h.a(this, paraml, "", new LuckyMoneyF2FReceiveUI.8(this));
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_f2f_receive_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kOG = findViewById(a.f.lucky_money_receive_ll);
    this.kNF = ((ImageView)findViewById(a.f.lucky_money_receive_sender_avatar));
    this.kNG = ((TextView)findViewById(a.f.lucky_money_receive_sender_nickname));
    this.kOH = ((TextView)findViewById(a.f.lucky_money_receive_tips));
    this.kOI = ((ImageView)findViewById(a.f.lucky_money_recieve_close_btn));
    this.kOI.setOnClickListener(new LuckyMoneyF2FReceiveUI.1(this));
    this.mController.contentView.setVisibility(8);
    this.ixy = getIntent().getStringExtra("key_share_url");
    i.zk(6);
    b(new b(this.ixy), true);
    this.ewi = getResources().getDisplayMetrics();
    this.kOJ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F }).setDuration(300L);
    this.kOK = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(300L);
    this.kOK.setStartDelay(1000L);
    this.kOJ.addUpdateListener(new LuckyMoneyF2FReceiveUI.2(this));
    this.kOJ.addListener(new LuckyMoneyF2FReceiveUI.3(this));
    this.kOK.addListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        x.i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
        if (LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this) != null) {
          LuckyMoneyF2FReceiveUI.a(LuckyMoneyF2FReceiveUI.this, LuckyMoneyDetailUI.class, LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this));
        }
        LuckyMoneyF2FReceiveUI.this.setResult(-1, null);
        LuckyMoneyF2FReceiveUI.this.finish();
        if (LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this) != null) {
          LuckyMoneyF2FReceiveUI.this.overridePendingTransition(a.a.pop_in, a.a.pop_out);
        }
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator) {}
      
      public final void onAnimationStart(Animator paramAnonymousAnimator) {}
    });
  }
  
  protected void onResume()
  {
    super.onResume();
    jr(1997);
    if (this.kOM) {
      finish();
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    js(1997);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */