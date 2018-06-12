package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class ResourcesExceedUI
  extends MMActivity
{
  private TextView tMH;
  private int type = 0;
  
  protected final int getLayoutId()
  {
    return R.i.resources_exceed_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new ResourcesExceedUI.1(this));
    this.tMH = ((TextView)findViewById(R.h.download_fail_text));
    switch (this.type)
    {
    default: 
      return;
    case 0: 
      this.tMH.setText(R.l.video_fail_or_clean);
      return;
    case 2: 
      this.tMH.setText(R.l.file_fail_or_clean);
      return;
    }
    this.tMH.setText(R.l.imgdownload_fail_or_cleaned);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("clean_view_type", 0);
    setMMTitle("");
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/ResourcesExceedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */