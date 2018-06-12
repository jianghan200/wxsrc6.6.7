package com.tencent.mm.plugin.shake.ui;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;

public class ShakeSayHiListUI
  extends MMActivity
{
  private ListView eIM;
  private long gVV;
  private n.d hlb = new ShakeSayHiListUI.2(this);
  private int lCw = 0;
  private int lCx = 0;
  private int limit = 0;
  private bp mZg = null;
  private int nbo = 0;
  private b nbp;
  
  protected final int getLayoutId()
  {
    return R.i.lbs_say_hi_list;
  }
  
  protected final void initView()
  {
    Object localObject = getLayoutInflater().inflate(R.i.say_hi_list_footer, null);
    this.eIM = ((ListView)findViewById(R.h.say_hi_lv));
    ((View)localObject).setOnClickListener(new ShakeSayHiListUI.1(this, (View)localObject));
    addTextOptionMenu(0, getString(R.l.app_clear), new ShakeSayHiListUI.3(this));
    if (this.lCw == 0)
    {
      TextView localTextView = (TextView)findViewById(R.h.empty_msg_tip_tv);
      localTextView.setText(R.l.say_hi_non);
      localTextView.setVisibility(0);
      enableOptionMenu(false);
    }
    if ((this.lCw > 0) && (this.limit < this.lCw)) {
      this.eIM.addFooterView((View)localObject);
    }
    this.nbp = new b(this, this.mZg, this.limit);
    this.nbp.setGetViewPositionCallback(new ShakeSayHiListUI.4(this));
    this.nbp.setPerformItemClickListener(new ShakeSayHiListUI.5(this));
    this.nbp.a(new ShakeSayHiListUI.6(this));
    this.eIM.setAdapter(this.nbp);
    this.eIM.setOnItemClickListener(new ShakeSayHiListUI.7(this));
    localObject = new k(this);
    this.eIM.setOnItemLongClickListener(new ShakeSayHiListUI.8(this, (k)localObject));
    setBackBtn(new ShakeSayHiListUI.9(this));
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        BackwardSupportUtil.c.a(ShakeSayHiListUI.d(ShakeSayHiListUI.this));
      }
    };
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.nbo = getIntent().getIntExtra("IntentSayHiType", 1);
    if (this.nbo == 1)
    {
      this.mZg = d.SH();
      setMMTitle(R.l.say_hi_list_shake_title);
      this.lCx = this.mZg.axd();
      if (this.lCx != 0) {
        break label150;
      }
    }
    label150:
    for (int i = 8;; i = this.lCx)
    {
      this.limit = i;
      this.lCw = this.mZg.getCount();
      paramBundle = this.mZg;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(4));
      if (paramBundle.diF.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0) {
        paramBundle.doNotify();
      }
      initView();
      return;
      setMMTitle(R.l.say_hi_list_lbs_title);
      break;
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.gVV = ((bo)this.nbp.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, R.l.app_delete);
  }
  
  public void onDestroy()
  {
    this.nbp.aYc();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.nbp.hkQ != null) {
      this.nbp.hkQ.aYl();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.lCw != this.mZg.getCount())
    {
      this.lCw = this.mZg.getCount();
      if (this.lCw == 0)
      {
        TextView localTextView = (TextView)findViewById(R.h.empty_msg_tip_tv);
        localTextView.setText(R.l.say_hi_non);
        localTextView.setVisibility(0);
        enableOptionMenu(false);
      }
      this.nbp.WT();
    }
    this.nbp.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */