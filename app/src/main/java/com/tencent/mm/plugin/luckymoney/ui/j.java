package com.tencent.mm.plugin.luckymoney.ui;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.tencent.mm.ui.MMActivity;

public class j
{
  public MMActivity fcq;
  public int kXx;
  private int kXy;
  
  public j(MMActivity paramMMActivity)
  {
    this.fcq = paramMMActivity;
    if (bbD())
    {
      paramMMActivity = paramMMActivity.getWindow();
      paramMMActivity.addFlags(Integer.MIN_VALUE);
      this.kXy = paramMMActivity.getStatusBarColor();
    }
  }
  
  public static boolean bbD()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  public void p(Drawable paramDrawable)
  {
    if (this.fcq.getSupportActionBar() != null) {
      this.fcq.getSupportActionBar().setBackgroundDrawable(paramDrawable);
    }
  }
  
  public static final class a
  {
    public int gND;
    public int kXA;
    public int kXB;
    public int kXC;
    public int kXD;
    public Drawable kXz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */