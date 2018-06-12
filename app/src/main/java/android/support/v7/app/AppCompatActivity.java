package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.an;
import android.support.v4.app.an.a;
import android.support.v4.app.v;
import android.support.v4.view.g;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ar;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class AppCompatActivity
  extends FragmentActivity
  implements an.a, d
{
  private e mDelegate;
  private boolean mEatKeyUpEvent;
  private Resources mResources;
  private int mThemeId = 0;
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().addContentView(paramView, paramLayoutParams);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((g.a(paramKeyEvent, 4096)) && (paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState() & 0x8FFF) == 60))
    {
      int i = paramKeyEvent.getAction();
      if (i == 0)
      {
        ActionBar localActionBar = getSupportActionBar();
        if ((localActionBar != null) && (localActionBar.isShowing()) && (localActionBar.requestFocus()))
        {
          this.mEatKeyUpEvent = true;
          return true;
        }
      }
      else if ((i == 1) && (this.mEatKeyUpEvent))
      {
        this.mEatKeyUpEvent = false;
        return true;
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public View findViewById(int paramInt)
  {
    return getDelegate().findViewById(paramInt);
  }
  
  public e getDelegate()
  {
    if (this.mDelegate == null) {
      this.mDelegate = e.a(this, this);
    }
    return this.mDelegate;
  }
  
  public a.a getDrawerToggleDelegate()
  {
    return getDelegate().getDrawerToggleDelegate();
  }
  
  public MenuInflater getMenuInflater()
  {
    return getDelegate().getMenuInflater();
  }
  
  public Resources getResources()
  {
    if ((this.mResources == null) && (ar.hi())) {
      this.mResources = new ar(this, super.getResources());
    }
    if (this.mResources == null) {
      return super.getResources();
    }
    return this.mResources;
  }
  
  public ActionBar getSupportActionBar()
  {
    return getDelegate().getSupportActionBar();
  }
  
  public Intent getSupportParentActivityIntent()
  {
    return v.b(this);
  }
  
  public void invalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    getDelegate().onConfigurationChanged(paramConfiguration);
    if (this.mResources != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.mResources.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged()
  {
    onSupportContentChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    e locale = getDelegate();
    locale.de();
    locale.onCreate(paramBundle);
    if ((locale.df()) && (this.mThemeId != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), this.mThemeId, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(this.mThemeId);
    }
  }
  
  public void onCreateSupportNavigateUpTaskStack(an paraman)
  {
    Intent localIntent = null;
    if ((this instanceof an.a)) {
      localIntent = ((an.a)this).getSupportParentActivityIntent();
    }
    if (localIntent == null) {
      localIntent = v.b(this);
    }
    for (;;)
    {
      if (localIntent != null)
      {
        ComponentName localComponentName2 = localIntent.getComponent();
        ComponentName localComponentName1 = localComponentName2;
        if (localComponentName2 == null) {
          localComponentName1 = localIntent.resolveActivity(paraman.qO.getPackageManager());
        }
        paraman.a(localComponentName1);
        paraman.qN.add(localIntent);
      }
      return;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    getDelegate().onDestroy();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    ActionBar localActionBar = getSupportActionBar();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0)) {
      return onSupportNavigateUp();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    getDelegate().dd();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    getDelegate().onPostResume();
  }
  
  public void onPrepareSupportNavigateUpTaskStack(an paraman) {}
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    getDelegate().onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
    getDelegate().onStop();
  }
  
  public void onSupportActionModeFinished(b paramb) {}
  
  public void onSupportActionModeStarted(b paramb) {}
  
  @Deprecated
  public void onSupportContentChanged() {}
  
  public boolean onSupportNavigateUp()
  {
    int i = 0;
    Object localObject1 = getSupportParentActivityIntent();
    if (localObject1 != null)
    {
      Object localObject2;
      Context localContext;
      int j;
      if (supportShouldUpRecreateTask((Intent)localObject1))
      {
        localObject1 = an.N(this);
        onCreateSupportNavigateUpTaskStack((an)localObject1);
        onPrepareSupportNavigateUpTaskStack((an)localObject1);
        if (((an)localObject1).qN.isEmpty()) {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        localObject2 = (Intent[])((an)localObject1).qN.toArray(new Intent[((an)localObject1).qN.size()]);
        localObject2[0] = new Intent(localObject2[0]).addFlags(268484608);
        localContext = ((an)localObject1).qO;
        j = Build.VERSION.SDK_INT;
        if (j >= 16)
        {
          localContext.startActivities((Intent[])localObject2, null);
          i = 1;
          if (i == 0)
          {
            localObject2 = new Intent(localObject2[(localObject2.length - 1)]);
            ((Intent)localObject2).addFlags(268435456);
            ((an)localObject1).qO.startActivity((Intent)localObject2);
          }
        }
      }
      for (;;)
      {
        try
        {
          if (Build.VERSION.SDK_INT >= 16)
          {
            finishAffinity();
            return true;
            if (j < 11) {
              break;
            }
            localContext.startActivities((Intent[])localObject2);
            i = 1;
            break;
          }
          finish();
          continue;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        supportNavigateUpTo(localIllegalStateException);
      }
    }
    return false;
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    getDelegate().setTitle(paramCharSequence);
  }
  
  public b onWindowStartingSupportActionMode(b.a parama)
  {
    return null;
  }
  
  public void setContentView(int paramInt)
  {
    getDelegate().setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    getDelegate().setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().setContentView(paramView, paramLayoutParams);
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    getDelegate().setSupportActionBar(paramToolbar);
  }
  
  @Deprecated
  public void setSupportProgress(int paramInt) {}
  
  @Deprecated
  public void setSupportProgressBarIndeterminate(boolean paramBoolean) {}
  
  @Deprecated
  public void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean) {}
  
  @Deprecated
  public void setSupportProgressBarVisibility(boolean paramBoolean) {}
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.mThemeId = paramInt;
  }
  
  public b startSupportActionMode(b.a parama)
  {
    return getDelegate().startSupportActionMode(parama);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void supportNavigateUpTo(Intent paramIntent)
  {
    v.b(this, paramIntent);
  }
  
  public boolean supportRequestWindowFeature(int paramInt)
  {
    return getDelegate().requestWindowFeature(paramInt);
  }
  
  public boolean supportShouldUpRecreateTask(Intent paramIntent)
  {
    return v.a(this, paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/AppCompatActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */