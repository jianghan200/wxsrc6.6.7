package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.xweb.x5.sdk.d;

@a(3)
public class MiniQBReaderUI
  extends MMActivity
{
  private String qTd = Integer.toString(hashCode());
  private int ret = -1;
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    super.onCreate(paramBundle);
    x.i("MicroMsg.MiniQBReaderUI", "onCreate");
    Object localObject1 = getIntent();
    paramBundle = ((Intent)localObject1).getStringExtra("file_path");
    localObject1 = ((Intent)localObject1).getStringExtra("file_ext");
    Object localObject2 = new MiniQBReaderUI.1(this);
    this.ret = p.a(this, paramBundle, (String)localObject1, this.qTd, (ValueCallback)localObject2);
    x.i("MicroMsg.MiniQBReaderUI", "tryOpenByQbSdk , ret:%b", new Object[] { Integer.valueOf(this.ret) });
    new StringBuilder("tryOpenByQbSdk , ret:").append(this.ret);
    localObject2 = new Intent();
    ((Intent)localObject2).setAction("MINIQB_OPEN_RET");
    ((Intent)localObject2).putExtra("file_path", paramBundle);
    ((Intent)localObject2).putExtra("file_ext", (String)localObject1);
    if (this.ret == 0) {}
    for (;;)
    {
      ((Intent)localObject2).putExtra("MINIQB_OPEN_RET_VAL", bool);
      sendBroadcast((Intent)localObject2, "com.tencent.mm.permission.MM_MESSAGE");
      if (this.ret != 0) {
        finish();
      }
      return;
      bool = false;
    }
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.MiniQBReaderUI", "onDestroy");
    if (this.ret == 0) {}
    try
    {
      d.closeFileReader(this);
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.MiniQBReaderUI", localException, "", new Object[0]);
      }
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    x.i("MicroMsg.MiniQBReaderUI", "onNewIntent");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */