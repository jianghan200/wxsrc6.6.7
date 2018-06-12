package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class e
{
  static int Ed = -1;
  private static boolean Ee = false;
  
  public static e a(Activity paramActivity, d paramd)
  {
    return a(paramActivity, paramActivity.getWindow(), paramd);
  }
  
  public static e a(Dialog paramDialog, d paramd)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramd);
  }
  
  private static e a(Context paramContext, Window paramWindow, d paramd)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return new i(paramContext, paramWindow, paramd);
    }
    if (i >= 14) {
      return new h(paramContext, paramWindow, paramd);
    }
    if (i >= 11) {
      return new g(paramContext, paramWindow, paramd);
    }
    return new AppCompatDelegateImplV7(paramContext, paramWindow, paramd);
  }
  
  public static boolean dg()
  {
    return Ee;
  }
  
  public abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void dd();
  
  public abstract void de();
  
  public abstract boolean df();
  
  public abstract View findViewById(int paramInt);
  
  public abstract a.a getDrawerToggleDelegate();
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract ActionBar getSupportActionBar();
  
  public abstract void invalidateOptionsMenu();
  
  public abstract void onConfigurationChanged(Configuration paramConfiguration);
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onPostResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  public abstract void onStop();
  
  public abstract boolean requestWindowFeature(int paramInt);
  
  public abstract void setContentView(int paramInt);
  
  public abstract void setContentView(View paramView);
  
  public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void setSupportActionBar(Toolbar paramToolbar);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public abstract b startSupportActionMode(b.a parama);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */