package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.ui.x;
import com.tencent.mm.w.a.h;

public abstract class i
  extends x
{
  private SharedPreferences duR;
  private boolean iWf = false;
  private ListView kww;
  private boolean oyq = false;
  private long pSG;
  public h tCL;
  public boolean tDd;
  
  public static boolean csm()
  {
    return false;
  }
  
  public abstract int Ys();
  
  public abstract boolean a(f paramf, Preference paramPreference);
  
  protected int getLayoutId()
  {
    return a.h.mm_preference_fragment_list_content;
  }
  
  protected View getLayoutView()
  {
    return b.EY().a(getContext(), "R.layout.mm_preference_fragment_list_content", a.h.mm_preference_fragment_list_content);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.tDd = false;
    this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.tCL = new h(getContext(), this.duR);
    this.kww = ((ListView)findViewById(16908298));
    this.tCL.b(new i.1(this));
    this.kww.setAdapter(this.tCL);
    this.kww.setOnItemClickListener(new i.2(this));
    this.kww.setOnItemLongClickListener(new i.3(this));
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onResume()
  {
    super.onResume();
    this.tCL.notifyDataSetChanged();
    this.pSG = System.currentTimeMillis();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */