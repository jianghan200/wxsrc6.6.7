package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.ipcall.a.c;
import com.tencent.mm.plugin.ipcall.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class IPCallCountryCodeSelectUI
  extends MMActivity
{
  private String countryCode;
  private String dYy;
  private String eIQ = "";
  private o eMS;
  public LinearLayout kuE;
  private boolean kuP = false;
  private ListView kvg;
  private f kvh;
  private IPCallCountryCodeScrollbar kvi;
  private IPCallCountryCodeScrollbar.a kvj;
  private boolean kvk = false;
  private List<a> list;
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(-1, R.a.push_down_out);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_country_select_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.address_title_select_country_code);
    this.eMS = new o((byte)0);
    this.eMS.uBw = new IPCallCountryCodeSelectUI.2(this);
    a(this.eMS);
    this.kvi = ((IPCallCountryCodeScrollbar)findViewById(R.h.address_scrollbar));
    long l = System.currentTimeMillis();
    Object localObject1 = c.aXb().aXe().iterator();
    int i = 0;
    int j;
    Object localObject2;
    if (((Iterator)localObject1).hasNext())
    {
      j = ((Integer)((Iterator)localObject1).next()).intValue();
      if (i < 5)
      {
        localObject2 = com.tencent.mm.plugin.ipcall.b.a.Fn(String.valueOf(j));
        if ((bi.oW((String)localObject2)) || (c.aXb().ru(j))) {
          break label798;
        }
        this.list.add(new a((String)localObject2, String.valueOf(j), 0, "0"));
        i += 1;
      }
    }
    label347:
    label798:
    for (;;)
    {
      break;
      if (i > 0) {
        this.kvk = true;
      }
      Iterator localIterator;
      b localb;
      if (w.chL())
      {
        localIterator = com.tencent.mm.plugin.ipcall.b.a.aYx().entrySet().iterator();
        if (localIterator.hasNext())
        {
          localObject1 = (Map.Entry)localIterator.next();
          ((Map.Entry)localObject1).getKey();
          localb = (b)((Map.Entry)localObject1).getValue();
          localObject2 = localb.kAl;
          localObject1 = localObject2;
          if (localObject2 != null) {
            if (!"".equals(((String)localObject2).trim())) {
              break label347;
            }
          }
          for (localObject1 = localObject2;; localObject1 = ((StringBuffer)localObject2).toString())
          {
            localObject2 = ((String)localObject1).toUpperCase();
            localObject1 = localObject2;
            if (bi.oW((String)localObject2)) {
              localObject1 = " ";
            }
            if (c.aXb().ru(bi.getInt(localb.kAk, 0))) {
              break;
            }
            this.list.add(new a(localb.kAl, localb.kAk, ((String)localObject1).charAt(0), (String)localObject1));
            break;
            localObject1 = ((String)localObject2).toCharArray();
            localObject2 = new StringBuffer();
            j = localObject1.length;
            i = 0;
            if (i < j)
            {
              String str = SpellMap.g(localObject1[i]);
              if (!bi.oW(str)) {
                ((StringBuffer)localObject2).append(str);
              }
              for (;;)
              {
                i += 1;
                break;
                ((StringBuffer)localObject2).append(localObject1[i]);
              }
            }
          }
        }
      }
      else
      {
        localIterator = com.tencent.mm.plugin.ipcall.b.a.aYx().entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (Map.Entry)localIterator.next();
          ((Map.Entry)localObject1).getKey();
          localb = (b)((Map.Entry)localObject1).getValue();
          localObject2 = localb.kAl.toUpperCase();
          localObject1 = localObject2;
          if (bi.oW((String)localObject2)) {
            localObject1 = " ";
          }
          if (!c.aXb().ru(bi.getInt(localb.kAk, 0))) {
            this.list.add(new a(localb.kAl, localb.kAk, ((String)localObject1).charAt(0), (String)localObject1));
          }
        }
      }
      Collections.sort(this.list, new IPCallCountryCodeSelectUI.6(this));
      localObject1 = this.list.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        i = ((a)((Iterator)localObject1).next()).aXZ();
        if (i != 0)
        {
          char c = (char)i;
          this.kvi.Fc(String.valueOf(c));
        }
      }
      x.d("MicroMsg.IPCallCountryCodeSelectUI", "initCountryCode used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.kuE = ((LinearLayout)findViewById(R.h.address_ui_hint_ll));
      this.kvg = ((ListView)findViewById(R.h.address_contactlist));
      this.kvh = new f(this, this.list);
      this.kvh.kuP = this.kuP;
      this.kvh.kuQ = this.kvk;
      this.kvg.setAdapter(this.kvh);
      this.kvg.setVisibility(0);
      this.kvj = new IPCallCountryCodeScrollbar.a()
      {
        public final void ys(String paramAnonymousString)
        {
          int i = 0;
          int j = paramAnonymousString.charAt(0);
          if ("↑".equals(paramAnonymousString)) {
            IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(0);
          }
          for (;;)
          {
            return;
            paramAnonymousString = IPCallCountryCodeSelectUI.c(IPCallCountryCodeSelectUI.this).kuO;
            if (paramAnonymousString != null) {
              while (i < paramAnonymousString.length)
              {
                if (paramAnonymousString[i] == j)
                {
                  IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(i + IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).getHeaderViewsCount());
                  return;
                }
                i += 1;
              }
            }
          }
        }
      };
      this.kvi.setOnScrollBarTouchListener(this.kvj);
      setBackBtn(new IPCallCountryCodeSelectUI.4(this));
      this.kvg.setOnItemClickListener(new IPCallCountryCodeSelectUI.5(this));
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.list = new ArrayList();
    this.dYy = bi.aG(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bi.aG(getIntent().getStringExtra("couttry_code"), "");
    this.kuP = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        IPCallCountryCodeSelectUI.this.finish();
        return false;
      }
    });
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.dYy);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      setResult(100, paramKeyEvent);
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.eMS != null) {
      this.eMS.czQ();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */