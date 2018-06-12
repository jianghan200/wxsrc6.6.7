package com.tencent.mm.plugin.account.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.plugin.account.a.b;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;

public class WelcomeSelectView
  extends WelcomeView
{
  private Context context;
  private View eRT;
  private Button eXt;
  private Button eXu;
  private TextView eXv;
  private int mHeight = 800;
  
  public WelcomeSelectView(Context paramContext)
  {
    super(paramContext);
    co(paramContext);
  }
  
  @TargetApi(11)
  public WelcomeSelectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    co(paramContext);
  }
  
  private void co(final Context paramContext)
  {
    this.context = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(a.g.welcome_select_ui, this);
    this.eRT = localView.findViewById(a.f.select_lv);
    this.eXt = ((Button)localView.findViewById(a.f.select_login_btn));
    this.eXu = ((Button)localView.findViewById(a.f.select_register_btn));
    this.eXv = ((TextView)localView.findViewById(a.f.welcome_language_tv));
    this.eRT.setVisibility(8);
    this.eXv.setVisibility(8);
    this.eXv.setText(w.h(paramContext, a.b.language_setting, a.j.app_lang_sys));
    this.mHeight = paramContext.getResources().getDisplayMetrics().heightPixels;
    this.eXv.setOnClickListener(new WelcomeSelectView.1(this));
    this.eXt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent(paramContext, MobileInputUI.class);
        paramAnonymousView.putExtra("mobile_input_purpose", 1);
        paramContext.startActivity(paramAnonymousView);
      }
    });
    this.eXu.setOnClickListener(new WelcomeSelectView.3(this, paramContext));
    paramContext = w.e(this.context.getSharedPreferences(ad.chY(), 0));
    this.eXv.setText(w.h(this.context, a.b.language_setting, a.j.app_lang_sys));
    if ((paramContext != null) && (paramContext.equals("language_default"))) {
      this.eXv.setText(this.context.getString(a.j.login_language));
    }
    this.eXt.setText(a.j.intro_existed_login);
    this.eXu.setText(a.j.intro_create_account_qq);
  }
  
  public final void Zt()
  {
    bE(this.eRT);
    bE(this.eXv);
    this.eRT.setVisibility(0);
    this.eXv.setVisibility(0);
    ah.A(new WelcomeSelectView.4(this));
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/WelcomeSelectView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */