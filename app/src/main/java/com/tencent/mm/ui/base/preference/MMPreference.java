package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public abstract class MMPreference
  extends MMActivity
{
  public SharedPreferences duR;
  private boolean iWf = false;
  public ListView kww;
  private boolean oyq = false;
  public h tCL;
  protected RelativeLayout tCM;
  protected TextView tCN;
  protected ImageView tCO;
  
  public static boolean csm()
  {
    return false;
  }
  
  public abstract int Ys();
  
  public boolean Yy()
  {
    return true;
  }
  
  public h a(SharedPreferences paramSharedPreferences)
  {
    return new h(this, paramSharedPreferences);
  }
  
  public abstract boolean a(f paramf, Preference paramPreference);
  
  public int auY()
  {
    return -1;
  }
  
  public View ayg()
  {
    return null;
  }
  
  public View btw()
  {
    return null;
  }
  
  public int getLayoutId()
  {
    return a.h.mm_preference_list_content;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.tCL = a(this.duR);
    this.kww = ((ListView)findViewById(16908298));
    this.tCM = ((RelativeLayout)findViewById(a.g.preference_tips_banner_view));
    this.tCN = ((TextView)findViewById(a.g.preference_tips_banner_tv));
    this.tCO = ((ImageView)findViewById(a.g.preference_tips_banner_close));
    int i = auY();
    if (i != -1)
    {
      paramBundle = getLayoutInflater().inflate(i, null);
      this.kww.addHeaderView(paramBundle);
    }
    paramBundle = ayg();
    if (paramBundle != null)
    {
      if (paramBundle.getLayoutParams() == null) {
        break label290;
      }
      paramBundle.setLayoutParams(new AbsListView.LayoutParams(paramBundle.getLayoutParams()));
    }
    for (;;)
    {
      this.kww.addFooterView(paramBundle);
      paramBundle = btw();
      if (paramBundle != null)
      {
        FrameLayout localFrameLayout = (FrameLayout)findViewById(a.g.preference_bottom);
        localFrameLayout.addView(paramBundle);
        localFrameLayout.setVisibility(0);
      }
      this.tCL.b(new MMPreference.1(this));
      i = Ys();
      if (i != -1) {
        this.tCL.addPreferencesFromResource(i);
      }
      this.kww.setAdapter(this.tCL);
      this.kww.setOnItemClickListener(new MMPreference.2(this));
      this.kww.setOnItemLongClickListener(new MMPreference.3(this));
      this.kww.setOnScrollListener(new MMPreference.4(this));
      return;
      label290:
      x.e("MicroMsg.mmui.MMPreference", "[arthurdan.mmpreference] Notice!!! footer.getLayoutParams() is null!!!\n");
    }
  }
  
  public void onResume()
  {
    if (Yy()) {
      this.tCL.notifyDataSetChanged();
    }
    super.onResume();
  }
  
  public final void setSelection(int paramInt)
  {
    this.kww.setSelection(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/MMPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */