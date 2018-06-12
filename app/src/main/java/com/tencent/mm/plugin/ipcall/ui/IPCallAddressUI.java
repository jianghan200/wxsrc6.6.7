package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.d;
import com.tencent.mm.plugin.ipcall.a.d.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class IPCallAddressUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private View ktX;
  private ListView kuj;
  private e kuk = null;
  private int kul = 0;
  private boolean kum = false;
  private boolean kun = true;
  private boolean kuo = false;
  private com.tencent.mm.sdk.b.c kup = new IPCallAddressUI.1(this);
  private Runnable kuq = new IPCallAddressUI.3(this);
  
  private void aYf()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (bool) {
      com.tencent.mm.sdk.f.e.post(this.kuq, "IPCallAddressUI_LoadSystemAddressBook");
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (((paraml instanceof g)) && (paramInt1 == 0) && (paramInt2 == 0) && (this.kuk != null)) {
      this.kuk.aYe();
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_address_ui;
  }
  
  public void onBackPressed()
  {
    if (this.kul == 1)
    {
      com.tencent.mm.plugin.ipcall.b.ezn.q(new Intent(), this);
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.HU();
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRv, Boolean.valueOf(false))).booleanValue())
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sRv, Boolean.valueOf(false));
      paramBundle = new Intent();
      paramBundle.setClass(this.mController.tml, IPCallAcitivityUI.class);
      this.mController.tml.startActivity(paramBundle);
      overridePendingTransition(R.a.slide_right_in, R.a.slide_left_out);
      this.kun = false;
    }
    setBackBtn(new IPCallAddressUI.2(this));
    if (this.kun)
    {
      this.kuo = true;
      aYf();
    }
    au.HU();
    this.kum = ((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sQR, Boolean.valueOf(true))).booleanValue();
    setMMTitle(R.l.ip_call_func_name);
    this.kuj = ((ListView)findViewById(R.h.addres_list));
    this.ktX = findViewById(R.h.address_ui_hint_ll);
    this.kuk = new e(this, this.kuj, this.ktX);
    paramBundle = this.kuk;
    paramBundle.ktW = new h(paramBundle.ktY);
    ViewGroup localViewGroup = (ViewGroup)View.inflate(paramBundle.ktY, R.i.ipcall_address_header_item, null);
    paramBundle.ktV.addHeaderView(localViewGroup, null, false);
    paramBundle.ktV.setAdapter(paramBundle.ktW);
    paramBundle.kua = ((TextView)localViewGroup.findViewById(R.h.account_balance_tv));
    paramBundle.kub = ((TextView)localViewGroup.findViewById(R.h.account_package_tv));
    paramBundle.kuc = ((LinearLayout)localViewGroup.findViewById(R.h.account_activity_ll));
    paramBundle.kud = ((TextView)localViewGroup.findViewById(R.h.account_activity_tv));
    paramBundle.kue = ((ImageView)localViewGroup.findViewById(R.h.unread_iv));
    localViewGroup.findViewById(R.h.account_rl).setOnClickListener(new e.1(paramBundle));
    localViewGroup.findViewById(R.h.contact_rl).setOnClickListener(new e.2(paramBundle));
    localViewGroup.findViewById(R.h.dial_rl).setOnClickListener(new e.3(paramBundle));
    paramBundle.ktV.setOnItemClickListener(new e.4(paramBundle));
    paramBundle.ktV.setOnItemLongClickListener(new e.5(paramBundle));
    au.HU();
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sQR, Boolean.valueOf(true))).booleanValue())
    {
      d.aXf().fN(true);
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sQR, Boolean.valueOf(false));
      if (paramBundle.ktW.getCount() <= 0) {
        break label554;
      }
      paramBundle.ktX.setVisibility(8);
    }
    for (;;)
    {
      paramBundle.aYe();
      paramBundle.aYd();
      paramBundle.ktZ = true;
      au.DF().a(257, this);
      com.tencent.mm.sdk.b.a.sFg.b(this.kup);
      this.kul = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
      com.tencent.mm.plugin.report.service.h.mEJ.a(257L, 0L, 1L, true);
      return;
      d.aXf().fN(false);
      break;
      label554:
      paramBundle.ktX.setVisibility(0);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressUI", "onCreateOptionsMenu");
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.kuk != null)
    {
      Object localObject = this.kuk;
      ((e)localObject).ktV.setOnItemClickListener(null);
      ((e)localObject).ktV.setOnItemLongClickListener(null);
      localObject = ((e)localObject).ktW;
      q.Kp().b((f.c)localObject);
    }
    au.DF().b(257, this);
    com.tencent.mm.sdk.b.a.sFg.c(this.kup);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.IPCallAddressUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] == 0) || (!this.kum));
    this.kum = false;
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_contacts_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new IPCallAddressUI.4(this), new IPCallAddressUI.5(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    e locale;
    if (this.kuk != null)
    {
      locale = this.kuk;
      if ((locale.ktW != null) && (!locale.ktZ))
      {
        locale.ktW.notifyDataSetChanged();
        if (locale.ktW.getCount() <= 0) {
          break label89;
        }
        locale.ktX.setVisibility(8);
      }
    }
    for (;;)
    {
      locale.ktZ = false;
      supportInvalidateOptionsMenu();
      com.tencent.mm.plugin.ipcall.a.f.b.aXT().fY(true);
      if (!this.kuo)
      {
        this.kuo = true;
        aYf();
      }
      return;
      label89:
      locale.ktX.setVisibility(0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */