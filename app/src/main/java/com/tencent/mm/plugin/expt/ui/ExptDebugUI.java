package com.tencent.mm.plugin.expt.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.plugin.expt.b.b;
import com.tencent.mm.plugin.expt.b.c;
import com.tencent.mm.plugin.expt.c.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;
import java.util.List;

public class ExptDebugUI
  extends MMActivity
{
  private Button eGn;
  private Button eOQ;
  private TextView iIJ;
  private Button iIK;
  private Button iIL;
  private TextView iIM;
  private TextView iIN;
  private TextView iIO;
  private TextView iIP;
  private TextView iIQ;
  private EditText iIR;
  private Button iIS;
  private int iIT = 0;
  
  protected final int getLayoutId()
  {
    return b.c.activity_expt_debug;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle("Expt debug ui");
    setBackBtn(new ExptDebugUI.1(this));
    this.iIJ = ((TextView)findViewById(b.b.input_exptId));
    this.eGn = ((Button)findViewById(b.b.confirm_btn));
    this.eGn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = ExptDebugUI.a(ExptDebugUI.this).getText().toString().trim();
        ExptDebugUI.a(ExptDebugUI.this, bi.getInt(paramAnonymousView, 0));
      }
    });
    this.iIR = ((EditText)findViewById(b.b.expt_xml));
    this.iIS = ((Button)findViewById(b.b.expt_xml_confirm));
    this.iIS.setOnClickListener(new ExptDebugUI.3(this));
    this.iIK = ((Button)findViewById(b.b.expt_picker));
    this.iIK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = com.tencent.mm.plugin.expt.b.a.aIu();
        if (paramAnonymousView.iHQ != null) {
          paramAnonymousView = paramAnonymousView.iHQ.aII();
        }
        while ((paramAnonymousView != null) && (paramAnonymousView.size() > 0))
        {
          String[] arrayOfString = new String[paramAnonymousView.size()];
          int i = 0;
          for (;;)
          {
            if (i < arrayOfString.length)
            {
              arrayOfString[i] = paramAnonymousView.get(i);
              i += 1;
              continue;
              paramAnonymousView = null;
              break;
            }
          }
          paramAnonymousView = new b(ExptDebugUI.this.mController.tml, arrayOfString);
          paramAnonymousView.GC(0);
          paramAnonymousView.uLl = new ExptDebugUI.4.1(this, paramAnonymousView, arrayOfString);
          paramAnonymousView.GB(com.tencent.mm.bp.a.fromDPToPix(ExptDebugUI.this.mController.tml, 288));
          paramAnonymousView.show();
        }
      }
    });
    this.iIL = ((Button)findViewById(b.b.req_expt));
    this.iIL.setOnClickListener(new ExptDebugUI.5(this));
    this.eOQ = ((Button)findViewById(b.b.expt_del));
    this.eOQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new ArrayList();
        paramAnonymousView.add(Integer.valueOf(ExptDebugUI.c(ExptDebugUI.this)));
        if (com.tencent.mm.plugin.expt.b.a.aIu().aV(paramAnonymousView) > 0) {}
        for (boolean bool = true;; bool = false)
        {
          ExptDebugUI.d(ExptDebugUI.this).setText(" del :" + ExptDebugUI.c(ExptDebugUI.this) + " " + bool);
          return;
        }
      }
    });
    this.iIM = ((TextView)findViewById(b.b.expt_id));
    this.iIN = ((TextView)findViewById(b.b.group_id));
    this.iIO = ((TextView)findViewById(b.b.expt_seq));
    this.iIP = ((TextView)findViewById(b.b.expt_time));
    this.iIQ = ((TextView)findViewById(b.b.expt_args));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/expt/ui/ExptDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */