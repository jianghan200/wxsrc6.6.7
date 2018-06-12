package com.tencent.mm.plugin.brandservice.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.mm.ac.z;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.g;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.e.i;

public class BrandServiceIndexUI
  extends MMActivity
  implements j.a
{
  private int dCn = 251658241;
  private TextView hoY = null;
  private BrandServiceSortView hoZ;
  private boolean hpa = false;
  private boolean hpb = false;
  
  public final void a(String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.BrandService.BrandServiceIndexUI", "On Storage Change, event : %s.", new Object[] { paramString });
    this.hpa = true;
  }
  
  protected final int getLayoutId()
  {
    return b.e.brand_service_index;
  }
  
  protected final void initView()
  {
    setMMTitle(b.h.address_official_accounts_title);
    this.hoZ = ((BrandServiceSortView)findViewById(b.d.sort_and_search_view));
    this.hoZ.setShowFooterView(true);
    this.hoZ.setReturnResult(this.hpb);
    this.hoY = ((TextView)findViewById(b.d.out_of_date_tv));
    this.hoY.setOnClickListener(new BrandServiceIndexUI.1(this));
    this.hoY.setVisibility(8);
    setBackBtn(new BrandServiceIndexUI.2(this));
    addIconOptionMenu(0, b.h.top_item_desc_search, b.g.actionbar_icon_dark_search, new BrandServiceIndexUI.3(this));
    addIconOptionMenu(1, b.h.app_add, b.g.actionbar_icon_dark_add, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (p.zO(0)) {
          ((i)g.l(i.class)).a(ad.getContext(), new BrandServiceIndexUI.4.1(this));
        }
        for (;;)
        {
          BrandServiceIndexUI.this.enableOptionMenu(1, false);
          return true;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BrandService.BrandServiceIndexUI", "fts h5 template not avail");
        }
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramInt2 == -1) && (this.hpb))
    {
      setResult(-1, paramIntent);
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dCn = getIntent().getIntExtra("intent_service_type", 251658241);
    this.hpb = s.fb(getIntent().getIntExtra("list_attr", 0), 16384);
    initView();
    z.MY().c(this);
  }
  
  protected void onDestroy()
  {
    if (g.Eg().Dx())
    {
      this.hoZ.release();
      z.MY().d(this);
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    g.Ek();
    g.Ei().DT().set(233474, Long.valueOf(System.currentTimeMillis()));
    g.Ek();
    g.Ei().DT().set(233473, Long.valueOf(System.currentTimeMillis()));
    g.Ek();
    g.Ei().DT().set(233476, Long.valueOf(System.currentTimeMillis()));
    super.onPause();
  }
  
  protected void onResume()
  {
    if (this.hpa)
    {
      this.hpa = false;
      this.hoZ.refresh();
    }
    super.onResume();
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    sendBroadcast(localIntent);
    enableOptionMenu(1, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/BrandServiceIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */