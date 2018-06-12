package com.tencent.mm.plugin.expt.roomexpt;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.plugin.expt.b.b;
import com.tencent.mm.plugin.expt.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;

public class RoomExptDebugUI
  extends MMActivity
{
  private ListView eVT;
  private Button iIA;
  private Button iIB;
  private Button iIC;
  private Button iID;
  private Button iIE;
  private ArrayAdapter iIy;
  private TextView iIz;
  
  private void aIE()
  {
    TextView localTextView = this.iIz;
    Object localObject = a.aIx();
    if (((a)localObject).iIm != null) {}
    for (localObject = ((a)localObject).iIm.wF();; localObject = "")
    {
      localTextView.setText((CharSequence)localObject);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return b.c.activity_room_expt_debug;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iIA = ((Button)findViewById(b.b.get_db_btn));
    this.iIA.setOnClickListener(new RoomExptDebugUI.1(this));
    this.iIB = ((Button)findViewById(b.b.calc));
    this.iIB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.tencent.mm.kernel.g.Em().H(new RoomExptDebugUI.2.1(this));
      }
    });
    this.iID = ((Button)findViewById(b.b.reset_btn));
    this.iID.setOnClickListener(new RoomExptDebugUI.3(this));
    this.iIC = ((Button)findViewById(b.b.del_db));
    this.iIC.setOnClickListener(new RoomExptDebugUI.4(this));
    this.iIE = ((Button)findViewById(b.b.show_btn));
    this.iIE.setOnClickListener(new RoomExptDebugUI.5(this));
    this.iIz = ((TextView)findViewById(b.b.expt_info));
    aIE();
    this.eVT = ((ListView)findViewById(b.b.room_list));
    this.iIy = new RoomExptDebugUI.6(this, this, b.c.room_expt_ui_item, b.b.room_expt_ui_tv);
    this.eVT.setAdapter(this.iIy);
  }
  
  protected void onDestroy()
  {
    if (this.iIy != null)
    {
      this.iIy.setNotifyOnChange(false);
      this.iIy.clear();
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/expt/roomexpt/RoomExptDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */