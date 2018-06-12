package com.tencent.mm.plugin.soter.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.d.a.a;
import com.tencent.d.a.c.e;
import com.tencent.d.a.c.h;
import com.tencent.mm.plugin.aj.a.a;
import com.tencent.mm.plugin.aj.a.b;
import com.tencent.mm.ui.MMActivity;

public class SoterTestUI
  extends MMActivity
{
  private Button onM = null;
  private Button onN = null;
  private Button onO = null;
  private Button onP = null;
  private Button onQ = null;
  private Button onR = null;
  private Button onS = null;
  private Button onT = null;
  private Button onU = null;
  private TextView onV = null;
  
  protected final int getLayoutId()
  {
    return a.b.soter_test_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.onM = ((Button)findViewById(a.a.soter_test_support_soter));
    this.onN = ((Button)findViewById(a.a.soter_test_gen_ask));
    this.onO = ((Button)findViewById(a.a.soter_test_remove_ask));
    this.onP = ((Button)findViewById(a.a.soter_test_get_ask_pub));
    this.onQ = ((Button)findViewById(a.a.soter_test_gen_ak));
    this.onR = ((Button)findViewById(a.a.soter_test_remove_ak));
    this.onS = ((Button)findViewById(a.a.soter_test_get_ak_pub));
    this.onT = ((Button)findViewById(a.a.soter_test_do_sign));
    this.onU = ((Button)findViewById(a.a.soter_test_decrypt_import));
    this.onV = ((TextView)findViewById(a.a.result_tv));
    this.onM.setOnClickListener(new SoterTestUI.1(this));
    this.onN.setOnClickListener(new SoterTestUI.2(this));
    this.onO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = a.cFB();
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "passed";; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          return;
        }
      }
    });
    this.onP.setOnClickListener(new SoterTestUI.4(this));
    this.onQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = a.acy("sample_auth_key_name");
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "pass";; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          return;
        }
      }
    });
    this.onR.setOnClickListener(new SoterTestUI.6(this));
    this.onS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = a.acB("sample_auth_key_name");
        if (paramAnonymousView == null)
        {
          SoterTestUI.a(SoterTestUI.this).setText("not passed: no certificate");
          return;
        }
        SoterTestUI.a(SoterTestUI.this).setText("model available: " + paramAnonymousView.toString());
      }
    });
    this.onT.setOnClickListener(new SoterTestUI.8(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/soter/ui/SoterTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */