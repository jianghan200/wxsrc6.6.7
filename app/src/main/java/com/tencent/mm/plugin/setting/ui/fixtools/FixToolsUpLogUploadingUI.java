package com.tencent.mm.plugin.setting.ui.fixtools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.model.a.1;
import com.tencent.mm.plugin.setting.model.a.2;
import com.tencent.mm.plugin.setting.model.a.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

@com.tencent.mm.ui.base.a(3)
public class FixToolsUpLogUploadingUI
  extends MMWizardActivity
{
  private Button joh;
  public a.a mOG = new FixToolsUpLogUploadingUI.3(this);
  private TextView mPo;
  private ImageView mPp;
  protected ProgressBar mPq;
  
  protected final int getLayoutId()
  {
    return a.g.fix_tools_uplog_uploading;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {}
    String str;
    com.tencent.mm.plugin.setting.model.a locala;
    do
    {
      return;
      setMMTitle(a.i.fix_tools_uplog);
      this.mPo = ((TextView)findViewById(a.f.fix_tools_uplog_uploading));
      this.mPp = ((ImageView)findViewById(a.f.fix_tools_uplog_logo));
      this.joh = ((Button)findViewById(a.f.fix_tools_uplog_finish));
      this.mPq = ((ProgressBar)findViewById(a.f.fix_tools_uplog_progress));
      this.mPp.setImageResource(a.h.fix_tools_uplog);
      this.mPo.setText(a.i.fix_tools_uplog_uploading);
      this.joh.setOnClickListener(new FixToolsUpLogUploadingUI.1(this));
      setBackBtn(new FixToolsUpLogUploadingUI.2(this));
      this.mPq.setVisibility(0);
      this.joh.setVisibility(8);
      str = getIntent().getStringExtra("date");
      locala = com.tencent.mm.plugin.setting.model.a.btq();
      com.tencent.mm.plugin.setting.model.a.mOG = this.mOG;
      x.i("MicroMsg.FixToolsUplogModel", "startUplog, date:%s, isUploading:%b", new Object[] { str, Boolean.valueOf(locala.egv) });
    } while (locala.egv);
    locala.egv = true;
    paramBundle = "weixin";
    if (g.Eg().Dx()) {
      paramBundle = q.GF();
    }
    long l1 = bi.VF() / 86400000L;
    long l2 = com.tencent.mm.plugin.setting.model.a.wy(str + "000000");
    int i = (int)((l1 * 86400000L + 57600000L - 1L - l2) / 86400000L);
    x.i("MicroMsg.FixToolsUplogModel", "startNewUplog, chooseTime:%d, time:%d", new Object[] { Long.valueOf(l2), Integer.valueOf(i) });
    g.DF().a(new bg(new a.1(locala, paramBundle, i)), 0);
    b.a(new a.2(locala));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */