package com.tencent.mm.performance.wxperformancetool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bv.b;
import com.tencent.mm.performance.a.a;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashMap;

@TargetApi(17)
public class MemoryLeakActivity
  extends Activity
{
  private AlertDialog euT;
  private ag mHandler = new MemoryLeakActivity.1(this);
  private String mKey;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.a.background_transparent);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("memory leak");
    this.mKey = getIntent().getStringExtra("key");
    String str2 = getIntent().getStringExtra("tag");
    String str1 = getIntent().getStringExtra("class");
    paramBundle = str1;
    if (str1.contains(" ")) {
      paramBundle = str1.substring(str1.indexOf(" "));
    }
    str1 = paramBundle.replace(".", "_");
    localBuilder.setMessage(str2 + paramBundle + "\n\npath:" + b.tfv + str1 + ".zip");
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton("dumphprof", new MemoryLeakActivity.2(this, str1));
    localBuilder.setNegativeButton("cancel", new MemoryLeakActivity.3(this));
    localBuilder.setOnDismissListener(new MemoryLeakActivity.4(this));
    this.euT = localBuilder.create();
    b.cos();
    this.mHandler.sendEmptyMessageDelayed(0, 200L);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a.euW.remove(this.mKey);
    this.mHandler.removeCallbacksAndMessages(null);
    if ((this.euT != null) && (this.euT.isShowing()))
    {
      this.euT.dismiss();
      this.euT = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/performance/wxperformancetool/MemoryLeakActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */