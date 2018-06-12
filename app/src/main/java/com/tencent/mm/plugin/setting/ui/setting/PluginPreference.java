package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginPreference
  extends Preference
  implements f.c
{
  private MMActivity bGc;
  private ImageView eKk = null;
  int iRP = 255;
  String mQg;
  String mQh;
  private String mQi = "";
  private int mQj = -1;
  private int mQk = 8;
  boolean mQl = false;
  
  public PluginPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    setLayoutResource(a.g.mm_preference);
    q.Kp().a(this);
  }
  
  private void bru()
  {
    if (this.eKk != null) {
      a.b.a(this.eKk, this.mQg);
    }
  }
  
  public final boolean KW(String paramString)
  {
    paramString = ((i)g.l(i.class)).FR().Yg(paramString);
    if ((paramString == null) || ((int)paramString.dhP == 0))
    {
      x.e("MicroMsg.PluginPreference", "plugin do not exist");
      return false;
    }
    this.mQg = paramString.field_username;
    this.mQh = paramString.BK();
    setKey("settings_plugins_list_#" + this.mQg);
    return true;
  }
  
  public final void jX(String paramString)
  {
    if ((this.mQg != null) && (this.mQg.equals(paramString))) {
      new ag(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          PluginPreference.a(PluginPreference.this);
        }
      });
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.eKk = ((ImageView)paramView.findViewById(a.f.image_iv));
    this.eKk.setAlpha(this.iRP);
    TextView localTextView = (TextView)paramView.findViewById(a.f.text_tv_one);
    if (localTextView != null)
    {
      localTextView.setVisibility(this.mQk);
      localTextView.setText(this.mQi);
      if (this.mQj != -1) {
        localTextView.setBackgroundDrawable(com.tencent.mm.bp.a.f(this.bGc, this.mQj));
      }
    }
    paramView = (TextView)paramView.findViewById(a.f.new_dot);
    if (paramView != null) {
      if (!this.mQl) {
        break label118;
      }
    }
    label118:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      bru();
      return;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(a.g.mm_preference_content_plugin, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/PluginPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */