package com.tencent.mm.plugin.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.downloader.b.b;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class FileDownloadConfirmUI
  extends MMBaseActivity
{
  private c evj = null;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(b.b.empty);
    paramBundle = new FileDownloadConfirmUI.1(this, getIntent().getLongExtra("extra_download_id", -1L));
    DialogInterface.OnClickListener local2 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    };
    FileDownloadConfirmUI.3 local3 = new FileDownloadConfirmUI.3(this);
    c.a locala = new c.a(this);
    locala.abt("");
    locala.Gr(b.c.file_downloader_confirm_title);
    locala.Gt(b.c.app_yes).a(paramBundle);
    locala.Gu(b.c.app_no).b(local2);
    locala.a(local3);
    this.evj = locala.anj();
    this.evj.show();
    x.i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
  }
  
  protected void onStop()
  {
    super.onStop();
    this.evj.dismiss();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/ui/FileDownloadConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */