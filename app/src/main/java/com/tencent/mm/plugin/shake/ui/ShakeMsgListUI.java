package com.tencent.mm.plugin.shake.ui;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;

public class ShakeMsgListUI
  extends MMActivity
{
  private int bJu;
  private long gVV;
  private TextView hWV;
  private n.d hlb = new ShakeMsgListUI.6(this);
  private int lCw = 0;
  private int lCx = 0;
  private int limit = 0;
  private int mType;
  private g mZM = null;
  private d mZN;
  private ListView mZO;
  
  private void bvk()
  {
    this.hWV.setText(R.l.shake_msg_list_empty_tips);
    this.hWV.setVisibility(0);
    enableOptionMenu(false);
  }
  
  protected final int getLayoutId()
  {
    return R.i.shake_msg_list;
  }
  
  protected final void initView()
  {
    setMMTitle(getIntent().getStringExtra("shake_msg_list_title"));
    setBackBtn(new ShakeMsgListUI.1(this));
    addTextOptionMenu(0, getString(R.l.app_clear), new ShakeMsgListUI.2(this));
    this.hWV = ((TextView)findViewById(R.h.empty_msg_tip_tv));
    if (this.lCw == 0) {
      bvk();
    }
    this.mZO = ((ListView)findViewById(R.h.shake_msg_listview));
    Object localObject = getLayoutInflater().inflate(R.i.say_hi_list_footer, null);
    ((View)localObject).setOnClickListener(new ShakeMsgListUI.3(this, (View)localObject));
    if ((this.lCw > 0) && (this.limit < this.lCw)) {
      this.mZO.addFooterView((View)localObject);
    }
    this.mZN = new d(this);
    this.mZN.mZJ = this.limit;
    this.mZO.setAdapter(this.mZN);
    this.mZO.setOnItemClickListener(new ShakeMsgListUI.4(this));
    localObject = new k(this);
    this.mZO.setOnItemLongClickListener(new ShakeMsgListUI.5(this, (k)localObject));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("shake_msg_type", 0);
    this.mZM = m.buD();
    this.lCx = this.mZM.axd();
    int i;
    if (this.lCx == 0)
    {
      i = 8;
      this.limit = i;
      this.lCw = this.mZM.getCount();
      this.bJu = getIntent().getIntExtra("shake_msg_from", 1);
      if (this.bJu != 1) {
        break label179;
      }
      h.mEJ.h(11313, new Object[] { Integer.valueOf(this.lCx), e.bvA() });
    }
    for (;;)
    {
      paramBundle = this.mZM;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(1));
      paramBundle.diF.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "1" });
      initView();
      return;
      i = this.lCx;
      break;
      label179:
      h.mEJ.h(11315, new Object[] { Integer.valueOf(this.lCx), e.bvA() });
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.gVV = ((f)this.mZN.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, R.l.app_delete);
  }
  
  public void onDestroy()
  {
    this.mZN.aYc();
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.lCw != this.mZM.getCount())
    {
      this.lCw = this.mZM.getCount();
      if (this.lCw == 0) {
        bvk();
      }
      this.mZN.WT();
    }
    this.mZN.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/ShakeMsgListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */