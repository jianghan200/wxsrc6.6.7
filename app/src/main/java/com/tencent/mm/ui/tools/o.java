package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.m;
import android.support.v4.view.m.e;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.j;
import com.tencent.mm.w.a.k;
import java.util.ArrayList;

public class o
{
  final String TAG;
  ag dvh = new ag(Looper.getMainLooper());
  MenuItem iZG = null;
  private boolean uBA;
  public int uBB = a.k.app_empty_string;
  private int uBC = 0;
  a uBD;
  boolean uBq = false;
  public boolean uBr = false;
  private boolean uBs = false;
  private boolean uBt = true;
  boolean uBu = true;
  public e uBv = null;
  public b uBw;
  private SearchViewNotRealTimeHelper.a uBx;
  private boolean uBy = true;
  private ArrayList<String> uBz;
  
  public o()
  {
    this.uBq = false;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
  }
  
  public o(byte paramByte)
  {
    this.uBq = true;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
  }
  
  private void b(final Activity paramActivity, Menu paramMenu)
  {
    if ((this.uBt) && ((this.uBr) || (this.uBs)))
    {
      this.uBs = false;
      if ((paramActivity instanceof MMActivity)) {
        ((MMActivity)paramActivity).lF(ad.getContext().getResources().getColor(a.d.normal_actionbar_color));
      }
      if (paramMenu != null)
      {
        int i = 0;
        while (i < paramMenu.size())
        {
          MenuItem localMenuItem = paramMenu.getItem(i);
          if (localMenuItem.getItemId() != a.g.menu_search) {
            localMenuItem.setVisible(false);
          }
          i += 1;
        }
      }
      this.dvh.postDelayed(new Runnable()
      {
        public final void run()
        {
          if (o.this.iZG == null)
          {
            x.w(o.this.TAG, "on post expand search menu, but item is null");
            return;
          }
          x.i(o.this.TAG, "try to expand action view, searchViewExpand %B", new Object[] { Boolean.valueOf(o.this.uBr) });
          if (o.this.uBq) {
            if (!o.this.uBr) {
              m.b(o.this.iZG);
            }
          }
          for (;;)
          {
            final View localView = m.a(o.this.iZG);
            if ((localView == null) || (!o.this.uBr)) {
              break;
            }
            localView.findViewById(a.g.edittext).requestFocus();
            if (!o.this.uBu) {
              break;
            }
            o.this.dvh.postDelayed(new Runnable()
            {
              public final void run()
              {
                ((InputMethodManager)o.10.this.mr.getSystemService("input_method")).showSoftInput(localView.findViewById(a.g.edittext), 0);
              }
            }, 128L);
            return;
            if (o.this.uBD != null) {
              o.this.uBD.czR();
            }
          }
        }
      }, 128L);
    }
  }
  
  public boolean Un()
  {
    return false;
  }
  
  public void Uo() {}
  
  public void Up() {}
  
  public void a(Activity paramActivity, Menu paramMenu)
  {
    x.v(this.TAG, "on prepare options menu, searchViewExpand %B, triggerExpand %B, canExpand %B", new Object[] { Boolean.valueOf(this.uBr), Boolean.valueOf(this.uBs), Boolean.valueOf(this.uBt) });
    if (paramActivity == null)
    {
      x.w(this.TAG, "on hanle status fail, activity is null");
      return;
    }
    this.iZG = paramMenu.findItem(a.g.menu_search);
    if (this.iZG == null)
    {
      x.w(this.TAG, "can not find search menu, error");
      return;
    }
    this.iZG.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        return false;
      }
    });
    b(paramActivity, paramMenu);
  }
  
  public final void a(final FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    x.v(this.TAG, "on create options menu");
    if (paramFragmentActivity == null)
    {
      x.w(this.TAG, "on add search menu, activity is null");
      return;
    }
    if (this.uBv == null)
    {
      if (this.uBy)
      {
        this.uBv = new ActionBarSearchView(paramFragmentActivity);
        this.uBv.setAutoMatchKeywords(this.uBA);
        this.uBv.setKeywords(this.uBz);
      }
    }
    else
    {
      this.uBv.setCallBack(new ActionBarSearchView.b()
      {
        public final void FW(String paramAnonymousString)
        {
          if (!o.this.uBr) {
            x.v(o.this.TAG, "onSearchTextChange %s, but not in searching", new Object[] { paramAnonymousString });
          }
          while (o.this.uBw == null) {
            return;
          }
          o.this.uBw.pk(paramAnonymousString);
        }
        
        public final void WY()
        {
          if (o.this.uBw != null) {
            o.this.uBw.WY();
          }
        }
        
        public final void bac()
        {
          if (o.this.uBw != null) {
            o.this.uBw.WZ();
          }
        }
        
        public final void bad()
        {
          if (!o.this.uBr)
          {
            x.v(o.this.TAG, "onVoiceSearchRequired, but not in searching");
            return;
          }
          o.this.Uo();
        }
      });
      this.uBv.ms(Un());
      this.uBv.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          if ((3 == paramAnonymousInt) && (o.this.uBw != null)) {
            return o.this.uBw.pj(o.this.getSearchContent());
          }
          return false;
        }
      });
      if (this.uBC != 0) {
        this.uBv.setSearchTipIcon(this.uBC);
      }
      this.iZG = paramMenu.add(0, a.g.menu_search, 0, this.uBB);
      this.iZG.setEnabled(this.uBt);
      int i = a.j.actionbar_icon_dark_search;
      if (ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false)) {
        i = a.j.actionbar_icon_light_search;
      }
      this.iZG.setIcon(i);
      m.a(this.iZG, (View)this.uBv);
      if (!this.uBq) {
        break label336;
      }
      m.a(this.iZG, 9);
      label266:
      if (!this.uBq) {
        break label347;
      }
      m.a(this.iZG, new m.e()
      {
        public final boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
        {
          o.this.b(paramFragmentActivity, false);
          return true;
        }
        
        public final boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
        {
          o.this.a(paramFragmentActivity, false);
          return true;
        }
      });
    }
    for (;;)
    {
      this.uBv.setBackClickCallback(new ActionBarSearchView.a()
      {
        public final void bae()
        {
          if (o.this.uBq) {
            if (o.this.iZG != null) {
              m.c(o.this.iZG);
            }
          }
          while (o.this.uBD == null) {
            return;
          }
          o.this.uBD.collapseActionView();
        }
      });
      return;
      this.uBv = new SearchViewNotRealTimeHelper(paramFragmentActivity);
      this.uBv.setNotRealCallBack(this.uBx);
      break;
      label336:
      m.a(this.iZG, 2);
      break label266;
      label347:
      this.uBD = new a()
      {
        public final void collapseActionView()
        {
          o.this.b(paramFragmentActivity, true);
        }
        
        public final void czR()
        {
          o.this.a(paramFragmentActivity, true);
        }
      };
    }
  }
  
  public final void a(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    x.d(this.TAG, "doNewExpand, searchViewExpand " + this.uBr);
    if (!this.uBr)
    {
      this.uBr = true;
      b(paramFragmentActivity, null);
      this.dvh.post(new Runnable()
      {
        public final void run()
        {
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing())) {
            x.w(o.this.TAG, "want to expand search view, but activity status error");
          }
          while (!paramBoolean) {
            return;
          }
          paramFragmentActivity.supportInvalidateOptionsMenu();
        }
      });
      if (this.uBw != null) {
        this.uBw.WX();
      }
    }
  }
  
  public final void b(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    x.d(this.TAG, "doNewCollapse, searchViewExpand " + this.uBr);
    if (this.uBr)
    {
      this.uBr = false;
      Up();
      if (this.uBv != null) {
        this.uBv.mt(false);
      }
      this.dvh.post(new Runnable()
      {
        public final void run()
        {
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing())) {
            x.w(o.this.TAG, "want to collapse search view, but activity status error");
          }
          while (!paramBoolean) {
            return;
          }
          paramFragmentActivity.supportInvalidateOptionsMenu();
        }
      });
      if (this.uBw != null) {
        this.dvh.post(new Runnable()
        {
          public final void run()
          {
            if (o.this.uBw != null) {
              o.this.uBw.WW();
            }
          }
        });
      }
    }
    this.dvh.post(new Runnable()
    {
      public final void run()
      {
        if (o.this.iZG == null) {
          x.w(o.this.TAG, "want to collapse search view, but search menu item is null");
        }
        Object localObject1;
        do
        {
          return;
          if ((paramFragmentActivity != null) && (!paramFragmentActivity.isFinishing()))
          {
            Object localObject2 = paramFragmentActivity;
            localObject1 = (InputMethodManager)((FragmentActivity)localObject2).getSystemService("input_method");
            if (localObject1 != null)
            {
              localObject2 = ((FragmentActivity)localObject2).getCurrentFocus();
              if (localObject2 != null)
              {
                localObject2 = ((View)localObject2).getWindowToken();
                if (localObject2 != null) {
                  ((InputMethodManager)localObject1).hideSoftInputFromWindow((IBinder)localObject2, 0);
                }
              }
            }
          }
          localObject1 = m.a(o.this.iZG);
        } while (localObject1 == null);
        ((View)localObject1).findViewById(a.g.edittext).clearFocus();
      }
    });
  }
  
  public final void clearFocus()
  {
    if (this.uBv != null) {
      this.uBv.czt();
    }
  }
  
  public final void czQ()
  {
    x.d(this.TAG, "do collapse");
    if ((this.uBr) && (this.iZG != null))
    {
      if (!this.uBq) {
        break label40;
      }
      m.c(this.iZG);
    }
    label40:
    while (this.uBD == null) {
      return;
    }
    this.uBD.collapseActionView();
  }
  
  public final boolean czu()
  {
    if (this.uBv != null) {
      return this.uBv.czu();
    }
    return false;
  }
  
  public final boolean czv()
  {
    if (this.uBv != null) {
      return this.uBv.czv();
    }
    return false;
  }
  
  public final String getSearchContent()
  {
    if (this.uBv != null) {
      return this.uBv.getSearchContent();
    }
    return "";
  }
  
  public final void mv(boolean paramBoolean)
  {
    boolean bool1 = false;
    String str = this.TAG;
    boolean bool2 = this.uBr;
    if (this.iZG == null) {
      bool1 = true;
    }
    x.d(str, "do expand, expanded[%B], search menu item null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    if (this.uBr) {
      return;
    }
    if (!this.uBt)
    {
      x.w(this.TAG, "can not expand now");
      return;
    }
    this.uBu = paramBoolean;
    if (this.iZG != null)
    {
      this.dvh.post(new Runnable()
      {
        public final void run()
        {
          if (o.this.iZG == null) {
            x.w(o.this.TAG, "post do expand search menu, but search menu item is null");
          }
          do
          {
            return;
            if (o.this.uBq)
            {
              m.b(o.this.iZG);
              return;
            }
          } while (o.this.uBD == null);
          o.this.uBD.czR();
        }
      });
      return;
    }
    this.uBs = true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    x.v(this.TAG, "on key down, key code %d, expand %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.uBr) });
    if ((4 == paramInt) && (this.uBr))
    {
      czQ();
      return true;
    }
    return false;
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    if (this.uBv == null) {
      return;
    }
    this.uBv.setHint(paramCharSequence);
  }
  
  public final void setSearchContent(String paramString)
  {
    if (this.uBv == null) {
      return;
    }
    this.uBv.setSearchContent(paramString);
  }
  
  public static abstract interface a
  {
    public abstract void collapseActionView();
    
    public abstract void czR();
  }
  
  public static abstract interface b
  {
    public abstract void WW();
    
    public abstract void WX();
    
    public abstract void WY();
    
    public abstract void WZ();
    
    public abstract boolean pj(String paramString);
    
    public abstract void pk(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */