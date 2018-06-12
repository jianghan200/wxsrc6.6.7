package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenImgUI
  extends MMActivity
{
  private ProgressDialog eHw = null;
  String filePath = null;
  private ag handler = new ShareScreenImgUI.1(this);
  private Intent intent = null;
  Uri uri = null;
  
  private void czU()
  {
    x.i("MicroMsg.ShareScreenImgUI", "filepath:[%s]", new Object[] { this.filePath });
    Intent localIntent = getIntent();
    String str = localIntent.resolveType(this);
    int i;
    if ((str == null) || (str.length() == 0))
    {
      x.e("MicroMsg.ShareScreenImgUI", "map : mimeType is null");
      i = -1;
    }
    while (i == -1)
    {
      x.e("MicroMsg.ShareScreenImgUI", "launch, msgType is invalid");
      finish();
      return;
      if (str.toLowerCase().contains("image"))
      {
        i = 0;
      }
      else
      {
        x.d("MicroMsg.ShareScreenImgUI", "map : unknown mimetype, send as file");
        i = 3;
      }
    }
    if ((!s.a(getIntent(), "Intro_Switch", false)) && (au.HW()) && (!au.Dr()))
    {
      localIntent.setData(this.uri);
      localIntent.setClass(this, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", this.filePath);
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Scene", 1);
      localIntent.putExtra("Retr_start_where_you_are", false);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    for (;;)
    {
      finish();
      return;
      if (!bi.oW(this.filePath))
      {
        localIntent = new Intent(this, ShareImgUI.class);
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.filePath)));
        localIntent.addFlags(67108864);
        localIntent.setType("image/*");
        localIntent.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      }
      else
      {
        czy();
      }
    }
  }
  
  private void czy()
  {
    Toast.makeText(this, R.l.shareimg_get_res_fail, 1).show();
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected final void initView()
  {
    this.intent = getIntent();
    if (this.intent == null)
    {
      x.e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
      czy();
      finish();
      return;
    }
    x.i("MicroMsg.ShareScreenImgUI", "intent = " + this.intent);
    String str = this.intent.getAction();
    this.uri = this.intent.getData();
    if (bi.oW(str))
    {
      x.e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
      czy();
      finish();
      return;
    }
    if (str.equals("android.intent.action.VIEW"))
    {
      x.i("MicroMsg.ShareScreenImgUI", "send signal: " + str);
      if ((this.uri == null) || (!bi.n(this.uri)))
      {
        x.e("MicroMsg.ShareScreenImgUI", "launch : fail, not accepted: %s", new Object[] { this.uri });
        czy();
        finish();
        return;
      }
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new ShareScreenImgUI.2(this));
      this.filePath = bi.h(this, this.uri);
      if (!bi.oW(this.filePath))
      {
        str = this.filePath;
        MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
        boolean bool = o.b(str, localDecodeResultLogger);
        if ((!bool) && (localDecodeResultLogger.getDecodeResult() >= 2000))
        {
          str = MMBitmapFactory.KVStatHelper.getKVStatString(str, 3, localDecodeResultLogger);
          com.tencent.mm.plugin.report.service.h.mEJ.k(12712, str);
        }
        if (bool) {}
      }
      else
      {
        x.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
        czy();
        finish();
        return;
      }
      czU();
      return;
    }
    x.e("MicroMsg.ShareScreenImgUI", "launch : fail, uri is null");
    czy();
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle("");
    int i = s.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default: 
      x.e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      return;
    case 1: 
      finish();
      return;
    }
    NotifyReceiver.xA();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/ShareScreenImgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */