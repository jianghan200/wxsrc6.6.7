package com.tencent.mm.plugin.label.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class ContactLabelMemberListUI
  extends MMActivity
{
  private TextView gVf;
  private String kBA;
  private String kBB;
  private m.b kBj = new ContactLabelMemberListUI.2(this);
  private ListView kBy;
  private a kBz;
  private ag mHandler = new ContactLabelMemberListUI.1(this);
  
  private void aYT()
  {
    if (this.kBz != null)
    {
      this.kBz.kBu = com.tencent.mm.plugin.label.a.a.aYK().FD(this.kBA);
      this.kBz.a(null, null);
    }
    this.kBB = com.tencent.mm.plugin.label.a.a.aYK().Fz(this.kBA);
    if (!bi.oW(this.kBB)) {
      setMMTitle(this.kBB);
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.contact_label_member_list_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. requestcode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      x.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. unknow requestcode:%d", new Object[] { Integer.valueOf(paramInt1) });
      return;
    }
    if (paramInt2 == -1)
    {
      finish();
      return;
    }
    aYT();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kBA = getIntent().getStringExtra("label_id");
    this.kBB = getIntent().getStringExtra("label_name");
    setBackBtn(new ContactLabelMemberListUI.3(this));
    addTextOptionMenu(0, getString(R.l.label_manager), new ContactLabelMemberListUI.4(this));
    setMMTitle(this.kBB);
    this.kBy = ((ListView)findViewById(R.h.contact_label_member_list));
    this.gVf = ((TextView)findViewById(R.h.empty));
    if (bi.oW(this.kBA))
    {
      x.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] inite view");
      finish();
    }
    this.kBz = new a(this.mController.tml);
    this.kBy.setAdapter(this.kBz);
    this.kBy.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        ContactLabelMemberListUI.a(ContactLabelMemberListUI.this, paramAnonymousInt);
      }
    });
    this.kBy.setEmptyView(this.gVf);
  }
  
  protected void onDestroy()
  {
    if (this.kBz != null)
    {
      this.kBz.aYc();
      this.kBz.tlG = null;
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    au.HU();
    c.FR().b(this.kBj);
    super.onPause();
  }
  
  protected void onResume()
  {
    au.HU();
    c.FR().a(this.kBj);
    super.onResume();
    aYT();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/label/ui/ContactLabelMemberListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */