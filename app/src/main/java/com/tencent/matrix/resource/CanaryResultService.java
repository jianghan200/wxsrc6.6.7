package com.tencent.matrix.resource;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.a;
import org.json.JSONObject;

public class CanaryResultService
  extends IntentService
{
  public CanaryResultService()
  {
    super("Matrix.CanaryResultService");
  }
  
  public static void f(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, CanaryResultService.class);
    localIntent.setAction("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT");
    localIntent.putExtra("RESULT_PATH", paramString1);
    localIntent.putExtra("RESULT_ACTIVITY", paramString2);
    paramContext.startService(localIntent);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    Object localObject;
    String str;
    if ((paramIntent != null) && ("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT".equals(paramIntent.getAction())))
    {
      localObject = paramIntent.getStringExtra("RESULT_PATH");
      str = paramIntent.getStringExtra("RESULT_ACTIVITY");
      if ((localObject == null) || (((String)localObject).isEmpty()) || (str == null) || (str.isEmpty())) {}
    }
    else
    {
      try
      {
        paramIntent = new JSONObject();
        paramIntent.put("resultZipPath", localObject);
        paramIntent.put("activity", str);
        localObject = a.tg().g(c.class);
        if (localObject != null) {
          ((com.tencent.matrix.b.b)localObject).a(new com.tencent.matrix.c.b(paramIntent));
        }
        return;
      }
      catch (Throwable paramIntent)
      {
        com.tencent.matrix.d.b.printErrStackTrace("Matrix.CanaryResultService", paramIntent, "unexpected exception, skip reporting.", new Object[0]);
        return;
      }
    }
    com.tencent.matrix.d.b.e("Matrix.CanaryResultService", "resultPath or activityName is null or empty, skip reporting.", new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/CanaryResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */