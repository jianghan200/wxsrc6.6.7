package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.a.a.j;
import android.view.LayoutInflater;

public final class d
  extends ContextWrapper
{
  private LayoutInflater Bc;
  public int Gt;
  private Resources.Theme mTheme;
  
  public d(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.Gt = paramInt;
  }
  
  private void dt()
  {
    if (this.mTheme == null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.mTheme = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null) {
          this.mTheme.setTo(localTheme);
        }
      }
      this.mTheme.applyStyle(this.Gt, true);
      return;
    }
  }
  
  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (this.Bc == null) {
        this.Bc = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return this.Bc;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public final Resources.Theme getTheme()
  {
    if (this.mTheme != null) {
      return this.mTheme;
    }
    if (this.Gt == 0) {
      this.Gt = a.j.Theme_AppCompat_Light;
    }
    dt();
    return this.mTheme;
  }
  
  public final void setTheme(int paramInt)
  {
    if (this.Gt != paramInt)
    {
      this.Gt = paramInt;
      dt();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */