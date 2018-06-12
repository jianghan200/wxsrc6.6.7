package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.gc;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class SnsNotInterestUI
  extends MMPreference
  implements e
{
  private static final String[] nYI = { "sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other" };
  private static final int[] nYJ = { 1, 2, 4, 8, 16, 32, 64 };
  private static final int[] nYN = { i.j.sns_expose_reason_not_fav, i.j.sns_expose_reason_too_freq_him, i.j.sns_expose_reason_too_many_same_content, i.j.sns_expose_reason_marketing, i.j.sns_expose_reason_content_sexy, i.j.sns_expose_reason_rumour, i.j.sns_expose_reason_other };
  private p fUo = null;
  private f gua;
  private String mbI = null;
  private HashMap<String, Boolean> nYK = new HashMap(nYI.length);
  private HashMap<Integer, Boolean> nYL = new HashMap(nYJ.length);
  private HashMap<String, Integer> nYM = new HashMap(nYJ.length);
  private TextView nYO;
  private EditText nYP;
  private ListView nYQ;
  private LinearLayout nYR;
  private int nYS;
  private int nYT;
  private long nYU;
  private boolean nYV = false;
  private boolean nYW = false;
  r nYX = null;
  
  private void bDE()
  {
    int k = 0;
    Object localObject1 = nYI;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      this.nYK.put(localObject2, Boolean.valueOf(false));
      i += 1;
    }
    localObject1 = nYJ;
    int m = localObject1.length;
    i = 0;
    for (;;)
    {
      j = k;
      if (i >= m) {
        break;
      }
      j = localObject1[i];
      this.nYL.put(Integer.valueOf(j), Boolean.valueOf(false));
      i += 1;
    }
    while (j < nYJ.length)
    {
      this.nYM.put(nYI[j], Integer.valueOf(nYJ[j]));
      j += 1;
    }
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.SnsNotInterestUI", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paraml.getType() == 218)
    {
      this.fUo.dismiss();
      this.fUo = null;
      if (((r)paraml).type == 9)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label91;
        }
        this.nYV = true;
        Toast.makeText(this, i.j.sns_expose_success, 1).show();
        finish();
      }
    }
    return;
    label91:
    this.nYV = false;
    Toast.makeText(this, i.j.sns_expose_failed, 1).show();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference == null) {}
    String str;
    do
    {
      return false;
      str = paramPreference.mKey;
    } while (!this.nYK.containsKey(str));
    boolean bool = ((Boolean)this.nYK.get(str)).booleanValue();
    label67:
    int i;
    if (bool)
    {
      paramPreference.setWidgetLayoutResource(i.g.mm_preference_checkbox_unchecked);
      paramf.notifyDataSetChanged();
      if (bool) {
        break label256;
      }
      bool = true;
      this.nYK.put(str, Boolean.valueOf(bool));
      i = ((Integer)this.nYM.get(str)).intValue();
      this.nYL.put(Integer.valueOf(i), Boolean.valueOf(bool));
      x.d("MicroMsg.SnsNotInterestUI", "click: %s, notInterestType: %d, isCheck: %b", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool) });
      paramf = this.nYK.values().iterator();
      while (paramf.hasNext()) {
        if (((Boolean)paramf.next()).booleanValue())
        {
          i = 1;
          label186:
          if (i == 0) {
            break label267;
          }
          enableOptionMenu(0, true);
          label196:
          if ((!bool) || (!str.equals("sns_expose_reason_other"))) {
            break label276;
          }
          this.nYP.setVisibility(0);
          this.nYO.setVisibility(0);
          this.nYP.requestFocus();
          this.nYW = true;
          showVKB();
        }
      }
    }
    for (;;)
    {
      return true;
      paramPreference.setWidgetLayoutResource(i.g.mm_preference_checkbox_checked);
      break;
      label256:
      bool = false;
      break label67;
      i = 0;
      break label186;
      label267:
      enableOptionMenu(0, false);
      break label196;
      label276:
      if (!((Boolean)this.nYK.get("sns_expose_reason_other")).booleanValue())
      {
        this.nYP.setVisibility(8);
        this.nYO.setVisibility(8);
        this.nYQ.requestFocus();
        this.nYW = false;
        YC();
      }
      else
      {
        this.nYQ.requestFocus();
        YC();
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_expose_ui;
  }
  
  protected final void initView()
  {
    super.initView();
    setMMTitle(i.j.sns_expose_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SnsNotInterestUI.this.finish();
        return true;
      }
    });
    this.nYO = ((TextView)findViewById(i.f.sns_expose_input_hint));
    this.nYP = ((EditText)findViewById(i.f.sns_expose_other_input));
    this.nYQ = ((ListView)findViewById(16908298));
    this.nYR = ((LinearLayout)findViewById(i.f.expose_layout));
    this.nYR.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SnsNotInterestUI.a(SnsNotInterestUI.this).requestFocus();
        SnsNotInterestUI.this.YC();
      }
    });
    this.nYP.setVisibility(8);
    this.nYO.setVisibility(8);
    this.gua = this.tCL;
    if (this.gua == null) {
      x.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
    }
    for (;;)
    {
      a(0, getString(i.j.biz_report_send), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          SnsNotInterestUI.b(SnsNotInterestUI.this);
          return true;
        }
      }, s.b.tmX);
      enableOptionMenu(0, false);
      return;
      Object localObject;
      if (this.gua.ZZ("sns_expose_desc") == null)
      {
        localObject = new PreferenceTitleCategory(this);
        ((Preference)localObject).setTitle(i.j.sns_expose_desc);
        ((Preference)localObject).setKey("sns_expose_desc");
        this.gua.a((Preference)localObject);
      }
      int i = 0;
      while (i < nYI.length)
      {
        localObject = nYI[i];
        int j = nYN[i];
        if (this.gua.ZZ((String)localObject) == null)
        {
          Preference localPreference = new Preference(this);
          localPreference.setTitle(j);
          localPreference.setKey((String)localObject);
          localPreference.setLayoutResource(i.g.mm_preference);
          localPreference.setWidgetLayoutResource(i.g.mm_preference_checkbox_unchecked);
          this.gua.a(localPreference);
        }
        i += 1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.nYS = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
    this.nYU = getIntent().getLongExtra("sns_info_svr_id", 0L);
    if (this.nYU != 0L)
    {
      paramBundle = af.byo().fi(this.nYU).field_userName;
      if (paramBundle != null)
      {
        g.Ek();
        paramBundle = ((i)g.l(i.class)).FR().Yf(paramBundle);
        if (paramBundle.sex != 2) {
          break label129;
        }
        nYN[1] = i.j.sns_expose_reason_too_freq_her;
      }
    }
    for (;;)
    {
      g.Ek();
      g.Eh().dpP.a(218, this);
      bDE();
      initView();
      return;
      label129:
      if (paramBundle.sex == 1) {
        nYN[1] = i.j.sns_expose_reason_too_freq_him;
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    bDE();
    g.Ek();
    g.Eh().dpP.b(218, this);
    gc localgc = new gc();
    localgc.bPk.bPl = this.nYV;
    localgc.bPk.bPm = this.nYU;
    a.sFg.m(localgc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsNotInterestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */