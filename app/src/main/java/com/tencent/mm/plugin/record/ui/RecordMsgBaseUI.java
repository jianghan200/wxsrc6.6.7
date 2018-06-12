package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public abstract class RecordMsgBaseUI
  extends BaseFavDetailReportUI
{
  protected long bJC = -1L;
  protected ListView eVT = null;
  protected h msU;
  
  protected void bqA()
  {
    this.msU = bqB();
    this.bJC = getIntent().getLongExtra("message_id", -1L);
    this.eVT = ((ListView)findViewById(R.h.record_listview));
    bqI();
    Object localObject = bqD();
    String str = bqE();
    if ((bi.oW((String)localObject)) || (bi.oW(str)))
    {
      x.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
      localObject = new View(this.mController.tml);
      ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.f.RecordListTopMargin)));
      this.eVT.addHeaderView((View)localObject, null, false);
      localObject = View.inflate(this.mController.tml, R.i.record_listview_footer, null);
      this.eVT.setAdapter(this.msU);
      this.msU.CU = this.eVT;
      this.msU.bqG();
      this.eVT.setOnScrollListener(new RecordMsgBaseUI.1(this));
      setBackBtn(new RecordMsgBaseUI.2(this));
      bqF();
      this.eVT.postDelayed(new RecordMsgBaseUI.3(this, (View)localObject), 100L);
      return;
    }
    localObject = localObject.split(" ")[0];
    str = str.split(" ")[0];
    if (((String)localObject).equals(str)) {}
    for (this.msU.msO = false;; this.msU.msO = true)
    {
      setMMSubTitle((String)localObject);
      break;
      localObject = (String)localObject + "~" + str;
    }
  }
  
  protected abstract h bqB();
  
  protected abstract String bqC();
  
  protected abstract String bqD();
  
  protected abstract String bqE();
  
  protected abstract void bqF();
  
  protected final void bqI()
  {
    String str2 = bqC();
    String str3 = this.mController.tml.getString(R.l.expose_example);
    String str1 = str2;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.endsWith(str3))
      {
        str1 = str2;
        if (str2.lastIndexOf(str3) > 0) {
          str1 = str2.substring(0, str2.lastIndexOf(str3) - 1);
        }
      }
    }
    M(j.a(this.mController.tml, str1, getResources().getDimensionPixelSize(R.f.BigTextSize)));
  }
  
  protected abstract void c(int paramInt1, int paramInt2, Intent paramIntent);
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.record_msg_detail_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    c(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    e.k(this);
    super.onCreate(paramBundle);
    bqA();
    e.l(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.msU != null) {
      this.msU.destroy();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.msU != null)
    {
      localObject = this.msU;
      int i = 0;
      while (i < ((h)localObject).msN.size())
      {
        h.b localb = (h.b)((h)localObject).msN.valueAt(i);
        if (localb != null) {
          localb.pause();
        }
        i += 1;
      }
    }
    Object localObject = new rz();
    ((rz)localObject).ccO.type = 1;
    a.sFg.m((b)localObject);
  }
  
  protected void onResume()
  {
    super.onResume();
    rz localrz = new rz();
    if (this.eVT != null)
    {
      localrz.ccO.type = 0;
      localrz.ccO.ccP = this.eVT.getFirstVisiblePosition();
      localrz.ccO.ccQ = this.eVT.getLastVisiblePosition();
      localrz.ccO.ccR = this.eVT.getHeaderViewsCount();
      a.sFg.m(localrz);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */