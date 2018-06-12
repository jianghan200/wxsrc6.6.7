package com.tencent.mrs.a;

import android.text.TextUtils;
import com.tencent.mars.app.AppLogic;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MrsCallback;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class a
  implements MrsCallback
{
  private HashMap<String, Boolean> uZS = new HashMap();
  
  public final String getPublicSharePath()
  {
    return AppLogic.getAppFilePath() + "/mrs/";
  }
  
  public final void onMrsReportDataReady(byte[] paramArrayOfByte)
  {
    com.tencent.matrix.d.b.i("Matrix.MrsCallbackImp", "onMrsReportDataReady, try to report mars", new Object[0]);
    if (paramArrayOfByte == null)
    {
      com.tencent.matrix.d.b.e("Matrix.ReportMrsUpload", "report mrs date is null", new Object[0]);
      return;
    }
    e.post(new c.2(paramArrayOfByte), "ReportMrsUpload");
  }
  
  public final boolean onRequestGetMrsStrategy(byte[] paramArrayOfByte)
  {
    try
    {
      if (!g.Eg().Dx())
      {
        x.e("Matrix.MrsCallbackImp", "onRequestGetMrsStrategy, account not ready");
        return false;
      }
      try
      {
        if (b.isRunning())
        {
          x.i("Matrix.MrsCallbackImp", "NetSceneGetMrsStrategy is already running, just return");
          return false;
        }
      }
      finally {}
      x.i("Matrix.MrsCallbackImp", "onRequestGetMrsStrategy, try to request mrs strategy");
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("Matrix.MrsCallbackImp", "error: " + paramArrayOfByte.getMessage());
      return false;
    }
    paramArrayOfByte = new b(paramArrayOfByte);
    g.Eh().dpP.a(paramArrayOfByte, 0);
    return true;
  }
  
  public final void onStrategyNotify(String paramString, boolean paramBoolean)
  {
    com.tencent.matrix.d.b.i("Matrix.MrsCallbackImp", "onStrategyNotify, strategy: %s, isReportProcess; %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (!com.tencent.matrix.a.isInstalled()) {}
    label102:
    label213:
    label264:
    label300:
    label334:
    for (;;)
    {
      return;
      if (MatrixReport.isInstalled())
      {
        if (MatrixReport.with().isDebug())
        {
          com.tencent.matrix.d.b.i("Matrix.MrsCallbackImp", "onStrategyNotify, matrix will report all for debug mode", new Object[0]);
          return;
        }
        this.uZS.clear();
        Object localObject = this.uZS;
        if ((TextUtils.isEmpty(paramString)) || (localObject == null))
        {
          com.tencent.matrix.d.b.e("Matrix.MatrixUtil", "changeStrategyToMap, input params is illegal", new Object[0]);
          paramString = com.tencent.matrix.a.tg().boT.iterator();
        }
        for (;;)
        {
          if (!paramString.hasNext()) {
            break label334;
          }
          localObject = (com.tencent.matrix.b.b)paramString.next();
          String str = ((com.tencent.matrix.b.b)localObject).getTag();
          if (this.uZS.containsKey(str))
          {
            paramBoolean = ((Boolean)this.uZS.get(str)).booleanValue();
            if (paramBoolean)
            {
              if (((com.tencent.matrix.b.b)localObject).status == 4) {}
              for (int i = 1;; i = 0)
              {
                if (i == 0) {
                  break label300;
                }
                com.tencent.matrix.d.b.w("Matrix.MrsCallbackImp", "matrix strategy change, try to turn on plugin %s", new Object[] { str });
                ((com.tencent.matrix.b.b)localObject).start();
                break label102;
                paramString = paramString.split(";");
                int j = paramString.length;
                i = 0;
                String[] arrayOfString;
                if (i < j)
                {
                  str = paramString[i];
                  arrayOfString = str.split(",", 2);
                  if (arrayOfString.length == 2) {
                    break label264;
                  }
                  com.tencent.matrix.d.b.e("Matrix.MatrixUtil", "changeStrategyToMap, strategy format is illegal, value: %s", new Object[] { str });
                }
                for (;;)
                {
                  i += 1;
                  break label213;
                  break;
                  ((HashMap)localObject).put(arrayOfString[0].trim(), Boolean.valueOf(arrayOfString[1].trim().equals("1")));
                }
              }
            }
            if ((!paramBoolean) && (((com.tencent.matrix.b.b)localObject).tw()))
            {
              com.tencent.matrix.d.b.w("Matrix.MrsCallbackImp", "matrix strategy change, try to turn off plugin %s", new Object[] { str });
              ((com.tencent.matrix.b.b)localObject).stop();
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mrs/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */