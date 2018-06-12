package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;
import java.util.HashMap;

public class IPCallContactUI
  extends MMActivity
{
  private ag dvh = new ag(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage.what == 1)
      {
        if (IPCallContactUI.k(IPCallContactUI.this) != null) {
          IPCallContactUI.k(IPCallContactUI.this).dismiss();
        }
        IPCallContactUI.l(IPCallContactUI.this).setVisibility(0);
        IPCallContactUI.d(IPCallContactUI.this);
        c.ksx = b.aXV();
        IPCallContactUI.d(IPCallContactUI.this).WT();
        IPCallContactUI.d(IPCallContactUI.this).notifyDataSetChanged();
        IPCallContactUI.b(IPCallContactUI.this).invalidateViews();
        IPCallContactUI.c(IPCallContactUI.this).setAddressCount(IPCallContactUI.d(IPCallContactUI.this).getCount());
        com.tencent.mm.plugin.ipcall.a.aWF().Vk();
      }
      for (;;)
      {
        return;
        if (paramAnonymousMessage.what == 2)
        {
          if (IPCallContactUI.d(IPCallContactUI.this).getCount() == 0) {
            IPCallContactUI.m(IPCallContactUI.this).setVisibility(0);
          }
          while ((IPCallContactUI.d(IPCallContactUI.this).getCount() != 0) && (IPCallContactUI.e(IPCallContactUI.this)))
          {
            IPCallContactUI.d(IPCallContactUI.this).notifyDataSetChanged();
            return;
            IPCallContactUI.m(IPCallContactUI.this).setVisibility(8);
          }
        }
      }
    }
  };
  private String eIQ;
  private o eMS = new o((byte)0);
  private RelativeLayout kuA;
  private LinearLayout kuB;
  private IPCallAddressCountView kuC = null;
  private VerticalScrollBar kuD;
  private LinearLayout kuE;
  private int kuF = -1;
  private int kuG = -1;
  private a.a kuH = new IPCallContactUI.7(this);
  private Runnable kuI = new IPCallContactUI.10(this);
  private boolean kuJ = true;
  private ListView kuj;
  private Runnable kuq = new IPCallContactUI.8(this);
  private ProgressDialog kuy = null;
  private c kuz;
  
  public final void fZ(boolean paramBoolean)
  {
    this.kuJ = paramBoolean;
    if (this.kuJ) {
      this.kuz.notifyDataSetChanged();
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_contact_ui;
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.ip_call_address_list);
    setBackBtn(new IPCallContactUI.1(this));
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    x.i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (bool)
    {
      this.kuA = ((RelativeLayout)findViewById(R.h.layout));
      this.kuB = ((LinearLayout)findViewById(R.h.address_ui_shadow));
      this.kuj = ((ListView)findViewById(R.h.addres_list));
      this.kuD = ((VerticalScrollBar)findViewById(R.h.address_scrollbar));
      this.kuE = ((LinearLayout)findViewById(R.h.address_ui_hint_ll));
      this.eMS.uBw = new IPCallContactUI.5(this);
      this.eMS.uBB = R.l.app_search;
      a(this.eMS);
      this.kuz = new c(this.mController.tml);
      c.ksx = b.aXV();
      this.kuC = new IPCallAddressCountView(this.mController.tml, this.kuz.aYb());
      this.kuj.addFooterView(this.kuC, null, false);
      this.kuj.setAdapter(this.kuz);
      this.kuj.setOnItemClickListener(new IPCallContactUI.6(this));
      this.kuD.setVisibility(0);
      this.kuj.setOnScrollListener(new IPCallContactUI.11(this));
      this.kuD.setOnScrollBarTouchListener(new VerticalScrollBar.a()
      {
        public final void ys(String paramAnonymousString)
        {
          if ("↑".equals(paramAnonymousString)) {
            IPCallContactUI.b(IPCallContactUI.this).setSelection(0);
          }
          for (;;)
          {
            return;
            c localc = IPCallContactUI.d(IPCallContactUI.this);
            if (localc.hPz.containsKey(paramAnonymousString)) {}
            for (int i = ((Integer)localc.hPz.get(paramAnonymousString)).intValue(); i != -1; i = -1)
            {
              IPCallContactUI.b(IPCallContactUI.this).setSelection(i);
              return;
            }
          }
        }
      });
      if (this.kuz.aYb() <= 0)
      {
        this.kuA.setVisibility(8);
        paramBundle = this.mController.tml;
        this.mController.tml.getString(R.l.app_tip);
        this.kuy = h.a(paramBundle, this.mController.tml.getString(R.l.ip_call_extracting_address_hint), true, new IPCallContactUI.9(this));
        e.post(this.kuq, "IPCall_LoadSystemAddressBook");
      }
    }
    else
    {
      return;
    }
    com.tencent.mm.plugin.ipcall.a.aWF().Vk();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    x.d("MicroMsg.IPCallContactUI", "onCreateOptionsMenu");
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.plugin.ipcall.a.a locala = com.tencent.mm.plugin.ipcall.a.a.aXa();
    a.a locala1 = this.kuH;
    if (locala.kod.contains(locala1)) {
      locala.kod.remove(locala1);
    }
    this.dvh.removeMessages(1);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.IPCallContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (paramArrayOfInt[0] == 0);
    h.a(this, getString(R.l.permission_contacts_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new IPCallContactUI.3(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        IPCallContactUI.this.finish();
      }
    });
  }
  
  protected void onResume()
  {
    super.onResume();
    supportInvalidateOptionsMenu();
  }
  
  public final void pi(String paramString)
  {
    this.eIQ = paramString;
    this.dvh.removeCallbacks(this.kuI);
    this.dvh.postDelayed(this.kuI, 200L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */