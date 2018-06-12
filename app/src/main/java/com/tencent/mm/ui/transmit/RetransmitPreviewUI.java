package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class RetransmitPreviewUI
  extends MMActivity
{
  private TextView ih = null;
  private String text = null;
  
  protected final int getLayoutId()
  {
    return R.i.chatting_item_full_screen;
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle("");
    this.text = getIntent().getStringExtra("Retr_Msg_content");
    this.ih = ((TextView)findViewById(R.h.full_screen_text));
    paramBundle = this.ih;
    g localg = g.cjL();
    ActionBarActivity localActionBarActivity = this.mController.tml;
    paramBundle.setText(localg.a(this.text, this.ih.getTextSize()));
    setBackBtn(new RetransmitPreviewUI.1(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/transmit/RetransmitPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */