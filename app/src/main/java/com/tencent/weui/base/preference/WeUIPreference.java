package com.tencent.weui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.ui.BaseActivity;

public abstract class WeUIPreference
  extends BaseActivity
{
  private SharedPreferences duR;
  private boolean iWf = false;
  private ListView kww;
  private boolean oyq = false;
  protected RelativeLayout tCM;
  protected TextView tCN;
  protected ImageView tCO;
  private b vzz;
  
  public abstract int Ys();
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.vzz = new b(this, this.duR);
    this.kww = ((ListView)findViewById(16908298));
    this.tCM = ((RelativeLayout)findViewById(a.f.preference_tips_banner_view));
    this.tCN = ((TextView)findViewById(a.f.preference_tips_banner_tv));
    this.tCO = ((ImageView)findViewById(a.f.preference_tips_banner_close));
    paramBundle = this.vzz;
    paramBundle.vzC = new WeUIPreference.1(this);
    paramBundle.notifyDataSetChanged();
    int i = Ys();
    if (i != -1)
    {
      paramBundle = this.vzz;
      paramBundle.tDb = true;
      paramBundle.vzB.a(i, paramBundle);
      paramBundle.tDb = false;
      paramBundle.notifyDataSetChanged();
    }
    this.kww.setAdapter(this.vzz);
    this.kww.setOnItemClickListener(new WeUIPreference.2(this));
    this.kww.setOnItemLongClickListener(new WeUIPreference.3(this));
    this.kww.setOnScrollListener(new WeUIPreference.4(this));
  }
  
  protected void onResume()
  {
    this.vzz.notifyDataSetChanged();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/weui/base/preference/WeUIPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */