package com.tencent.mm.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.i;
import java.util.LinkedList;

public abstract class SearchBarUI
  extends BaseActivity
  implements ag.a
{
  ag tpU;
  
  public void onClickBackBtn(View paramView)
  {
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = BaseActivity.c.tgS;
    paramBundle = new SearchBarUI.1(this);
    BaseActivity.b localb = new BaseActivity.b();
    localb.tgH = 0;
    localb.tgI = 0;
    localb.text = "";
    localb.eOJ = paramBundle;
    localb.jcS = null;
    localb.tgM = i;
    if ((localb.tgI == a.e.actionbar_icon_dark_more) && ("".length() <= 0)) {
      localb.text = getString(a.i.actionbar_more);
    }
    int j = localb.tgH;
    i = 0;
    for (;;)
    {
      if (i < this.tgz.size())
      {
        if (((BaseActivity.b)this.tgz.get(i)).tgH == j)
        {
          ao.s("match menu, id ：" + j + ", remove it", new Object[0]);
          this.tgz.remove(i);
        }
      }
      else
      {
        this.tgz.add(localb);
        new Handler().postDelayed(new BaseActivity.6(this), 200L);
        setBackBtn(new SearchBarUI.2(this));
        return;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/SearchBarUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */