package com.tencent.sqlitelint.behaviour.alert;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.tencent.sqlitelint.d.b;
import com.tencent.sqlitelint.d.c;

public abstract class SQLiteLintBaseActivity
  extends Activity
{
  private Toolbar vnN;
  
  static
  {
    if (!SQLiteLintBaseActivity.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  protected abstract int getLayoutId();
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(d.c.activity_sqlitelint_base);
    paramBundle = (FrameLayout)findViewById(d.b.content);
    LayoutInflater localLayoutInflater = LayoutInflater.from(this);
    int i = getLayoutId();
    assert (i != 0);
    localLayoutInflater.inflate(i, paramBundle);
    this.vnN = ((Toolbar)findViewById(d.b.toolbar));
    this.vnN.setNavigationOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SQLiteLintBaseActivity.this.finish();
      }
    });
    paramBundle = this.vnN.getLogo();
    if (paramBundle != null) {
      paramBundle.setVisible(false, true);
    }
  }
  
  protected final void setTitle(String paramString)
  {
    this.vnN.setTitle(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/behaviour/alert/SQLiteLintBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */