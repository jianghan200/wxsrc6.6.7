package com.tencent.mrs.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.d.b;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.mm.sdk.platformtools.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MatrixReportBroadcast
  extends BroadcastReceiver
{
  private static final HashMap<String, ArrayList<a>> uZW = new HashMap();
  
  public static void cEa()
  {
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        Iterator localIterator = MatrixReportBroadcast.bqz().keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject1 = (String)localIterator.next();
          Object localObject2 = (ArrayList)MatrixReportBroadcast.bqz().get(localObject1);
          b.i("Matrix.ReportBroadcast", "MatrixReportBroadcast, matrix report pending issues tag:%s, size:%d", new Object[] { localObject1, Integer.valueOf(((ArrayList)localObject2).size()) });
          localObject1 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (MatrixReportBroadcast.a)((Iterator)localObject1).next();
            MatrixReport.with().reportLocal(((MatrixReportBroadcast.a)localObject2).tag, ((MatrixReportBroadcast.a)localObject2).value);
          }
        }
        MatrixReportBroadcast.bqz().clear();
        return false;
      }
    });
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      b.e("Matrix.ReportBroadcast", "MatrixReportBroadcast intent == null", new Object[0]);
      return;
    }
    paramContext = s.j(paramIntent, "tag");
    paramIntent = s.j(paramIntent, "value");
    if (!MatrixReport.isInstalled())
    {
      b.e("Matrix.ReportBroadcast", "MatrixReportBroadcast, matrix report is not init, wait to report plugin:%s, content:%s", new Object[] { paramContext, paramIntent });
      a locala = new a(paramContext, paramIntent);
      paramIntent = (ArrayList)uZW.get(paramContext);
      paramContext = paramIntent;
      if (paramIntent == null) {
        paramContext = new ArrayList();
      }
      paramContext.add(locala);
      return;
    }
    b.i("Matrix.ReportBroadcast", "MatrixReportBroadcast, receive broadcast with tag %s, value:%s", new Object[] { paramContext, paramIntent });
    MatrixReport.with().reportLocal(paramContext, paramIntent);
  }
  
  private static final class a
  {
    String tag;
    String value;
    
    a(String paramString1, String paramString2)
    {
      this.tag = paramString1;
      this.value = paramString2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mrs/util/MatrixReportBroadcast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */