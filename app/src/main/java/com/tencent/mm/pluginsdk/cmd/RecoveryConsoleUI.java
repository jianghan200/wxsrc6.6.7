package com.tencent.mm.pluginsdk.cmd;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RecoveryConsoleUI
  extends MMActivity
  implements AdapterView.OnItemClickListener
{
  List<Map<String, String>> idD;
  ListView lPD;
  List<b.a> qyo;
  SimpleAdapter qyp;
  
  protected final int getLayoutId()
  {
    return a.f.mm_preference_list_content;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitle("Recovery Console");
    this.qyo = b.cbo();
    this.idD = new ArrayList(this.qyo.size());
    paramBundle = this.qyo.iterator();
    while (paramBundle.hasNext())
    {
      b.a locala = (b.a)paramBundle.next();
      HashMap localHashMap = new HashMap();
      localHashMap.put("title", getString(locala.qyt));
      this.idD.add(localHashMap);
    }
    this.qyp = new SimpleAdapter(this, this.idD, a.f.mm_preference, new String[] { "title" }, new int[] { 16908310 });
    this.lPD = ((ListView)findViewById(16908298));
    this.lPD.setAdapter(this.qyp);
    this.lPD.setOnItemClickListener(this);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (b.a)this.qyo.get(paramInt);
    if (paramAdapterView.qyu != null)
    {
      paramAdapterView.qyu.a(this, paramAdapterView.cfF.split(" +"));
      return;
    }
    b.be(this, paramAdapterView.cfF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/cmd/RecoveryConsoleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */