package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.e.h;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenToTimeLineUI
  extends MMActivity
{
  String filePath = null;
  Uri uri = null;
  
  private void czy()
  {
    Toast.makeText(this, R.l.shareimg_to_timeline_get_res_fail, 1).show();
  }
  
  private void gk(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    if (!bi.oW(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
    }
    if (!bi.oW(paramString2)) {
      localIntent.putExtra(e.h.thz, paramString2);
    }
    if ((au.HW()) && (!au.Dr()))
    {
      localIntent.putExtra("K_go_to_SnsTimeLineUI", true);
      d.b(this, "sns", ".ui.SnsUploadUI", localIntent);
    }
    for (;;)
    {
      finish();
      return;
      if (!bi.oW(paramString1))
      {
        paramString2 = new Intent(this, ShareToTimeLineUI.class);
        paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
        paramString2.addFlags(32768).addFlags(268435456);
        paramString2.setType("image/*");
        paramString2.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), paramString2);
      }
      else
      {
        czy();
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected final void initView()
  {
    Object localObject1 = getIntent();
    if (localObject1 == null)
    {
      x.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, intent is null");
      czy();
      finish();
      return;
    }
    Object localObject2 = ((Intent)localObject1).getAction();
    this.uri = ((Intent)localObject1).getData();
    if (bi.oW((String)localObject2))
    {
      x.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, action is null");
      czy();
      finish();
      return;
    }
    String str1 = s.j((Intent)localObject1, e.h.thz);
    String str2 = getIntent().resolveType(this);
    if (bi.oW(str2))
    {
      czy();
      finish();
      return;
    }
    if (!str2.contains("image"))
    {
      czy();
      finish();
      return;
    }
    if (((String)localObject2).equals("android.intent.action.VIEW"))
    {
      x.i("MicroMsg.ShareScreenToTimeLineUI", "send signal: " + (String)localObject2);
      if (!bi.n(this.uri))
      {
        x.e("MicroMsg.ShareScreenToTimeLineUI", "fail, not accepted: %s", new Object[] { this.uri });
        czy();
        finish();
        return;
      }
      this.filePath = bi.h(this, this.uri);
      if ((bi.oW(this.filePath)) || (!bi.Xh(this.filePath)))
      {
        if (s.a((Intent)localObject1, "Ksnsupload_empty_img", false))
        {
          gk(this.filePath, str1);
          return;
        }
        czy();
        finish();
        return;
      }
      localObject1 = this.filePath;
      localObject2 = new MMBitmapFactory.DecodeResultLogger();
      boolean bool = com.tencent.mm.sdk.platformtools.o.b((String)localObject1, (MMBitmapFactory.DecodeResultLogger)localObject2);
      if ((!bool) && (((MMBitmapFactory.DecodeResultLogger)localObject2).getDecodeResult() >= 2000))
      {
        localObject1 = MMBitmapFactory.KVStatHelper.getKVStatString(localObject1, 4, (MMBitmapFactory.DecodeResultLogger)localObject2);
        h.mEJ.k(12712, (String)localObject1);
      }
      if (bool)
      {
        gk(this.filePath, str1);
        return;
      }
      czy();
      finish();
      return;
    }
    x.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, uri is null");
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
      x.e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      return;
    case 1: 
      finish();
      return;
    }
    NotifyReceiver.xA();
    au.DF().a(new bg(new ShareScreenToTimeLineUI.1(this)), 0);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/tools/ShareScreenToTimeLineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */