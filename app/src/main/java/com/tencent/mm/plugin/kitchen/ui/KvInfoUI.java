package com.tencent.mm.plugin.kitchen.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.kitchen.b.b;
import com.tencent.mm.plugin.kitchen.b.c;
import com.tencent.mm.plugin.kitchen.b.d;
import com.tencent.mm.plugin.report.service.d;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KvInfoUI
  extends MMActivity
{
  private Button eGn;
  private c fad;
  private ArrayAdapter iIy;
  private EditText kAm;
  private Button kAn;
  private ListView kAo;
  private TextView kAp;
  private MMSwitchBtn kAq;
  private String kAr;
  
  private void Fy(String paramString)
  {
    x.i("MicroMsg.KvInfoUI", "updateData new[%s] old[%s]", new Object[] { paramString, this.kAr });
    this.kAr = paramString;
    paramString = (List)j.brV().mFb.get(this.kAr);
    if (paramString != null)
    {
      this.kAp.setText(this.kAr + ":" + paramString.size());
      this.iIy.setNotifyOnChange(false);
      this.iIy.clear();
      this.iIy.addAll(paramString);
      this.iIy.notifyDataSetChanged();
      return;
    }
    this.kAp.setText(this.kAr + ":0");
    this.iIy.clear();
  }
  
  protected final int getLayoutId()
  {
    return b.c.kv_info_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle("Debug show kv log");
    setBackBtn(new KvInfoUI.1(this));
    this.kAm = ((EditText)findViewById(b.b.input_log));
    this.kAp = ((TextView)findViewById(b.b.select_id_info));
    this.kAn = ((Button)findViewById(b.b.log_picker));
    this.kAn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = j.brV().mFb;
        if ((paramAnonymousView != null) && (paramAnonymousView.size() > 0))
        {
          paramAnonymousView = new ArrayList(paramAnonymousView.keySet());
          b localb = new b(KvInfoUI.this.mController.tml, paramAnonymousView);
          localb.GC(0);
          localb.uLl = new KvInfoUI.2.1(this, localb, paramAnonymousView);
          localb.GB(a.fromDPToPix(KvInfoUI.this.mController.tml, 288));
          localb.show();
        }
      }
    });
    this.kAq = ((MMSwitchBtn)findViewById(b.b.debug_flag));
    this.kAq.setCheck(j.brV().mDt);
    this.kAq.setSwitchListener(new KvInfoUI.3(this));
    this.eGn = ((Button)findViewById(b.b.confirm_btn));
    this.eGn.setOnClickListener(new KvInfoUI.4(this));
    this.kAo = ((ListView)findViewById(b.b.kv_log_list));
    this.iIy = new KvInfoUI.5(this, this, b.c.kv_info_ui_item, b.b.kv_info_ui_tv);
    this.kAo.setAdapter(this.iIy);
    this.kAo.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (d)KvInfoUI.b(KvInfoUI.this).getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null) {}
        do
        {
          return;
          if ((paramAnonymousAdapterView.bKg == null) || (paramAnonymousAdapterView.bKg.length() <= 0)) {
            paramAnonymousAdapterView.bKg = ac.ce(paramAnonymousAdapterView.value);
          }
          paramAnonymousAdapterView = paramAnonymousAdapterView.bKg;
          paramAnonymousAdapterView = (String)j.brV().mFc.get(paramAnonymousAdapterView);
          if (KvInfoUI.c(KvInfoUI.this) != null) {
            KvInfoUI.c(KvInfoUI.this).dismiss();
          }
        } while (bi.oW(paramAnonymousAdapterView));
        KvInfoUI.a(KvInfoUI.this, h.a(KvInfoUI.this, paramAnonymousAdapterView, "", KvInfoUI.this.getString(b.d.app_ok), KvInfoUI.this.getString(b.d.app_copy), true, new DialogInterface.OnClickListener()new KvInfoUI.6.2
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2DialogInterface.cancel();
          }
        }, new KvInfoUI.6.2(this, paramAnonymousAdapterView), -1));
      }
    });
  }
  
  protected void onDestroy()
  {
    if (this.iIy != null)
    {
      this.iIy.setNotifyOnChange(false);
      this.iIy.clear();
    }
    if (this.fad != null) {
      this.fad.dismiss();
    }
    YC();
    super.onDestroy();
  }
  
  protected void onResume()
  {
    if (!bi.oW(this.kAr)) {
      Fy(this.kAr);
    }
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/kitchen/ui/KvInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */